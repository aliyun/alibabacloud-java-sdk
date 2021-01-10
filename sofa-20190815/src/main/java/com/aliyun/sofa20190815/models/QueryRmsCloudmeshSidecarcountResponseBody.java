// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshSidecarcountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshSidecarcountResponseBodyResponse response;

    public static QueryRmsCloudmeshSidecarcountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshSidecarcountResponseBody self = new QueryRmsCloudmeshSidecarcountResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshSidecarcountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshSidecarcountResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshSidecarcountResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshSidecarcountResponseBody setResponse(QueryRmsCloudmeshSidecarcountResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshSidecarcountResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshSidecarcountResponseBodyResponseData extends TeaModel {
        @NameInMap("AllCount")
        public String allCount;

        public static QueryRmsCloudmeshSidecarcountResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSidecarcountResponseBodyResponseData self = new QueryRmsCloudmeshSidecarcountResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSidecarcountResponseBodyResponseData setAllCount(String allCount) {
            this.allCount = allCount;
            return this;
        }
        public String getAllCount() {
            return this.allCount;
        }

    }

    public static class QueryRmsCloudmeshSidecarcountResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshSidecarcountResponseBodyResponseData data;

        public static QueryRmsCloudmeshSidecarcountResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSidecarcountResponseBodyResponse self = new QueryRmsCloudmeshSidecarcountResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSidecarcountResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshSidecarcountResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshSidecarcountResponseBodyResponse setData(QueryRmsCloudmeshSidecarcountResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshSidecarcountResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
