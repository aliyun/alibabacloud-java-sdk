// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshRunningstatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshRunningstatesResponseBodyResponse response;

    public static QueryRmsCloudmeshRunningstatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshRunningstatesResponseBody self = new QueryRmsCloudmeshRunningstatesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshRunningstatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshRunningstatesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshRunningstatesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshRunningstatesResponseBody setResponse(QueryRmsCloudmeshRunningstatesResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshRunningstatesResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshRunningstatesResponseBodyResponseData extends TeaModel {
        @NameInMap("RunningCount")
        public String runningCount;

        @NameInMap("Status")
        public String status;

        @NameInMap("Timer")
        public Long timer;

        public static QueryRmsCloudmeshRunningstatesResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshRunningstatesResponseBodyResponseData self = new QueryRmsCloudmeshRunningstatesResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshRunningstatesResponseBodyResponseData setRunningCount(String runningCount) {
            this.runningCount = runningCount;
            return this;
        }
        public String getRunningCount() {
            return this.runningCount;
        }

        public QueryRmsCloudmeshRunningstatesResponseBodyResponseData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRmsCloudmeshRunningstatesResponseBodyResponseData setTimer(Long timer) {
            this.timer = timer;
            return this;
        }
        public Long getTimer() {
            return this.timer;
        }

    }

    public static class QueryRmsCloudmeshRunningstatesResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public java.util.List<QueryRmsCloudmeshRunningstatesResponseBodyResponseData> data;

        public static QueryRmsCloudmeshRunningstatesResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshRunningstatesResponseBodyResponse self = new QueryRmsCloudmeshRunningstatesResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshRunningstatesResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshRunningstatesResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshRunningstatesResponseBodyResponse setData(java.util.List<QueryRmsCloudmeshRunningstatesResponseBodyResponseData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshRunningstatesResponseBodyResponseData> getData() {
            return this.data;
        }

    }

}
