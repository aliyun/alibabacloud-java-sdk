// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeCommonSandboxTemplatesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAc3HCuYhJi/wvpk4xOr0VLYz/NvD85HpgBeRBCusEIeVQ0dHZH9jr+NP3X9Jx0iSoql55b9nd4PIDm252/a0f+U=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329241C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Templates")
    public java.util.List<DescribeCommonSandboxTemplatesResponseBodyTemplates> templates;

    public static DescribeCommonSandboxTemplatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCommonSandboxTemplatesResponseBody self = new DescribeCommonSandboxTemplatesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCommonSandboxTemplatesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeCommonSandboxTemplatesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCommonSandboxTemplatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCommonSandboxTemplatesResponseBody setTemplates(java.util.List<DescribeCommonSandboxTemplatesResponseBodyTemplates> templates) {
        this.templates = templates;
        return this;
    }
    public java.util.List<DescribeCommonSandboxTemplatesResponseBodyTemplates> getTemplates() {
        return this.templates;
    }

    public static class DescribeCommonSandboxTemplatesResponseBodyTemplates extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultCpu")
        public String defaultCpu;

        /**
         * <strong>example:</strong>
         * <p>1Gi</p>
         */
        @NameInMap("DefaultMemory")
        public String defaultMemory;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DefaultReplicas")
        public Long defaultReplicas;

        /**
         * <strong>example:</strong>
         * <p>Execute user-provided Python code in the sandbox environment. Runs any Python script the user provides and returns the output.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>desktop</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeCommonSandboxTemplatesResponseBodyTemplates build(java.util.Map<String, ?> map) throws Exception {
            DescribeCommonSandboxTemplatesResponseBodyTemplates self = new DescribeCommonSandboxTemplatesResponseBodyTemplates();
            return TeaModel.build(map, self);
        }

        public DescribeCommonSandboxTemplatesResponseBodyTemplates setDefaultCpu(String defaultCpu) {
            this.defaultCpu = defaultCpu;
            return this;
        }
        public String getDefaultCpu() {
            return this.defaultCpu;
        }

        public DescribeCommonSandboxTemplatesResponseBodyTemplates setDefaultMemory(String defaultMemory) {
            this.defaultMemory = defaultMemory;
            return this;
        }
        public String getDefaultMemory() {
            return this.defaultMemory;
        }

        public DescribeCommonSandboxTemplatesResponseBodyTemplates setDefaultReplicas(Long defaultReplicas) {
            this.defaultReplicas = defaultReplicas;
            return this;
        }
        public Long getDefaultReplicas() {
            return this.defaultReplicas;
        }

        public DescribeCommonSandboxTemplatesResponseBodyTemplates setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeCommonSandboxTemplatesResponseBodyTemplates setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
