package com.epam.task2.sort;

import java.util.Comparator;

public final class Sorter {
    
    private Sorter() {}
    
    public static void selectionSort(int[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {  
            int index = i;
            if (ascending) {
                for (int j = i + 1; j < array.length; j++) {  
                    if (array[j] < array[index]) {  
                        index = j;
                    }  
                }  
            } else {
                for (int j = i + 1; j < array.length; j++) {  
                    if (array[j] > array[index]) {  
                        index = j;
                    }  
                }  
            }
            int selected = array[index];   
            array[index] = array[i];  
            array[i] = selected;  
        } 
    }

    public static void insertionSort(int[] array, boolean ascending) {
        for (int i = 1; i < array.length; i++) {
            int toInsert = array[i];
            int j = i;
            if (ascending) {
                while (j > 0 && array[j - 1] > toInsert) {
                    array[j] = array[j - 1];
                    j--;
              }
            } else {
                while (j > 0 && array[j - 1] < toInsert) {
                    array[j] = array[j - 1];
                    j--;
              }
            }
            array[j] = toInsert;
        }
    }

    public static void bubbleSort(int[] array, boolean ascending) { 
        for (int i = 0; i < array.length; i++) {  
            for(int j = 1; j < (array.length - i); j++) {  
                if (ascending) {
                    if (array[j - 1] > array[j]) {  
                        int bubble = array[j - 1];  
                        array[j - 1] = array[j];  
                        array[j] = bubble;  
                    } 
                } else {
                    if (array[j - 1] < array[j]) {  
                        int bubble = array[j - 1];  
                        array[j - 1] = array[j];  
                        array[j] = bubble;  
                    } 
                }
            }  
        } 
    }

    public static void quickSort(int[] array, boolean ascending) {
        quickSortFromTo(array, 0, array.length - 1, ascending);
    }

    public static void quickSortFromTo(int[] array, int from, int to, boolean ascending) {
        int startFrom = from;
        int startTo = to;
        int pivot = array[(from + to) / 2];
        while (from <= to) {
            if (ascending) {
                while (array[from] < pivot) {
                    from++;
                }
                while (array[to] > pivot) {
                    to--;
                }
                if (from <= to) {
                    int temp = array[from];
                    array[from] = array[to];
                    array[to] = temp;
                    from++;
                    to--;
                }
            } else {
                while (array[from] > pivot) {
                    from++;
                }
                while (array[to] < pivot) {
                    to--;
                }
                if (from <= to) {
                    int temp = array[from];
                    array[from] = array[to];
                    array[to] = temp;
                    from++;
                    to--;
                }
            }

        };
        if (from - 1 > startFrom) {
            quickSortFromTo(array, startFrom, from - 1, ascending);
        }
        if (from < startTo) {
            quickSortFromTo(array, from, startTo, ascending);
        }
    }

    //Other similar methods for other primitive types...
    
    public static <E extends Comparable<? super E>> void selectionSort(E[] array, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {  
            int index = i;
            if (ascending) {
                for (int j = i + 1; j < array.length; j++) {  
                    if (array[j].compareTo(array[index]) < 0) {  
                        index = j;
                    }  
                }  
            } else {
                for (int j = i + 1; j < array.length; j++) {  
                    if (array[j].compareTo(array[index]) > 0) {  
                        index = j;
                    }  
                }  
            }
            E selected = array[index];   
            array[index] = array[i];  
            array[i] = selected;  
        } 
    }

    public static <E extends Comparable<? super E>> void insertionSort(E[] array, boolean ascending){
        for (int i = 1; i < array.length; i++) {
            E toInsert = array[i];
            int j = i;
            if (ascending) {
                while (j > 0 && array[j - 1].compareTo(toInsert) > 0) {
                    array[j] = array[j - 1];
                    j--;
              }
            } else {
                while (j > 0 && array[j - 1].compareTo(toInsert) < 0) {
                    array[j] = array[j - 1];
                    j--;
              }
            }
            array[j] = toInsert;
        }
    }
    
    public static <E extends Comparable<? super E>> void bubbleSort(E[] array, boolean ascending){
        for (int i = 0; i < array.length; i++) {  
            for(int j = 1; j < (array.length - i); j++) {  
                if (ascending) {
                    if (array[j - 1].compareTo(array[j]) > 0) {  
                        E bubble = array[j - 1];  
                        array[j - 1] = array[j];  
                        array[j] = bubble;  
                    } 
                } else {
                    if (array[j - 1].compareTo(array[j]) < 0) {  
                        E bubble = array[j - 1];  
                        array[j - 1] = array[j];  
                        array[j] = bubble;  
                    } 
                }
            }  
        } 
    }

    public static <E extends Comparable<? super E>> void quickSort(E[] array, boolean ascending){
        quickSortFromTo(array, 0, array.length - 1, ascending);
    }
    
    public static <E extends Comparable<? super E>> void quickSortFromTo(E[] array, int from, int to, boolean ascending) {
        int startFrom = from;
        int startTo = to;
        E pivot = array[(from + to) / 2];
        while (from <= to) {
            if (ascending) {
                while (array[from].compareTo(pivot) < 0) {
                    from++;
                }
                while (array[to].compareTo(pivot) > 0) {
                    to--;
                }
                if (from <= to) {
                    E temp = array[from];
                    array[from] = array[to];
                    array[to] = temp;
                    from++;
                    to--;
                }
            } else {
                while (array[from].compareTo(pivot) > 0) {
                    from++;
                }
                while (array[to].compareTo(pivot) < 0) {
                    to--;
                }
                if (from <= to) {
                    E temp = array[from];
                    array[from] = array[to];
                    array[to] = temp;
                    from++;
                    to--;
                }
            }

        }
        if (from - 1 > startFrom) {
            quickSortFromTo(array, startFrom, from - 1, ascending);
        }
        if (from < startTo) {
            quickSortFromTo(array, from, startTo, ascending);
        }
    }

    public static <E> void selectionSort(E[] array, Comparator<? super E> comp, boolean ascending) {
        for (int i = 0; i < array.length - 1; i++) {  
            int index = i;
            if (ascending) {
                for (int j = i + 1; j < array.length; j++) {  
                    if (comp.compare(array[j], array[index]) < 0) {  
                        index = j;
                    }  
                }  
            } else {
                for (int j = i + 1; j < array.length; j++) {  
                    if (comp.compare(array[j], array[index]) > 0) {  
                        index = j;
                    }  
                }  
            }
            E selected = array[index];   
            array[index] = array[i];  
            array[i] = selected;  
        } 
    }

    public static <E> void insertionSort(E[] array, Comparator<? super E> comp, boolean ascending) {
        for (int i = 1; i < array.length; i++) {
            E toInsert = array[i];
            int j = i;
            if (ascending) {
                while (j > 0 && comp.compare(array[j -1 ], toInsert) > 0) {
                    array[j] = array[j - 1];
                    j--;
              }
            } else {
                while (j > 0 && comp.compare(array[j -1 ], toInsert) < 0) {
                    array[j] = array[j - 1];
                    j--;
              }
            }
            array[j] = toInsert;
        }
    }
    
    public static <E> void bubbleSort(E[] array, Comparator<? super E> comp, boolean ascending) {
        for (int i = 0; i < array.length; i++) {  
            for(int j = 1; j < (array.length - i); j++) {  
                if (ascending) {
                    if (comp.compare(array[j - 1], array[j]) > 0) {  
                        E bubble = array[j - 1];  
                        array[j - 1] = array[j];  
                        array[j] = bubble;  
                    } 
                } else {
                    if (comp.compare(array[j - 1], array[j]) < 0) {  
                        E bubble = array[j - 1];  
                        array[j - 1] = array[j];  
                        array[j] = bubble;  
                    } 
                }
            }  
        } 
    }
    
    public static <E> void quickSort(E[] array, Comparator<? super E> comp, boolean ascending) {
        quickSortFromTo(array, comp, 0, array.length - 1, ascending);
    }
    
    public static <E> void quickSortFromTo(E[] array, Comparator<? super E> comp, int from, int to, boolean ascending) {
        int startFrom = from;
        int startTo = to;
        E pivot = array[(from + to) / 2];
        while (from <= to) {
            if (ascending) {
                while (comp.compare(array[from], pivot) < 0) {
                    from++;
                }
                while (comp.compare(array[to], pivot) > 0) {
                    to--;
                }
                if (from <= to) {
                    E temp = array[from];
                    array[from] = array[to];
                    array[to] = temp;
                    from++;
                    to--;
                }
            } else {
                while (comp.compare(array[from], pivot) > 0) {
                    from++;
                }
                while (comp.compare(array[to], pivot) < 0) {
                    to--;
                }
                if (from <= to) {
                    E temp = array[from];
                    array[from] = array[to];
                    array[to] = temp;
                    from++;
                    to--;
                }
            }

        }
        if (from - 1 > startFrom) {
            quickSortFromTo(array, comp, startFrom, from - 1, ascending);
        }
        if (from < startTo) {
            quickSortFromTo(array, comp, from, startTo, ascending); 
        }
    }

    //Other similar methods for List<E>. Don't wrote them because there isn't anything
    //new about sorting methods or types of sortable items.
}
