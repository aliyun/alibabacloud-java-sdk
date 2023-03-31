// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class JobViewMetric extends TeaModel {
    @NameInMap("CPUUsageRate")
    public String CPUUsageRate;

    @NameInMap("DiskReadRate")
    public String diskReadRate;

    @NameInMap("DiskWriteRate")
    public String diskWriteRate;

    @NameInMap("GPUUsageRate")
    public String GPUUsageRate;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("JobType")
    public String jobType;

    @NameInMap("MemoryUsageRate")
    public String memoryUsageRate;

    @NameInMap("NetworkInputRate")
    public String networkInputRate;

    @NameInMap("NetworkOutputRate")
    public String networkOutputRate;

    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    @NameInMap("RequestCPU")
    public Integer requestCPU;

    @NameInMap("RequestGPU")
    public Integer requestGPU;

    @NameInMap("RequestMemory")
    public Long requestMemory;

    @NameInMap("ResourceGroupID")
    public String resourceGroupID;

    @NameInMap("TotalCPU")
    public Integer totalCPU;

    @NameInMap("TotalGPU")
    public Integer totalGPU;

    @NameInMap("TotalMemory")
    public Long totalMemory;

    @NameInMap("UserId")
    public String userId;

    public static JobViewMetric build(java.util.Map<String, ?> map) throws Exception {
        JobViewMetric self = new JobViewMetric();
        return TeaModel.build(map, self);
    }

    public JobViewMetric setCPUUsageRate(String CPUUsageRate) {
        this.CPUUsageRate = CPUUsageRate;
        return this;
    }
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    public JobViewMetric setDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }
    public String getDiskReadRate() {
        return this.diskReadRate;
    }

    public JobViewMetric setDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }
    public String getDiskWriteRate() {
        return this.diskWriteRate;
    }

    public JobViewMetric setGPUUsageRate(String GPUUsageRate) {
        this.GPUUsageRate = GPUUsageRate;
        return this;
    }
    public String getGPUUsageRate() {
        return this.GPUUsageRate;
    }

    public JobViewMetric setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public JobViewMetric setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public JobViewMetric setMemoryUsageRate(String memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
        return this;
    }
    public String getMemoryUsageRate() {
        return this.memoryUsageRate;
    }

    public JobViewMetric setNetworkInputRate(String networkInputRate) {
        this.networkInputRate = networkInputRate;
        return this;
    }
    public String getNetworkInputRate() {
        return this.networkInputRate;
    }

    public JobViewMetric setNetworkOutputRate(String networkOutputRate) {
        this.networkOutputRate = networkOutputRate;
        return this;
    }
    public String getNetworkOutputRate() {
        return this.networkOutputRate;
    }

    public JobViewMetric setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public JobViewMetric setRequestCPU(Integer requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Integer getRequestCPU() {
        return this.requestCPU;
    }

    public JobViewMetric setRequestGPU(Integer requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public Integer getRequestGPU() {
        return this.requestGPU;
    }

    public JobViewMetric setRequestMemory(Long requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    public JobViewMetric setResourceGroupID(String resourceGroupID) {
        this.resourceGroupID = resourceGroupID;
        return this;
    }
    public String getResourceGroupID() {
        return this.resourceGroupID;
    }

    public JobViewMetric setTotalCPU(Integer totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Integer getTotalCPU() {
        return this.totalCPU;
    }

    public JobViewMetric setTotalGPU(Integer totalGPU) {
        this.totalGPU = totalGPU;
        return this;
    }
    public Integer getTotalGPU() {
        return this.totalGPU;
    }

    public JobViewMetric setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    public JobViewMetric setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
