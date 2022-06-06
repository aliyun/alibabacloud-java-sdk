// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeShoppingReceiptRequest extends TeaModel {
    // 图片链接（长度不超 2048，不支持 base64）
    @NameInMap("Url")
    public String url;

    // 图片二进制字节流，最大10MB
    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeShoppingReceiptRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeShoppingReceiptRequest self = new RecognizeShoppingReceiptRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeShoppingReceiptRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeShoppingReceiptRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
