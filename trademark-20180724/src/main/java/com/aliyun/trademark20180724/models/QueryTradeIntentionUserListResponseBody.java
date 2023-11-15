// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryTradeIntentionUserListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryTradeIntentionUserListResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryTradeIntentionUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTradeIntentionUserListResponseBody self = new QueryTradeIntentionUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTradeIntentionUserListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryTradeIntentionUserListResponseBody setData(QueryTradeIntentionUserListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTradeIntentionUserListResponseBodyData getData() {
        return this.data;
    }

    public QueryTradeIntentionUserListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTradeIntentionUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTradeIntentionUserListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryTradeIntentionUserListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryTradeIntentionUserListResponseBodyDataTrademark extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("Description")
        public String description;

        @NameInMap("DocumentDate")
        public String documentDate;

        @NameInMap("DocumentName")
        public String documentName;

        @NameInMap("DocumentUrl")
        public String documentUrl;

        @NameInMap("Grade")
        public Integer grade;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("RegisterNumber")
        public String registerNumber;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UserName")
        public String userName;

        public static QueryTradeIntentionUserListResponseBodyDataTrademark build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeIntentionUserListResponseBodyDataTrademark self = new QueryTradeIntentionUserListResponseBodyDataTrademark();
            return TeaModel.build(map, self);
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setDocumentDate(String documentDate) {
            this.documentDate = documentDate;
            return this;
        }
        public String getDocumentDate() {
            return this.documentDate;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setDocumentName(String documentName) {
            this.documentName = documentName;
            return this;
        }
        public String getDocumentName() {
            return this.documentName;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setDocumentUrl(String documentUrl) {
            this.documentUrl = documentUrl;
            return this;
        }
        public String getDocumentUrl() {
            return this.documentUrl;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setGrade(Integer grade) {
            this.grade = grade;
            return this;
        }
        public Integer getGrade() {
            return this.grade;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setRegisterNumber(String registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }
        public String getRegisterNumber() {
            return this.registerNumber;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryTradeIntentionUserListResponseBodyDataTrademark setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

    public static class QueryTradeIntentionUserListResponseBodyData extends TeaModel {
        @NameInMap("Trademark")
        public java.util.List<QueryTradeIntentionUserListResponseBodyDataTrademark> trademark;

        public static QueryTradeIntentionUserListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTradeIntentionUserListResponseBodyData self = new QueryTradeIntentionUserListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTradeIntentionUserListResponseBodyData setTrademark(java.util.List<QueryTradeIntentionUserListResponseBodyDataTrademark> trademark) {
            this.trademark = trademark;
            return this;
        }
        public java.util.List<QueryTradeIntentionUserListResponseBodyDataTrademark> getTrademark() {
            return this.trademark;
        }

    }

}
