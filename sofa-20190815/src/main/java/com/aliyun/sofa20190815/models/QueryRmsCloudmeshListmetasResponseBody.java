// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListmetasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshListmetasResponseBodyResponse response;

    public static QueryRmsCloudmeshListmetasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListmetasResponseBody self = new QueryRmsCloudmeshListmetasResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListmetasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshListmetasResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshListmetasResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshListmetasResponseBody setResponse(QueryRmsCloudmeshListmetasResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshListmetasResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshListmetasResponseBodyResponseData extends TeaModel {
        @NameInMap("TotalCnt")
        public String totalCnt;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static QueryRmsCloudmeshListmetasResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListmetasResponseBodyResponseData self = new QueryRmsCloudmeshListmetasResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListmetasResponseBodyResponseData setTotalCnt(String totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }
        public String getTotalCnt() {
            return this.totalCnt;
        }

        public QueryRmsCloudmeshListmetasResponseBodyResponseData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryRmsCloudmeshListmetasResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshListmetasResponseBodyResponseData data;

        public static QueryRmsCloudmeshListmetasResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListmetasResponseBodyResponse self = new QueryRmsCloudmeshListmetasResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListmetasResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshListmetasResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshListmetasResponseBodyResponse setData(QueryRmsCloudmeshListmetasResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshListmetasResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
