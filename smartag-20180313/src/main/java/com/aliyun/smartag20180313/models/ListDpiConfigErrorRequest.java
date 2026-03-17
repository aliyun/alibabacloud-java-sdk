// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiConfigErrorRequest extends TeaModel {
    /**
     * <p>The type of the instance for which the DPI feature is configured. Valid values:</p>
     * <ul>
     * <li><strong>acl</strong></li>
     * <li><strong>qos</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>qos</p>
     */
    @NameInMap("DpiConfigType")
    public String dpiConfigType;

    /**
     * <p>The maximum number of entries to return on each page.</p>
     * <p>Valid values: <strong>1</strong> to <strong>100</strong>.</p>
     * <p>Default value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to query the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The region ID of the SAG instance.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/69813.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the instance for which the DPI feature is configured.</p>
     * 
     * <strong>example:</strong>
     * <p>qos-1strcafl4wghpb****</p>
     */
    @NameInMap("RuleInstanceId")
    public String ruleInstanceId;

    /**
     * <p>The ID of the SAG instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sag-1e8sgws6b133b8****</p>
     */
    @NameInMap("SmartAGId")
    public String smartAGId;

    public static ListDpiConfigErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDpiConfigErrorRequest self = new ListDpiConfigErrorRequest();
        return TeaModel.build(map, self);
    }

    public ListDpiConfigErrorRequest setDpiConfigType(String dpiConfigType) {
        this.dpiConfigType = dpiConfigType;
        return this;
    }
    public String getDpiConfigType() {
        return this.dpiConfigType;
    }

    public ListDpiConfigErrorRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListDpiConfigErrorRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDpiConfigErrorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDpiConfigErrorRequest setRuleInstanceId(String ruleInstanceId) {
        this.ruleInstanceId = ruleInstanceId;
        return this;
    }
    public String getRuleInstanceId() {
        return this.ruleInstanceId;
    }

    public ListDpiConfigErrorRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

}
