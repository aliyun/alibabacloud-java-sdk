// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DisableBruteForceRecordRequest extends TeaModel {
    /**
     * <p>The IP address that you want to specify in the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8.210.XX.XX</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The traffic direction that you want to specify in the policy. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound</li>
     * <li><strong>out</strong>: outbound</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Bound")
    public String bound;

    /**
     * <p>The ID of the IP address blocking policy.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeBruteForceRecords~~">DescribeBruteForceRecords</a> operation to query the policy ID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>114166XX</p>
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
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cbb9aa80-a8d1-443c-9ff0-2c36cd39****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static DisableBruteForceRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableBruteForceRecordRequest self = new DisableBruteForceRecordRequest();
        return TeaModel.build(map, self);
    }

    public DisableBruteForceRecordRequest setBlockIp(String blockIp) {
        this.blockIp = blockIp;
        return this;
    }
    public String getBlockIp() {
        return this.blockIp;
    }

    public DisableBruteForceRecordRequest setBound(String bound) {
        this.bound = bound;
        return this;
    }
    public String getBound() {
        return this.bound;
    }

    public DisableBruteForceRecordRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public DisableBruteForceRecordRequest setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public DisableBruteForceRecordRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DisableBruteForceRecordRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
