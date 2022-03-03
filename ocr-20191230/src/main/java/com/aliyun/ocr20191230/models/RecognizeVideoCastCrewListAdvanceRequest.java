// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr20191230.models;

import com.aliyun.tea.*;

public class RecognizeVideoCastCrewListAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Params")
    public java.util.List<RecognizeVideoCastCrewListAdvanceRequestParams> params;

    @NameInMap("RegisterUrl")
    public String registerUrl;

    public static RecognizeVideoCastCrewListAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVideoCastCrewListAdvanceRequest self = new RecognizeVideoCastCrewListAdvanceRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVideoCastCrewListAdvanceRequest setVideoUrlObject(java.io.InputStream videoUrlObject) {
        this.videoUrlObject = videoUrlObject;
        return this;
    }
    public java.io.InputStream getVideoUrlObject() {
        return this.videoUrlObject;
    }

    public RecognizeVideoCastCrewListAdvanceRequest setParams(java.util.List<RecognizeVideoCastCrewListAdvanceRequestParams> params) {
        this.params = params;
        return this;
    }
    public java.util.List<RecognizeVideoCastCrewListAdvanceRequestParams> getParams() {
        return this.params;
    }

    public RecognizeVideoCastCrewListAdvanceRequest setRegisterUrl(String registerUrl) {
        this.registerUrl = registerUrl;
        return this;
    }
    public String getRegisterUrl() {
        return this.registerUrl;
    }

    public static class RecognizeVideoCastCrewListAdvanceRequestParams extends TeaModel {
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
