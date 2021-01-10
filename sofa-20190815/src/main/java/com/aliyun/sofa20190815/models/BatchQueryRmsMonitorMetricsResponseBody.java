// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchQueryRmsMonitorMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("Result")
    public BatchQueryRmsMonitorMetricsResponseBodyResult result;

    public static BatchQueryRmsMonitorMetricsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryRmsMonitorMetricsResponseBody self = new BatchQueryRmsMonitorMetricsResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchQueryRmsMonitorMetricsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchQueryRmsMonitorMetricsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public BatchQueryRmsMonitorMetricsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchQueryRmsMonitorMetricsResponseBody setResult(BatchQueryRmsMonitorMetricsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public BatchQueryRmsMonitorMetricsResponseBodyResult getResult() {
        return this.result;
    }

    public static class BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps self = new BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps();
            return TeaModel.build(map, self);
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags self = new BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags();
            return TeaModel.build(map, self);
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas extends TeaModel {
        @NameInMap("Dps")
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps> dps;

        @NameInMap("Metric")
        public String metric;

        @NameInMap("Tags")
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags> tags;

        public static BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas self = new BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas();
            return TeaModel.build(map, self);
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas setDps(java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps> dps) {
            this.dps = dps;
            return this;
        }
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasDps> getDps() {
            return this.dps;
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas setMetric(String metric) {
            this.metric = metric;
            return this;
        }
        public String getMetric() {
            return this.metric;
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas setTags(java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatasTags> getTags() {
            return this.tags;
        }

    }

    public static class BatchQueryRmsMonitorMetricsResponseBodyResultListValue extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Datas")
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas> datas;

        @NameInMap("ErrMsg")
        public String errMsg;

        public static BatchQueryRmsMonitorMetricsResponseBodyResultListValue build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryRmsMonitorMetricsResponseBodyResultListValue self = new BatchQueryRmsMonitorMetricsResponseBodyResultListValue();
            return TeaModel.build(map, self);
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValue setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValue setDatas(java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas> datas) {
            this.datas = datas;
            return this;
        }
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultListValueDatas> getDatas() {
            return this.datas;
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultListValue setErrMsg(String errMsg) {
            this.errMsg = errMsg;
            return this;
        }
        public String getErrMsg() {
            return this.errMsg;
        }

    }

    public static class BatchQueryRmsMonitorMetricsResponseBodyResultList extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public BatchQueryRmsMonitorMetricsResponseBodyResultListValue value;

        public static BatchQueryRmsMonitorMetricsResponseBodyResultList build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryRmsMonitorMetricsResponseBodyResultList self = new BatchQueryRmsMonitorMetricsResponseBodyResultList();
            return TeaModel.build(map, self);
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultList setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResultList setValue(BatchQueryRmsMonitorMetricsResponseBodyResultListValue value) {
            this.value = value;
            return this;
        }
        public BatchQueryRmsMonitorMetricsResponseBodyResultListValue getValue() {
            return this.value;
        }

    }

    public static class BatchQueryRmsMonitorMetricsResponseBodyResult extends TeaModel {
        @NameInMap("List")
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultList> list;

        public static BatchQueryRmsMonitorMetricsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            BatchQueryRmsMonitorMetricsResponseBodyResult self = new BatchQueryRmsMonitorMetricsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public BatchQueryRmsMonitorMetricsResponseBodyResult setList(java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<BatchQueryRmsMonitorMetricsResponseBodyResultList> getList() {
            return this.list;
        }

    }

}
