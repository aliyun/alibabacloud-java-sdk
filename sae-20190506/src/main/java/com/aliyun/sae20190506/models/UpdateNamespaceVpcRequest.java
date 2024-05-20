// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceVpcRequest extends TeaModel {
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>vpc-2ze0i263cnn311nvj\\*\\*\\*\\*</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The ID of the request.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static UpdateNamespaceVpcRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateNamespaceVpcRequest self = new UpdateNamespaceVpcRequest();
        return TeaModel.build(map, self);
    }

    public UpdateNamespaceVpcRequest setNameSpaceShortId(String nameSpaceShortId) {
        this.nameSpaceShortId = nameSpaceShortId;
        return this;
    }
    public String getNameSpaceShortId() {
        return this.nameSpaceShortId;
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
