// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifySoarStrategySubscribeRequest extends TeaModel {
    /**
     * <p>The ID of the policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSoarStrategies~~">DescribeSoarStrategies</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    /**
     * <p>Specifies whether to create the policy template. Valid values:</p>
     * <ul>
     * <li>true: creates the policy template</li>
     * <li>false: deletes the policy template</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SubscribeStatus")
    public Boolean subscribeStatus;

    public static ModifySoarStrategySubscribeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySoarStrategySubscribeRequest self = new ModifySoarStrategySubscribeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySoarStrategySubscribeRequest setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

    public ModifySoarStrategySubscribeRequest setSubscribeStatus(Boolean subscribeStatus) {
        this.subscribeStatus = subscribeStatus;
        return this;
    }
    public Boolean getSubscribeStatus() {
        return this.subscribeStatus;
    }

}
