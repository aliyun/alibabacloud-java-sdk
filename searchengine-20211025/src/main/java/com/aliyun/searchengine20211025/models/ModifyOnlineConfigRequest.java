// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyOnlineConfigRequest extends TeaModel {
    /**
     * <p>The request body.</p>
     */
    @NameInMap("body")
    public java.util.Map<String, String> body;

    public static ModifyOnlineConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOnlineConfigRequest self = new ModifyOnlineConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOnlineConfigRequest setBody(java.util.Map<String, String> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, String> getBody() {
        return this.body;
    }

}
