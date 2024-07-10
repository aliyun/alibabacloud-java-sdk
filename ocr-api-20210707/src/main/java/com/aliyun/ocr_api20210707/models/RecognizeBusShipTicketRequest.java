// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeBusShipTicketRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/imgextra/i2/O1CN010iDcM7218ZQJtJyGX_!!6000000006940-0-tps-936-541.jpg">https://img.alicdn.com/imgextra/i2/O1CN010iDcM7218ZQJtJyGX_!!6000000006940-0-tps-936-541.jpg</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeBusShipTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeBusShipTicketRequest self = new RecognizeBusShipTicketRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeBusShipTicketRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeBusShipTicketRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
