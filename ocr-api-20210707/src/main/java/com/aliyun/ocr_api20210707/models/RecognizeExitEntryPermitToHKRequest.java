// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExitEntryPermitToHKRequest extends TeaModel {
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeExitEntryPermitToHKRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeExitEntryPermitToHKRequest self = new RecognizeExitEntryPermitToHKRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeExitEntryPermitToHKRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeExitEntryPermitToHKRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeExitEntryPermitToHKRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
