// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRuleResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F190ADE9-619A-447D-84E3-7E241A5C428E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRuleResponseBody self = new GetRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRuleResponseBody setData(GetRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRuleResponseBodyData getData() {
        return this.data;
    }

    public GetRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList extends TeaModel {
        @NameInMap("BusinessCategoryNameList")
        public java.util.List<String> businessCategoryNameList;

        public static GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList self = new GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList setBusinessCategoryNameList(java.util.List<String> businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }
        public java.util.List<String> getBusinessCategoryNameList() {
            return this.businessCategoryNameList;
        }

    }

    public static class GetRuleResponseBodyDataRulesRuleInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoReview")
        public Integer autoReview;

        @NameInMap("BusinessCategoryNameList")
        public GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList businessCategoryNameList;

        @NameInMap("Comments")
        public String comments;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CreateEmpid")
        public String createEmpid;

        /**
         * <strong>example:</strong>
         * <p>2016-08-05 10:37:10</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>2016-08-05 10:37:10</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IsDelete")
        public Integer isDelete;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IsOnline")
        public Integer isOnline;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("LastUpdateEmpid")
        public String lastUpdateEmpid;

        /**
         * <strong>example:</strong>
         * <p>2019-10-28 14:23:28</p>
         */
        @NameInMap("LastUpdateTime")
        public String lastUpdateTime;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Rid")
        public String rid;

        /**
         * <strong>example:</strong>
         * <p>a &amp;&amp; b</p>
         */
        @NameInMap("RuleLambda")
        public String ruleLambda;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("ScoreId")
        public Integer scoreId;

        @NameInMap("ScoreName")
        public String scoreName;

        /**
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("ScoreSubId")
        public Integer scoreSubId;

        @NameInMap("ScoreSubName")
        public String scoreSubName;

        /**
         * <strong>example:</strong>
         * <p>2016-08-05 10:37:10</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Weight")
        public String weight;

        public static GetRuleResponseBodyDataRulesRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataRulesRuleInfo self = new GetRuleResponseBodyDataRulesRuleInfo();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataRulesRuleInfo setAutoReview(Integer autoReview) {
            this.autoReview = autoReview;
            return this;
        }
        public Integer getAutoReview() {
            return this.autoReview;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setBusinessCategoryNameList(GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList businessCategoryNameList) {
            this.businessCategoryNameList = businessCategoryNameList;
            return this;
        }
        public GetRuleResponseBodyDataRulesRuleInfoBusinessCategoryNameList getBusinessCategoryNameList() {
            return this.businessCategoryNameList;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setComments(String comments) {
            this.comments = comments;
            return this;
        }
        public String getComments() {
            return this.comments;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setCreateEmpid(String createEmpid) {
            this.createEmpid = createEmpid;
            return this;
        }
        public String getCreateEmpid() {
            return this.createEmpid;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setIsDelete(Integer isDelete) {
            this.isDelete = isDelete;
            return this;
        }
        public Integer getIsDelete() {
            return this.isDelete;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setIsOnline(Integer isOnline) {
            this.isOnline = isOnline;
            return this;
        }
        public Integer getIsOnline() {
            return this.isOnline;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setLastUpdateEmpid(String lastUpdateEmpid) {
            this.lastUpdateEmpid = lastUpdateEmpid;
            return this;
        }
        public String getLastUpdateEmpid() {
            return this.lastUpdateEmpid;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setLastUpdateTime(String lastUpdateTime) {
            this.lastUpdateTime = lastUpdateTime;
            return this;
        }
        public String getLastUpdateTime() {
            return this.lastUpdateTime;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setRuleLambda(String ruleLambda) {
            this.ruleLambda = ruleLambda;
            return this;
        }
        public String getRuleLambda() {
            return this.ruleLambda;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setRuleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setScoreId(Integer scoreId) {
            this.scoreId = scoreId;
            return this;
        }
        public Integer getScoreId() {
            return this.scoreId;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setScoreName(String scoreName) {
            this.scoreName = scoreName;
            return this;
        }
        public String getScoreName() {
            return this.scoreName;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setScoreSubId(Integer scoreSubId) {
            this.scoreSubId = scoreSubId;
            return this;
        }
        public Integer getScoreSubId() {
            return this.scoreSubId;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setScoreSubName(String scoreSubName) {
            this.scoreSubName = scoreSubName;
            return this;
        }
        public String getScoreSubName() {
            return this.scoreSubName;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetRuleResponseBodyDataRulesRuleInfo setWeight(String weight) {
            this.weight = weight;
            return this;
        }
        public String getWeight() {
            return this.weight;
        }

    }

    public static class GetRuleResponseBodyDataRules extends TeaModel {
        @NameInMap("RuleInfo")
        public java.util.List<GetRuleResponseBodyDataRulesRuleInfo> ruleInfo;

        public static GetRuleResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyDataRules self = new GetRuleResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyDataRules setRuleInfo(java.util.List<GetRuleResponseBodyDataRulesRuleInfo> ruleInfo) {
            this.ruleInfo = ruleInfo;
            return this;
        }
        public java.util.List<GetRuleResponseBodyDataRulesRuleInfo> getRuleInfo() {
            return this.ruleInfo;
        }

    }

    public static class GetRuleResponseBodyData extends TeaModel {
        @NameInMap("Rules")
        public GetRuleResponseBodyDataRules rules;

        public static GetRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRuleResponseBodyData self = new GetRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRuleResponseBodyData setRules(GetRuleResponseBodyDataRules rules) {
            this.rules = rules;
            return this;
        }
        public GetRuleResponseBodyDataRules getRules() {
            return this.rules;
        }

    }

}
