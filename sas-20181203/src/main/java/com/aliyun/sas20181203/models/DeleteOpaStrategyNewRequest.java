// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteOpaStrategyNewRequest extends TeaModel {
    @NameInMap("StrategyIds")
    public java.util.List<Long> strategyIds;

    public static DeleteOpaStrategyNewRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOpaStrategyNewRequest self = new DeleteOpaStrategyNewRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOpaStrategyNewRequest setStrategyIds(java.util.List<Long> strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public java.util.List<Long> getStrategyIds() {
        return this.strategyIds;
    }

}
