// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceVpcRequest extends TeaModel {
    @NameInMap("NamespaceId")
    public String namespaceId;

    @NameInMap("VpcId")
    public String vpcId;

    public static UpdateNamespaceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceVpcRequest self = new UpdateNamespaceVpcRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceVpcRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceVpcRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
