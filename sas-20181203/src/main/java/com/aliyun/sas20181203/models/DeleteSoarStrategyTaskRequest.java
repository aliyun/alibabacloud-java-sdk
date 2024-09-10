// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteSoarStrategyTaskRequest extends TeaModel {
    /**
     * <p>The ID of the policy task that is in the waiting state.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeSoarStrategyTasks~~">DescribeSoarStrategyTasks</a> operation to obtain the ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>11082</p>
     */
    @NameInMap("StrategyTaskId")
    public Long strategyTaskId;

    public static DeleteSoarStrategyTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSoarStrategyTaskRequest self = new DeleteSoarStrategyTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSoarStrategyTaskRequest setStrategyTaskId(Long strategyTaskId) {
        this.strategyTaskId = strategyTaskId;
        return this;
    }
    public Long getStrategyTaskId() {
        return this.strategyTaskId;
    }

}
