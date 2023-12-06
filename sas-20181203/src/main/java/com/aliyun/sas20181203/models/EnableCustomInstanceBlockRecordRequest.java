// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableCustomInstanceBlockRecordRequest extends TeaModel {
    /**
     * <p>The IP address that you want to block.</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The traffic direction from the IP address that you want to block. Valid value:</p>
     * <br>
     * <p>*   **in**</p>
     * <p>*   **out**</p>
     */
    @NameInMap("Bound")
    public String bound;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The UUID of the server.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static EnableCustomInstanceBlockRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableCustomInstanceBlockRecordRequest self = new EnableCustomInstanceBlockRecordRequest();
        return TeaModel.build(map, self);
    }

    public EnableCustomInstanceBlockRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public EnableCustomInstanceBlockRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public EnableCustomInstanceBlockRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableCustomInstanceBlockRecordRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
