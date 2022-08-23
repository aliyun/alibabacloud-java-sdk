// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeVehicleRegistrationRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeVehicleRegistrationRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleRegistrationRequest self = new RecognizeVehicleRegistrationRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleRegistrationRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeVehicleRegistrationRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
