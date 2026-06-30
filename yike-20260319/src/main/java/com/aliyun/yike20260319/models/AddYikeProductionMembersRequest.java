// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class AddYikeProductionMembersRequest extends TeaModel {
    /**
     * <p>The project ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pd_061716***</p>
     */
    @NameInMap("ProductionId")
    public String productionId;

    /**
     * <p>The IDs of the RAM users.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21*****</p>
     */
    @NameInMap("YikeUserIds")
    public String yikeUserIds;

    public static AddYikeProductionMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        AddYikeProductionMembersRequest self = new AddYikeProductionMembersRequest();
        return TeaModel.build(map, self);
    }

    public AddYikeProductionMembersRequest setProductionId(String productionId) {
        this.productionId = productionId;
        return this;
    }
    public String getProductionId() {
        return this.productionId;
    }

    public AddYikeProductionMembersRequest setYikeUserIds(String yikeUserIds) {
        this.yikeUserIds = yikeUserIds;
        return this;
    }
    public String getYikeUserIds() {
        return this.yikeUserIds;
    }

}
