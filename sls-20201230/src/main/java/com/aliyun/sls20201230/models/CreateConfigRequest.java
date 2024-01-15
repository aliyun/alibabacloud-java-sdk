// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateConfigRequest extends TeaModel {
    /**
     * <p>The body of the request.</p>
     */
    @NameInMap("body")
    public LogtailConfig body;

    public static CreateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConfigRequest self = new CreateConfigRequest();
        return TeaModel.build(map, self);
    }

    public CreateConfigRequest setBody(LogtailConfig body) {
        this.body = body;
        return this;
    }
    public LogtailConfig getBody() {
        return this.body;
    }

}
