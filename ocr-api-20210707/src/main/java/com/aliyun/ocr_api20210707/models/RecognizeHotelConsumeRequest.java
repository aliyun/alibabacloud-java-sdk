// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeHotelConsumeRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeHotelConsumeRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeHotelConsumeRequest self = new RecognizeHotelConsumeRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeHotelConsumeRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeHotelConsumeRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
