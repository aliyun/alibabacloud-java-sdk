// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DisassociateSourceServersRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The IDs of migration sources that you want to disassociate from the workgroup. You can specify up to 50 migration sources.</p>
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

    public static DisassociateSourceServersRequest build(java.util.Map<String, ?> map) throws Exception {
        DisassociateSourceServersRequest self = new DisassociateSourceServersRequest();
        return TeaModel.build(map, self);
    }

    public DisassociateSourceServersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DisassociateSourceServersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DisassociateSourceServersRequest setSourceId(java.util.List<String> sourceId) {
        this.sourceId = sourceId;
        return this;
    }
    public java.util.List<String> getSourceId() {
        return this.sourceId;
    }

    public DisassociateSourceServersRequest setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
        return this;
    }
    public String getWorkgroupId() {
        return this.workgroupId;
    }

}
