// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class BatchResumeVsStreamResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResumeResult")
    public BatchResumeVsStreamResponseBodyResumeResult resumeResult;

    public static BatchResumeVsStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchResumeVsStreamResponseBody self = new BatchResumeVsStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchResumeVsStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchResumeVsStreamResponseBody setResumeResult(BatchResumeVsStreamResponseBodyResumeResult resumeResult) {
        this.resumeResult = resumeResult;
        return this;
    }
    public BatchResumeVsStreamResponseBodyResumeResult getResumeResult() {
        return this.resumeResult;
    }

    public static class BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels extends TeaModel {
        @NameInMap("Channel")
        public java.util.List<String> channel;

        public static BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels build(java.util.Map<String, ?> map) throws Exception {
            BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels self = new BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels();
            return TeaModel.build(map, self);
        }

        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels setChannel(java.util.List<String> channel) {
            this.channel = channel;
            return this;
        }
        public java.util.List<String> getChannel() {
            return this.channel;
        }

    }

    public static class BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo extends TeaModel {
        @NameInMap("Channels")
        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels channels;

        /**
         * <strong>example:</strong>
         * <p>1</p>
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

        public static BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo self = new BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo();
            return TeaModel.build(map, self);
        }

        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo setChannels(BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels channels) {
            this.channels = channels;
            return this;
        }
        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels getChannels() {
            return this.channels;
        }

        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo setDetail(String detail) {
            this.detail = detail;
            return this;
        }
        public String getDetail() {
            return this.detail;
        }

        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class BatchResumeVsStreamResponseBodyResumeResult extends TeaModel {
        @NameInMap("ResumeResultInfo")
        public java.util.List<BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo> resumeResultInfo;

        public static BatchResumeVsStreamResponseBodyResumeResult build(java.util.Map<String, ?> map) throws Exception {
            BatchResumeVsStreamResponseBodyResumeResult self = new BatchResumeVsStreamResponseBodyResumeResult();
            return TeaModel.build(map, self);
        }

        public BatchResumeVsStreamResponseBodyResumeResult setResumeResultInfo(java.util.List<BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo> resumeResultInfo) {
            this.resumeResultInfo = resumeResultInfo;
            return this;
        }
        public java.util.List<BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo> getResumeResultInfo() {
            return this.resumeResultInfo;
        }

    }

}
