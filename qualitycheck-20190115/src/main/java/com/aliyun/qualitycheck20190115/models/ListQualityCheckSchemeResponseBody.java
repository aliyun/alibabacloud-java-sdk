// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListQualityCheckSchemeResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of <strong>200</strong> indicates success. Other values indicate failure. You can use this field to determine the cause of the failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The data of the quality check scheme list.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListQualityCheckSchemeResponseBodyData> data;

    /**
     * <p>The error message returned when an error occurs. The value is successful when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>82C91484-B2D5-4D2A-A21F-A6D73F4***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An internal field. Ignore this field.</p>
     * 
     * <strong>example:</strong>
     * <p>Deprecated field</p>
     */
    @NameInMap("ResultCountId")
    public String resultCountId;

    /**
     * <p>Indicates whether the request is successful. <strong>true</strong> indicates that the request is successful. <strong>false</strong> or <strong>null</strong> indicates that the request fails.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListQualityCheckSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListQualityCheckSchemeResponseBody self = new ListQualityCheckSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public ListQualityCheckSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListQualityCheckSchemeResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public ListQualityCheckSchemeResponseBody setData(java.util.List<ListQualityCheckSchemeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListQualityCheckSchemeResponseBodyData> getData() {
        return this.data;
    }

    public ListQualityCheckSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListQualityCheckSchemeResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListQualityCheckSchemeResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQualityCheckSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListQualityCheckSchemeResponseBody setResultCountId(String resultCountId) {
        this.resultCountId = resultCountId;
        return this;
    }
    public String getResultCountId() {
        return this.resultCountId;
    }

    public ListQualityCheckSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListQualityCheckSchemeResponseBodyDataRuleListRules extends TeaModel {
        /**
         * <p>The quality check dimension to which the rule belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>Test rule</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("Rid")
        public Long rid;

        /**
         * <p>Specifies whether the score is calculated. Valid values: 1: not calculated; 3: calculated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        /**
         * <p>The score.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ScoreNum")
        public Integer scoreNum;

        /**
         * <p>The scoring type. Valid values: 0: add or deduct points after the rule is triggered; 1: award a one-time score after the rule is triggered.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>The score adjustment type. Valid values: 1: add points; 3: deduct points.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        /**
         * <p>The common scenarios of the check item. Valid values: 10: common check item. 11: SOP flow check item.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TargetType")
        public Integer targetType;

        public static ListQualityCheckSchemeResponseBodyDataRuleListRules build(java.util.Map<String, ?> map) throws Exception {
            ListQualityCheckSchemeResponseBodyDataRuleListRules self = new ListQualityCheckSchemeResponseBodyDataRuleListRules();
            return TeaModel.build(map, self);
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setRid(Long rid) {
            this.rid = rid;
            return this;
        }
        public Long getRid() {
            return this.rid;
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setRuleScoreType(Integer ruleScoreType) {
            this.ruleScoreType = ruleScoreType;
            return this;
        }
        public Integer getRuleScoreType() {
            return this.ruleScoreType;
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setScoreNum(Integer scoreNum) {
            this.scoreNum = scoreNum;
            return this;
        }
        public Integer getScoreNum() {
            return this.scoreNum;
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setScoreNumType(Integer scoreNumType) {
            this.scoreNumType = scoreNumType;
            return this;
        }
        public Integer getScoreNumType() {
            return this.scoreNumType;
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setScoreType(Integer scoreType) {
            this.scoreType = scoreType;
            return this;
        }
        public Integer getScoreType() {
            return this.scoreType;
        }

        public ListQualityCheckSchemeResponseBodyDataRuleListRules setTargetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }
        public Integer getTargetType() {
            return this.targetType;
        }

    }

    public static class ListQualityCheckSchemeResponseBodyDataRuleList extends TeaModel {
        /**
         * <p>The rule information. Only one rule is included here and reserved for future extensions.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListQualityCheckSchemeResponseBodyDataRuleListRules> rules;

        public static ListQualityCheckSchemeResponseBodyDataRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityCheckSchemeResponseBodyDataRuleList self = new ListQualityCheckSchemeResponseBodyDataRuleList();
            return TeaModel.build(map, self);
        }

        public ListQualityCheckSchemeResponseBodyDataRuleList setRules(java.util.List<ListQualityCheckSchemeResponseBodyDataRuleListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListQualityCheckSchemeResponseBodyDataRuleListRules> getRules() {
            return this.rules;
        }

    }

    public static class ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList extends TeaModel {
        /**
         * <p>The name of the quality check dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>Service compliance check</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The type of the quality check dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CheckType")
        public Integer checkType;

        /**
         * <p>The enable status. Valid values: 0: disabled; 1: enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The score of the quality check dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>An internal field. Ignore this field.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TargetType")
        public Integer targetType;

        public static ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList build(java.util.Map<String, ?> map) throws Exception {
            ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList self = new ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList();
            return TeaModel.build(map, self);
        }

        public ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setTargetType(Integer targetType) {
            this.targetType = targetType;
            return this;
        }
        public Integer getTargetType() {
            return this.targetType;
        }

    }

    public static class ListQualityCheckSchemeResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T09:34Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The name of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The data type of the quality check scheme. Valid values: 0: text; 1: audio.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DataType")
        public Integer dataType;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>Pre-sales use</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The name of the quality check scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of check items.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<ListQualityCheckSchemeResponseBodyDataRuleList> ruleList;

        /**
         * <p>The list of quality check dimensions.</p>
         */
        @NameInMap("SchemeCheckTypeList")
        public java.util.List<ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> schemeCheckTypeList;

        /**
         * <p>The ID of the quality check scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>112**</p>
         */
        @NameInMap("SchemeId")
        public Long schemeId;

        /**
         * <p>The status of the quality check scheme. Valid values: 0: deleted; 1: published; 2: unpublished; 3: updated and unpublished.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the quality check scheme template. Valid values: 1: built-in; 2: custom.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateType")
        public Integer templateType;

        /**
         * <p>The type of the quality check scheme. Valid values: 0: built-in; 1: custom.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T10:34Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The name of the updater.</p>
         * 
         * <strong>example:</strong>
         * <p>Li Si</p>
         */
        @NameInMap("UpdateUserName")
        public String updateUserName;

        /**
         * <p>The version of the quality check scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Version")
        public Long version;

        public static ListQualityCheckSchemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListQualityCheckSchemeResponseBodyData self = new ListQualityCheckSchemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListQualityCheckSchemeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListQualityCheckSchemeResponseBodyData setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public ListQualityCheckSchemeResponseBodyData setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public ListQualityCheckSchemeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListQualityCheckSchemeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListQualityCheckSchemeResponseBodyData setRuleList(java.util.List<ListQualityCheckSchemeResponseBodyDataRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<ListQualityCheckSchemeResponseBodyDataRuleList> getRuleList() {
            return this.ruleList;
        }

        public ListQualityCheckSchemeResponseBodyData setSchemeCheckTypeList(java.util.List<ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> schemeCheckTypeList) {
            this.schemeCheckTypeList = schemeCheckTypeList;
            return this;
        }
        public java.util.List<ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> getSchemeCheckTypeList() {
            return this.schemeCheckTypeList;
        }

        public ListQualityCheckSchemeResponseBodyData setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

        public ListQualityCheckSchemeResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListQualityCheckSchemeResponseBodyData setTemplateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }
        public Integer getTemplateType() {
            return this.templateType;
        }

        public ListQualityCheckSchemeResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public ListQualityCheckSchemeResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListQualityCheckSchemeResponseBodyData setUpdateUserName(String updateUserName) {
            this.updateUserName = updateUserName;
            return this;
        }
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        public ListQualityCheckSchemeResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
