// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPasswordRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static ModifyPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPasswordRequest self = new ModifyPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPasswordRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
