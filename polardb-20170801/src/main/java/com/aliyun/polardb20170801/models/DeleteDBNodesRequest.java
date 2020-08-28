// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBNodesRequest extends TeaModel {
    @NameInMap("DBClusterId")
    @Validation(required = true)
    public String DBClusterId;

    @NameInMap("DBNodeId")
    @Validation(required = true)
    public java.util.List<String> DBNodeId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteDBNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBNodesRequest self = new DeleteDBNodesRequest();
        return TeaModel.build(map, self);
    }

}
