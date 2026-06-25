// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateNamespaceVpcRequest extends TeaModel {
    /**
     * <p>The short-format namespace ID. You do not need to include the region ID. We recommend that you use this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("NameSpaceShortId")
    public String nameSpaceShortId;

    /**
     * <p>The long-format namespace ID. If you set this parameter, it takes precedence over NameSpaceShortId. This parameter is for backward compatibility. Use the short-format namespace ID to simplify the request.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The ID of the VPC. This VPC replaces the original VPC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2ze0i263cnn311nvj****</p>
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
