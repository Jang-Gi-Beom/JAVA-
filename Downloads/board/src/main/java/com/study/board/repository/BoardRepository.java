package com.study.board.repository;

import com.study.board.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends JpaRepository<Board, Integer> {
    Page<Board> findByTitleContaining(String searchKeyword, Pageable pageable);


    /* JPA Repository
        findBy(컬럼이름)Containing
        -> 컬럼에서 키워드가 포함된 것을 찾겠다

        * 키워드가 포함된 모든 데이터 검색
        ex) '한코딩'을 검색하고 싶을 때 '한'만 입력해도 됨

     */
}
