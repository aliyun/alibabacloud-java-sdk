// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class HotNewsRecommendResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public HotNewsRecommendResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>ok</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>575D5893-01DB-5C81-A899-74F67616762A</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static HotNewsRecommendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        HotNewsRecommendResponseBody self = new HotNewsRecommendResponseBody();
        return TeaModel.build(map, self);
    }

    public HotNewsRecommendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public HotNewsRecommendResponseBody setData(HotNewsRecommendResponseBodyData data) {
        this.data = data;
        return this;
    }
    public HotNewsRecommendResponseBodyData getData() {
        return this.data;
    }

    public HotNewsRecommendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public HotNewsRecommendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public HotNewsRecommendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class HotNewsRecommendResponseBodyDataNews extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("content")
        public String content;

        @NameInMap("imageUrls")
        public java.util.List<String> imageUrls;

        /**
         * <strong>example:</strong>
         * <p>2024-09-10 15:32:00</p>
         */
        @NameInMap("pubTime")
        public String pubTime;

        @NameInMap("searchSource")
        public String searchSource;

        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>xx</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p><a href="http://xxx">http://xxx</a></p>
         */
        @NameInMap("url")
        public String url;

        public static HotNewsRecommendResponseBodyDataNews build(java.util.Map<String, ?> map) throws Exception {
            HotNewsRecommendResponseBodyDataNews self = new HotNewsRecommendResponseBodyDataNews();
            return TeaModel.build(map, self);
        }

        public HotNewsRecommendResponseBodyDataNews setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public HotNewsRecommendResponseBodyDataNews setImageUrls(java.util.List<String> imageUrls) {
            this.imageUrls = imageUrls;
            return this;
        }
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public HotNewsRecommendResponseBodyDataNews setPubTime(String pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public String getPubTime() {
            return this.pubTime;
        }

        public HotNewsRecommendResponseBodyDataNews setSearchSource(String searchSource) {
            this.searchSource = searchSource;
            return this;
        }
        public String getSearchSource() {
            return this.searchSource;
        }

        public HotNewsRecommendResponseBodyDataNews setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public HotNewsRecommendResponseBodyDataNews setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public HotNewsRecommendResponseBodyDataNews setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class HotNewsRecommendResponseBodyData extends TeaModel {
        @NameInMap("news")
        public java.util.List<HotNewsRecommendResponseBodyDataNews> news;

        public static HotNewsRecommendResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            HotNewsRecommendResponseBodyData self = new HotNewsRecommendResponseBodyData();
            return TeaModel.build(map, self);
        }

        public HotNewsRecommendResponseBodyData setNews(java.util.List<HotNewsRecommendResponseBodyDataNews> news) {
            this.news = news;
            return this;
        }
        public java.util.List<HotNewsRecommendResponseBodyDataNews> getNews() {
            return this.news;
        }

    }

}
