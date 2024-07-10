// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeChinesePassportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("OutputFigure")
    public Boolean outputFigure;

    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i2/O1CN01yaQKCT1PrUsTWqgSK_!!6000000001894-0-tps-271-186.jpg">https://img.alicdn.com/imgextra/i2/O1CN01yaQKCT1PrUsTWqgSK_!!6000000001894-0-tps-271-186.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

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
