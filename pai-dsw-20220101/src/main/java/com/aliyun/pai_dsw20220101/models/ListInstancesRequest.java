// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstancesRequest extends TeaModel {
    /**
     * <p>The accelerator type.</p>
     * <ul>
     * <li>CPU: Only CPU computing is used.</li>
     * <li>GPU: GPUs are used to accelerate computing.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CPU</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <p>The accessibility. Valid values:</p>
     * <ul>
     * <li>PRIVATE (default): The instances are accessible only to you and the administrator of the workspace.</li>
     * <li>PUBLIC: The instances are accessible only to all members in the workspace.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("CreateTimeAfter")
    public String createTimeAfter;

    @NameInMap("CreateTimeBefore")
    public String createTimeBefore;

    /**
     * <p>The UID of the creator.</p>
     * 
     * <strong>example:</strong>
     * <p>12345*****67890</p>
     */
    @NameInMap("CreateUserId")
    public String createUserId;

    /**
     * <p>The GPU type.</p>
     * 
     * <strong>example:</strong>
     * <p>NVIDIA A10</p>
     */
    @NameInMap("GpuType")
    public String gpuType;

    /**
     * <p>The image name.</p>
     * 
     * <strong>example:</strong>
     * <p>modelscope:1.9.4-pytorch2.0.1tensorflow2.13.0-cpu-py38-ubuntu20.04</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/470439.html">ListInstances</a> to obtain the instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>training_data</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The labels. A maximum of four labels are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;key1&quot;: &quot;value1&quot;,
     *   &quot;key2&quot;: &quot;value2&quot;,
     *   &quot;key3&quot;: &quot;value3&quot;
     * }</p>
     */
    @NameInMap("Labels")
    public java.util.Map<String, ?> labels;

    /**
     * <p>The maximum number of CPUs. Unit: 0.001 CPU. The value 1000 indicates one CPU.</p>
     * 
     * <strong>example:</strong>
     * <p>30000</p>
     */
    @NameInMap("MaxCpu")
    public String maxCpu;

    /**
     * <p>The maximum number of GPUs. Unit: 0.001 GPU. The value 1000 indicates one GPU.</p>
     * 
     * <strong>example:</strong>
     * <p>8000</p>
     */
    @NameInMap("MaxGpu")
    public String maxGpu;

    /**
     * <p>The maximum memory size per GPU card. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>16</p>
     */
    @NameInMap("MaxGpuMemory")
    public String maxGpuMemory;

    /**
     * <p>The maximum memory size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>48</p>
     */
    @NameInMap("MaxMemory")
    public String maxMemory;

    /**
     * <p>The minimum number of CPUs. Unit: 0.001 CPU. The value 1000 indicates one CPU.</p>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("MinCpu")
    public String minCpu;

    /**
     * <p>The minimum number of GPUs. Unit: 0.001 GPU. The value 1000 indicates one GPU.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MinGpu")
    public String minGpu;

    /**
     * <p>The minimum memory size per GPU card. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("MinGpuMemory")
    public String minGpuMemory;

    /**
     * <p>The minimum memory size. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MinMemory")
    public String minMemory;

    /**
     * <p>The order that you use to sort the query results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>ASC</li>
     * <li>DESC</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OversoldInfo")
    public String oversoldInfo;

    @NameInMap("OversoldType")
    public String oversoldType;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The billing method.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>PayAsYouGo</li>
     * <li>Subscription</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>The resource group ID. If you leave this parameter empty, the instances in the pay-as-you-go resource group are queried. If you set this parameter to ALL, all instances are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-123456789</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The field that you use to sort the query results.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Priority</li>
     * <li>GmtCreateTime</li>
     * <li>GmtModifiedTime</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The instance status.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>SaveFailed</li>
     * <li>Stopped</li>
     * <li>Failed</li>
     * <li>ResourceAllocating</li>
     * <li>Stopping</li>
     * <li>Updating</li>
     * <li>Saving</li>
     * <li>Queuing</li>
     * <li>Recovering</li>
     * <li>Starting</li>
     * <li>Running</li>
     * <li>Saved</li>
     * <li>Deleting</li>
     * <li>EnvPreparing</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListInstancesRequestTag> tag;

    /**
     * <p>The workspace ID. You can call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>40823</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListInstancesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesRequest self = new ListInstancesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListInstancesRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListInstancesRequest setCreateTimeAfter(String createTimeAfter) {
        this.createTimeAfter = createTimeAfter;
        return this;
    }
    public String getCreateTimeAfter() {
        return this.createTimeAfter;
    }

    public ListInstancesRequest setCreateTimeBefore(String createTimeBefore) {
        this.createTimeBefore = createTimeBefore;
        return this;
    }
    public String getCreateTimeBefore() {
        return this.createTimeBefore;
    }

    public ListInstancesRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public ListInstancesRequest setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public ListInstancesRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListInstancesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancesRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstancesRequest setLabels(java.util.Map<String, ?> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.Map<String, ?> getLabels() {
        return this.labels;
    }

    public ListInstancesRequest setMaxCpu(String maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public String getMaxCpu() {
        return this.maxCpu;
    }

    public ListInstancesRequest setMaxGpu(String maxGpu) {
        this.maxGpu = maxGpu;
        return this;
    }
    public String getMaxGpu() {
        return this.maxGpu;
    }

    public ListInstancesRequest setMaxGpuMemory(String maxGpuMemory) {
        this.maxGpuMemory = maxGpuMemory;
        return this;
    }
    public String getMaxGpuMemory() {
        return this.maxGpuMemory;
    }

    public ListInstancesRequest setMaxMemory(String maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }
    public String getMaxMemory() {
        return this.maxMemory;
    }

    public ListInstancesRequest setMinCpu(String minCpu) {
        this.minCpu = minCpu;
        return this;
    }
    public String getMinCpu() {
        return this.minCpu;
    }

    public ListInstancesRequest setMinGpu(String minGpu) {
        this.minGpu = minGpu;
        return this;
    }
    public String getMinGpu() {
        return this.minGpu;
    }

    public ListInstancesRequest setMinGpuMemory(String minGpuMemory) {
        this.minGpuMemory = minGpuMemory;
        return this;
    }
    public String getMinGpuMemory() {
        return this.minGpuMemory;
    }

    public ListInstancesRequest setMinMemory(String minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public String getMinMemory() {
        return this.minMemory;
    }

    public ListInstancesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListInstancesRequest setOversoldInfo(String oversoldInfo) {
        this.oversoldInfo = oversoldInfo;
        return this;
    }
    public String getOversoldInfo() {
        return this.oversoldInfo;
    }

    public ListInstancesRequest setOversoldType(String oversoldType) {
        this.oversoldType = oversoldType;
        return this;
    }
    public String getOversoldType() {
        return this.oversoldType;
    }

    public ListInstancesRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstancesRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListInstancesRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListInstancesRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListInstancesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstancesRequest setTag(java.util.List<ListInstancesRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListInstancesRequestTag> getTag() {
        return this.tag;
    }

    public ListInstancesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class ListInstancesRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>tag1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>value1</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesRequestTag self = new ListInstancesRequestTag();
            return TeaModel.build(map, self);
        }

        public ListInstancesRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
