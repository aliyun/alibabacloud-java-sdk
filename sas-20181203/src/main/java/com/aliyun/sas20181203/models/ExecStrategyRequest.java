// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExecStrategyRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the baseline check policy.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeStrategy~~">DescribeStrategy</a> operation to query the IDs of baseline check policies.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>215421</p>
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
