// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteAgenticDBComputeClusterRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-g0lsayq8c5qe</p>
     */
    @NameInMap("ComputeClusterId")
    public String computeClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pagc-bp1abcdef1234567</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteAgenticDBComputeClusterRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgenticDBComputeClusterRequest self = new DeleteAgenticDBComputeClusterRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAgenticDBComputeClusterRequest setComputeClusterId(String computeClusterId) {
        this.computeClusterId = computeClusterId;
        return this;
    }
    public String getComputeClusterId() {
        return this.computeClusterId;
    }

    public DeleteAgenticDBComputeClusterRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DeleteAgenticDBComputeClusterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
