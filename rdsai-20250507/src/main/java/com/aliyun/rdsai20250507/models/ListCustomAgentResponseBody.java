// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class ListCustomAgentResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListCustomAgentResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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

    public ListCustomAgentResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomAgentResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-11-27 16:01:28</p>
         */
        @NameInMap("CreatedAt")
        public String createdAt;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableTools")
        public Boolean enableTools;

        /**
         * <p>AgentId。</p>
         * 
         * <strong>example:</strong>
         * <p>d1b7d639-f34e-44c7-8231-987da14d****</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("SystemPrompt")
        public String systemPrompt;

        @NameInMap("Tools")
        public java.util.List<String> tools;

        /**
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

}
