// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeSandboxTemplatesResponseBody extends TeaModel {
    /**
     * <p>A reserved parameter. You do not need to specify this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that indicates the position from which the current read operation starts. An empty value indicates that the read operation starts from the beginning.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLYz/NvD85HpgBeRBCusEIeVQ0dHZH9jr+NP3X9Jx0iSoql55b9nd4PIDm252/a0f+U=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of records per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of sandbox templates.</p>
     */
    @NameInMap("SandboxTemplates")
    public java.util.List<DescribeSandboxTemplatesResponseBodySandboxTemplates> sandboxTemplates;

    /**
     * <p>The total number of records that match the request conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeSandboxTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSandboxTemplatesResponseBody self = new DescribeSandboxTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSandboxTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeSandboxTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeSandboxTemplatesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSandboxTemplatesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeSandboxTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSandboxTemplatesResponseBody setSandboxTemplates(java.util.List<DescribeSandboxTemplatesResponseBodySandboxTemplates> sandboxTemplates) {
        this.sandboxTemplates = sandboxTemplates;
        return this;
    }
    public java.util.List<DescribeSandboxTemplatesResponseBodySandboxTemplates> getSandboxTemplates() {
        return this.sandboxTemplates;
    }

    public DescribeSandboxTemplatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSandboxTemplatesResponseBodySandboxTemplates extends TeaModel {
        @NameInMap("CreatedBy")
        public String createdBy;

        /**
         * <p>The number of CPUs for the sandbox created with this template.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DefaultCpu")
        public String defaultCpu;

        /**
         * <p>The memory size of the sandbox created with this template.</p>
         * 
         * <strong>example:</strong>
         * <p>4Gi</p>
         */
        @NameInMap("DefaultMemory")
        public String defaultMemory;

        /**
         * <p>The sandbox template description.</p>
         * 
         * <strong>example:</strong>
         * <p>code-interpreter-vpc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Indicates whether the sandbox created with this template can access resources in the VPC where Supabase resides.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableVpcAccess")
        public String enableVpcAccess;

        @NameInMap("Image")
        public String image;

        /**
         * <p>The sandbox template name.</p>
         * 
         * <strong>example:</strong>
         * <p>code-interpreter</p>
         */
        @NameInMap("Name")
        public String name;

        @NameInMap("Replicas")
        public Long replicas;

        @NameInMap("Tags")
        public java.util.Map<String, String> tags;

        /**
         * <p>The sandbox template ID. Specify this ID when creating a sandbox with this template.</p>
         * 
         * <strong>example:</strong>
         * <p>code-interpreter-asdxxxx</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeSandboxTemplatesResponseBodySandboxTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeSandboxTemplatesResponseBodySandboxTemplates self = new DescribeSandboxTemplatesResponseBodySandboxTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setCreatedBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }
        public String getCreatedBy() {
            return this.createdBy;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setDefaultCpu(String defaultCpu) {
            this.defaultCpu = defaultCpu;
            return this;
        }
        public String getDefaultCpu() {
            return this.defaultCpu;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setDefaultMemory(String defaultMemory) {
            this.defaultMemory = defaultMemory;
            return this;
        }
        public String getDefaultMemory() {
            return this.defaultMemory;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setEnableVpcAccess(String enableVpcAccess) {
            this.enableVpcAccess = enableVpcAccess;
            return this;
        }
        public String getEnableVpcAccess() {
            return this.enableVpcAccess;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setImage(String image) {
            this.image = image;
            return this;
        }
        public String getImage() {
            return this.image;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setReplicas(Long replicas) {
            this.replicas = replicas;
            return this;
        }
        public Long getReplicas() {
            return this.replicas;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setTags(java.util.Map<String, String> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.Map<String, String> getTags() {
            return this.tags;
        }

        public DescribeSandboxTemplatesResponseBodySandboxTemplates setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
