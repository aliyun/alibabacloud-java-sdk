// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class QueryMonitorKeywordsRequest extends TeaModel {
    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("Keywords")
    public java.util.List<String> keywords;

    public static QueryMonitorKeywordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryMonitorKeywordsRequest self = new QueryMonitorKeywordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryMonitorKeywordsRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public QueryMonitorKeywordsRequest setKeywords(java.util.List<String> keywords) {
        this.keywords = keywords;
        return this;
    }
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

}
