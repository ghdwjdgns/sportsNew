import React from 'react';
import { Link } from 'react-router-dom';
import '../css/ArticleList.css'; // CSS 파일 경로에 따라 수정

const ArticleList = ({ articles }) => {
  const chunkedArticles = [];
  for (let i = 0; i < articles.content.length; i += 3) {
    chunkedArticles.push(articles.content.slice(i, i + 3));
  }

  return (
      <div className="cards-wrapper">
        {chunkedArticles.map((row, rowIndex) => (
            <div key={rowIndex} className="card-grid-space">
              {row.map((article, articleIndex) => (
                  <a
                      key={article.id}
                      className="card"
                      href={`/article/${article.id}`}
                      style={{
                        backgroundImage: `url(${article.image_url})`, // 배경 이미지 설정
                        backgroundSize: 'cover',
                        backgroundPosition: 'center',
                        backgroundRepeat: 'no-repeat'
                      }}
                  >
                    <div>
                      <h1>{article.title}</h1>
                      <p>{article.content}</p> {/* 기사 요약을 표시하는 속성을 사용하도록 수정 */}
                      <div className="date">{article.news_time}</div> {/* 기사 날짜를 표시하는 속성을 사용하도록 수정 */}
                      <div className="tags">

                      </div>
                    </div>
                  </a>
              ))}
            </div>
        ))}
      </div>
  );
};

export default ArticleList;
