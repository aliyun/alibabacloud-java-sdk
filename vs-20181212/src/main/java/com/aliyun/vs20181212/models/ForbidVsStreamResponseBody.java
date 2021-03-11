// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ForbidVsStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ForbidVsStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ForbidVsStreamResponseBody self = new ForbidVsStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public ForbidVsStreamResponseBody setRequestId(String requestId) {
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
        @NameInMap("Result")
        public String result;

        @NameInMap("Channels")
        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfoChannels channels;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Detail")
        public String detail;

        public static BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo self = new BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo();
            return TeaModel.build(map, self);
        }

        public BatchForbidVsStreamResponseBodyForbidResultForbidResultInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
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
