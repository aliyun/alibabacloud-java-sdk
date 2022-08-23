// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeAirItineraryRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeAirItineraryRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeAirItineraryRequest self = new RecognizeAirItineraryRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeAirItineraryRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeAirItineraryRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
