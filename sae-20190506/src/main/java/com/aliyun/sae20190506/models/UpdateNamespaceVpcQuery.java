// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceVpcQuery extends TeaModel {
    @NameInMap("NamespaceId")
    @Validation(required = true)
    public String namespaceId;

    @NameInMap("VpcId")
    @Validation(required = true)
    public String vpcId;

    public static UpdateNamespaceVpcQuery build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceVpcQuery self = new UpdateNamespaceVpcQuery();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceVpcQuery setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public UpdateNamespaceVpcQuery setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
