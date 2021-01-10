// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsXflushDelegateResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsXflushDelegateResponseBodyResponse response;

    public static QueryRmsXflushDelegateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsXflushDelegateResponseBody self = new QueryRmsXflushDelegateResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsXflushDelegateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsXflushDelegateResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsXflushDelegateResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsXflushDelegateResponseBody setResponse(QueryRmsXflushDelegateResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsXflushDelegateResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsXflushDelegateResponseBodyResponseData extends TeaModel {
        @NameInMap("ErrCode")
        public String errCode;

        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("ErrResolution")
        public String errResolution;

        @NameInMap("Message")
        public String message;

        @NameInMap("Module")
        public String module;

        @NameInMap("Success")
        public Boolean success;

        public static QueryRmsXflushDelegateResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsXflushDelegateResponseBodyResponseData self = new QueryRmsXflushDelegateResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsXflushDelegateResponseBodyResponseData setErrCode(String errCode) {
            this.errCode = errCode;
            return this;
        }
        public String getErrCode() {
            return this.errCode;
        }

        public QueryRmsXflushDelegateResponseBodyResponseData setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsXflushDelegateResponseBodyResponseData setErrResolution(String errResolution) {
            this.errResolution = errResolution;
            return this;
        }
        public String getErrResolution() {
            return this.errResolution;
        }

        public QueryRmsXflushDelegateResponseBodyResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryRmsXflushDelegateResponseBodyResponseData setModule(String module) {
            this.module = module;
            return this;
        }
        public String getModule() {
            return this.module;
        }

        public QueryRmsXflushDelegateResponseBodyResponseData setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class QueryRmsXflushDelegateResponseBodyResponse extends TeaModel {
        @NameInMap("Layer")
        public String layer;

        @NameInMap("Data")
        public QueryRmsXflushDelegateResponseBodyResponseData data;

        public static QueryRmsXflushDelegateResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsXflushDelegateResponseBodyResponse self = new QueryRmsXflushDelegateResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsXflushDelegateResponseBodyResponse setLayer(String layer) {
            this.layer = layer;
            return this;
        }
        public String getLayer() {
            return this.layer;
        }

        public QueryRmsXflushDelegateResponseBodyResponse setData(QueryRmsXflushDelegateResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsXflushDelegateResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
