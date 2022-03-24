// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class PutTemplateRequest extends TeaModel {
    // A custom template
    @NameInMap("body")
    public Template body;

    // The major version of the template. "1" by default.
    @NameInMap("version")
    public Integer version;

    public static PutTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        PutTemplateRequest self = new PutTemplateRequest();
        return TeaModel.build(map, self);
    }

    public PutTemplateRequest setBody(Template body) {
        this.body = body;
        return this;
    }
    public Template getBody() {
        return this.body;
    }

    public PutTemplateRequest setVersion(Integer version) {
        this.version = version;
        return this;
    }
    public Integer getVersion() {
        return this.version;
    }

}
