// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetQualityCheckSchemeResponseBody extends TeaModel {
    /**
     * <p>The result code. A value of 200 indicates success. Other values indicate failure. Use this code to determine the cause of a failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The QualityCheckScheme object. This is the JSON object of the quality check plan. For more information, see <a href="https://help.aliyun.com/document_detail/453292.html"><code>Description of quality check task objects</code></a>.</p>
     */
    @NameInMap("Data")
    public GetQualityCheckSchemeResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>If an error occurs, this field provides details about the error. If the request is successful, the value is <strong>successful</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The list of returned messages.</p>
     */
    @NameInMap("Messages")
    public java.util.List<String> messages;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>96138D8D-8D26-4E41-BFF4-77AED1088BBD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. A value of true indicates success. A value of false or null indicates failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The name of the quality check dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>服务规范性检测</p>
         */
        @NameInMap("CheckName")
        public String checkName;

        /**
         * <p>The ID of the quality check dimension type.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CheckType")
        public Long checkType;

        /**
         * <p>The status. Valid values: 0 (disabled) and 1 (enabled).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The quality check plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("SchemeId")
        public Long schemeId;

        /**
         * <p>The score of the quality check dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Score")
        public Integer score;

        /**
         * <p>The original score.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
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
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1616113198000</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The username of the creator.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("CreateUserName")
        public String createUserName;

        /**
         * <p>The data type of the quality check plan. Valid values: 0 (text) and 1 (audio).</p>
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
         * <p>The total score of the quality check plan.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("InitScore")
        public String initScore;

        /**
         * <p>The name of the quality check plan.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The list of associated rule IDs.</p>
         */
        @NameInMap("RuleIds")
        public java.util.List<String> ruleIds;

        /**
         * <p>The list of rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<RulesInfo> ruleList;

        /**
         * <p>The list of quality check dimensions.</p>
         */
        @NameInMap("SchemeCheckTypeList")
        public java.util.List<GetQualityCheckSchemeResponseBodyDataSchemeCheckTypeList> schemeCheckTypeList;

        /**
         * <p>The quality check plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>112**</p>
         */
        @NameInMap("SchemeId")
        public Long schemeId;

        /**
         * <p>The quality check plan template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SchemeTemplateId")
        public Long schemeTemplateId;

        /**
         * <p>The status. Valid values: 0 (deleted), 1 (published), 2 (unpublished), and 3 (updated but not published). Default value: 2.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The type of the quality check plan template. Valid values: 1 (system-built) and 2 (custom).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TemplateType")
        public Integer templateType;

        /**
         * <p>The type of the quality check plan. Valid values: 0 (system-built) and 1 (custom).</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        /**
         * <p>The time when the plan was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1616113198000</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The username of the user who last updated the plan.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("UpdateUserName")
        public String updateUserName;

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1616113198000</p>
         */
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

        public GetQualityCheckSchemeResponseBodyData setInitScore(String initScore) {
            this.initScore = initScore;
            return this;
        }
        public String getInitScore() {
            return this.initScore;
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
