// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListSkillGroupConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSkillGroupConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupConfigResponseBody self = new ListSkillGroupConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupConfigResponseBody setData(ListSkillGroupConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillGroupConfigResponseBodyData getData() {
        return this.data;
    }

    public ListSkillGroupConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>221</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo self = new ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList extends TeaModel {
        @NameInMap("RuleNameInfo")
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo> ruleNameInfo;

        public static ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList self = new ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList setRuleNameInfo(java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo> ruleNameInfo) {
            this.ruleNameInfo = ruleNameInfo;
            return this;
        }
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleListRuleNameInfo> getRuleNameInfo() {
            return this.ruleNameInfo;
        }

    }

    public static class ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2221</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <strong>example:</strong>
         * <p>x\&quot;x\&quot;x</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        public static ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo self = new ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList extends TeaModel {
        @NameInMap("RuleNameInfo")
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo> ruleNameInfo;

        public static ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList self = new ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList setRuleNameInfo(java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo> ruleNameInfo) {
            this.ruleNameInfo = ruleNameInfo;
            return this;
        }
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleListRuleNameInfo> getRuleNameInfo() {
            return this.ruleNameInfo;
        }

    }

    public static class ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        /**
         * <strong>example:</strong>
         * <p>customerName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Symbol")
        public Integer symbol;

        @NameInMap("Value")
        public String value;

        public static ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen self = new ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen setSymbol(Integer symbol) {
            this.symbol = symbol;
            return this;
        }
        public Integer getSymbol() {
            return this.symbol;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens extends TeaModel {
        @NameInMap("SkillGroupScreen")
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen> skillGroupScreen;

        public static ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens self = new ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens setSkillGroupScreen(java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen> skillGroupScreen) {
            this.skillGroupScreen = skillGroupScreen;
            return this;
        }
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreensSkillGroupScreen> getSkillGroupScreen() {
            return this.skillGroupScreen;
        }

    }

    public static class ListSkillGroupConfigResponseBodyDataSkillGroupConfig extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllContentQualityCheck")
        public Integer allContentQualityCheck;

        /**
         * <strong>example:</strong>
         * <p>223</p>
         */
        @NameInMap("AllRids")
        public String allRids;

        @NameInMap("AllRuleList")
        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList allRuleList;

        /**
         * <strong>example:</strong>
         * <p>2020-12-01T15:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>221</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>211</p>
         */
        @NameInMap("ModelId")
        public Long modelId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QualityCheckType")
        public Integer qualityCheckType;

        /**
         * <strong>example:</strong>
         * <p>2221</p>
         */
        @NameInMap("Rid")
        public String rid;

        @NameInMap("RuleList")
        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList ruleList;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ScreenSwitch")
        public Boolean screenSwitch;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SkillGroupFrom")
        public Integer skillGroupFrom;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupScreens")
        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens skillGroupScreens;

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
         * <p>2020-12-01T19:28Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>323</p>
         */
        @NameInMap("VocabId")
        public Long vocabId;

        /**
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("VocabName")
        public String vocabName;

        public static ListSkillGroupConfigResponseBodyDataSkillGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyDataSkillGroupConfig self = new ListSkillGroupConfigResponseBodyDataSkillGroupConfig();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setAllContentQualityCheck(Integer allContentQualityCheck) {
            this.allContentQualityCheck = allContentQualityCheck;
            return this;
        }
        public Integer getAllContentQualityCheck() {
            return this.allContentQualityCheck;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setAllRids(String allRids) {
            this.allRids = allRids;
            return this;
        }
        public String getAllRids() {
            return this.allRids;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setAllRuleList(ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList allRuleList) {
            this.allRuleList = allRuleList;
            return this;
        }
        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigAllRuleList getAllRuleList() {
            return this.allRuleList;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setQualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }
        public Integer getQualityCheckType() {
            return this.qualityCheckType;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setRuleList(ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigRuleList getRuleList() {
            return this.ruleList;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setScreenSwitch(Boolean screenSwitch) {
            this.screenSwitch = screenSwitch;
            return this;
        }
        public Boolean getScreenSwitch() {
            return this.screenSwitch;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setSkillGroupFrom(Integer skillGroupFrom) {
            this.skillGroupFrom = skillGroupFrom;
            return this;
        }
        public Integer getSkillGroupFrom() {
            return this.skillGroupFrom;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setSkillGroupScreens(ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens skillGroupScreens) {
            this.skillGroupScreens = skillGroupScreens;
            return this;
        }
        public ListSkillGroupConfigResponseBodyDataSkillGroupConfigSkillGroupScreens getSkillGroupScreens() {
            return this.skillGroupScreens;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setVocabId(Long vocabId) {
            this.vocabId = vocabId;
            return this;
        }
        public Long getVocabId() {
            return this.vocabId;
        }

        public ListSkillGroupConfigResponseBodyDataSkillGroupConfig setVocabName(String vocabName) {
            this.vocabName = vocabName;
            return this;
        }
        public String getVocabName() {
            return this.vocabName;
        }

    }

    public static class ListSkillGroupConfigResponseBodyData extends TeaModel {
        @NameInMap("SkillGroupConfig")
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfig> skillGroupConfig;

        public static ListSkillGroupConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupConfigResponseBodyData self = new ListSkillGroupConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupConfigResponseBodyData setSkillGroupConfig(java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfig> skillGroupConfig) {
            this.skillGroupConfig = skillGroupConfig;
            return this;
        }
        public java.util.List<ListSkillGroupConfigResponseBodyDataSkillGroupConfig> getSkillGroupConfig() {
            return this.skillGroupConfig;
        }

    }

}
