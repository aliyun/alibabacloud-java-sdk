// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class SaveWhiteListStrategyResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5DFD6277-CC36-57F7-ACE6-F5952XXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the application whitelist policy.</p>
     * 
     * <strong>example:</strong>
     * <p>8634</p>
     */
    @NameInMap("StrategyId")
    public Long strategyId;

    public static SaveWhiteListStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveWhiteListStrategyResponseBody self = new SaveWhiteListStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveWhiteListStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveWhiteListStrategyResponseBody setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Long getStrategyId() {
        return this.strategyId;
    }

}
