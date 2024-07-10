// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ocr_api20210707.models;

import com.aliyun.tea.*;

public class RecognizeMedicalDeviceProduceLicenseRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><a href="https://img.alicdn.com/tfs/TB13MJ.MuT2gK0jSZFvXXXnFXXa-1417-994.png">https://img.alicdn.com/tfs/TB13MJ.MuT2gK0jSZFvXXXnFXXa-1417-994.png</a></p>
     */
    @NameInMap("Url")
    public String url;

    @NameInMap("body")
    public java.io.InputStream body;

    public static RecognizeMedicalDeviceProduceLicenseRequest build(java.util.Map<String, ?> map) throws Exception {
        RecognizeMedicalDeviceProduceLicenseRequest self = new RecognizeMedicalDeviceProduceLicenseRequest();
        return TeaModel.build(map, self);
    }

    public RecognizeMedicalDeviceProduceLicenseRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

    public RecognizeMedicalDeviceProduceLicenseRequest setBody(java.io.InputStream body) {
        this.body = body;
        return this;
    }
    public java.io.InputStream getBody() {
        return this.body;
    }

}
