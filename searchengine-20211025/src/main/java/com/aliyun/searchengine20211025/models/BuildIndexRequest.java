// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class BuildIndexRequest extends TeaModel {
    @NameInMap("body")
    public java.util.Map<String, ?> body;

    public static BuildIndexRequest build(java.util.Map<String, ?> map) throws Exception {
        BuildIndexRequest self = new BuildIndexRequest();
        return TeaModel.build(map, self);
    }

    public BuildIndexRequest setBody(java.util.Map<String, ?> body) {
        this.body = body;
        return this;
    }
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

}
