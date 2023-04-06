//Реализовать алгоритм сортировки слиянием

package hw3.task;

public class Task1 { // ДЛЯ ПРЕПОДАВАТЕЛЯ: - я буду писать коментарии для себя на будущее, не обращайте внимание, так мне проще разбираться, запоминать и понимать, что делаю.
                     

    public static int [] mergeSort(int[] ourArray) { // метод для разбивки входящего массива
        if (ourArray == null) {
            return null;
        }   
        if (ourArray.length < 2) {                              // условия выхода из рекусрии 
            return ourArray;                                    
        }
        int length_arr = ourArray.length / 2;   //определяем переменную с половиной длинны массива
        if (ourArray.length % 2 != 0){         // проверка на тот случай, если не четное кол-во элементов в массиве
            length_arr += 1;
        }

        int [] firstArray = new int[length_arr];            // инициализиурем два массва куда будем складывать элементы для будующей сортировки. 1ый массив с половиной длины от входящего массива  
        int [] secondArray = new int [ourArray.length/2];      // 2ой так же с половиной длины  
        for (int i = 0; i < ourArray.length / 2; i++) { //заполнение массива 
            secondArray[i] = ourArray[i];
        }
        
        for (int i = ourArray.length / 2; i < ourArray.length; i++) {  //заполнение массива
                firstArray[i - ourArray.length / 2] = ourArray[i];

        }
        firstArray = mergeSort(firstArray); // вызов рекурсии  
         secondArray = mergeSort(secondArray);
         return mergeArray(firstArray, secondArray); //вызов метода для слияния
        
    
    }

    public static int [] mergeArray(int [] firstArray, int [] secondArray) { // метод слияния и сортировки
        int [] resultArrray =  new int [firstArray.length + secondArray.length]; // иниц. результирующий массив с длиной двух переданных массивов из метода по разбивке
        int posA = 0; //иниц. переменные, где будем хранить индексы каждого из массивов, чтобы не бегать постоянно циклом по всем массивам, а просто менять индексы
        int posB = 0;
        for (int i = 0; i < resultArrray.length; i++) {
            if (posA < firstArray.length && posB < secondArray.length) { // проверка по длине
                if (firstArray[posA] < secondArray[posB]) {  // сравнение по текущим индексам двух массивов 
                    resultArrray[i] = firstArray[posA];
                    posA++;
                } else {
                    resultArrray[i] = secondArray[posB];  
                    posB++;
                }
            } else if (posA == firstArray.length && posB < secondArray.length) {
                resultArrray[i] = secondArray[posB];
                posB++;
            }
            else if (posA < firstArray.length && posB == secondArray.length) {
                resultArrray[i] = firstArray[posA];
                posA++;
            }else{
                resultArrray[i] = 0;
            }
        }    
        return resultArrray;
        
    }


    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }

}
// for (int i = 0; i < resultArrray.length; i++) {
//     if (posA == firstArray.length){
//         resultArrray[i] = secondArray[posB];
//         posB++;

//     }else if (posB == secondArray.length){
//         resultArrray[i] = firstArray[posA];
//         posA++;
//     }else if (firstArray[posA]< secondArray[posB]){
//         resultArrray[i] = firstArray[posA];
//         posA++;
//     }else {
//         resultArrray[i] = secondArray[posB];
//         posB++;
//     }  
// }

