// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeEduQuestionOcrRequest extends TeaModel {
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeEduQuestionOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeEduQuestionOcrRequest self = new RecognizeEduQuestionOcrRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeEduQuestionOcrRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeEduQuestionOcrRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeEduQuestionOcrRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
