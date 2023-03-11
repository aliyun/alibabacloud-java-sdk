// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableBruteForceRecordRequest extends TeaModel {
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

    /**
     * <p>The ID of the policy that you want to enable.</p>
     * <br>
     * <p>> You can call the [DescribeBruteForceRecords](~~DescribeBruteForceRecords~~) operation to query the IDs of policies.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The port number.</p>
     */
    @NameInMap("Port")
    public String port;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The UUID of the server.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static EnableBruteForceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableBruteForceRecordRequest self = new EnableBruteForceRecordRequest();
        return TeaModel.build(map, self);
    }

    public EnableBruteForceRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public EnableBruteForceRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public EnableBruteForceRecordRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public EnableBruteForceRecordRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public EnableBruteForceRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public EnableBruteForceRecordRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
