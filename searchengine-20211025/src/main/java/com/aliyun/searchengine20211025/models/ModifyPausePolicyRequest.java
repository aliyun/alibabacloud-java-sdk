// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPausePolicyRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, BodyValue> body;

    public static ModifyPausePolicyRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPausePolicyRequest self = new ModifyPausePolicyRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPausePolicyRequest setBody(java.util.Map<String, BodyValue> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, BodyValue> getBody() {
        return this.body;
    }

}
