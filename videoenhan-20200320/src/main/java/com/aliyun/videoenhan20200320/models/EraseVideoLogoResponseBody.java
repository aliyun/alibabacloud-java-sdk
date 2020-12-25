// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EraseVideoLogoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public EraseVideoLogoResponseBodyData data;

    public static EraseVideoLogoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EraseVideoLogoResponseBody self = new EraseVideoLogoResponseBody();
        return TeaModel.build(map, self);
    }

    public EraseVideoLogoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EraseVideoLogoResponseBody setData(EraseVideoLogoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public EraseVideoLogoResponseBodyData getData() {
        return this.data;
    }

    public static class EraseVideoLogoResponseBodyData extends TeaModel {
        @NameInMap("VideoUrl")
        public String videoUrl;

        public static EraseVideoLogoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            EraseVideoLogoResponseBodyData self = new EraseVideoLogoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public EraseVideoLogoResponseBodyData setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
            return this;
        }
        public String getVideoUrl() {
            return this.videoUrl;
        }

    }

}
