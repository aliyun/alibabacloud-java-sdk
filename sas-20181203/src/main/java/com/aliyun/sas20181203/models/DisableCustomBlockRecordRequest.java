// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableCustomBlockRecordRequest extends TeaModel {
    @NameInMap("BlockIp")
    public String blockIp;

    @NameInMap("Bound")
    public String bound;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DisableCustomBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableCustomBlockRecordRequest self = new DisableCustomBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public DisableCustomBlockRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public DisableCustomBlockRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public DisableCustomBlockRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
