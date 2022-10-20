// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListQualityCheckSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("Data")
    public java.util.List<ListQualityCheckSchemeResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCountId")
    public String resultCountId;

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
        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Rid")
        public Long rid;

        @NameInMap("RuleScoreType")
        public Integer ruleScoreType;

        @NameInMap("ScoreNum")
        public Integer scoreNum;

        @NameInMap("ScoreNumType")
        public Integer scoreNumType;

        @NameInMap("ScoreType")
        public Integer scoreType;

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
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckType")
        public Integer checkType;

        @NameInMap("Enable")
        public Integer enable;

        @NameInMap("Score")
        public Integer score;

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
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateUserName")
        public String createUserName;

        @NameInMap("DataType")
        public Integer dataType;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        @NameInMap("RuleList")
        public java.util.List<ListQualityCheckSchemeResponseBodyDataRuleList> ruleList;

        @NameInMap("SchemeCheckTypeList")
        public java.util.List<ListQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> schemeCheckTypeList;

        @NameInMap("SchemeId")
        public Long schemeId;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("TemplateType")
        public Integer templateType;

        @NameInMap("Type")
        public Integer type;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("UpdateUserName")
        public String updateUserName;

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
