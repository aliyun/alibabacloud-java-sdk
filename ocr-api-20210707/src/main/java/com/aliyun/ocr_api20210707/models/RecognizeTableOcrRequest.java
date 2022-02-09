// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeTableOcrRequest extends TeaModel {
    // 是否无线条
    @NameInMap("LineLess")
    public Boolean lineLess;

    // 是否需要自动旋转功能，默认需要
    @NameInMap("NeedRotate")
    public Boolean needRotate;

    // 是否跳过表格识别，如果没有检测到表格，可以设置"skip_detection":true
    @NameInMap("SkipDetection")
    public Boolean skipDetection;

    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    // 图片二进制字节流，最大10MB
    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeTableOcrRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeTableOcrRequest self = new RecognizeTableOcrRequest();
        return TeaModel.build(map, self);
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
