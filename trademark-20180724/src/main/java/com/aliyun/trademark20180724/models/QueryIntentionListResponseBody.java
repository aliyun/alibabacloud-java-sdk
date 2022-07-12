// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryIntentionListResponseBody extends TeaModel {
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("Data")
    public QueryIntentionListResponseBodyData data;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryIntentionListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryIntentionListResponseBody self = new QueryIntentionListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryIntentionListResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryIntentionListResponseBody setData(QueryIntentionListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryIntentionListResponseBodyData getData() {
        return this.data;
    }

    public QueryIntentionListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryIntentionListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryIntentionListResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryIntentionListResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryIntentionListResponseBodyDataIntention extends TeaModel {
        @NameInMap("BizId")
        public String bizId;

        @NameInMap("Classification")
        public String classification;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("RegisterNumber")
        public String registerNumber;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static QueryIntentionListResponseBodyDataIntention build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionListResponseBodyDataIntention self = new QueryIntentionListResponseBodyDataIntention();
            return TeaModel.build(map, self);
        }

        public QueryIntentionListResponseBodyDataIntention setBizId(String bizId) {
            this.bizId = bizId;
            return this;
        }
        public String getBizId() {
            return this.bizId;
        }

        public QueryIntentionListResponseBodyDataIntention setClassification(String classification) {
            this.classification = classification;
            return this;
        }
        public String getClassification() {
            return this.classification;
        }

        public QueryIntentionListResponseBodyDataIntention setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public QueryIntentionListResponseBodyDataIntention setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryIntentionListResponseBodyDataIntention setRegisterNumber(String registerNumber) {
            this.registerNumber = registerNumber;
            return this;
        }
        public String getRegisterNumber() {
            return this.registerNumber;
        }

        public QueryIntentionListResponseBodyDataIntention setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public QueryIntentionListResponseBodyDataIntention setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryIntentionListResponseBodyDataIntention setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public QueryIntentionListResponseBodyDataIntention setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryIntentionListResponseBodyData extends TeaModel {
        @NameInMap("Intention")
        public java.util.List<QueryIntentionListResponseBodyDataIntention> intention;

        public static QueryIntentionListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryIntentionListResponseBodyData self = new QueryIntentionListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryIntentionListResponseBodyData setIntention(java.util.List<QueryIntentionListResponseBodyDataIntention> intention) {
            this.intention = intention;
            return this;
        }
        public java.util.List<QueryIntentionListResponseBodyDataIntention> getIntention() {
            return this.intention;
        }

    }

}
