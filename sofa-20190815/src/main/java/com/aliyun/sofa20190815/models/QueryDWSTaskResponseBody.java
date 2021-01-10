// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryDWSTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public java.util.List<QueryDWSTaskResponseBodyData> data;

    public static QueryDWSTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDWSTaskResponseBody self = new QueryDWSTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDWSTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDWSTaskResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDWSTaskResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryDWSTaskResponseBody setData(java.util.List<QueryDWSTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryDWSTaskResponseBodyData> getData() {
        return this.data;
    }

    public static class QueryDWSTaskResponseBodyData extends TeaModel {
        @NameInMap("Detail")
        public String detail;

        @NameInMap("Name")
        public String name;

        public static QueryDWSTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryDWSTaskResponseBodyData self = new QueryDWSTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryDWSTaskResponseBodyData setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public QueryDWSTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
