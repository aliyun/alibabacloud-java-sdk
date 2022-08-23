// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduPaperStructedRequest extends TeaModel {
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    @NameInMap("Subject")
    public String subject;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeEduPaperStructedRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduPaperStructedRequest self = new RecognizeEduPaperStructedRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduPaperStructedRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeEduPaperStructedRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public RecognizeEduPaperStructedRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeEduPaperStructedRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
