// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperCutRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("CutType")
    public String cutType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageType")
    public String imageType;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeEduPaperCutRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperCutRequest self = new RecognizeEduPaperCutRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperCutRequest setCutType(String cutType) {
        this.cutType = cutType;
        return this;
    }
    public String getCutType() {
        return this.cutType;
    }

    public RecognizeEduPaperCutRequest setImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    public String getImageType() {
        return this.imageType;
    }

    public RecognizeEduPaperCutRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public RecognizeEduPaperCutRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeEduPaperCutRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
