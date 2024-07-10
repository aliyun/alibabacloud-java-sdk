// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeRollTicketRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB1Y2ryJKT2gK0jSZFvXXXnFXXa-438-934.png">https://img.alicdn.com/tfs/TB1Y2ryJKT2gK0jSZFvXXXnFXXa-438-934.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeRollTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeRollTicketRequest self = new RecognizeRollTicketRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeRollTicketRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeRollTicketRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
