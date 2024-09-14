// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateSessionClusterRequest extends TeaModel {
    @NameInMap("body")
    public SessionCluster body;

    public static CreateSessionClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionClusterRequest self = new CreateSessionClusterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSessionClusterRequest setBody(SessionCluster body) {
        this.body = body;
        return this;
    }
    public SessionCluster getBody() {
        return this.body;
    }

}
