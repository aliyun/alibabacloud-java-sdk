// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSecurityScoreRuleResponseBody extends TeaModel {
    @NameInMap("EnableStatus")
    public Boolean enableStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SecurityScoreRuleList")
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> securityScoreRuleList;

    public static GetSecurityScoreRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSecurityScoreRuleResponseBody self = new GetSecurityScoreRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSecurityScoreRuleResponseBody setEnableStatus(Boolean enableStatus) {
        this.enableStatus = enableStatus;
        return this;
    }
    public Boolean getEnableStatus() {
        return this.enableStatus;
    }

    public GetSecurityScoreRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSecurityScoreRuleResponseBody setSecurityScoreRuleList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> securityScoreRuleList) {
        this.securityScoreRuleList = securityScoreRuleList;
        return this;
    }
    public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleList> getSecurityScoreRuleList() {
        return this.securityScoreRuleList;
    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList extends TeaModel {
        @NameInMap("Score")
        public Integer score;

        @NameInMap("ScoreThreshold")
        public Integer scoreThreshold;

        @NameInMap("SubRuleType")
        public String subRuleType;

        @NameInMap("Title")
        public String title;

        public static GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList self = new GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList();
            return TeaModel.build(map, self);
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setScoreThreshold(Integer scoreThreshold) {
            this.scoreThreshold = scoreThreshold;
            return this;
        }
        public Integer getScoreThreshold() {
            return this.scoreThreshold;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setSubRuleType(String subRuleType) {
            this.subRuleType = subRuleType;
            return this;
        }
        public String getSubRuleType() {
            return this.subRuleType;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetSecurityScoreRuleResponseBodySecurityScoreRuleList extends TeaModel {
        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("SecurityScoreItemList")
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> securityScoreItemList;

        @NameInMap("Title")
        public String title;

        public static GetSecurityScoreRuleResponseBodySecurityScoreRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSecurityScoreRuleResponseBodySecurityScoreRuleList self = new GetSecurityScoreRuleResponseBodySecurityScoreRuleList();
            return TeaModel.build(map, self);
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setSecurityScoreItemList(java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> securityScoreItemList) {
            this.securityScoreItemList = securityScoreItemList;
            return this;
        }
        public java.util.List<GetSecurityScoreRuleResponseBodySecurityScoreRuleListSecurityScoreItemList> getSecurityScoreItemList() {
            return this.securityScoreItemList;
        }

        public GetSecurityScoreRuleResponseBodySecurityScoreRuleList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
