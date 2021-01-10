// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListpodsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshListpodsResponseBodyResponse response;

    public static QueryRmsCloudmeshListpodsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListpodsResponseBody self = new QueryRmsCloudmeshListpodsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListpodsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshListpodsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshListpodsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshListpodsResponseBody setResponse(QueryRmsCloudmeshListpodsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshListpodsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshListpodsResponseBodyResponseData extends TeaModel {
        @NameInMap("TotalCnt")
        public String totalCnt;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static QueryRmsCloudmeshListpodsResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListpodsResponseBodyResponseData self = new QueryRmsCloudmeshListpodsResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListpodsResponseBodyResponseData setTotalCnt(String totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }
        public String getTotalCnt() {
            return this.totalCnt;
        }

        public QueryRmsCloudmeshListpodsResponseBodyResponseData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryRmsCloudmeshListpodsResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshListpodsResponseBodyResponseData data;

        public static QueryRmsCloudmeshListpodsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListpodsResponseBodyResponse self = new QueryRmsCloudmeshListpodsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListpodsResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshListpodsResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshListpodsResponseBodyResponse setData(QueryRmsCloudmeshListpodsResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshListpodsResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
