// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeStrategyRequest extends TeaModel {
    /**
     * <p>The type of the baseline check policy that you want to query. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: standard baseline check policy</li>
     * <li><strong>custom</strong>: custom baseline check policy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("CustomType")
    public String customType;

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
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.X.X</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The ID of the baseline check policy that you want to query. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>8164248</p>
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
