// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>技能列表</p>
     */
    @NameInMap("items")
    public java.util.List<ListSkillsResponseBodyItems> items;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>当前页码</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>每页数量</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>符合条件的技能总数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListSkillsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillsResponseBody self = new ListSkillsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillsResponseBody setItems(java.util.List<ListSkillsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ListSkillsResponseBodyItems> getItems() {
        return this.items;
    }

    public ListSkillsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillsResponseBody setPage(Integer page) {
        this.page = page;
        return this;
    }
    public Integer getPage() {
        return this.page;
    }

    public ListSkillsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListSkillsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public static class ListSkillsResponseBodyItems extends TeaModel {
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
         * <p>执行模式：CODE_AGENT / SYSTEM 等</p>
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
         * <p>技能名称（已 i18n 解析）</p>
         * 
         * <strong>example:</strong>
         * <p>示例名称.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>技能编码（全局唯一）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>技能定义 ID</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("skillHubDefinitionId")
        public Long skillHubDefinitionId;

        /**
         * <p>来源类型：BUILTIN / CUSTOM</p>
         * 
         * <strong>example:</strong>
         * <p>BUILTIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>技能状态：ACTIVE / DRAFT</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>标签列表（已 i18n 解析）</p>
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
         * <p>版本号</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("versionNumber")
        public String versionNumber;

        public static ListSkillsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ListSkillsResponseBodyItems self = new ListSkillsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ListSkillsResponseBodyItems setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListSkillsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListSkillsResponseBodyItems setExecuteMode(String executeMode) {
            this.executeMode = executeMode;
            return this;
        }
        public String getExecuteMode() {
            return this.executeMode;
        }

        public ListSkillsResponseBodyItems setGlobalAccess(Boolean globalAccess) {
            this.globalAccess = globalAccess;
            return this;
        }
        public Boolean getGlobalAccess() {
            return this.globalAccess;
        }

        public ListSkillsResponseBodyItems setHasDraftChanges(Boolean hasDraftChanges) {
            this.hasDraftChanges = hasDraftChanges;
            return this;
        }
        public Boolean getHasDraftChanges() {
            return this.hasDraftChanges;
        }

        public ListSkillsResponseBodyItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListSkillsResponseBodyItems setSkillCode(String skillCode) {
            this.skillCode = skillCode;
            return this;
        }
        public String getSkillCode() {
            return this.skillCode;
        }

        public ListSkillsResponseBodyItems setSkillHubDefinitionId(Long skillHubDefinitionId) {
            this.skillHubDefinitionId = skillHubDefinitionId;
            return this;
        }
        public Long getSkillHubDefinitionId() {
            return this.skillHubDefinitionId;
        }

        public ListSkillsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public ListSkillsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListSkillsResponseBodyItems setTags(java.util.List<String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<String> getTags() {
            return this.tags;
        }

        public ListSkillsResponseBodyItems setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public ListSkillsResponseBodyItems setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

    }

}
