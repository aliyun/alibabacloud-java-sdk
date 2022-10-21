// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetQualityCheckSchemeResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetQualityCheckSchemeResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public java.util.List<String> messages;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetQualityCheckSchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetQualityCheckSchemeResponseBody self = new GetQualityCheckSchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetQualityCheckSchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetQualityCheckSchemeResponseBody setData(GetQualityCheckSchemeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetQualityCheckSchemeResponseBodyData getData() {
        return this.data;
    }

    public GetQualityCheckSchemeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetQualityCheckSchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetQualityCheckSchemeResponseBody setMessages(java.util.List<String> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<String> getMessages() {
        return this.messages;
    }

    public GetQualityCheckSchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetQualityCheckSchemeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList extends TeaModel {
        @NameInMap("CheckName")
        public String checkName;

        @NameInMap("CheckType")
        public Long checkType;

        @NameInMap("Enable")
        public Integer enable;

        @NameInMap("SchemeId")
        public Long schemeId;

        @NameInMap("Score")
        public Integer score;

        @NameInMap("SourceScore")
        public Integer sourceScore;

        public static GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList build(java.util.Map<String, ?> map) throws Exception {
            GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList self = new GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList();
            return TeaModel.build(map, self);
        }

        public GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setCheckName(String checkName) {
            this.checkName = checkName;
            return this;
        }
        public String getCheckName() {
            return this.checkName;
        }

        public GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setCheckType(Long checkType) {
            this.checkType = checkType;
            return this;
        }
        public Long getCheckType() {
            return this.checkType;
        }

        public GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

        public GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setScore(Integer score) {
            this.score = score;
            return this;
        }
        public Integer getScore() {
            return this.score;
        }

        public GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList setSourceScore(Integer sourceScore) {
            this.sourceScore = sourceScore;
            return this;
        }
        public Integer getSourceScore() {
            return this.sourceScore;
        }

    }

    public static class GetQualityCheckSchemeResponseBodyData extends TeaModel {
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

        @NameInMap("RuleIds")
        public java.util.List<String> ruleIds;

        @NameInMap("RuleList")
        public java.util.List<RulesInfo> ruleList;

        @NameInMap("SchemeCheckTypeList")
        public java.util.List<GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> schemeCheckTypeList;

        @NameInMap("SchemeId")
        public Long schemeId;

        @NameInMap("SchemeTemplateId")
        public Long schemeTemplateId;

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

        public static GetQualityCheckSchemeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetQualityCheckSchemeResponseBodyData self = new GetQualityCheckSchemeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetQualityCheckSchemeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetQualityCheckSchemeResponseBodyData setCreateUserName(String createUserName) {
            this.createUserName = createUserName;
            return this;
        }
        public String getCreateUserName() {
            return this.createUserName;
        }

        public GetQualityCheckSchemeResponseBodyData setDataType(Integer dataType) {
            this.dataType = dataType;
            return this;
        }
        public Integer getDataType() {
            return this.dataType;
        }

        public GetQualityCheckSchemeResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetQualityCheckSchemeResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetQualityCheckSchemeResponseBodyData setRuleIds(java.util.List<String> ruleIds) {
            this.ruleIds = ruleIds;
            return this;
        }
        public java.util.List<String> getRuleIds() {
            return this.ruleIds;
        }

        public GetQualityCheckSchemeResponseBodyData setRuleList(java.util.List<RulesInfo> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<RulesInfo> getRuleList() {
            return this.ruleList;
        }

        public GetQualityCheckSchemeResponseBodyData setSchemeCheckTypeList(java.util.List<GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> schemeCheckTypeList) {
            this.schemeCheckTypeList = schemeCheckTypeList;
            return this;
        }
        public java.util.List<GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> getSchemeCheckTypeList() {
            return this.schemeCheckTypeList;
        }

        public GetQualityCheckSchemeResponseBodyData setSchemeId(Long schemeId) {
            this.schemeId = schemeId;
            return this;
        }
        public Long getSchemeId() {
            return this.schemeId;
        }

        public GetQualityCheckSchemeResponseBodyData setSchemeTemplateId(Long schemeTemplateId) {
            this.schemeTemplateId = schemeTemplateId;
            return this;
        }
        public Long getSchemeTemplateId() {
            return this.schemeTemplateId;
        }

        public GetQualityCheckSchemeResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetQualityCheckSchemeResponseBodyData setTemplateType(Integer templateType) {
            this.templateType = templateType;
            return this;
        }
        public Integer getTemplateType() {
            return this.templateType;
        }

        public GetQualityCheckSchemeResponseBodyData setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public GetQualityCheckSchemeResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public GetQualityCheckSchemeResponseBodyData setUpdateUserName(String updateUserName) {
            this.updateUserName = updateUserName;
            return this;
        }
        public String getUpdateUserName() {
            return this.updateUserName;
        }

        public GetQualityCheckSchemeResponseBodyData setVersion(Long version) {
            this.version = version;
            return this;
        }
        public Long getVersion() {
            return this.version;
        }

    }

}
