// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExecStrategyRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

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
