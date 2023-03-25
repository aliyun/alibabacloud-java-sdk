// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExecStrategyRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the baseline check policy.</p>
     * <br>
     * <p>>  You can call the [DescribeStrategy](~~DescribeStrategy~~) operation to query the IDs of baseline check policies.</p>
     */
    @NameInMap("StrategyId")
    public Integer strategyId;

    public static ExecStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecStrategyRequest self = new ExecStrategyRequest();
        return TeaModel.build(map, self);
    }

    public ExecStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExecStrategyRequest setStrategyId(Integer strategyId) {
        this.strategyId = strategyId;
        return this;
    }
    public Integer getStrategyId() {
        return this.strategyId;
    }

}
