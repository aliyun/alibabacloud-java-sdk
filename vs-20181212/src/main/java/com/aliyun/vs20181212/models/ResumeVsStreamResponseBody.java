// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ResumeVsStreamResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ResumeVsStreamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ResumeVsStreamResponseBody self = new ResumeVsStreamResponseBody();
        return TeaModel.build(map, self);
    }

    public ResumeVsStreamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
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
        @NameInMap("Result")
        public String result;

        @NameInMap("Channels")
        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfoChannels channels;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("Detail")
        public String detail;

        public static BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo build(java.util.Map<String, ?> map) throws Exception {
            BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo self = new BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo();
            return TeaModel.build(map, self);
        }

        public BatchResumeVsStreamResponseBodyResumeResultResumeResultInfo setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
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
