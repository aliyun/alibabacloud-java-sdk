// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaJobViewMetric extends TeaModel {
    /**
     * <p>The CPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>59</p>
     */
    @NameInMap("CPUUsageRate")
    public String CPUUsageRate;

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
     * <p>The GPU utilization.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("GPUUsageRate")
    public String GPUUsageRate;

    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-12580</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The job type, such as DLC or DSW.</p>
     * 
     * <strong>example:</strong>
     * <p>TFJob</p>
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
     * <p>The network inbound rate.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("NetworkInputRate")
    public String networkInputRate;

    /**
     * <p>The network outbound rate.</p>
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
     * <p>The number of requested GPUs.</p>
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

    public static QuotaJobViewMetric build(java.util.Map<String, ?> map) throws Exception {
        QuotaJobViewMetric self = new QuotaJobViewMetric();
        return TeaModel.build(map, self);
    }

    public QuotaJobViewMetric setCPUUsageRate(String CPUUsageRate) {
        this.CPUUsageRate = CPUUsageRate;
        return this;
    }
    public String getCPUUsageRate() {
        return this.CPUUsageRate;
    }

    public QuotaJobViewMetric setDiskReadRate(String diskReadRate) {
        this.diskReadRate = diskReadRate;
        return this;
    }
    public String getDiskReadRate() {
        return this.diskReadRate;
    }

    public QuotaJobViewMetric setDiskWriteRate(String diskWriteRate) {
        this.diskWriteRate = diskWriteRate;
        return this;
    }
    public String getDiskWriteRate() {
        return this.diskWriteRate;
    }

    public QuotaJobViewMetric setGPUUsageRate(String GPUUsageRate) {
        this.GPUUsageRate = GPUUsageRate;
        return this;
    }
    public String getGPUUsageRate() {
        return this.GPUUsageRate;
    }

    public QuotaJobViewMetric setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public QuotaJobViewMetric setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public QuotaJobViewMetric setMemoryUsageRate(String memoryUsageRate) {
        this.memoryUsageRate = memoryUsageRate;
        return this;
    }
    public String getMemoryUsageRate() {
        return this.memoryUsageRate;
    }

    public QuotaJobViewMetric setNetworkInputRate(String networkInputRate) {
        this.networkInputRate = networkInputRate;
        return this;
    }
    public String getNetworkInputRate() {
        return this.networkInputRate;
    }

    public QuotaJobViewMetric setNetworkOutputRate(String networkOutputRate) {
        this.networkOutputRate = networkOutputRate;
        return this;
    }
    public String getNetworkOutputRate() {
        return this.networkOutputRate;
    }

    public QuotaJobViewMetric setNodeNames(java.util.List<String> nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public java.util.List<String> getNodeNames() {
        return this.nodeNames;
    }

    public QuotaJobViewMetric setRequestCPU(Integer requestCPU) {
        this.requestCPU = requestCPU;
        return this;
    }
    public Integer getRequestCPU() {
        return this.requestCPU;
    }

    public QuotaJobViewMetric setRequestGPU(Integer requestGPU) {
        this.requestGPU = requestGPU;
        return this;
    }
    public Integer getRequestGPU() {
        return this.requestGPU;
    }

    public QuotaJobViewMetric setRequestMemory(Long requestMemory) {
        this.requestMemory = requestMemory;
        return this;
    }
    public Long getRequestMemory() {
        return this.requestMemory;
    }

    public QuotaJobViewMetric setTotalCPU(Integer totalCPU) {
        this.totalCPU = totalCPU;
        return this;
    }
    public Integer getTotalCPU() {
        return this.totalCPU;
    }

    public QuotaJobViewMetric setTotalGPU(Integer totalGPU) {
        this.totalGPU = totalGPU;
        return this;
    }
    public Integer getTotalGPU() {
        return this.totalGPU;
    }

    public QuotaJobViewMetric setTotalMemory(Long totalMemory) {
        this.totalMemory = totalMemory;
        return this;
    }
    public Long getTotalMemory() {
        return this.totalMemory;
    }

    public QuotaJobViewMetric setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
