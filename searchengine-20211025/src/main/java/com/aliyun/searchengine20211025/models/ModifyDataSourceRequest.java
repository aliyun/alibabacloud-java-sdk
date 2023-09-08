// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyDataSourceRequest extends TeaModel {
    /**
     * <p>The information about the index</p>
     */
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    /**
     * <p>The ID of the request</p>
     */
    @NameInMap("dryRun")
    public Boolean dryRun;

    public static ModifyDataSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDataSourceRequest self = new ModifyDataSourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDataSourceRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public ModifyDataSourceRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

}
