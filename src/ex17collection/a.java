package ex17collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

/*
 ArrayList<E> : List계열의 컬렉션
  - 데이터의 중복 저장이 허용된다.
  - 데이터의 저장 순서를 보장한다.
  - 데이터 접근시 get() 혹은 iterator()를 이용한다.
  - Array라는 이름처럼 '배열'의 특성을 가지고 있어 index를 통한 저장 및 접근이 가능하다.
 */
public class a {

   public static void main(String[] args) {
      
      /*
       String인스턴스를 저장할 수 있는 List컬렉션 생성 ArrayList와 나머지 컬렉션들은 
       데이터를 저장하는 내부적인 자료구조만 다를뿐 사용법은 100% 동일하다.
       */
      ArrayList<String> list = new ArrayList<String>();
      // LinkedList<String> list = new LinkedList<String>();
      // Vector<String> list = new Vector<String>();
      /*
       객체저장 : add()
             add(인스턴스) : 순차적으로 저장하면서 인덱스는 0부터 자동으로 부여한다.
             add(인덱스, 인스턴스) : 데이터 저장시 인덱스를 직접 부여한다.
                                 단, 이덱슬르 건너뛰면 에러가 발생하므로 주의해야한다.
       */
      list.add("소녀시대");
      list.add("빅뱅");
      list.add("트와이스");
      list.add(3,"워너원");
//      list.add(5,"소방차ㅋㅋ");
      list.add(list.size(),"오마이걸");
      list.add(list.size(),"방탄소년단");
      System.out.println("중복 저장전 객체수:"+ list.size());

      /*
       중복저장
       */
      System.out.println(list.add("트와이스") ? "중복저장됨":"중복저장안됨");
      System.out.println("중복 저장후 객체수:"+ list.size());
      
      /*
       출력하기
       */
      System.out.println("\n[일반for문 사용]");
      for(int i=0 ; i<list.size() ; i++) {
         System.out.println(list.get(i) +" ");
      }
      System.out.println("\n[확장for문 사용]");
      for(String obj : list) {
         System.out.println(obj +" ");
      }
      
      /*
       Iterator사용법
       */
      System.out.println("\n[반복자(Iterator) 사용]");
      Iterator<String> itr = list.iterator();
      while(itr.hasNext()) {
         System.out.println(itr.next() +" ");
      }
      System.out.println("\n==========================\n");
      
      /*
       덮어쓰기
       */
      list.set(4, "오마이걸>덮어쓰기");
      for(Object obj : list) {
         System.out.println(obj +" ");
      }
      System.out.println("\n==========================\n");
      
      /*
       삽입하기(끼워넣기)
       */
      list.add(4, "블랙핑크>삽입하기");
      for(Object obj : list) {
         System.out.println(obj +" ");
      }
      System.out.println("\n==========================\n");
      
      /*
       포함여부확인
       */
      System.out.println(list.contains("빅뱅") ? "빅뱅 있음" : "빅뱅 없음");
      System.out.println(list.contains("블랙핑크") ? "블랙핑크 있음" : "블랙핑크 없음");
      
      /*
       삭제
       방법1
       */
      Object obj = list.remove(2);
      System.out.println("삭제된객체:"+ obj);
      
      /*
       방법2
       */
      int index = list.indexOf("빅뱅");
      System.out.println("빅뱅의 index="+ index);
      list.remove(index);
      
      /*
       방법3
       */
      System.out.println(list.remove("방탄소년단") ? "삭제성공(방탄)":"삭제실패(방탄)");
      System.out.println(list.remove("오마이걸") ? "삭제성공(마이걸)":"삭제실패(마이걸)");
      System.out.println("삭제후 출력");
      for(Object ob : list) {
         System.out.print(ob +" ");
      }
      System.out.println();
      
      /*
       전체삭제
       */
      list.removeAll(list);
      list.clear();
      System.out.println("전체삭제후 객체수:"+ list.size());
      
   }

}