// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifySpecTypePriceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The compute group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-3d5ce6454354****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <p>The coupon ID.</p>
     * 
     * <strong>example:</strong>
     * <p>youhuiquan_12378dfj6</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>The node type of the compute group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>standard</p>
     */
    @NameInMap("TargetSpecType")
    public String targetSpecType;

    public static QueryModifySpecTypePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModifySpecTypePriceRequest self = new QueryModifySpecTypePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryModifySpecTypePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryModifySpecTypePriceRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public QueryModifySpecTypePriceRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public QueryModifySpecTypePriceRequest setTargetSpecType(String targetSpecType) {
        this.targetSpecType = targetSpecType;
        return this;
    }
    public String getTargetSpecType() {
        return this.targetSpecType;
    }

}
