// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryCertConfig extends TeaModel {
    /**
     * <p>Specifies whether to skip HTTPS certificate validation for the image repository. Enable this option only for private repositories that use self-signed certificates.</p>
     */
    @NameInMap("insecure")
    public Boolean insecure;

    public static CreateTemplateRegistryCertConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRegistryCertConfig self = new CreateTemplateRegistryCertConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRegistryCertConfig setInsecure(Boolean insecure) {
        this.insecure = insecure;
        return this;
    }
    public Boolean getInsecure() {
        return this.insecure;
    }

}
