// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeIdcardRequest extends TeaModel {
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    @NameInMap("OutputQualityInfo")
    public Boolean outputQualityInfo;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeIdcardRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeIdcardRequest self = new RecognizeIdcardRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeIdcardRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeIdcardRequest setOutputQualityInfo(Boolean outputQualityInfo) {
        this.outputQualityInfo = outputQualityInfo;
        return this;
    }
    public Boolean getOutputQualityInfo() {
        return this.outputQualityInfo;
    }

    public RecognizeIdcardRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeIdcardRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
