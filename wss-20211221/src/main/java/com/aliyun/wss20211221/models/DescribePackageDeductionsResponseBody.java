// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wss20211221.models;

import com.aliyun.tea.*;

public class DescribePackageDeductionsResponseBody extends TeaModel {
    /**
     * <p>The list of deduction details.</p>
     */
    @NameInMap("Deductions")
    public java.util.List<DescribePackageDeductionsResponseBodyDeductions> deductions;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page in the Settings for paging during a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>833C4D2C-09C7-5CE6-8159-06758B964970</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of core-hour package deduction details queried.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The total deducted core-hours.</p>
     * 
     * <strong>example:</strong>
     * <p>10.1</p>
     */
    @NameInMap("TotalUsedCoreTime")
    public Float totalUsedCoreTime;

    /**
     * <p>The total usage duration.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("TotalUsedTime")
    public Long totalUsedTime;

    /**
     * <p>The total usage calculated by using a precision factor, rounded to four decimal places. This field uses the same metering criteria as UsedTimeDecimal in the details.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0000</p>
     */
    @NameInMap("TotalUsedTimeDecimal")
    public String totalUsedTimeDecimal;

    public static DescribePackageDeductionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePackageDeductionsResponseBody self = new DescribePackageDeductionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePackageDeductionsResponseBody setDeductions(java.util.List<DescribePackageDeductionsResponseBodyDeductions> deductions) {
        this.deductions = deductions;
        return this;
    }
    public java.util.List<DescribePackageDeductionsResponseBodyDeductions> getDeductions() {
        return this.deductions;
    }

    public DescribePackageDeductionsResponseBody setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribePackageDeductionsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePackageDeductionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePackageDeductionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribePackageDeductionsResponseBody setTotalUsedCoreTime(Float totalUsedCoreTime) {
        this.totalUsedCoreTime = totalUsedCoreTime;
        return this;
    }
    public Float getTotalUsedCoreTime() {
        return this.totalUsedCoreTime;
    }

    public DescribePackageDeductionsResponseBody setTotalUsedTime(Long totalUsedTime) {
        this.totalUsedTime = totalUsedTime;
        return this;
    }
    public Long getTotalUsedTime() {
        return this.totalUsedTime;
    }

    public DescribePackageDeductionsResponseBody setTotalUsedTimeDecimal(String totalUsedTimeDecimal) {
        this.totalUsedTimeDecimal = totalUsedTimeDecimal;
        return this;
    }
    public String getTotalUsedTimeDecimal() {
        return this.totalUsedTimeDecimal;
    }

    public static class DescribePackageDeductionsResponseBodyDeductions extends TeaModel {
        /**
         * <p>The agent type.</p>
         * 
         * <strong>example:</strong>
         * <p>OpenClaw</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The number of vCPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>r-xxxx</p>
         */
        @NameInMap("DeductionRequestId")
        public String deductionRequestId;

        /**
         * <p>The deduction types.</p>
         * 
         * <strong>example:</strong>
         * <p>KNOWLEDGE_SPACE/CONVESATION</p>
         */
        @NameInMap("DeductionType")
        public String deductionType;

        /**
         * <p>The Cloud Desktop ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-6wye9optu0kag****</p>
         */
        @NameInMap("DesktopId")
        public String desktopId;

        /**
         * <p>The name of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>DemoComputer</p>
         */
        @NameInMap("DesktopName")
        public String desktopName;

        /**
         * <p>The specifications of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>eds.enterprise_office.4c8g</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The end time of the deduction record in UTC. The format is yyyy-MM-ddTHH:mm:ssZ. For records aggregated by hour, the format can be yyyy-MM-ddTHH:mmZ with seconds omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-31T03:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The group resource type to which the deduction record belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>GROUP_CORE_PACKAGE</p>
         */
        @NameInMap("GroupResourceType")
        public String groupResourceType;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A specific instance ID</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The status of the core-hour package.</p>
         * 
         * <strong>example:</strong>
         * <p>Deleted</p>
         */
        @NameInMap("InstanceState")
        public String instanceState;

        /**
         * <p>The instance specifications for the deduction.</p>
         * 
         * <strong>example:</strong>
         * <p>ec.agentbay-pc</p>
         */
        @NameInMap("InstanceType")
        public String instanceType;

        /**
         * <p>The memory. Unit: MB.</p>
         * 
         * <strong>example:</strong>
         * <p>8192</p>
         */
        @NameInMap("Memory")
        public Long memory;

        /**
         * <p>The model.</p>
         * 
         * <strong>example:</strong>
         * <p>qwen-3.7</p>
         */
        @NameInMap("Model")
        public String model;

        /**
         * <p>The operating system type of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The ID of the credit package.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-xxx</p>
         */
        @NameInMap("PackageId")
        public String packageId;

        /**
         * <p>The region ID of the cloud desktop.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the first resource in the deduction item.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd-xxx</p>
         */
        @NameInMap("ResourceId")
        public String resourceId;

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Desktop</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The ID of the session associated with the deduction record.</p>
         * 
         * <strong>example:</strong>
         * <p>ai-123456****</p>
         */
        @NameInMap("SessionId")
        public String sessionId;

