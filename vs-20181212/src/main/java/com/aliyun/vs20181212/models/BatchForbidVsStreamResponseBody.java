// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchForbidVsStreamResponseBody extends TeaModel {
    @NameInMap("ForbidResult")
    public BatchForbidVsStreamResponseBodyForbidResult forbidResult;

    /**
     * <strong>example:</strong>
     * <p>B058D71B-76EA-5DF6-ACAF-A617C1E7937F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static BatchForbidVsStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchForbidVsStreamResponseBody self = new BatchForbidVsStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchForbidVsStreamResponseBody setForbidResult(BatchForbidVsStreamResponseBodyForbidResult forbidResult) {
        this.forbidResult = forbidResult;
        return this;
    }
    public BatchForbidVsStreamResponseBodyForbidResult getForbidResult() {
        return this.forbidResult;
    }

    public BatchForbidVsStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<String> channel;

        public static BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels build(java.util.Map<String, ?> map) throws Exception {
            BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels self = new BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels();
            return TeaModel.build(map, self);
        }

        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

    }

    public static class BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo extends TeaModel {
        @NameInMap("Channels")
        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels channels;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("Detail")
        public String detail;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Result")
        public String result;

        public static BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo self = new BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo();
            return TeaModel.build(map, self);
        }

        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo setChannels(BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels channels) {
            this.channels = channels;
            return this;
        }
        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels getChannels() {
            return this.channels;
        }

        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class BatchForbidVsStreamResponseBodyForbidResult extends TeaModel {
        @NameInMap("ForbidResultInfo")
        public java.util.List<BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo> forbidResultInfo;

        public static BatchForbidVsStreamResponseBodyForbidResult build(java.util.Map<String, ?> map) throws Exception {
            BatchForbidVsStreamResponseBodyForbidResult self = new BatchForbidVsStreamResponseBodyForbidResult();
            return TeaModel.build(map, self);
        }

        public BatchForbidVsStreamResponseBodyForbidResult setForbidResultInfo(java.util.List<BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo> forbidResultInfo) {
            this.forbidResultInfo = forbidResultInfo;
            return this;
        }
        public java.util.List<BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo> getForbidResultInfo() {
            return this.forbidResultInfo;
        }

    }

}
