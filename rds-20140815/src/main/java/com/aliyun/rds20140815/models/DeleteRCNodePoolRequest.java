// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteRCNodePoolRequest extends TeaModel {
    /**
     * <p>The ID of the ACK cluster to which the RDS Custom instance belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c463aaa89e2b84cacacfbf23c4867****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The node pool ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np31da1b38983f4511b490fc62108a****</p>
     */
    @NameInMap("NodePoolId")
    public String nodePoolId;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteRCNodePoolRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRCNodePoolRequest self = new DeleteRCNodePoolRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRCNodePoolRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DeleteRCNodePoolRequest setNodePoolId(String nodePoolId) {
        this.nodePoolId = nodePoolId;
        return this;
    }
    public String getNodePoolId() {
        return this.nodePoolId;
    }

    public DeleteRCNodePoolRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
