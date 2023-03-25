// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyRequest extends TeaModel {
    /**
     * <p>The type of the baseline check policy that you want to query. Valid values:</p>
     * <br>
     * <p>*   **common**: standard baseline check policy</p>
     * <p>*   **custom**: custom baseline check policy</p>
     */
    @NameInMap("CustomType")
    public String customType;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the baseline check policy that you want to query. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("StrategyIds")
    public String strategyIds;

    public static DescribeStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStrategyRequest self = new DescribeStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStrategyRequest setCustomType(String customType) {
        this.customType = customType;
        return this;
    }
    public String getCustomType() {
        return this.customType;
    }

    public DescribeStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeStrategyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeStrategyRequest setStrategyIds(String strategyIds) {
        this.strategyIds = strategyIds;
        return this;
    }
    public String getStrategyIds() {
        return this.strategyIds;
    }

}
