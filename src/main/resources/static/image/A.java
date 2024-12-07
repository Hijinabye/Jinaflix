
        .poster:hover {
            transform: scale(1.05);
            box-shadow: 0 4px 15px rgba(255, 102, 178, 0.5); /* 핑크색 그림자 추가 */
        }

        .poster:hover .title, .poster:hover .views, .poster:hover .likes {
            opacity: 1; /* 마우스를 올렸을 때 표시 */
        }

        .poster-container::-webkit-scrollbar {
            display: none; /* 스크롤바 숨기기 */
        }

        .poster-container {
            -ms-overflow-style: none; /* IE and Edge */
            scrollbar-width: none; /* Firefox */
        }
    </style>
</head>
<body>

<header class="header">
    <a href="../../../../../../../Desktop/JINFLIX/홈화면.html">
        <img src="/image/logo 설명 0.png" alt="Jinflix Logo">
    </a>
    <nav>
        <a href="장르.html">장르</a>
        <a href="마이페이지.html">마이프로필</a>
    </nav>
</header>

<div class="container">
    <!-- 장르별 TOP 10 Section -->
    <div class="genre-section">
        <h2>장르별 TOP 10</h2>
        <div class="poster-container">
            <div class="poster">
                <img src="/image/장르표지01.jpg" alt="작품명01">
                <div class="title">작품명01</div>
                <div class="views">조회수: 1,234</div>
                <div class="likes">좋아요: 567</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지02.jpg" alt="작품명02">
                <div class="title">작품명02</div>
                <div class="views">조회수: 2,345</div>
                <div class="likes">좋아요: 678</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지03.jpg" alt="작품명03">
                <div class="title">작품명03</div>
                <div class="views">조회수: 3,456</div>
                <div class="likes">좋아요: 789</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지04.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지13.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지14.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지15.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지18.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div><div class="poster">
                <img src="/image/장르표지19.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지20.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지21.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
        </div>
    </div>

    <!-- 장르별 신작 Section -->
    <div class="genre-section">
        <h2>장르별 신작</h2>
        <div class="poster-container">
            <div class="poster">
                <img src="/image/장르표지05.jpg" alt="작품명05">
                <div class="title">작품명05</div>
                <div class="views">조회수: 234</div>
                <div class="likes">좋아요: 45</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지06.jpg" alt="작품명06">
                <div class="title">작품명06</div>
                <div class="views">조회수: 345</div>
                <div class="likes">좋아요: 56</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지07.jpg" alt="작품명07">
                <div class="title">작품명07</div>
                <div class="views">조회수: 456</div>
                <div class="likes">좋아요: 67</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지08.jpg" alt="작품명08">
                <div class="title">작품명08</div>
                <div class="views">조회수: 567</div>
                <div class="likes">좋아요: 78</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지09.jpg" alt="작품명09">
                <div class="title">작품명08</div>
                <div class="views">조회수: 807</div>
                <div class="likes">좋아요: 38</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지16.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
            <div class="poster">
                <img src="/image/장르표지17.jpg" alt="작품명04">
                <div class="title">작품명04</div>
                <div class="views">조회수: 4,567</div>
                <div class="likes">좋아요: 890</div>
            </div>
        </div>
    </div>

    <!-- 장르별 랜덤 추천작 Section -->
    <div class="genre-section">
        <h2>장르별 랜덤 추천작</h2>
        <div class="poster-container">
            <div class="poster">
                <img src="/image/작품09.jpg" alt="작품명09">
                <div class="title">작품명09</div>
                <div class="views">조회수: 678</div>
                <div class="likes">좋아요: 89</div>
            </div>
            <div class="poster">
                <img src="/image/작품10.jpg" alt="작품명10">
                <div class="title">작품명10</div>
                <div class="views">조회수: 789</div>
                <div class="likes">좋아요: 90</div>
            </div>
            <div class="poster">
                <img src="/image/작품11.jpg" alt="작품명11">
                <div class="title">작품명11</div>
                <div class="views">조회수: 890</div>
                <div class="likes">좋아요: 101</div>
            </div>
            <div class="poster">
                <img src="/image/작품12.jpg" alt="작품명12">
                    <div class="title">작품명12</div>
                    <div class="views">조회수: 123</div>
                    <div class="likes">좋아요: 22</div>
                </div>
            </div>
        </div>
    </div>

    <script>
        // 애니메이션 효과를 위한 JavaScript
        document.querySelectorAll('.poster').forEach(poster => {
            poster.addEventListener('mouseenter', () => {
                poster.style.transform = 'scale(1.1)'; // 마우스 오버 시 확대
                poster.style.transition = 'transform 0.3s ease'; // 애니메이션 효과
            });
            poster.addEventListener('mouseleave', () => {
                poster.style.transform = 'scale(1)'; // 마우스 아웃 시 원래 크기로 복귀
            });
        });
    </script>

</body>
</html>
