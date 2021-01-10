// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshListappserviceversionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshListappserviceversionsResponseBodyResponse response;

    public static QueryRmsCloudmeshListappserviceversionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshListappserviceversionsResponseBody self = new QueryRmsCloudmeshListappserviceversionsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshListappserviceversionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshListappserviceversionsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshListappserviceversionsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshListappserviceversionsResponseBody setResponse(QueryRmsCloudmeshListappserviceversionsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshListappserviceversionsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData extends TeaModel {
        @NameInMap("TotalCnt")
        public String totalCnt;

        @NameInMap("Items")
        public java.util.List<String> items;

        public static QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData self = new QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData setTotalCnt(String totalCnt) {
            this.totalCnt = totalCnt;
            return this;
        }
        public String getTotalCnt() {
            return this.totalCnt;
        }

        public QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData setItems(java.util.List<String> items) {
            this.items = items;
            return this;
        }
        public java.util.List<String> getItems() {
            return this.items;
        }

    }

    public static class QueryRmsCloudmeshListappserviceversionsResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData data;

        public static QueryRmsCloudmeshListappserviceversionsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshListappserviceversionsResponseBodyResponse self = new QueryRmsCloudmeshListappserviceversionsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshListappserviceversionsResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshListappserviceversionsResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshListappserviceversionsResponseBodyResponse setData(QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshListappserviceversionsResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
