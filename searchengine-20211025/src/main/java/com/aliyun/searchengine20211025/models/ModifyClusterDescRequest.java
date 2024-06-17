// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyClusterDescRequest extends TeaModel {
    /**
     * <p>The parameters in the request body</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
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
