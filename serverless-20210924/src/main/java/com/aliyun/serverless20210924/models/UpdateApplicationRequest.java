// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class UpdateApplicationRequest extends TeaModel {
    @NameInMap("body")
    public Application body;

    public static UpdateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateApplicationRequest self = new UpdateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateApplicationRequest setBody(Application body) {
        this.body = body;
        return this;
    }
    public Application getBody() {
        return this.body;
    }

}
