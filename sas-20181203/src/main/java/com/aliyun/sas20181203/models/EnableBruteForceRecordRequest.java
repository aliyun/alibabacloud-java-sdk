// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class EnableBruteForceRecordRequest extends TeaModel {
    /**
     * <p>The IP address that is specified in the policy.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>61.155.XX.XX</p>
     */
    @NameInMap("BlockIp")
    public String blockIp;

    /**
     * <p>The traffic direction that is specified in the policy. Valid values:</p>
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
     * <p>The ID of the policy that you want to enable.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeBruteForceRecords~~">DescribeBruteForceRecords</a> operation to query the IDs of policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>116602XX</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The port number.</p>
     * 
     * <strong>example:</strong>
     * <p>22/22</p>
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
     * <p>71046acb-8bff-4c3b-9163-24deb007****</p>
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
