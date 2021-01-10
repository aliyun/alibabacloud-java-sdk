// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsCloudmeshMultibizqueryResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Response")
    public QueryRmsCloudmeshMultibizqueryResponseBodyResponse response;

    public static QueryRmsCloudmeshMultibizqueryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsCloudmeshMultibizqueryResponseBody self = new QueryRmsCloudmeshMultibizqueryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRmsCloudmeshMultibizqueryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRmsCloudmeshMultibizqueryResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsCloudmeshMultibizqueryResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryRmsCloudmeshMultibizqueryResponseBody setResponse(QueryRmsCloudmeshMultibizqueryResponseBodyResponse response) {
        this.response = response;
        return this;
    }
    public QueryRmsCloudmeshMultibizqueryResponseBodyResponse getResponse() {
        return this.response;
    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps extends TeaModel {
        @NameInMap("Timestamp")
        public Long timestamp;

        @NameInMap("Value")
        public String value;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponseData extends TeaModel {
        @NameInMap("ErrorRateDetail")
        public String errorRateDetail;

        @NameInMap("ResTimeDetail")
        public String resTimeDetail;

        @NameInMap("RpsDetail")
        public String rpsDetail;

        @NameInMap("Cpu")
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu> cpu;

        @NameInMap("ErrorRate")
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate> errorRate;

        @NameInMap("FlowIn")
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn> flowIn;

        @NameInMap("FlowOut")
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut> flowOut;

        @NameInMap("Memory")
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory> memory;

        @NameInMap("ResTime")
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime> resTime;

        @NameInMap("Rps")
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps> rps;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponseData self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponseData();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setErrorRateDetail(String errorRateDetail) {
            this.errorRateDetail = errorRateDetail;
            return this;
        }
        public String getErrorRateDetail() {
            return this.errorRateDetail;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setResTimeDetail(String resTimeDetail) {
            this.resTimeDetail = resTimeDetail;
            return this;
        }
        public String getResTimeDetail() {
            return this.resTimeDetail;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setRpsDetail(String rpsDetail) {
            this.rpsDetail = rpsDetail;
            return this;
        }
        public String getRpsDetail() {
            return this.rpsDetail;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setCpu(java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu> cpu) {
            this.cpu = cpu;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataCpu> getCpu() {
            return this.cpu;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setErrorRate(java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate> errorRate) {
            this.errorRate = errorRate;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataErrorRate> getErrorRate() {
            return this.errorRate;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setFlowIn(java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn> flowIn) {
            this.flowIn = flowIn;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowIn> getFlowIn() {
            return this.flowIn;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setFlowOut(java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut> flowOut) {
            this.flowOut = flowOut;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataFlowOut> getFlowOut() {
            return this.flowOut;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setMemory(java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory> memory) {
            this.memory = memory;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataMemory> getMemory() {
            return this.memory;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setResTime(java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime> resTime) {
            this.resTime = resTime;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataResTime> getResTime() {
            return this.resTime;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData setRps(java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps> rps) {
            this.rps = rps;
            return this;
        }
        public java.util.List<QueryRmsCloudmeshMultibizqueryResponseBodyResponseDataRps> getRps() {
            return this.rps;
        }

    }

    public static class QueryRmsCloudmeshMultibizqueryResponseBodyResponse extends TeaModel {
        @NameInMap("ErrMsg")
        public String errMsg;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Data")
        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData data;

        public static QueryRmsCloudmeshMultibizqueryResponseBodyResponse build(java.util.Map<String, ?> map) throws Exception {
            QueryRmsCloudmeshMultibizqueryResponseBodyResponse self = new QueryRmsCloudmeshMultibizqueryResponseBodyResponse();
            return TeaModel.build(map, self);
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponse setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponse setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public QueryRmsCloudmeshMultibizqueryResponseBodyResponse setData(QueryRmsCloudmeshMultibizqueryResponseBodyResponseData data) {
            this.data = data;
            return this;
        }
        public QueryRmsCloudmeshMultibizqueryResponseBodyResponseData getData() {
            return this.data;
        }

    }

}
