// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTmCollectionPageListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTmCollectionPageListResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryTmCollectionPageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTmCollectionPageListResponseBody self = new QueryTmCollectionPageListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTmCollectionPageListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTmCollectionPageListResponseBody setData(QueryTmCollectionPageListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTmCollectionPageListResponseBodyData getData() {
        return this.data;
    }

    public QueryTmCollectionPageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTmCollectionPageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTmCollectionPageListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTmCollectionPageListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTmCollectionPageListResponseBodyDataTrademark extends TeaModel {
        @NameInMap("Classification")
        public String classification;

        @NameInMap("Collected")
        public Boolean collected;

        @NameInMap("CollectionContent")
        public String collectionContent;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ItemId")
        public String itemId;

        @NameInMap("TmName")
        public String tmName;

        public static QueryTmCollectionPageListResponseBodyDataTrademark build(java.util.Map<String, ?> map) throws Exception {
            QueryTmCollectionPageListResponseBodyDataTrademark self = new QueryTmCollectionPageListResponseBodyDataTrademark();
            return TeaModel.build(map, self);
        }

        public QueryTmCollectionPageListResponseBodyDataTrademark setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryTmCollectionPageListResponseBodyDataTrademark setCollected(Boolean collected) {
            this.collected = collected;
            return this;
        }
        public Boolean getCollected() {
            return this.collected;
        }

        public QueryTmCollectionPageListResponseBodyDataTrademark setCollectionContent(String collectionContent) {
            this.collectionContent = collectionContent;
            return this;
        }
        public String getCollectionContent() {
            return this.collectionContent;
        }

        public QueryTmCollectionPageListResponseBodyDataTrademark setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryTmCollectionPageListResponseBodyDataTrademark setItemId(String itemId) {
            this.itemId = itemId;
            return this;
        }
        public String getItemId() {
            return this.itemId;
        }

        public QueryTmCollectionPageListResponseBodyDataTrademark setTmName(String tmName) {
            this.tmName = tmName;
            return this;
        }
        public String getTmName() {
            return this.tmName;
        }

    }

    public static class QueryTmCollectionPageListResponseBodyData extends TeaModel {
        @NameInMap("Trademark")
        public java.util.List<QueryTmCollectionPageListResponseBodyDataTrademark> trademark;

        public static QueryTmCollectionPageListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTmCollectionPageListResponseBodyData self = new QueryTmCollectionPageListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTmCollectionPageListResponseBodyData setTrademark(java.util.List<QueryTmCollectionPageListResponseBodyDataTrademark> trademark) {
            this.trademark = trademark;
            return this;
        }
        public java.util.List<QueryTmCollectionPageListResponseBodyDataTrademark> getTrademark() {
            return this.trademark;
        }

    }

}
