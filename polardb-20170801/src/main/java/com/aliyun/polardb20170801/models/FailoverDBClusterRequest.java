// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class FailoverDBClusterRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("TargetDBNodeId")
    public String targetDBNodeId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static FailoverDBClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        FailoverDBClusterRequest self = new FailoverDBClusterRequest();
        return TeaModel.build(map, self);
    }

}
