// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyVirtualClusterRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>selectdb-o2yg***-be</p>
     */
    @NameInMap("ActiveClusterId")
    public String activeClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-vcg-b****-be</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>selectdb-pu6y****-be</p>
     */
    @NameInMap("StandbyClusterId")
    public String standbyClusterId;

    public static ModifyVirtualClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVirtualClusterRequest self = new ModifyVirtualClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVirtualClusterRequest setActiveClusterId(String activeClusterId) {
        this.activeClusterId = activeClusterId;
        return this;
    }
    public String getActiveClusterId() {
        return this.activeClusterId;
    }

    public ModifyVirtualClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyVirtualClusterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyVirtualClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyVirtualClusterRequest setStandbyClusterId(String standbyClusterId) {
        this.standbyClusterId = standbyClusterId;
        return this;
    }
    public String getStandbyClusterId() {
        return this.standbyClusterId;
    }

}
