// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoModelFaceResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public MergeVideoModelFaceResponseBodyData data;

    public static MergeVideoModelFaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoModelFaceResponseBody self = new MergeVideoModelFaceResponseBody();
        return TeaModel.build(map, self);
    }

    public MergeVideoModelFaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeVideoModelFaceResponseBody setData(MergeVideoModelFaceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public MergeVideoModelFaceResponseBodyData getData() {
        return this.data;
    }

    public static class MergeVideoModelFaceResponseBodyData extends TeaModel {
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
