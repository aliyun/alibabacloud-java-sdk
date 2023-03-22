// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTableOcrRequest extends TeaModel {
    @NameInMap("IsHandWriting")
    public String isHandWriting;

    @NameInMap("LineLess")
    public Boolean lineLess;

    @NameInMap("NeedRotate")
    public Boolean needRotate;

    @NameInMap("SkipDetection")
    public Boolean skipDetection;

    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeTableOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableOcrRequest self = new RecognizeTableOcrRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeTableOcrRequest setIsHandWriting(String isHandWriting) {
        this.isHandWriting = isHandWriting;
        return this;
    }
    public String getIsHandWriting() {
        return this.isHandWriting;
    }

    public RecognizeTableOcrRequest setLineLess(Boolean lineLess) {
        this.lineLess = lineLess;
        return this;
    }
    public Boolean getLineLess() {
        return this.lineLess;
    }

    public RecognizeTableOcrRequest setNeedRotate(Boolean needRotate) {
        this.needRotate = needRotate;
        return this;
    }
    public Boolean getNeedRotate() {
        return this.needRotate;
    }

    public RecognizeTableOcrRequest setSkipDetection(Boolean skipDetection) {
        this.skipDetection = skipDetection;
        return this;
    }
    public Boolean getSkipDetection() {
        return this.skipDetection;
    }

    public RecognizeTableOcrRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeTableOcrRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
