// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterDescRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static ModifyClusterDescRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyClusterDescRequest self = new ModifyClusterDescRequest();
        return TeaModel.build(map, self);
    }

    public ModifyClusterDescRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
