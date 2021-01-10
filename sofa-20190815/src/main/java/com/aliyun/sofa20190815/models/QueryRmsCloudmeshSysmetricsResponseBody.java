// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshSysmetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshSysmetricsResponseBodyResponse response;

    public static QueryRmsCloudmeshSysmetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshSysmetricsResponseBody self = new QueryRmsCloudmeshSysmetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshSysmetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshSysmetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshSysmetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshSysmetricsResponseBody setResponse(QueryRmsCloudmeshSysmetricsResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshSysmetricsResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu self = new QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn self = new QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut self = new QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory self = new QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshSysmetricsResponseBodyResponseData extends TeaModel {
        @NameInMap("Cpu")
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu> cpu;

        @NameInMap("FlowIn")
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn> flowIn;

        @NameInMap("FlowOut")
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut> flowOut;

        @NameInMap("Memory")
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory> memory;

        public static QueryRmsCloudmeshSysmetricsResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSysmetricsResponseBodyResponseData self = new QueryRmsCloudmeshSysmetricsResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseData setCpu(java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu> cpu) {
            this.cpu = cpu;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataCpu> getCpu() {
            return this.cpu;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseData setFlowIn(java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn> flowIn) {
            this.flowIn = flowIn;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowIn> getFlowIn() {
            return this.flowIn;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseData setFlowOut(java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut> flowOut) {
            this.flowOut = flowOut;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataFlowOut> getFlowOut() {
            return this.flowOut;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponseData setMemory(java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory> memory) {
            this.memory = memory;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshSysmetricsResponseBodyResponseDataMemory> getMemory() {
            return this.memory;
        }

    }

    public static class QueryRmsCloudmeshSysmetricsResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshSysmetricsResponseBodyResponseData data;

        public static QueryRmsCloudmeshSysmetricsResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshSysmetricsResponseBodyResponse self = new QueryRmsCloudmeshSysmetricsResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshSysmetricsResponseBodyResponse setData(QueryRmsCloudmeshSysmetricsResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshSysmetricsResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
