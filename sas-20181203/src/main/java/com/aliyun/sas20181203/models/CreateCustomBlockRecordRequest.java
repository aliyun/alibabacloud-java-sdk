// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomBlockRecordRequest extends TeaModel {
    /**
     * <p>The IP address that you want to specify in the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.xx.xx</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The traffic direction that you want to specify in the policy. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound</li>
     * <li><strong>out</strong>: outbound</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Bound")
    public String bound;

    /**
     * <p>The expiration time of the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1859094550000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The UUIDs of the servers. Separate multiple UUIDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>71c846d6-5c84-4714-acfc-58265bc3****,5013b5e8-1613-43a8-b4de-651db318****,df53f0ad-b3ba-4fe0-9ec7-f42a2ae2****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static CreateCustomBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomBlockRecordRequest self = new CreateCustomBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomBlockRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public CreateCustomBlockRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public CreateCustomBlockRecordRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public CreateCustomBlockRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateCustomBlockRecordRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
