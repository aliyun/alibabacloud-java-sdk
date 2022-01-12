// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryAppResValueResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // data
    @NameInMap("Data")
    public java.util.List<QueryAppResValueResponseBodyData> data;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // requestId
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    // totalCount
    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryAppResValueResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAppResValueResponseBody self = new QueryAppResValueResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAppResValueResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAppResValueResponseBody setData(java.util.List<QueryAppResValueResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryAppResValueResponseBodyData> getData() {
        return this.data;
    }

    public QueryAppResValueResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryAppResValueResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAppResValueResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAppResValueResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAppResValueResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryAppResValueResponseBodyData extends TeaModel {
        // id
        @NameInMap("Id")
        public String id;

        // 配置
        @NameInMap("Res")
        public DAppRes res;

        // 配置值
        @NameInMap("Value")
        public String value;

        public static QueryAppResValueResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAppResValueResponseBodyData self = new QueryAppResValueResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAppResValueResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAppResValueResponseBodyData setRes(DAppRes res) {
            this.res = res;
            return this;
        }
        public DAppRes getRes() {
            return this.res;
        }

        public QueryAppResValueResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
