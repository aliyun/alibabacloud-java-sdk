// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class RecognizeVideoCastCrewListAdvanceRequest extends TeaModel {
    @NameInMap("Params")
    public java.util.List<RecognizeVideoCastCrewListAdvanceRequestParams> params;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://shanghai.oss-cn-shanghai.aliyuncs.com/download/xxxx.mp4">https://shanghai.oss-cn-shanghai.aliyuncs.com/download/xxxx.mp4</a></p>
     */
    @NameInMap("VideoUrl")
    public java.io.InputStream videoUrlObject;

    public static RecognizeVideoCastCrewListAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCastCrewListAdvanceRequest self = new RecognizeVideoCastCrewListAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCastCrewListAdvanceRequest setParams(java.util.List<RecognizeVideoCastCrewListAdvanceRequestParams> params) {
        this.params = params;
        return this;
    }
    public java.util.List<RecognizeVideoCastCrewListAdvanceRequestParams> getParams() {
        return this.params;
    }

    public RecognizeVideoCastCrewListAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public static class RecognizeVideoCastCrewListAdvanceRequestParams extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cast</p>
         */
        @NameInMap("Type")
        public String type;

        public static RecognizeVideoCastCrewListAdvanceRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListAdvanceRequestParams self = new RecognizeVideoCastCrewListAdvanceRequestParams();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListAdvanceRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
