// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateCustomDomainRequest extends TeaModel {
    /**
     * <p>The request parameters.</p>
     */
    @NameInMap("body")
    public CreateCustomDomainInput body;

    public static CreateCustomDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomDomainRequest self = new CreateCustomDomainRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomDomainRequest setBody(CreateCustomDomainInput body) {
        this.body = body;
        return this;
    }
    public CreateCustomDomainInput getBody() {
        return this.body;
    }

}
