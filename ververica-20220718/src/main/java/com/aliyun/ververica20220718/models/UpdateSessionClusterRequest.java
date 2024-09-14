// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateSessionClusterRequest extends TeaModel {
    @NameInMap("body")
    public SessionCluster body;

    public static UpdateSessionClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionClusterRequest self = new UpdateSessionClusterRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSessionClusterRequest setBody(SessionCluster body) {
        this.body = body;
        return this;
    }
    public SessionCluster getBody() {
        return this.body;
    }

}
