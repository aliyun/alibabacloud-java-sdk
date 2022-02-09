// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeChinesePassportRequest extends TeaModel {
    // 是否需要图案检测功能，默认需要
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    // 图片二进制字节流，最大10MB
    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeChinesePassportRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeChinesePassportRequest self = new RecognizeChinesePassportRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeChinesePassportRequest setOutputFigure(Boolean outputFigure) {
        this.outputFigure = outputFigure;
        return this;
    }
    public Boolean getOutputFigure() {
        return this.outputFigure;
    }

    public RecognizeChinesePassportRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeChinesePassportRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
