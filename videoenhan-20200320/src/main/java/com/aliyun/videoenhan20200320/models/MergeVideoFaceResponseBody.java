// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceResponseBody extends TeaModel {
    @NameInMap("Data")
    public MergeVideoFaceResponseBodyData data;

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

    public MergeVideoFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class MergeVideoFaceResponseBodyData extends TeaModel {
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
