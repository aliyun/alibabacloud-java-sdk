// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeExitEntryPermitToHKRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true/false</p>
     */
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i2/O1CN01Rs4C321G2oTD7Dg1U_!!6000000000565-0-tps-1024-692.jpg">https://img.alicdn.com/imgextra/i2/O1CN01Rs4C321G2oTD7Dg1U_!!6000000000565-0-tps-1024-692.jpg</a></p>
     */
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
