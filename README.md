# 정렬 알고리즘
## 1. 버블 정렬
: 인접한 두 원소를 비교하여 자리를 교환하는 방식
### 시간복잡도
- 평균 : O(n^2)
- 최선 : O(n^2)
- 최악 : O(n^2)
### 코드 설명
: 입력한 배열의 크기만큼 100이하의 숫자가 랜덤으로 생성된 후, 버블 정렬 방식으로 오름차순으로 정렬된다.
- 입력 : 배열의 크기
- 출력 : 오른차순으로 정렬된 배열

![1](https://postfiles.pstatic.net/MjAyMTA1MDRfMjk5/MDAxNjIwMTA2NDg3MDI5.j0aWjvAWsRObsvQyGxbAoK4zwSf1-wvKfWk85TwWV-Ig.UVJuwmu9yDVgSLllOegP8gJ3g4V-MkYVQl49Q3fRdOIg.PNG.hongsubakgame/image.png?type=w966)
### 코드 구현
```java
public class BubbleSort extends AwesomeSort {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
```
## 2. 선택 정렬
: 전체 원소 중에서 최소값을 찾아 해당 번째의 원소와 자리를 바꾸는 방식
### 시간복잡도
- 평균 : O(n^2)
- 최선 : O(n^2)
- 최악 : O(n^2)
### 코드 설명
: 입력한 배열의 크기만큼 100이하의 숫자가 랜덤으로 생성된 후, 선택 정렬 방식으로 오름차순으로 정렬된다.
- 입력 : 배열의 크기
- 출력 : 오른차순으로 정렬된 배열

![2](https://postfiles.pstatic.net/MjAyMTA1MDNfMTQ0/MDAxNjIwMDI5MzQ5Mzg1.T9qO95C64UpmErZkuoH2d7WE92iR9yiCM7HfxnOO-Bcg.8gqOeAKxwcQc2uWPGtHf-hJeBAp9MbEwy6tcmcRn1Kcg.PNG.hongsubakgame/image.png?type=w966)
### 코드 구현
```java
public class SelectionSort extends AwesomeSort {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = i;
            for (int j = i; j < n; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
    }
}
```
## 3. 삽입 정렬
: 정렬된 부분과 정렬이 안 된 부분으로 나눠서 정렬되어 있는 부분에 정렬할 새로운 원소의 위치를 삽입하는 방식
### 시간복잡도
- 평균 : O(n^2)
- 최선 : O(n)
- 최악 : O(n^2)
### 코드 설명
: 입력한 배열의 크기만큼 100이하의 숫자가 랜덤으로 생성된 후, 삽입 정렬 방식으로 오름차순으로 정렬된다.
- 입력 : 배열의 크기
- 출력 : 오른차순으로 정렬된 배열

![3](https://postfiles.pstatic.net/MjAyMTA1MDNfMjg0/MDAxNjIwMDI5MzU0OTU0.0MHYtgRW1a5SBiQClGMEvWisZLgp4gGudV8nIqnpkwUg.KqRDK3sY11IrwYXWa6LvlUayvEYFG7xp3zxHRsKRM9Ag.PNG.hongsubakgame/image.png?type=w966)
### 코드 구현
```java
public class InsertionSort extends AwesomeSort {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = tmp;
        }
    }
}
```

## 4. 쉘 정렬
: 일정한 간격으로 그룹을 나누고 각 그룹에 있는 원소들에 대해 삽입 정렬을 하여 전체 원소들을 정렬하는 방식
### 시간복잡도
- 평균 : O(n^1.25)
- 최선 : O(n)
- 최악 : O(n^2)
#### gap에 따른 시간복잡도
쉘 정렬은 간격(gap)을 어떻게 설정하는지에 따라 시간이 크게 달라진다. 
일반적으로 쉘 정렬을 구현할 때는 gap = n/2로 설정한다. 
하지만 gap은 짝수보다 홀수로 하는 것이 성능이 더 좋기 때문에 gap이 짝수면 1을 더해서 홀수로 만드는 것이 더 좋다.
또 이보다도 gap = n/3 + 1이 더 빠른 성능을 가진다.
히바드의 간격(2^k-1)일 때는 O(n1.5)의 시간복잡도를 가진다.
### 코드 설명
: 입력한 배열의 크기만큼 100이하의 숫자가 랜덤으로 생성된 후, 쉘 정렬 방식으로 오름차순으로 정렬된다.
- 입력 : 배열의 크기
- 출력 : 오른차순으로 정렬된 배열

![4](https://postfiles.pstatic.net/MjAyMTA1MDNfMTY2/MDAxNjIwMDI5MzYwNDg5.8B4OVsXxKet0eU1fTFYe8_WT_GMprnNNOdz3woMcwGEg.cnWjFOCtzbGQb_I4bBZJxAVjFwoVM0W-boJvn_ICsrgg.PNG.hongsubakgame/image.png?type=w966)
### 코드 구현
```java
public class ShellSort extends AwesomeSort {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int tmp = arr[i];
                int j = i;
                while (j >= gap && arr[j - gap] > tmp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }
                arr[j] = tmp;
            }
        }
    }
}
```
## 성능 분석
### 실행시간 측정
- System.nanoTime() : 10^-9 초
```java
long beforeTime = System.nanoTime();
AwesomeSort ShellSort = new ShellSort();
ShellSort.sort(arr);
long afterTime = System.nanoTime();
long secDiffTime = (afterTime - beforeTime);
System.out.println("실행시간 : " + secDiffTime);
```
### 선택 정렬과 삽입 정렬 비교
- reversed
  | 배열의 크기 | 100   | 200   | 300   | 400   | 500   | 600   | 700   | 800   | 900   | 1000  |
  | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
  | 선택 정렬 | 232800   | 712000   | 2533100   | 3458100   | 4923900   | 4776500   | 5635300   | 8065900   | 8913600   | 10283300  |
  | 삽입 정렬 | 185600   | 678300   | 2536700   | 3264000   | 4800400   | 4899600   | 5625400   | 6924700   | 7990100   | 10045300  |

- nearly sorted
  | 배열의 크기 | 100   | 200   | 300   | 400   | 500   | 600   | 700   | 800   | 900   | 1000  |
  | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
  | 선택 정렬 | 223700   | 1070700   | 2285100   | 3282900   | 4821600   | 5104400   | 5363300   | 5840100   | 7145600   | 8560600  |
  | 삽입 정렬 | 62100   | 45600   | 69600   | 79300   | 90400   | 94600   | 108700   | 102600   | 137500   | 166700  |

### 삽입 정렬과 쉘 정렬 비교
- reversed
  | 배열의 크기 | 100   | 200   | 300   | 400   | 500   | 600   | 700   | 800   | 900   | 1000  |
  | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
  | 삽입 정렬 | 185600   | 678300   | 2536700   | 3264000   | 4800400   | 4899600   | 5625400   | 6924700   | 7990100   | 20045300  |
  | 쉘 정렬 | 108000   | 157100   | 236700   | 317500   | 366200   | 446400   | 522400   | 695400   | 667000   | 739200  |

- nearly sorted
  | 배열의 크기 | 100   | 200   | 300   | 400   | 500   | 600   | 700   | 800   | 900   | 1000  |
  | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
  | 삽입 정렬 | 62100   | 45600   | 69600   | 79300   | 90400   | 94600   | 108700   | 102600   | 137500   | 166700  |
  | 쉘 정렬 | 94600   | 133500   | 168600   | 222800   | 384800   | 393000   | 380100   | 423600   | 458500   | 589700  |

### 버블정렬
- random
  | 배열의 크기 | 100   | 200   | 300   | 400   | 500   | 600   | 700   | 800   | 900   | 1000  |
  | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- | ---- |
  | 버블 정렬 | 933600   | 3462500   | 4741300   | 5655300   | 9789400   | 8551100   | 14083100   | 10463800   | 15324700   | 19200400  |

### 결과
검정 : 선택 정렬, 파랑 : 삽입 정렬, 빨강 : 쉘 정렬
#### revesed
![5](https://postfiles.pstatic.net/MjAyMTA1MDRfNTcg/MDAxNjIwMTE0NDEwMTIx.3gea2N2VQmxRFFujiWR0jpmEq0cLGuBzusrA70S8w8Ig.hNMC1ZBwJ-N9OErntJ1VcGr5uARRrpbN9zrQTt_2t5Eg.PNG.hongsubakgame/image.png?type=w966)
#### nearly sorted
![6](https://postfiles.pstatic.net/MjAyMTA1MDRfMTA2/MDAxNjIwMTE0NDE2MzM2.l3T_V3n5FYtn7nJ1nBvgdKH0KhJOl-HrJKIOwf0rKkEg.3n_0vGnMrNhCWKmEVYGwMxfG8bg8hbFhmIitMJOTsNQg.PNG.hongsubakgame/image.png?type=w966)
### 결론
역방향으로 정렬된 데이터에서 선택정렬과 삽입정렬은 비슷한 실행시간이 걸렸다. 
하지만 어느 정도 정렬된 데이터에서 선택정렬은 역방향으로 된 데이터에서와 비슷한 실행시간이 걸렸지만, 삽입정렬은 실행시간이 훨씬 줄어들었다.
버블정렬도 선택정렬처럼 시간복잡도가 항상 O(n^2)이므로 선택정렬과 비슷한 성능을 가질 것이다.
실행시간을 측정하였을 때, 버블정렬의 실행시간이 제일 오래 걸렸다. 
위 그래프에서 삽입정렬과 쉘정렬을 비교해보면 역방향으로 정렬된 데이터에서 쉘 정렬의 성능이 더 좋다는 것을 알 수 있다. 
이는 쉘 정렬이 이동하는 간격이 크기 때문에 제자리로 더 빠르게 찾아갈 수 있어 연산의 횟수가 줄어들었기 때문이다. 
반면 거의 정렬된 데이터에서는 대체적으로 삽입정렬이 쉘정렬보다 조금 더 빨랐지만 차이가 많이 나지는 않았다. 
즉, 선택정렬과 버블정렬은 성능이 별로 좋지 않고, 삽입정렬은 어느 정도 정렬이 되어있는 상태에서는 성능이 좋지만 정렬할 대상의 제자리가 멀리 있으면 연산 횟수가 많아져서 성능이 안 좋아진다. 
이 단점을 보완한 것이 쉘 정렬이고 설정한 간격에 따라 성능이 달라질 수 있다.
