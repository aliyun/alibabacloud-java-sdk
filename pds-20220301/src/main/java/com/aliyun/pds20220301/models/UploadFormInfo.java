// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class UploadFormInfo extends TeaModel {
    /**
     * <p>The request endpoint for the upload.</p>
     */
    @NameInMap("endpoint")
    public String endpoint;

    /**
     * <p>The form fields for the upload.</p>
     */
    @NameInMap("form_data")
    public java.util.Map<String, String> formData;

    public static UploadFormInfo build(java.util.Map<String, ?> map) throws Exception {
        UploadFormInfo self = new UploadFormInfo();
        return TeaModel.build(map, self);
    }

    public UploadFormInfo setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public UploadFormInfo setFormData(java.util.Map<String, String> formData) {
        this.formData = formData;
        return this;
    }
    public java.util.Map<String, String> getFormData() {
        return this.formData;
    }

}
