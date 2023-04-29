// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateCustomBlockRecordRequest extends TeaModel {
    @NameInMap("BlockIp")
    public String blockIp;

    @NameInMap("Bound")
    public String bound;

    @NameInMap("ExpireTime")
    public Long expireTime;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

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
