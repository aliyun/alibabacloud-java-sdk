// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyIndexVersionRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static ModifyIndexVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIndexVersionRequest self = new ModifyIndexVersionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIndexVersionRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
