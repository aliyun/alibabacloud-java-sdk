// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListdataidsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshListdataidsResponseBodyResponse response;

    public static QueryRmsCloudmeshListdataidsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListdataidsResponseBody self = new QueryRmsCloudmeshListdataidsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListdataidsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshListdataidsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshListdataidsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshListdataidsResponseBody setResponse(QueryRmsCloudmeshListdataidsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshListdataidsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshListdataidsResponseBodyResponseData extends TeaModel {
        @NameInMap("TotalCnt")
        public String totalCnt;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static QueryRmsCloudmeshListdataidsResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListdataidsResponseBodyResponseData self = new QueryRmsCloudmeshListdataidsResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListdataidsResponseBodyResponseData setTotalCnt(String totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }
        public String getTotalCnt() {
            return this.totalCnt;
        }

        public QueryRmsCloudmeshListdataidsResponseBodyResponseData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryRmsCloudmeshListdataidsResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshListdataidsResponseBodyResponseData data;

        public static QueryRmsCloudmeshListdataidsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListdataidsResponseBodyResponse self = new QueryRmsCloudmeshListdataidsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListdataidsResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshListdataidsResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshListdataidsResponseBodyResponse setData(QueryRmsCloudmeshListdataidsResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshListdataidsResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
