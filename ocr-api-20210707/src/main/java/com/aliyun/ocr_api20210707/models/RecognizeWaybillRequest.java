// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeWaybillRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1lOe6VqL7gK0jSZFBXXXZZpXa-480-640.png">https://img.alicdn.com/tfs/TB1lOe6VqL7gK0jSZFBXXXZZpXa-480-640.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeWaybillRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeWaybillRequest self = new RecognizeWaybillRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeWaybillRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeWaybillRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
