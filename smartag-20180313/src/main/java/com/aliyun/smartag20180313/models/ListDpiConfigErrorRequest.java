// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListDpiConfigErrorRequest extends TeaModel {
    @NameInMap("DpiConfigType")
    public String dpiConfigType;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RuleInstanceId")
    public String ruleInstanceId;

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
