// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class ReduceVideoNoiseResponseBody extends TeaModel {
    @NameInMap("Data")
    public ReduceVideoNoiseResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ReduceVideoNoiseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReduceVideoNoiseResponseBody self = new ReduceVideoNoiseResponseBody();
        return TeaModel.build(map, self);
    }

    public ReduceVideoNoiseResponseBody setData(ReduceVideoNoiseResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ReduceVideoNoiseResponseBodyData getData() {
        return this.data;
    }

    public ReduceVideoNoiseResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReduceVideoNoiseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ReduceVideoNoiseResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static ReduceVideoNoiseResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ReduceVideoNoiseResponseBodyData self = new ReduceVideoNoiseResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ReduceVideoNoiseResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
