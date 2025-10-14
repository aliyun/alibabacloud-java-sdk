// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCustomEndpointRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cep-002</p>
     */
    @NameInMap("CustomEndpointId")
    public String customEndpointId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mydatabase</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>secondary-endpoint</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NodeAutoEnter")
    public Boolean nodeAutoEnter;

    /**
     * <p>node ids</p>
     * 
     * <strong>example:</strong>
     * <p>node3</p>
     */
    @NameInMap("NodeIds")
    public String nodeIds;

    /**
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("NodeRole")
    public String nodeRole;

    /**
     * <strong>example:</strong>
     * <p>cn-zhangjiakou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyCustomEndpointRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomEndpointRequest self = new ModifyCustomEndpointRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomEndpointRequest setCustomEndpointId(String customEndpointId) {
        this.customEndpointId = customEndpointId;
        return this;
    }
    public String getCustomEndpointId() {
        return this.customEndpointId;
    }

    public ModifyCustomEndpointRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyCustomEndpointRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifyCustomEndpointRequest setNodeAutoEnter(Boolean nodeAutoEnter) {
        this.nodeAutoEnter = nodeAutoEnter;
        return this;
    }
    public Boolean getNodeAutoEnter() {
        return this.nodeAutoEnter;
    }

    public ModifyCustomEndpointRequest setNodeIds(String nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }
    public String getNodeIds() {
        return this.nodeIds;
    }

    public ModifyCustomEndpointRequest setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }
    public String getNodeRole() {
        return this.nodeRole;
    }

    public ModifyCustomEndpointRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
