// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsAlertruleAppstatusRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("ResType")
    public String resType;

    @NameInMap("RuleType")
    public String ruleType;

    @NameInMap("TargetId")
    public String targetId;

    public static QueryRmsAlertruleAppstatusRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsAlertruleAppstatusRequest self = new QueryRmsAlertruleAppstatusRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsAlertruleAppstatusRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsAlertruleAppstatusRequest setResType(String resType) {
        this.resType = resType;
        return this;
    }
    public String getResType() {
        return this.resType;
    }

    public QueryRmsAlertruleAppstatusRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public QueryRmsAlertruleAppstatusRequest setTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }
    public String getTargetId() {
        return this.targetId;
    }

}
