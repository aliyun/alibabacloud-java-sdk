// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyCustomBlockRecordRequest extends TeaModel {
    /**
     * <p>The IP address that you want to specify in the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The traffic direction that you want to specify in the policy. Valid values:</p>
     * <br>
     * <p>*   **in**: inbound</p>
     * <p>*   **out**: outbound</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Bound")
    public String bound;

    /**
     * <p>The expiration time of the policy.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The UUIDs of servers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ModifyCustomBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomBlockRecordRequest self = new ModifyCustomBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomBlockRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public ModifyCustomBlockRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public ModifyCustomBlockRecordRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ModifyCustomBlockRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyCustomBlockRecordRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
