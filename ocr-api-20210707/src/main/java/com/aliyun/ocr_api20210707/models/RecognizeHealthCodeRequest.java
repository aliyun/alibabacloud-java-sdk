// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHealthCodeRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i3/O1CN01ME0L7j29f6VRZKo5e_!!6000000008094-0-tps-1237-1981.jpg">https://img.alicdn.com/imgextra/i3/O1CN01ME0L7j29f6VRZKo5e_!!6000000008094-0-tps-1237-1981.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeHealthCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHealthCodeRequest self = new RecognizeHealthCodeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeHealthCodeRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeHealthCodeRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
