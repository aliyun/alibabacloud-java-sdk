// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class QueryModifyDiskTypePriceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ng-d332aa8bca48****</p>
     */
    @NameInMap("NodeGroupId")
    public String nodeGroupId;

    /**
     * <strong>example:</strong>
     * <p>youhuiquan_12378dfj6</p>
     */
    @NameInMap("PromotionOptionNo")
    public String promotionOptionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>essd</p>
     */
    @NameInMap("TargetDiskType")
    public String targetDiskType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pl2</p>
     */
    @NameInMap("TargetPerformanceLevel")
    public String targetPerformanceLevel;

    public static QueryModifyDiskTypePriceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryModifyDiskTypePriceRequest self = new QueryModifyDiskTypePriceRequest();
        return TeaModel.build(map, self);
    }

    public QueryModifyDiskTypePriceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryModifyDiskTypePriceRequest setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
        return this;
    }
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    public QueryModifyDiskTypePriceRequest setPromotionOptionNo(String promotionOptionNo) {
        this.promotionOptionNo = promotionOptionNo;
        return this;
    }
    public String getPromotionOptionNo() {
        return this.promotionOptionNo;
    }

    public QueryModifyDiskTypePriceRequest setTargetDiskType(String targetDiskType) {
        this.targetDiskType = targetDiskType;
        return this;
    }
    public String getTargetDiskType() {
        return this.targetDiskType;
    }

    public QueryModifyDiskTypePriceRequest setTargetPerformanceLevel(String targetPerformanceLevel) {
        this.targetPerformanceLevel = targetPerformanceLevel;
        return this;
    }
    public String getTargetPerformanceLevel() {
        return this.targetPerformanceLevel;
    }

}
