// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListCustomAgentResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListCustomAgentResponseBodyData> data;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Skills")
    public java.util.List<ListCustomAgentResponseBodySkills> skills;

    /**
     * <p>The total number of entries returned. By default, this parameter is not returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListCustomAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomAgentResponseBody self = new ListCustomAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomAgentResponseBody setData(java.util.List<ListCustomAgentResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCustomAgentResponseBodyData> getData() {
        return this.data;
    }

    public ListCustomAgentResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomAgentResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCustomAgentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomAgentResponseBody setSkills(java.util.List<ListCustomAgentResponseBodySkills> skills) {
        this.skills = skills;
        return this;
    }
    public java.util.List<ListCustomAgentResponseBodySkills> getSkills() {
        return this.skills;
    }

    public ListCustomAgentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomAgentResponseBodyData extends TeaModel {
        /**
         * <p>The creation time of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-27 16:01:28</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <p>Indicates whether tools are enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTools")
        public Boolean enableTools;

        /**
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the dedicated agent.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The system prompts.</p>
         */
        @NameInMap("SystemPrompt")
        public String systemPrompt;

        /**
         * <p>The information about the tool.</p>
         */
        @NameInMap("Tools")
        public java.util.List<String> tools;

        /**
         * <p>The modification time of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-27 16:02:28</p>
         */
        @NameInMap("UpdatedAt")
        public String updatedAt;

        public static ListCustomAgentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodyData self = new ListCustomAgentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public ListCustomAgentResponseBodyData setEnableTools(Boolean enableTools) {
            this.enableTools = enableTools;
            return this;
        }
        public Boolean getEnableTools() {
            return this.enableTools;
        }

        public ListCustomAgentResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCustomAgentResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentResponseBodyData setSystemPrompt(String systemPrompt) {
            this.systemPrompt = systemPrompt;
            return this;
        }
        public String getSystemPrompt() {
            return this.systemPrompt;
        }

        public ListCustomAgentResponseBodyData setTools(java.util.List<String> tools) {
            this.tools = tools;
            return this;
        }
        public java.util.List<String> getTools() {
            return this.tools;
        }

        public ListCustomAgentResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

    public static class ListCustomAgentResponseBodySkills extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SkillType")
        public String skillType;

        public static ListCustomAgentResponseBodySkills build(java.util.Map<String, ?> map) throws Exception {
            ListCustomAgentResponseBodySkills self = new ListCustomAgentResponseBodySkills();
            return TeaModel.build(map, self);
        }

        public ListCustomAgentResponseBodySkills setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomAgentResponseBodySkills setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListCustomAgentResponseBodySkills setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomAgentResponseBodySkills setSkillType(String skillType) {
            this.skillType = skillType;
            return this;
        }
        public String getSkillType() {
            return this.skillType;
        }

    }

}
