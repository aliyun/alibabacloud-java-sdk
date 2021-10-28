// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class QueryHitUserResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryHitUserResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryHitUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryHitUserResponseBody self = new QueryHitUserResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryHitUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryHitUserResponseBody setData(QueryHitUserResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryHitUserResponseBodyData getData() {
        return this.data;
    }

    public QueryHitUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryHitUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryHitUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryHitUserResponseBodyDataQueryHitUserEntry extends TeaModel {
        @NameInMap("AliyunIdkp")
        public String aliyunIdkp;

        @NameInMap("GmtCreated")
        public Long gmtCreated;

        @NameInMap("IdType")
        public String idType;

        @NameInMap("ResultTag")
        public String resultTag;

        @NameInMap("UserId")
        public String userId;

        public static QueryHitUserResponseBodyDataQueryHitUserEntry build(java.util.Map<String, ?> map) throws Exception {
            QueryHitUserResponseBodyDataQueryHitUserEntry self = new QueryHitUserResponseBodyDataQueryHitUserEntry();
            return TeaModel.build(map, self);
        }

        public QueryHitUserResponseBodyDataQueryHitUserEntry setAliyunIdkp(String aliyunIdkp) {
            this.aliyunIdkp = aliyunIdkp;
            return this;
        }
        public String getAliyunIdkp() {
            return this.aliyunIdkp;
        }

        public QueryHitUserResponseBodyDataQueryHitUserEntry setGmtCreated(Long gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public Long getGmtCreated() {
            return this.gmtCreated;
        }

        public QueryHitUserResponseBodyDataQueryHitUserEntry setIdType(String idType) {
            this.idType = idType;
            return this;
        }
        public String getIdType() {
            return this.idType;
        }

        public QueryHitUserResponseBodyDataQueryHitUserEntry setResultTag(String resultTag) {
            this.resultTag = resultTag;
            return this;
        }
        public String getResultTag() {
            return this.resultTag;
        }

        public QueryHitUserResponseBodyDataQueryHitUserEntry setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryHitUserResponseBodyData extends TeaModel {
        @NameInMap("QueryHitUserEntry")
        public java.util.List<QueryHitUserResponseBodyDataQueryHitUserEntry> queryHitUserEntry;

        public static QueryHitUserResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryHitUserResponseBodyData self = new QueryHitUserResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryHitUserResponseBodyData setQueryHitUserEntry(java.util.List<QueryHitUserResponseBodyDataQueryHitUserEntry> queryHitUserEntry) {
            this.queryHitUserEntry = queryHitUserEntry;
            return this;
        }
        public java.util.List<QueryHitUserResponseBodyDataQueryHitUserEntry> getQueryHitUserEntry() {
            return this.queryHitUserEntry;
        }

    }

}
