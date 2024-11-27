// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class MoveDatabasesToNetworkDomainRequest extends TeaModel {
    /**
     * <p>The IDs of the databases that you want to add to the network domain.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DatabaseIds")
    public java.util.List<String> databaseIds;

    /**
     * <p>The bastion host ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to query the bastion host ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>bastionhost-cn-zpr3h2zo60l</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the network domain to which you want to add databases.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2758827.html">ListNetworkDomains</a> operation to query the network domain ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("NetworkDomainId")
    public String networkDomainId;

    /**
     * <p>The region ID of the bastion host.</p>
     * <blockquote>
     * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static MoveDatabasesToNetworkDomainRequest build(java.util.Map<String, ?> map) throws Exception {
        MoveDatabasesToNetworkDomainRequest self = new MoveDatabasesToNetworkDomainRequest();
        return TeaModel.build(map, self);
    }

    public MoveDatabasesToNetworkDomainRequest setDatabaseIds(java.util.List<String> databaseIds) {
        this.databaseIds = databaseIds;
        return this;
    }
    public java.util.List<String> getDatabaseIds() {
        return this.databaseIds;
    }

    public MoveDatabasesToNetworkDomainRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public MoveDatabasesToNetworkDomainRequest setNetworkDomainId(String networkDomainId) {
        this.networkDomainId = networkDomainId;
        return this;
    }
    public String getNetworkDomainId() {
        return this.networkDomainId;
    }

    public MoveDatabasesToNetworkDomainRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
