// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AdjustVideoColorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public AdjustVideoColorResponseBodyData data;

    public static AdjustVideoColorResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AdjustVideoColorResponseBody self = new AdjustVideoColorResponseBody();
        return TeaModel.build(map, self);
    }

    public AdjustVideoColorResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AdjustVideoColorResponseBody setData(AdjustVideoColorResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AdjustVideoColorResponseBodyData getData() {
        return this.data;
    }

    public static class AdjustVideoColorResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static AdjustVideoColorResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AdjustVideoColorResponseBodyData self = new AdjustVideoColorResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AdjustVideoColorResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
