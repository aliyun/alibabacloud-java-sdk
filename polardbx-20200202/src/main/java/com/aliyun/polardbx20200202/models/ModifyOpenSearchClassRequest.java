// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyOpenSearchClassRequest extends TeaModel {
    /**
     * <p>The target disk size per node, in GB. If not specified, the current disk size is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("DBInstanceDiskSize")
    public Integer DBInstanceDiskSize;

    /**
     * <p>The name of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-spsil01pww4hfz</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The node specifications code of the PolarDB-X Search data node. This parameter is required. Active node specifications depend on the region and sales configuration, and must differ from the current node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>opensearch.sn2ne.large.1</p>
     */
    @NameInMap("SearchClassCode")
    public String searchClassCode;

    public static ModifyOpenSearchClassRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOpenSearchClassRequest self = new ModifyOpenSearchClassRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOpenSearchClassRequest setDBInstanceDiskSize(Integer DBInstanceDiskSize) {
        this.DBInstanceDiskSize = DBInstanceDiskSize;
        return this;
    }
    public Integer getDBInstanceDiskSize() {
        return this.DBInstanceDiskSize;
    }

    public ModifyOpenSearchClassRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyOpenSearchClassRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyOpenSearchClassRequest setSearchClassCode(String searchClassCode) {
        this.searchClassCode = searchClassCode;
        return this;
    }
    public String getSearchClassCode() {
        return this.searchClassCode;
    }

}
