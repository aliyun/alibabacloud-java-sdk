// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public MergeVideoModelFaceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>334F180F-3B50-51CB-B4CB-9A86A542D3BC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MergeVideoModelFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceResponseBody self = new MergeVideoModelFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeVideoModelFaceResponseBody setData(MergeVideoModelFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MergeVideoModelFaceResponseBodyData getData() {
        return this.data;
    }

    public MergeVideoModelFaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MergeVideoModelFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MergeVideoModelFaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-face-fusion/334F180F-3B50-51CB-B4CB-9A86A542D3BC-5716-20210906-074905.mp4?Expires=1630916420&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=OEtNqVYxXRwkyO4BrsYVJ8q5bx">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-face-fusion/334F180F-3B50-51CB-B4CB-9A86A542D3BC-5716-20210906-074905.mp4?Expires=1630916420&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=OEtNqVYxXRwkyO4BrsYVJ8q5bx</a>****</p>
         */
        @NameInMap("VideoURL")
        public String videoURL;

        public static MergeVideoModelFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MergeVideoModelFaceResponseBodyData self = new MergeVideoModelFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MergeVideoModelFaceResponseBodyData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
