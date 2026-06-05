// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class DescribeComfyWorkflowsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Workflows")
    public java.util.List<DescribeComfyWorkflowsResponseBodyWorkflows> workflows;

    public static DescribeComfyWorkflowsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeComfyWorkflowsResponseBody self = new DescribeComfyWorkflowsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeComfyWorkflowsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeComfyWorkflowsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeComfyWorkflowsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeComfyWorkflowsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeComfyWorkflowsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeComfyWorkflowsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeComfyWorkflowsResponseBody setWorkflows(java.util.List<DescribeComfyWorkflowsResponseBodyWorkflows> workflows) {
        this.workflows = workflows;
        return this;
    }
    public java.util.List<DescribeComfyWorkflowsResponseBodyWorkflows> getWorkflows() {
        return this.workflows;
    }

    public static class DescribeComfyWorkflowsResponseBodyWorkflows extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2026-02-03T07:31:45+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>1778897586</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        /**
         * <strong>example:</strong>
         * <p>wf_adb32aed-ccdc-42ae-b4d4-a21181ac8a5f</p>
         */
        @NameInMap("WorkflowId")
        public String workflowId;

        public static DescribeComfyWorkflowsResponseBodyWorkflows build(java.util.Map<String, ?> map) throws Exception {
            DescribeComfyWorkflowsResponseBodyWorkflows self = new DescribeComfyWorkflowsResponseBodyWorkflows();
            return TeaModel.build(map, self);
        }

        public DescribeComfyWorkflowsResponseBodyWorkflows setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeComfyWorkflowsResponseBodyWorkflows setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeComfyWorkflowsResponseBodyWorkflows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeComfyWorkflowsResponseBodyWorkflows setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

        public DescribeComfyWorkflowsResponseBodyWorkflows setWorkflowId(String workflowId) {
            this.workflowId = workflowId;
            return this;
        }
        public String getWorkflowId() {
            return this.workflowId;
        }

    }

}
