// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyFEClusterRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The specifications of the FE cluster. Valid values:</p>
     * <ul>
     * <li><p>selectdb_fe.xlarge16: 4 cores and 16 GB.</p>
     * </li>
     * <li><p>selectdb_fe.2xlarge16: 8 cores and 32 GB.</p>
     * </li>
     * <li><p>selectdb_fe.4xlarge16: 16 cores and 64 GB.</p>
     * </li>
     * <li><p>selectdb_fe.8xlarge16: 32 cores and 128 GB.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>selectdb_fe.2xlarge16</p>
     */
    @NameInMap("FEClassCode")
    public String FEClassCode;

    /**
     * <p>The FE cluster ID. Default value: {instance ID}-fe.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb-cn-7213cjv****-fe</p>
     */
    @NameInMap("FEClusterId")
    public String FEClusterId;

    /**
     * <p>The number of nodes in the FE cluster. The value must be an odd number. Valid values for locally redundant instances: 1 to 11. Valid values for zone-redundant instances: 3 to 11.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("FENodeCount")
    public String FENodeCount;

    /**
     * <p>The product ID. Default value: selectdb.</p>
     * 
     * <strong>example:</strong>
     * <p>selectdb</p>
     */
    @NameInMap("Product")
    public String product;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyFEClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyFEClusterRequest self = new ModifyFEClusterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyFEClusterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyFEClusterRequest setFEClassCode(String FEClassCode) {
        this.FEClassCode = FEClassCode;
        return this;
    }
    public String getFEClassCode() {
        return this.FEClassCode;
    }

    public ModifyFEClusterRequest setFEClusterId(String FEClusterId) {
        this.FEClusterId = FEClusterId;
        return this;
    }
    public String getFEClusterId() {
        return this.FEClusterId;
    }

    public ModifyFEClusterRequest setFENodeCount(String FENodeCount) {
        this.FENodeCount = FENodeCount;
        return this;
    }
    public String getFENodeCount() {
        return this.FENodeCount;
    }

    public ModifyFEClusterRequest setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public ModifyFEClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