        /**
         * <p>The start time of the deduction record in UTC. The format is yyyy-MM-ddTHH:mm:ssZ. For records aggregated by hour, the format can be yyyy-MM-ddTHH:mmZ with seconds omitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-31T02:00:00Z</p>
         */
        @NameInMap("StaTime")
        public String staTime;

        /**
         * <p>The summary.</p>
         * 
         * <strong>example:</strong>
         * <p>Summary of the AI query</p>
         */
        @NameInMap("Summary")
        public String summary;

        /**
         * <p>The number of cores deducted.</p>
         * 
         * <strong>example:</strong>
         * <p>4.0</p>
         */
        @NameInMap("UsedCoreTime")
        public Float usedCoreTime;

        /**
         * <p>The usage duration. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("UsedTime")
        public Long usedTime;

        /**
         * <p>The usage calculated from UsedTime by using a precision factor, rounded to four decimal places. This field is returned only for applicable resource types and must be read based on the metering criteria of the corresponding resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0000</p>
         */
        @NameInMap("UsedTimeDecimal")
        public String usedTimeDecimal;

        /**
         * <p>The usage that includes the deduction coefficient. In scenarios where deduction is based on duration, the value is measured in seconds and returned as an integer.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("UsedTimeWithScale")
        public Long usedTimeWithScale;

        public static DescribePackageDeductionsResponseBodyDeductions build(java.util.Map<String, ?> map) throws Exception {
            DescribePackageDeductionsResponseBodyDeductions self = new DescribePackageDeductionsResponseBodyDeductions();
            return TeaModel.build(map, self);
        }

        public DescribePackageDeductionsResponseBodyDeductions setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDeductionRequestId(String deductionRequestId) {
            this.deductionRequestId = deductionRequestId;
            return this;
        }
        public String getDeductionRequestId() {
            return this.deductionRequestId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDeductionType(String deductionType) {
            this.deductionType = deductionType;
            return this;
        }
        public String getDeductionType() {
            return this.deductionType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDesktopId(String desktopId) {
            this.desktopId = desktopId;
            return this;
        }
        public String getDesktopId() {
            return this.desktopId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDesktopName(String desktopName) {
            this.desktopName = desktopName;
            return this;
        }
        public String getDesktopName() {
            return this.desktopName;
        }

        public DescribePackageDeductionsResponseBodyDeductions setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribePackageDeductionsResponseBodyDeductions setGroupResourceType(String groupResourceType) {
            this.groupResourceType = groupResourceType;
            return this;
        }
        public String getGroupResourceType() {
            return this.groupResourceType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setInstanceState(String instanceState) {
            this.instanceState = instanceState;
            return this;
        }
        public String getInstanceState() {
            return this.instanceState;
        }

        public DescribePackageDeductionsResponseBodyDeductions setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setMemory(Long memory) {
            this.memory = memory;
            return this;
        }
        public Long getMemory() {
            return this.memory;
        }

        public DescribePackageDeductionsResponseBodyDeductions setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public DescribePackageDeductionsResponseBodyDeductions setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setPackageId(String packageId) {
            this.packageId = packageId;
            return this;
        }
        public String getPackageId() {
            return this.packageId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setResourceId(String resourceId) {
            this.resourceId = resourceId;
            return this;
        }
        public String getResourceId() {
            return this.resourceId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public DescribePackageDeductionsResponseBodyDeductions setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public DescribePackageDeductionsResponseBodyDeductions setStaTime(String staTime) {
            this.staTime = staTime;
            return this;
        }
        public String getStaTime() {
            return this.staTime;
        }

        public DescribePackageDeductionsResponseBodyDeductions setSummary(String summary) {
            this.summary = summary;
            return this;
        }
        public String getSummary() {
            return this.summary;
        }

        public DescribePackageDeductionsResponseBodyDeductions setUsedCoreTime(Float usedCoreTime) {
            this.usedCoreTime = usedCoreTime;
            return this;
        }
        public Float getUsedCoreTime() {
            return this.usedCoreTime;
        }

        public DescribePackageDeductionsResponseBodyDeductions setUsedTime(Long usedTime) {
            this.usedTime = usedTime;
            return this;
        }
        public Long getUsedTime() {
            return this.usedTime;
        }

        public DescribePackageDeductionsResponseBodyDeductions setUsedTimeDecimal(String usedTimeDecimal) {
            this.usedTimeDecimal = usedTimeDecimal;
            return this;
        }
        public String getUsedTimeDecimal() {
            return this.usedTimeDecimal;
        }

        public DescribePackageDeductionsResponseBodyDeductions setUsedTimeWithScale(Long usedTimeWithScale) {
            this.usedTimeWithScale = usedTimeWithScale;
            return this;
        }
        public Long getUsedTimeWithScale() {
            return this.usedTimeWithScale;
        }

    }

}
