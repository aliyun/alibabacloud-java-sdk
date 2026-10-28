// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaUserViewMetric extends TeaModel {
    /**
     * <p>The number of CPU nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CPUNodeNumber")
    public Integer CPUNodeNumber;

    /**
     * <p>The CPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("CPUUsageRate")
    public String CPUUsageRate;

    /**
     * <p>The CPU jobs.</p>
     */
    @NameInMap("CpuJobNames")
    public java.util.List<String> cpuJobNames;

    /**
     * <p>The CPU node list.</p>
     */
    @NameInMap("CpuNodeNames")
    public java.util.List<String> cpuNodeNames;

    /**
     * <p>The disk read rate.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("DiskReadRate")
    public String diskReadRate;

    /**
     * <p>The disk write rate.</p>
     * 
     * <strong>example:</strong>
     * <p>22</p>
     */
    @NameInMap("DiskWriteRate")
    public String diskWriteRate;

    /**
     * <p>The number of GPU nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GPUNodeNumber")
    public Integer GPUNodeNumber;

    /**
     * <p>The GPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GPUUsageRate")
    public String GPUUsageRate;

    /**
     * <p>The GPU jobs.</p>
     */
    @NameInMap("GpuJobNames")
    public java.util.List<String> gpuJobNames;

    /**
     * <p>The GPU node list.</p>
     */
    @NameInMap("GpuNodeNames")
    public java.util.List<String> gpuNodeNames;

    /**
     * <p>The job type.</p>
     * 
     * <strong>example:</strong>
     * <p>PyTorch</p>
     */
    @NameInMap("JobType")
    public String jobType;

    /**
     * <p>The memory utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MemoryUsageRate")
    public String memoryUsageRate;

    /**
     * <p>The network input rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkInputRate")
    public String networkInputRate;

    /**
     * <p>The network output rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkOutputRate")
    public String networkOutputRate;

    /**
     * <p>The node list.</p>
     */
    @NameInMap("NodeNames")
    public java.util.List<String> nodeNames;

    /**
     * <p>The number of requested CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("RequestCPU")
    public Integer requestCPU;

    /**
     * <p>The number of requested GPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RequestGPU")
    public Integer requestGPU;

    /**
     * <p>The requested memory in KB.</p>
     * 
     * <strong>example:</strong>
     * <p>102400000</p>
     */
    @NameInMap("RequestMemory")
    public Long requestMemory;

    /**
     * <p>The total number of CPU cores.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCPU")
    public Integer totalCPU;

    /**
     * <p>The total number of GPUs.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalGPU")
    public Integer totalGPU;

    /**
     * <p>The total memory in KB.</p>
     * 
     * <strong>example:</strong>
     * <p>10240</p>
     */
    @NameInMap("TotalMemory")
    public Long totalMemory;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456789</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static QuotaUserViewMetric build(java.util.Map<String, ?> map) throws Exception {
        QuotaUserViewMetric self = new QuotaUserViewMetric();
        return TeaModel.build(map, self);
    }

    public QuotaUserViewMetric setCPUNodeNumber(Integer CPUNodeNumber) {
        this.CPUNodeNumber = CPUNodeNumber;
        return this;
    }
    public Integer getCPUNodeNumber() {
        return this.CPUNodeNumber;
    }

    public QuotaUserViewMetric setCPUUsageRate(String CPUUsageRate) {
        this.CPUUsageRate = CPUUsageRate;
        return this;
    }
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    public QuotaUserViewMetric setCpuJobNames(java.util.List<String> cpuJobNames) {
        this.cpuJobNames = cpuJobNames;
        return this;
    }
    public java.util.List<String> getCpuJobNames() {
        return this.cpuJobNames;
    }

    public QuotaUserViewMetric setCpuNodeNames(java.util.List<String> cpuNodeNames) {
        this.cpuNodeNames = cpuNodeNames;
        return this;
    }
    public java.util.List<String> getCpuNodeNames() {
        return this.cpuNodeNames;
    }

    public QuotaUserViewMetric setDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }
    public String getDiskReadRate() {
        return this.diskReadRate;
    }

    public QuotaUserViewMetric setDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }
    public String getDiskWriteRate() {
        return this.diskWriteRate;
    }

    public QuotaUserViewMetric setGPUNodeNumber(Integer GPUNodeNumber) {
        this.GPUNodeNumber = GPUNodeNumber;
        return this;
    }
    public Integer getGPUNodeNumber() {
        return this.GPUNodeNumber;
    }

    public QuotaUserViewMetric setGPUUsageRate(String GPUUsageRate) {
        this.GPUUsageRate = GPUUsageRate;
        return this;
    }
    public String getGPUUsageRate() {
        return this.GPUUsageRate;
    }

    public QuotaUserViewMetric setGpuJobNames(java.util.List<String> gpuJobNames) {
        this.gpuJobNames = gpuJobNames;
        return this;
    }
    public java.util.List<String> getGpuJobNames() {
        return this.gpuJobNames;
    }

    public QuotaUserViewMetric setGpuNodeNames(java.util.List<String> gpuNodeNames) {
        this.gpuNodeNames = gpuNodeNames;
        return this;
    }
    public java.util.List<String> getGpuNodeNames() {
        return this.gpuNodeNames;
    }

    public QuotaUserViewMetric setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public QuotaUserViewMetric setMemoryUsageRate(String memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
        return this;
    }
    public String getMemoryUsageRate() {
        return this.memoryUsageRate;
    }

    public QuotaUserViewMetric setNetworkInputRate(String networkInputRate) {
        this.networkInputRate = networkInputRate;
        return this;
    }
    public String getNetworkInputRate() {
        return this.networkInputRate;
    }

    public QuotaUserViewMetric setNetworkOutputRate(String networkOutputRate) {
        this.networkOutputRate = networkOutputRate;
        return this;
    }
    public String getNetworkOutputRate() {
        return this.networkOutputRate;
    }

    public QuotaUserViewMetric setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public QuotaUserViewMetric setRequestCPU(Integer requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Integer getRequestCPU() {
        return this.requestCPU;
    }

    public QuotaUserViewMetric setRequestGPU(Integer requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public Integer getRequestGPU() {
        return this.requestGPU;
    }

    public QuotaUserViewMetric setRequestMemory(Long requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    public QuotaUserViewMetric setTotalCPU(Integer totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Integer getTotalCPU() {
        return this.totalCPU;
    }

    public QuotaUserViewMetric setTotalGPU(Integer totalGPU) {
        this.totalGPU = totalGPU;
        return this;
    }
    public Integer getTotalGPU() {
        return this.totalGPU;
    }

    public QuotaUserViewMetric setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    public QuotaUserViewMetric setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
