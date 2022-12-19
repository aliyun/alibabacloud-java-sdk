// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyRequest extends TeaModel {
    // The type of the baseline check policy that you want to query. Valid values:
    // 
    // *   **common**: standard baseline check policy
    // *   **custom**: custom baseline check policy
    @NameInMap("CustomType")
    public String customType;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The ID of the baseline check policy that you want to query. Separate multiple IDs with commas (,).
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
