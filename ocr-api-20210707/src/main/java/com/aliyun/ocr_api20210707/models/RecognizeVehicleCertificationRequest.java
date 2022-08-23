// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeVehicleCertificationRequest extends TeaModel {
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeVehicleCertificationRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleCertificationRequest self = new RecognizeVehicleCertificationRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleCertificationRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeVehicleCertificationRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
