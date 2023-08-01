// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateConfigRequest extends TeaModel {
    @NameInMap("body")
    public LogtailConfig body;

    public static UpdateConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConfigRequest self = new UpdateConfigRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConfigRequest setBody(LogtailConfig body) {
        this.body = body;
        return this;
    }
    public LogtailConfig getBody() {
        return this.body;
    }

}
