// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class DeleteWorkgroupRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The workgroup ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>w-***</p>
     */
    @NameInMap("WorkgroupId")
    public String workgroupId;

    public static DeleteWorkgroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkgroupRequest self = new DeleteWorkgroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkgroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteWorkgroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteWorkgroupRequest setWorkgroupId(String workgroupId) {
        this.workgroupId = workgroupId;
        return this;
    }
    public String getWorkgroupId() {
        return this.workgroupId;
    }

}
