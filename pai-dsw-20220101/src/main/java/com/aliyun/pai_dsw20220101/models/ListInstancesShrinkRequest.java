// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListInstancesShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>AcceleratorType</p>
     */
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    /**
     * <strong>example:</strong>
     * <p>PRIVATE</p>
     */
    @NameInMap("Accessibility")
    public String accessibility;

    @NameInMap("CreateUserId")
    public String createUserId;

    @NameInMap("GpuType")
    public String gpuType;

    @NameInMap("ImageName")
    public String imageName;

    /**
     * <strong>example:</strong>
     * <p>dsw-730xxxxxxxxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>training_data</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("Labels")
    public String labelsShrink;

    @NameInMap("MaxCpu")
    public String maxCpu;

    @NameInMap("MaxGpu")
    public String maxGpu;

    @NameInMap("MaxGpuMemory")
    public String maxGpuMemory;

    @NameInMap("MaxMemory")
    public String maxMemory;

    @NameInMap("MinCpu")
    public String minCpu;

    @NameInMap("MinGpu")
    public String minGpu;

    @NameInMap("MinGpuMemory")
    public String minGpuMemory;

    @NameInMap("MinMemory")
    public String minMemory;

    /**
     * <strong>example:</strong>
     * <p>DESC</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>PayAsYouGo</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <strong>example:</strong>
     * <p>rg-123456789</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>gmtCreate</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    @NameInMap("Tag")
    public String tagShrink;

    /**
     * <strong>example:</strong>
     * <p>40823</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListInstancesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesShrinkRequest self = new ListInstancesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListInstancesShrinkRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

    public ListInstancesShrinkRequest setAccessibility(String accessibility) {
        this.accessibility = accessibility;
        return this;
    }
    public String getAccessibility() {
        return this.accessibility;
    }

    public ListInstancesShrinkRequest setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
        return this;
    }
    public String getCreateUserId() {
        return this.createUserId;
    }

    public ListInstancesShrinkRequest setGpuType(String gpuType) {
        this.gpuType = gpuType;
        return this;
    }
    public String getGpuType() {
        return this.gpuType;
    }

    public ListInstancesShrinkRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ListInstancesShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListInstancesShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public ListInstancesShrinkRequest setLabelsShrink(String labelsShrink) {
        this.labelsShrink = labelsShrink;
        return this;
    }
    public String getLabelsShrink() {
        return this.labelsShrink;
    }

    public ListInstancesShrinkRequest setMaxCpu(String maxCpu) {
        this.maxCpu = maxCpu;
        return this;
    }
    public String getMaxCpu() {
        return this.maxCpu;
    }

    public ListInstancesShrinkRequest setMaxGpu(String maxGpu) {
        this.maxGpu = maxGpu;
        return this;
    }
    public String getMaxGpu() {
        return this.maxGpu;
    }

    public ListInstancesShrinkRequest setMaxGpuMemory(String maxGpuMemory) {
        this.maxGpuMemory = maxGpuMemory;
        return this;
    }
    public String getMaxGpuMemory() {
        return this.maxGpuMemory;
    }

    public ListInstancesShrinkRequest setMaxMemory(String maxMemory) {
        this.maxMemory = maxMemory;
        return this;
    }
    public String getMaxMemory() {
        return this.maxMemory;
    }

    public ListInstancesShrinkRequest setMinCpu(String minCpu) {
        this.minCpu = minCpu;
        return this;
    }
    public String getMinCpu() {
        return this.minCpu;
    }

    public ListInstancesShrinkRequest setMinGpu(String minGpu) {
        this.minGpu = minGpu;
        return this;
    }
    public String getMinGpu() {
        return this.minGpu;
    }

    public ListInstancesShrinkRequest setMinGpuMemory(String minGpuMemory) {
        this.minGpuMemory = minGpuMemory;
        return this;
    }
    public String getMinGpuMemory() {
        return this.minGpuMemory;
    }

    public ListInstancesShrinkRequest setMinMemory(String minMemory) {
        this.minMemory = minMemory;
        return this;
    }
    public String getMinMemory() {
        return this.minMemory;
    }

    public ListInstancesShrinkRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public ListInstancesShrinkRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListInstancesShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ListInstancesShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ListInstancesShrinkRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListInstancesShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListInstancesShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListInstancesShrinkRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
