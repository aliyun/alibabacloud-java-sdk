// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetSkillGroupConfigResponseBody extends TeaModel {
    /**
     * <p>The response code. A value of <strong>200</strong> indicates a successful response.</p>
     * <blockquote>
     * <p>Other values indicate a failed response. You can use this field to identify the cause of the failure.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the skill group rule configuration.</p>
     */
    @NameInMap("Data")
    public GetSkillGroupConfigResponseBodyData data;

    /**
     * <p>The response message. If the request is successful, a value of <strong>successful</strong> is returned. If the request fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3CEA0495-341B-4482-9AD9-8191EF4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * <p>The caller can use this field to determine whether the request was successful:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p>false or <strong>null</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSkillGroupConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillGroupConfigResponseBody self = new GetSkillGroupConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillGroupConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillGroupConfigResponseBody setData(GetSkillGroupConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSkillGroupConfigResponseBodyData getData() {
        return this.data;
    }

    public GetSkillGroupConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillGroupConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillGroupConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo extends TeaModel {
        @NameInMap("Rid")
        public Long rid;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo self = new GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetSkillGroupConfigResponseBodyDataAllRuleList extends TeaModel {
        @NameInMap("RuleNameInfo")
        public java.util.List<GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo> ruleNameInfo;

        public static GetSkillGroupConfigResponseBodyDataAllRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupConfigResponseBodyDataAllRuleList self = new GetSkillGroupConfigResponseBodyDataAllRuleList();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupConfigResponseBodyDataAllRuleList setRuleNameInfo(java.util.List<GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo> ruleNameInfo) {
            this.ruleNameInfo = ruleNameInfo;
            return this;
        }
        public java.util.List<GetSkillGroupConfigResponseBodyDataAllRuleListRuleNameInfo> getRuleNameInfo() {
            return this.ruleNameInfo;
        }

    }

    public static class GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo extends TeaModel {
        @NameInMap("Rid")
        public Long rid;

        @NameInMap("RuleName")
        public String ruleName;

        public static GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo self = new GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

    public static class GetSkillGroupConfigResponseBodyDataRuleList extends TeaModel {
        @NameInMap("RuleNameInfo")
        public java.util.List<GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo> ruleNameInfo;

        public static GetSkillGroupConfigResponseBodyDataRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupConfigResponseBodyDataRuleList self = new GetSkillGroupConfigResponseBodyDataRuleList();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupConfigResponseBodyDataRuleList setRuleNameInfo(java.util.List<GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo> ruleNameInfo) {
            this.ruleNameInfo = ruleNameInfo;
            return this;
        }
        public java.util.List<GetSkillGroupConfigResponseBodyDataRuleListRuleNameInfo> getRuleNameInfo() {
            return this.ruleNameInfo;
        }

    }

    public static class GetSkillGroupConfigResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether to perform a full-text quality check after the real-time quality check is complete. Valid values:</p>
         * <ul>
         * <li><p>1: yes</p>
         * </li>
         * <li><p>0: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AllContentQualityCheck")
        public Integer allContentQualityCheck;

        /**
         * <p>The ID of the rule used for the full-text quality check.</p>
         * 
         * <strong>example:</strong>
         * <p>223</p>
         */
        @NameInMap("AllRids")
        public String allRids;

        @NameInMap("AllRuleList")
        public GetSkillGroupConfigResponseBodyDataAllRuleList allRuleList;

        /**
         * <p>The time when the configuration was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T15:12Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1212</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>This is an internal parameter. You can ignore it.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The language model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1321</p>
         */
        @NameInMap("ModelId")
        public Long modelId;

        /**
         * <p>The language model name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ModelName")
        public String modelName;

        /**
         * <p>The configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The quality check type. Valid values:</p>
         * <ul>
         * <li><p>0: offline</p>
         * </li>
         * <li><p>1: real-time</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QualityCheckType")
        public Integer qualityCheckType;

        /**
         * <p>The quality check rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2332</p>
         */
        @NameInMap("Rid")
        public String rid;

        @NameInMap("RuleList")
        public GetSkillGroupConfigResponseBodyDataRuleList ruleList;

        /**
         * <p>The source of the skill group. The value is fixed at 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SkillGroupFrom")
        public Integer skillGroupFrom;

        /**
         * <p>The skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>The skill group name.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        /**
         * <p>The status of the configuration. Valid values: 0 (disabled) and 1 (enabled).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The configuration type. Valid values: 1 (custom configuration) and 0 (built-in configuration).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The time when the configuration was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-01T19:28Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The hotword ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("VocabId")
        public Long vocabId;

        /**
         * <p>The hotword name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("VocabName")
        public String vocabName;

        public static GetSkillGroupConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSkillGroupConfigResponseBodyData self = new GetSkillGroupConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSkillGroupConfigResponseBodyData setAllContentQualityCheck(Integer allContentQualityCheck) {
            this.allContentQualityCheck = allContentQualityCheck;
            return this;
        }
        public Integer getAllContentQualityCheck() {
            return this.allContentQualityCheck;
        }

        public GetSkillGroupConfigResponseBodyData setAllRids(String allRids) {
            this.allRids = allRids;
            return this;
        }
        public String getAllRids() {
            return this.allRids;
        }

        public GetSkillGroupConfigResponseBodyData setAllRuleList(GetSkillGroupConfigResponseBodyDataAllRuleList allRuleList) {
            this.allRuleList = allRuleList;
            return this;
        }
        public GetSkillGroupConfigResponseBodyDataAllRuleList getAllRuleList() {
            return this.allRuleList;
        }

        public GetSkillGroupConfigResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetSkillGroupConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSkillGroupConfigResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetSkillGroupConfigResponseBodyData setModelId(Long modelId) {
            this.modelId = modelId;
            return this;
        }
        public Long getModelId() {
            return this.modelId;
        }

        public GetSkillGroupConfigResponseBodyData setModelName(String modelName) {
            this.modelName = modelName;
            return this;
        }
        public String getModelName() {
            return this.modelName;
        }

        public GetSkillGroupConfigResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSkillGroupConfigResponseBodyData setQualityCheckType(Integer qualityCheckType) {
            this.qualityCheckType = qualityCheckType;
            return this;
        }
        public Integer getQualityCheckType() {
            return this.qualityCheckType;
        }

        public GetSkillGroupConfigResponseBodyData setRid(String rid) {
            this.rid = rid;
            return this;
        }
        public String getRid() {
            return this.rid;
        }

        public GetSkillGroupConfigResponseBodyData setRuleList(GetSkillGroupConfigResponseBodyDataRuleList ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public GetSkillGroupConfigResponseBodyDataRuleList getRuleList() {
            return this.ruleList;
        }

        public GetSkillGroupConfigResponseBodyData setSkillGroupFrom(Integer skillGroupFrom) {
            this.skillGroupFrom = skillGroupFrom;
            return this;
        }
        public Integer getSkillGroupFrom() {
            return this.skillGroupFrom;
        }

        public GetSkillGroupConfigResponseBodyData setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public GetSkillGroupConfigResponseBodyData setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public GetSkillGroupConfigResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetSkillGroupConfigResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetSkillGroupConfigResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetSkillGroupConfigResponseBodyData setVocabId(Long vocabId) {
            this.vocabId = vocabId;
            return this;
        }
        public Long getVocabId() {
            return this.vocabId;
        }

        public GetSkillGroupConfigResponseBodyData setVocabName(String vocabName) {
            this.vocabName = vocabName;
            return this;
        }
        public String getVocabName() {
            return this.vocabName;
        }

    }

}
