// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetSkillResponseBody extends TeaModel {
    @NameInMap("arguments")
    public java.util.List<GetSkillResponseBodyArguments> arguments;

    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>创建时间，ISO8601 格式</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>技能描述（已 i18n 解析）</p>
     * 
     * <strong>example:</strong>
     * <p>示例描述</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>技能详细逻辑</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("detailLogic")
    public String detailLogic;

    /**
     * <p>展示名称</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>执行模式</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("executeMode")
    public String executeMode;

    /**
     * <p>是否全局可访问</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("globalAccess")
    public Boolean globalAccess;

    /**
     * <p>是否存在未发布的草稿修改</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasDraftChanges")
    public Boolean hasDraftChanges;

    /**
     * <p>入参配置原文</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("inputConfig")
    public String inputConfig;

    @NameInMap("inputConfigFormatted")
    public java.util.List<java.util.Map<String, ?>> inputConfigFormatted;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>文件名</p>
     * 
     * <strong>example:</strong>
     * <p>示例名称.pdf</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>技能编码（全局唯一）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillCode")
    public String skillCode;

    @NameInMap("skillFiles")
    public java.util.List<java.util.Map<String, ?>> skillFiles;

    /**
     * <p>技能定义 ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("skillHubDefinitionId")
    public Long skillHubDefinitionId;

    /**
     * <p>SKILL.md 简介（由 LLM 生成）</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("skillMdSummary")
    public String skillMdSummary;

    /**
     * <p>来源类型: BUILTIN / CUSTOM</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("sourceType")
    public String sourceType;

    /**
     * <p>技能状态: ACTIVE / DRAFT</p>
     * 
     * <strong>example:</strong>
     * <p>READY</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>tags</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("tags")
    public java.util.List<String> tags;

    /**
     * <p>修改时间，ISO8601 格式</p>
     * 
     * <strong>example:</strong>
     * <p>2023-10-01T12:00:00Z</p>
     */
    @NameInMap("updatedTime")
    public String updatedTime;

    /**
     * <p>版本总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("versionCount")
    public Long versionCount;

    /**
     * <p>版本号</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("versionNumber")
    public String versionNumber;

    public static GetSkillResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSkillResponseBody self = new GetSkillResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSkillResponseBody setArguments(java.util.List<GetSkillResponseBodyArguments> arguments) {
        this.arguments = arguments;
        return this;
    }
    public java.util.List<GetSkillResponseBodyArguments> getArguments() {
        return this.arguments;
    }

    public GetSkillResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSkillResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetSkillResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetSkillResponseBody setDetailLogic(String detailLogic) {
        this.detailLogic = detailLogic;
        return this;
    }
    public String getDetailLogic() {
        return this.detailLogic;
    }

    public GetSkillResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public GetSkillResponseBody setExecuteMode(String executeMode) {
        this.executeMode = executeMode;
        return this;
    }
    public String getExecuteMode() {
        return this.executeMode;
    }

    public GetSkillResponseBody setGlobalAccess(Boolean globalAccess) {
        this.globalAccess = globalAccess;
        return this;
    }
    public Boolean getGlobalAccess() {
        return this.globalAccess;
    }

    public GetSkillResponseBody setHasDraftChanges(Boolean hasDraftChanges) {
        this.hasDraftChanges = hasDraftChanges;
        return this;
    }
    public Boolean getHasDraftChanges() {
        return this.hasDraftChanges;
    }

    public GetSkillResponseBody setInputConfig(String inputConfig) {
        this.inputConfig = inputConfig;
        return this;
    }
    public String getInputConfig() {
        return this.inputConfig;
    }

    public GetSkillResponseBody setInputConfigFormatted(java.util.List<java.util.Map<String, ?>> inputConfigFormatted) {
        this.inputConfigFormatted = inputConfigFormatted;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getInputConfigFormatted() {
        return this.inputConfigFormatted;
    }

    public GetSkillResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSkillResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetSkillResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSkillResponseBody setSkillCode(String skillCode) {
        this.skillCode = skillCode;
        return this;
    }
    public String getSkillCode() {
        return this.skillCode;
    }

    public GetSkillResponseBody setSkillFiles(java.util.List<java.util.Map<String, ?>> skillFiles) {
        this.skillFiles = skillFiles;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getSkillFiles() {
        return this.skillFiles;
    }

    public GetSkillResponseBody setSkillHubDefinitionId(Long skillHubDefinitionId) {
        this.skillHubDefinitionId = skillHubDefinitionId;
        return this;
    }
    public Long getSkillHubDefinitionId() {
        return this.skillHubDefinitionId;
    }

    public GetSkillResponseBody setSkillMdSummary(String skillMdSummary) {
        this.skillMdSummary = skillMdSummary;
        return this;
    }
    public String getSkillMdSummary() {
        return this.skillMdSummary;
    }

    public GetSkillResponseBody setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public GetSkillResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetSkillResponseBody setTags(java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<String> getTags() {
        return this.tags;
    }

    public GetSkillResponseBody setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }
    public String getUpdatedTime() {
        return this.updatedTime;
    }

    public GetSkillResponseBody setVersionCount(Long versionCount) {
        this.versionCount = versionCount;
        return this;
    }
    public Long getVersionCount() {
        return this.versionCount;
    }

    public GetSkillResponseBody setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
        return this;
    }
    public String getVersionNumber() {
        return this.versionNumber;
    }

    public static class GetSkillResponseBodyArguments extends TeaModel {
        /**
         * <p>默认值</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("default")
        public String _default;

        /**
         * <p>参数说明</p>
         * 
         * <strong>example:</strong>
         * <p>示例描述</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>enum</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("enum")
        public java.util.List<String> _enum;

        /**
         * <p>文件名</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>是否必填</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("required")
        public Boolean required;

        /**
         * <p>参数类型: string / number / boolean / array</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("type")
        public String type;

        public static GetSkillResponseBodyArguments build(java.util.Map<String, ?> map) throws Exception {
            GetSkillResponseBodyArguments self = new GetSkillResponseBodyArguments();
            return TeaModel.build(map, self);
        }

        public GetSkillResponseBodyArguments set_default(String _default) {
            this._default = _default;
            return this;
        }
        public String get_default() {
            return this._default;
        }

        public GetSkillResponseBodyArguments setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetSkillResponseBodyArguments set_enum(java.util.List<String> _enum) {
            this._enum = _enum;
            return this;
        }
        public java.util.List<String> get_enum() {
            return this._enum;
        }

        public GetSkillResponseBodyArguments setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetSkillResponseBodyArguments setRequired(Boolean required) {
            this.required = required;
            return this;
        }
        public Boolean getRequired() {
            return this.required;
        }

        public GetSkillResponseBodyArguments setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
