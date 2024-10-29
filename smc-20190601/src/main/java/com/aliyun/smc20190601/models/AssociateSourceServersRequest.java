// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class AssociateSourceServersRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The IDs of migration sources. You can specify up to 50 IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SourceId")
    public java.util.List<String> sourceId;

    /**
     * <p>The ID of the workgroup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-***</p>
     */
    @NameInMap("WorkgroupId")
    public String workgroupId;

    public static AssociateSourceServersRequest build(java.util.Map<String, ?> map) throws Exception {
        AssociateSourceServersRequest self = new AssociateSourceServersRequest();
        return TeaModel.build(map, self);
    }

    public AssociateSourceServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AssociateSourceServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AssociateSourceServersRequest setSourceId(java.util.List<String> sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    public AssociateSourceServersRequest setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
        return this;
    }
    public String getWorkgroupId() {
        return this.workgroupId;
    }

}
