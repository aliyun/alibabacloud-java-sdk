// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyCustomEndpointNetRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pxc-****</p>
     */
    @NameInMap("ConnPrefix")
    public String connPrefix;

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
     * <p>pxc-********</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public Integer port;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>vsw-*********</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <strong>example:</strong>
     * <p>vpc-bp1ndoug37dtwoedlmru0</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static ModifyCustomEndpointNetRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCustomEndpointNetRequest self = new ModifyCustomEndpointNetRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCustomEndpointNetRequest setConnPrefix(String connPrefix) {
        this.connPrefix = connPrefix;
        return this;
    }
    public String getConnPrefix() {
        return this.connPrefix;
    }

    public ModifyCustomEndpointNetRequest setCustomEndpointId(String customEndpointId) {
        this.customEndpointId = customEndpointId;
        return this;
    }
    public String getCustomEndpointId() {
        return this.customEndpointId;
    }

    public ModifyCustomEndpointNetRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyCustomEndpointNetRequest setPort(Integer port) {
        this.port = port;
        return this;
    }
    public Integer getPort() {
        return this.port;
    }

    public ModifyCustomEndpointNetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCustomEndpointNetRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyCustomEndpointNetRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
