// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiConfigErrorRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    @NameInMap("DpiConfigType")
    public String dpiConfigType;

    @NameInMap("RuleInstanceId")
    public String ruleInstanceId;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("MaxResults")
    public Integer maxResults;

    public static ListDpiConfigErrorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDpiConfigErrorRequest self = new ListDpiConfigErrorRequest();
        return TeaModel.build(map, self);
    }

    public ListDpiConfigErrorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListDpiConfigErrorRequest setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public ListDpiConfigErrorRequest setDpiConfigType(String dpiConfigType) {
        this.dpiConfigType = dpiConfigType;
        return this;
    }
    public String getDpiConfigType() {
        return this.dpiConfigType;
    }

    public ListDpiConfigErrorRequest setRuleInstanceId(String ruleInstanceId) {
        this.ruleInstanceId = ruleInstanceId;
        return this;
    }
    public String getRuleInstanceId() {
        return this.ruleInstanceId;
    }

    public ListDpiConfigErrorRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListDpiConfigErrorRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

}
