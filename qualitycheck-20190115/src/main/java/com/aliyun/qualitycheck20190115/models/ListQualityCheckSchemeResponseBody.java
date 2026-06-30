// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListQualityCheckSchemeResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of <strong>200</strong> indicates success. Other values indicate a failure. Use this code to identify the cause of the failure.</p>
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
     * <p>The returned message. If the request is successful, \<code>successful\\</code> is returned. If the request fails, an error message is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
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
     * <p>An internal parameter. You can ignore this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>XXX</p>
     */
    @NameInMap("ResultCountId")
    public String resultCountId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates success. A value of <strong>false</strong> or <strong>null</strong> indicates failure.</p>
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
         * <p>The quality check dimension to which the item belongs.</p>
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
         * <p>测试规则</p>
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
         * <p>Indicates whether to calculate a score. Valid values: 1 (no score) and 3 (score).</p>
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
         * <p>The scoring type. Valid values: 0 (Points are added or deducted each time the rule is triggered) and 1 (A one-time score is given when the rule is triggered).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        /**
         * <p>The scoring method. Valid values: 1 (add points) and 3 (deduct points).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ScoreType")
        public Integer scoreType;

        /**
         * <p>The application scenario of the check item. Valid values: 10 (common check item) and 11 (SOP flow check item).</p>
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
         * <p>The rule information. This parameter is reserved for future use. Currently, only one rule is returned.</p>
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
         * <p>服务规范性检测</p>
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
         * <p>The enabled status. Valid values: 0 (disabled) and 1 (enabled).</p>
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
         * <p>An internal parameter. You can ignore this parameter.</p>
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
         * <p>The time when the scheme was created.</p>
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
         * <p>张三</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The data type of the quality check scheme. Valid values: 0 (text) and 1 (audio).</p>
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
         * <p>售前使用</p>
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
         * <p>The status of the quality check scheme. Valid values: 0 (deleted), 1 (published), 2 (unpublished), and 3 (updated but not published).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the quality check scheme template. Valid values: 1 (built-in) and 2 (user-defined).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateType")
        public Integer templateType;

        /**
         * <p>The type of the quality check scheme. Valid values: 0 (built-in) and 1 (user-defined).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The time when the scheme was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T10:34Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The name of the user who last updated the scheme.</p>
         * 
         * <strong>example:</strong>
         * <p>李四</p>
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
