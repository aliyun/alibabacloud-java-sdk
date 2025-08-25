// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public MergeVideoFaceResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>DEF90E76-B62D-45EF-8835-CA3C83842B18</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static MergeVideoFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoFaceResponseBody self = new MergeVideoFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeVideoFaceResponseBody setData(MergeVideoFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MergeVideoFaceResponseBodyData getData() {
        return this.data;
    }

    public MergeVideoFaceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MergeVideoFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MergeVideoFaceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-face-fusion/A657011C-82B4-4705-A5DB-69B18B7CE89D.mp4?Expires=1606378308&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=Hl3cq5XedTGCscOSr0OGVxAS2o">http://vibktprfx-prod-prod-aic-gd-cn-shanghai.oss-cn-shanghai.aliyuncs.com/video-face-fusion/A657011C-82B4-4705-A5DB-69B18B7CE89D.mp4?Expires=1606378308&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=Hl3cq5XedTGCscOSr0OGVxAS2o</a>****</p>
         */
        @NameInMap("VideoURL")
        public String videoURL;

        public static MergeVideoFaceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            MergeVideoFaceResponseBodyData self = new MergeVideoFaceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public MergeVideoFaceResponseBodyData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
