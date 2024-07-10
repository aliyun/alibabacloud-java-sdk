// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTableOcrRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;false&quot;</p>
     */
    @NameInMap("IsHandWriting")
    public String isHandWriting;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("LineLess")
    public Boolean lineLess;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SkipDetection")
    public Boolean skipDetection;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg">https://img.alicdn.com/tfs/TB1Wo7eXAvoK1RjSZFDXXXY3pXa-2512-3509.jpg</a></p>
     */
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
