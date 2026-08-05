// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribeRunIdDeductionsResponseBody extends TeaModel {
    /**
     * <p>The deduction details.</p>
     */
    @NameInMap("Deductions")
    public java.util.List<DescribeRunIdDeductionsResponseBodyDeductions> deductions;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token. Leave this parameter empty for the first request. For subsequent requests, use the <code>nextToken</code> value from the previous response.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJvZmZzZXQiOjIwfQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>68BD3312-53D8-123E-BB32-1A9F25E07A03</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of core-hour package deduction details in the query result.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total usage duration. Unit: seconds. Do not use this field for AI scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("TotalUsedTime")
    public Long totalUsedTime;

    /**
     * <p>The total credits used that match the specified conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1.23</p>
     */
    @NameInMap("TotalUsedTimeDecimal")
    public String totalUsedTimeDecimal;

    public static DescribeRunIdDeductionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRunIdDeductionsResponseBody self = new DescribeRunIdDeductionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRunIdDeductionsResponseBody setDeductions(java.util.List<DescribeRunIdDeductionsResponseBodyDeductions> deductions) {
        this.deductions = deductions;
        return this;
    }
    public java.util.List<DescribeRunIdDeductionsResponseBodyDeductions> getDeductions() {
        return this.deductions;
    }

    public DescribeRunIdDeductionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeRunIdDeductionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRunIdDeductionsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeRunIdDeductionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRunIdDeductionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRunIdDeductionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeRunIdDeductionsResponseBody setTotalUsedTime(Long totalUsedTime) {
        this.totalUsedTime = totalUsedTime;
        return this;
    }
    public Long getTotalUsedTime() {
        return this.totalUsedTime;
    }

    public DescribeRunIdDeductionsResponseBody setTotalUsedTimeDecimal(String totalUsedTimeDecimal) {
        this.totalUsedTimeDecimal = totalUsedTimeDecimal;
        return this;
    }
    public String getTotalUsedTimeDecimal() {
        return this.totalUsedTimeDecimal;
    }

    public static class DescribeRunIdDeductionsResponseBodyDeductions extends TeaModel {
        /**
         * <p>The agent type. Valid values: <code>CREDIT_PACKAGE</code>, <code>JVS_CLAW</code>, <code>OPEN_CLAW</code>, and <code>JVS_COPILOT</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The end time of the period.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-31T03:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The group resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP_CREDIT_PACKAGE、GROUP_BUSINESS_CREDIT_PACKAGE</p>
         */
        @NameInMap("GroupResourceType")
        public String groupResourceType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>jvs-xxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The credit or plan package ID.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-xxx</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sunwyic.com</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>CreditPackage、BusinessCreditPackage</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The unique ID of the run.</p>
         * 
         * <strong>example:</strong>
         * <p>run-szwB1fYHCTocjGkFAIf6V8A</p>
         */
        @NameInMap("RunId")
        public String runId;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-12-16T02:10:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The summary of the large language model call.</p>
         * 
         * <strong>example:</strong>
         * <p>How is the weather today</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The usage duration. Unit: seconds. Do not use this field for AI scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>360000000</p>
         */
        @NameInMap("UsedTime")
        public Long usedTime;

        /**
         * <p>The credits used.</p>
         * 
         * <strong>example:</strong>
         * <p>1.23</p>
         */
        @NameInMap("UsedTimeDecimal")
        public String usedTimeDecimal;

        public static DescribeRunIdDeductionsResponseBodyDeductions build(java.util.Map<String, ?> map) throws Exception {
            DescribeRunIdDeductionsResponseBodyDeductions self = new DescribeRunIdDeductionsResponseBodyDeductions();
            return TeaModel.build(map, self);
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setGroupResourceType(String groupResourceType) {
            this.groupResourceType = groupResourceType;
            return this;
        }
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setUsedTime(Long usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Long getUsedTime() {
            return this.usedTime;
        }

        public DescribeRunIdDeductionsResponseBodyDeductions setUsedTimeDecimal(String usedTimeDecimal) {
            this.usedTimeDecimal = usedTimeDecimal;
            return this;
        }
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

    }

}
