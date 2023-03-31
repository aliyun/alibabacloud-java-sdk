// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UserViewMetric extends TeaModel {
    @NameInMap("CPUNodeNumber")
    public Integer CPUNodeNumber;

    @NameInMap("CPUUsageRate")
    public String CPUUsageRate;

    @NameInMap("CpuJobNames")
    public java.util.List<String> cpuJobNames;

    @NameInMap("CpuNodeNames")
    public java.util.List<String> cpuNodeNames;

    @NameInMap("DiskReadRate")
    public String diskReadRate;

    @NameInMap("DiskWriteRate")
    public String diskWriteRate;

    @NameInMap("GPUNodeNumber")
    public Integer GPUNodeNumber;

    @NameInMap("GPUUsageRate")
    public String GPUUsageRate;

    @NameInMap("GpuJobNames")
    public java.util.List<String> gpuJobNames;

    @NameInMap("GpuNodeNames")
    public java.util.List<String> gpuNodeNames;

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

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("TotalCPU")
    public Integer totalCPU;

    @NameInMap("TotalGPU")
    public Integer totalGPU;

    @NameInMap("TotalMemory")
    public Long totalMemory;

    @NameInMap("UserId")
    public String userId;

    public static UserViewMetric build(java.util.Map<String, ?> map) throws Exception {
        UserViewMetric self = new UserViewMetric();
        return TeaModel.build(map, self);
    }

    public UserViewMetric setCPUNodeNumber(Integer CPUNodeNumber) {
        this.CPUNodeNumber = CPUNodeNumber;
        return this;
    }
    public Integer getCPUNodeNumber() {
        return this.CPUNodeNumber;
    }

    public UserViewMetric setCPUUsageRate(String CPUUsageRate) {
        this.CPUUsageRate = CPUUsageRate;
        return this;
    }
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    public UserViewMetric setCpuJobNames(java.util.List<String> cpuJobNames) {
        this.cpuJobNames = cpuJobNames;
        return this;
    }
    public java.util.List<String> getCpuJobNames() {
        return this.cpuJobNames;
    }

    public UserViewMetric setCpuNodeNames(java.util.List<String> cpuNodeNames) {
        this.cpuNodeNames = cpuNodeNames;
        return this;
    }
    public java.util.List<String> getCpuNodeNames() {
        return this.cpuNodeNames;
    }

    public UserViewMetric setDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }
    public String getDiskReadRate() {
        return this.diskReadRate;
    }

    public UserViewMetric setDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }
    public String getDiskWriteRate() {
        return this.diskWriteRate;
    }

    public UserViewMetric setGPUNodeNumber(Integer GPUNodeNumber) {
        this.GPUNodeNumber = GPUNodeNumber;
        return this;
    }
    public Integer getGPUNodeNumber() {
        return this.GPUNodeNumber;
    }

    public UserViewMetric setGPUUsageRate(String GPUUsageRate) {
        this.GPUUsageRate = GPUUsageRate;
        return this;
    }
    public String getGPUUsageRate() {
        return this.GPUUsageRate;
    }

    public UserViewMetric setGpuJobNames(java.util.List<String> gpuJobNames) {
        this.gpuJobNames = gpuJobNames;
        return this;
    }
    public java.util.List<String> getGpuJobNames() {
        return this.gpuJobNames;
    }

    public UserViewMetric setGpuNodeNames(java.util.List<String> gpuNodeNames) {
        this.gpuNodeNames = gpuNodeNames;
        return this;
    }
    public java.util.List<String> getGpuNodeNames() {
        return this.gpuNodeNames;
    }

    public UserViewMetric setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public UserViewMetric setMemoryUsageRate(String memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
        return this;
    }
    public String getMemoryUsageRate() {
        return this.memoryUsageRate;
    }

    public UserViewMetric setNetworkInputRate(String networkInputRate) {
        this.networkInputRate = networkInputRate;
        return this;
    }
    public String getNetworkInputRate() {
        return this.networkInputRate;
    }

    public UserViewMetric setNetworkOutputRate(String networkOutputRate) {
        this.networkOutputRate = networkOutputRate;
        return this;
    }
    public String getNetworkOutputRate() {
        return this.networkOutputRate;
    }

    public UserViewMetric setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public UserViewMetric setRequestCPU(Integer requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Integer getRequestCPU() {
        return this.requestCPU;
    }

    public UserViewMetric setRequestGPU(Integer requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public Integer getRequestGPU() {
        return this.requestGPU;
    }

    public UserViewMetric setRequestMemory(Long requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    public UserViewMetric setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UserViewMetric setTotalCPU(Integer totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Integer getTotalCPU() {
        return this.totalCPU;
    }

    public UserViewMetric setTotalGPU(Integer totalGPU) {
        this.totalGPU = totalGPU;
        return this;
    }
    public Integer getTotalGPU() {
        return this.totalGPU;
    }

    public UserViewMetric setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    public UserViewMetric setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
