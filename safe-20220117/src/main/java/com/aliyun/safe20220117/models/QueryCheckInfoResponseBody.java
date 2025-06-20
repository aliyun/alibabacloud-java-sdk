// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safe20220117.models;

import com.aliyun.tea.*;

public class QueryCheckInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public QueryCheckInfoResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryCheckInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCheckInfoResponseBody self = new QueryCheckInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCheckInfoResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public QueryCheckInfoResponseBody setData(QueryCheckInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryCheckInfoResponseBodyData getData() {
        return this.data;
    }

    public QueryCheckInfoResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCheckInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCheckInfoResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList extends TeaModel {
        @NameInMap("LeafLevel")
        public String leafLevel;

        @NameInMap("Level1")
        public String level1;

        @NameInMap("Level2")
        public String level2;

        @NameInMap("Level3")
        public String level3;

        @NameInMap("Level4")
        public String level4;

        @NameInMap("Level5")
        public String level5;

        @NameInMap("Path")
        public String path;

        @NameInMap("RuleId")
        public Long ruleId;

        @NameInMap("Type")
        public String type;

        public static QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList build(java.util.Map<String, ?> map) throws Exception {
            QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList self = new QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList();
            return TeaModel.build(map, self);
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setLeafLevel(String leafLevel) {
            this.leafLevel = leafLevel;
            return this;
        }
        public String getLeafLevel() {
            return this.leafLevel;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setLevel1(String level1) {
            this.level1 = level1;
            return this;
        }
        public String getLevel1() {
            return this.level1;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setLevel2(String level2) {
            this.level2 = level2;
            return this;
        }
        public String getLevel2() {
            return this.level2;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setLevel3(String level3) {
            this.level3 = level3;
            return this;
        }
        public String getLevel3() {
            return this.level3;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setLevel4(String level4) {
            this.level4 = level4;
            return this;
        }
        public String getLevel4() {
            return this.level4;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setLevel5(String level5) {
            this.level5 = level5;
            return this;
        }
        public String getLevel5() {
            return this.level5;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setRuleId(Long ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public Long getRuleId() {
            return this.ruleId;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryCheckInfoResponseBodyDataCheckDetailListBlockRule extends TeaModel {
        @NameInMap("BlockHarm")
        public String blockHarm;

        @NameInMap("BlockId")
        public Long blockId;

        @NameInMap("Express")
        public String express;

        @NameInMap("ScopeEndTime")
        public Long scopeEndTime;

        @NameInMap("ScopeNodeList")
        public java.util.List<QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList> scopeNodeList;

        @NameInMap("ScopeRuleId")
        public Long scopeRuleId;

        @NameInMap("ScopeStartTime")
        public Long scopeStartTime;

        public static QueryCheckInfoResponseBodyDataCheckDetailListBlockRule build(java.util.Map<String, ?> map) throws Exception {
            QueryCheckInfoResponseBodyDataCheckDetailListBlockRule self = new QueryCheckInfoResponseBodyDataCheckDetailListBlockRule();
            return TeaModel.build(map, self);
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRule setBlockHarm(String blockHarm) {
            this.blockHarm = blockHarm;
            return this;
        }
        public String getBlockHarm() {
            return this.blockHarm;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRule setBlockId(Long blockId) {
            this.blockId = blockId;
            return this;
        }
        public Long getBlockId() {
            return this.blockId;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRule setExpress(String express) {
            this.express = express;
            return this;
        }
        public String getExpress() {
            return this.express;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRule setScopeEndTime(Long scopeEndTime) {
            this.scopeEndTime = scopeEndTime;
            return this;
        }
        public Long getScopeEndTime() {
            return this.scopeEndTime;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRule setScopeNodeList(java.util.List<QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList> scopeNodeList) {
            this.scopeNodeList = scopeNodeList;
            return this;
        }
        public java.util.List<QueryCheckInfoResponseBodyDataCheckDetailListBlockRuleScopeNodeList> getScopeNodeList() {
            return this.scopeNodeList;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRule setScopeRuleId(Long scopeRuleId) {
            this.scopeRuleId = scopeRuleId;
            return this;
        }
        public Long getScopeRuleId() {
            return this.scopeRuleId;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailListBlockRule setScopeStartTime(Long scopeStartTime) {
            this.scopeStartTime = scopeStartTime;
            return this;
        }
        public Long getScopeStartTime() {
            return this.scopeStartTime;
        }

    }

    public static class QueryCheckInfoResponseBodyDataCheckDetailList extends TeaModel {
        @NameInMap("BlockRule")
        public java.util.List<QueryCheckInfoResponseBodyDataCheckDetailListBlockRule> blockRule;

        @NameInMap("CheckholdReason")
        public String checkholdReason;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("PicInfo")
        public String picInfo;

        @NameInMap("RiskExplain")
        public String riskExplain;

        @NameInMap("Title")
        public String title;

        @NameInMap("Url")
        public String url;

        public static QueryCheckInfoResponseBodyDataCheckDetailList build(java.util.Map<String, ?> map) throws Exception {
            QueryCheckInfoResponseBodyDataCheckDetailList self = new QueryCheckInfoResponseBodyDataCheckDetailList();
            return TeaModel.build(map, self);
        }

        public QueryCheckInfoResponseBodyDataCheckDetailList setBlockRule(java.util.List<QueryCheckInfoResponseBodyDataCheckDetailListBlockRule> blockRule) {
            this.blockRule = blockRule;
            return this;
        }
        public java.util.List<QueryCheckInfoResponseBodyDataCheckDetailListBlockRule> getBlockRule() {
            return this.blockRule;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailList setCheckholdReason(String checkholdReason) {
            this.checkholdReason = checkholdReason;
            return this;
        }
        public String getCheckholdReason() {
            return this.checkholdReason;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailList setPicInfo(String picInfo) {
            this.picInfo = picInfo;
            return this;
        }
        public String getPicInfo() {
            return this.picInfo;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailList setRiskExplain(String riskExplain) {
            this.riskExplain = riskExplain;
            return this;
        }
        public String getRiskExplain() {
            return this.riskExplain;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryCheckInfoResponseBodyDataCheckDetailList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryCheckInfoResponseBodyData extends TeaModel {
        @NameInMap("CheckDetailList")
        public java.util.List<QueryCheckInfoResponseBodyDataCheckDetailList> checkDetailList;

        @NameInMap("CheckResultUrl")
        public String checkResultUrl;

        public static QueryCheckInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCheckInfoResponseBodyData self = new QueryCheckInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCheckInfoResponseBodyData setCheckDetailList(java.util.List<QueryCheckInfoResponseBodyDataCheckDetailList> checkDetailList) {
            this.checkDetailList = checkDetailList;
            return this;
        }
        public java.util.List<QueryCheckInfoResponseBodyDataCheckDetailList> getCheckDetailList() {
            return this.checkDetailList;
        }

        public QueryCheckInfoResponseBodyData setCheckResultUrl(String checkResultUrl) {
            this.checkResultUrl = checkResultUrl;
            return this;
        }
        public String getCheckResultUrl() {
            return this.checkResultUrl;
        }

    }

}
