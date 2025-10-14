// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateCustomEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-hzjasd****</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ext-win-live-17</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NodeAutoEnter")
    public Boolean nodeAutoEnter;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1l5kfgw8****c3iv</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <strong>example:</strong>
     * <p>READONLY</p>
     */
    @NameInMap("NodeRole")
    public String nodeRole;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1ndoug37dtwoedlmru0</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static CreateCustomEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomEndpointRequest self = new CreateCustomEndpointRequest();
        return TeaModel.build(map, self);
    }

    public CreateCustomEndpointRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateCustomEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateCustomEndpointRequest setNodeAutoEnter(Boolean nodeAutoEnter) {
        this.nodeAutoEnter = nodeAutoEnter;
        return this;
    }
    public Boolean getNodeAutoEnter() {
        return this.nodeAutoEnter;
    }

    public CreateCustomEndpointRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public CreateCustomEndpointRequest setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }
    public String getNodeRole() {
        return this.nodeRole;
    }

    public CreateCustomEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateCustomEndpointRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateCustomEndpointRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
