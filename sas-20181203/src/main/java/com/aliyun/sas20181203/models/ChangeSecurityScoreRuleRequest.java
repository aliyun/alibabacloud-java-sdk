// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ChangeSecurityScoreRuleRequest extends TeaModel {
    @NameInMap("ResetSecurityScoreRule")
    public Boolean resetSecurityScoreRule;

    @NameInMap("SecurityScoreRuleList")
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> securityScoreRuleList;

    public static ChangeSecurityScoreRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeSecurityScoreRuleRequest self = new ChangeSecurityScoreRuleRequest();
        return TeaModel.build(map, self);
    }

    public ChangeSecurityScoreRuleRequest setResetSecurityScoreRule(Boolean resetSecurityScoreRule) {
        this.resetSecurityScoreRule = resetSecurityScoreRule;
        return this;
    }
    public Boolean getResetSecurityScoreRule() {
        return this.resetSecurityScoreRule;
    }

    public ChangeSecurityScoreRuleRequest setSecurityScoreRuleList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> securityScoreRuleList) {
        this.securityScoreRuleList = securityScoreRuleList;
        return this;
    }
    public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static class ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList extends TeaModel {
        @NameInMap("Score")
        public Integer score;

        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        @NameInMap("SubRuleType")
        public String subRuleType;

        public static ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList build(java.util.Map<String, ?> map) throws Exception {
            ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList self = new ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList();
            return TeaModel.build(map, self);
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList setScoreThreshold(Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList setSubRuleType(String subRuleType) {
            this.subRuleType = subRuleType;
            return this;
        }
        public String getSubRuleType() {
            return this.subRuleType;
        }

    }

    public static class ChangeSecurityScoreRuleRequestSecurityScoreRuleList extends TeaModel {
        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("SecurityScoreItemList")
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList> securityScoreItemList;

        public static ChangeSecurityScoreRuleRequestSecurityScoreRuleList build(java.util.Map<String, ?> map) throws Exception {
            ChangeSecurityScoreRuleRequestSecurityScoreRuleList self = new ChangeSecurityScoreRuleRequestSecurityScoreRuleList();
            return TeaModel.build(map, self);
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ChangeSecurityScoreRuleRequestSecurityScoreRuleList setSecurityScoreItemList(java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList> securityScoreItemList) {
            this.securityScoreItemList = securityScoreItemList;
            return this;
        }
        public java.util.List<ChangeSecurityScoreRuleRequestSecurityScoreRuleListSecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

    }

}
