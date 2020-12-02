// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class MergeVideoFaceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public MergeVideoFaceResponseData data;

    public static MergeVideoFaceResponse build(java.util.Map<String, ?> map) throws Exception {
        MergeVideoFaceResponse self = new MergeVideoFaceResponse();
        return TeaModel.build(map, self);
    }

    public MergeVideoFaceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MergeVideoFaceResponse setData(MergeVideoFaceResponseData data) {
        this.data = data;
        return this;
    }
    public MergeVideoFaceResponseData getData() {
        return this.data;
    }

    public static class MergeVideoFaceResponseData extends TeaModel {
        @NameInMap("VideoURL")
        @Validation(required = true)
        public String videoURL;

        public static MergeVideoFaceResponseData build(java.util.Map<String, ?> map) throws Exception {
            MergeVideoFaceResponseData self = new MergeVideoFaceResponseData();
            return TeaModel.build(map, self);
        }

        public MergeVideoFaceResponseData setVideoURL(String videoURL) {
            this.videoURL = videoURL;
            return this;
        }
        public String getVideoURL() {
            return this.videoURL;
        }

    }

}
