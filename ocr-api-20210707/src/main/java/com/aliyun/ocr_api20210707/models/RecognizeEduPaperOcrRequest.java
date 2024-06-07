// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperOcrRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("OutputOricoord")
    public Boolean outputOricoord;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeEduPaperOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperOcrRequest self = new RecognizeEduPaperOcrRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperOcrRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public RecognizeEduPaperOcrRequest setOutputOricoord(Boolean outputOricoord) {
        this.outputOricoord = outputOricoord;
        return this;
    }
    public Boolean getOutputOricoord() {
        return this.outputOricoord;
    }

    public RecognizeEduPaperOcrRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public RecognizeEduPaperOcrRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeEduPaperOcrRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
