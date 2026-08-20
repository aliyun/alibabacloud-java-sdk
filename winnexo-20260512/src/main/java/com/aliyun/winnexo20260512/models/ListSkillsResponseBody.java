// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListSkillsResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The list of skill cards.</p>
     */
    @NameInMap("items")
    public java.util.List<ListSkillsResponseBodyItems> items;

    /**
     * <p>The prompt message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("page")
    public Integer page;

    /**
     * <p>The number of entries per page. Default value: 20. Minimum value: 1. Maximum value: 50.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The description of the to-do card type.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The execution mode, such as CODE_AGENT or SYSTEM.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("executeMode")
        public String executeMode;

        /**
         * <p>Indicates whether the skill is globally accessible.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("globalAccess")
        public Boolean globalAccess;

        /**
         * <p>Indicates whether unpublished draft modifications exist.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("hasDraftChanges")
        public Boolean hasDraftChanges;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>SampleName.pdf</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The actual skill code for execution.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("skillCode")
        public String skillCode;

        /**
         * <p>The skill definition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("skillHubDefinitionId")
        public Long skillHubDefinitionId;

        /**
         * <p>The data source type. Fixed value: FILE.</p>
         * 
         * <strong>example:</strong>
         * <p>BUILTIN</p>
         */
        @NameInMap("sourceType")
        public String sourceType;

        /**
         * <p>The task status. Returns Running upon submission.</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The keys.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("tags")
        public java.util.List<String> tags;

        /**
         * <p>The update timestamp, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-10-01T12:00:00Z</p>
         */
        @NameInMap("updatedTime")
        public String updatedTime;

        /**
         * <p>The workflow definition version number.</p>
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
