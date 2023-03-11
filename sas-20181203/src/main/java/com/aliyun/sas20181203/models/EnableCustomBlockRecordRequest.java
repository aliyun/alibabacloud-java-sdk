// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableCustomBlockRecordRequest extends TeaModel {
    /**
     * <p>The IP address that is specified in the policy.</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The traffic direction that is specified in the policy. Valid values:</p>
     * <br>
     * <p>*   **in**: inbound</p>
     * <p>*   **out**: outbound</p>
     */
    @NameInMap("Bound")
    public String bound;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static EnableCustomBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomBlockRecordRequest self = new EnableCustomBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public EnableCustomBlockRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public EnableCustomBlockRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public EnableCustomBlockRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
