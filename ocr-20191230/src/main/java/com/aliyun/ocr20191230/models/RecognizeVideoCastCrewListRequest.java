// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCastCrewListRequest extends TeaModel {
    @NameInMap("Params")
    public java.util.List<RecognizeVideoCastCrewListRequestParams> params;

    @NameInMap("RegisterUrl")
    public String registerUrl;

    @NameInMap("VideoUrl")
    public String videoUrl;

    public static RecognizeVideoCastCrewListRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCastCrewListRequest self = new RecognizeVideoCastCrewListRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCastCrewListRequest setParams(java.util.List<RecognizeVideoCastCrewListRequestParams> params) {
        this.params = params;
        return this;
    }
    public java.util.List<RecognizeVideoCastCrewListRequestParams> getParams() {
        return this.params;
    }

    public RecognizeVideoCastCrewListRequest setRegisterUrl(String registerUrl) {
        this.registerUrl = registerUrl;
        return this;
    }
    public String getRegisterUrl() {
        return this.registerUrl;
    }

    public RecognizeVideoCastCrewListRequest setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

    public static class RecognizeVideoCastCrewListRequestParams extends TeaModel {
        @NameInMap("Type")
        public String type;

        public static RecognizeVideoCastCrewListRequestParams build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVideoCastCrewListRequestParams self = new RecognizeVideoCastCrewListRequestParams();
            return TeaModel.build(map, self);
        }

        public RecognizeVideoCastCrewListRequestParams setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
