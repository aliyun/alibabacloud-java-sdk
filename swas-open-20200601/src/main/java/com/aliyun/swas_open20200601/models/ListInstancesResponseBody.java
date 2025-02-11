// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancesResponseBody extends TeaModel {
    /**
     * <p>Details about the simple application servers.</p>
     */
    @NameInMap("Instances")
    public java.util.List<ListInstancesResponseBodyInstances> instances;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesResponseBody self = new ListInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstancesResponseBody setInstances(java.util.List<ListInstancesResponseBodyInstances> instances) {
        this.instances = instances;
        return this;
    }
    public java.util.List<ListInstancesResponseBodyInstances> getInstances() {
        return this.instances;
    }

    public ListInstancesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListInstancesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListInstancesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListInstancesResponseBodyInstancesDisksDiskTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyInstancesDisksDiskTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesDisksDiskTags self = new ListInstancesResponseBodyInstancesDisksDiskTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesDisksDiskTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyInstancesDisksDiskTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyInstancesDisks extends TeaModel {
        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li>ESSD: ESSD of PL0</li>
         * <li>SSD: standard SSD</li>
         * <li>CLOUD_EFFICIENCY: an ultra disk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ESSD</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The time when the simple application server was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-02-24T02:20:10Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The device name of the disk after the disk is attached to the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvda</p>
         */
        @NameInMap("Device")
        public String device;

        /**
         * <p>The billing method of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("DiskChargeType")
        public String diskChargeType;

        /**
         * <p>The disk ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp14wq0149cpp2x****</p>
         */
        @NameInMap("DiskId")
        public String diskId;

        /**
         * <p>The disk name.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemDisk</p>
         */
        @NameInMap("DiskName")
        public String diskName;

        /**
         * <p>The tags that are added to the disk.</p>
         */
        @NameInMap("DiskTags")
        public java.util.List<ListInstancesResponseBodyInstancesDisksDiskTags> diskTags;

        /**
         * <p>The disk type. Valid values:</p>
         * <ul>
         * <li>system: system disk</li>
         * <li>data: data disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The remarks of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>remark</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The ID of the resource group to which the disk belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aek2bti7cf7****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Size")
        public Integer size;

        /**
         * <p>The status of the disk. Valid values:</p>
         * <ul>
         * <li>ReIniting: The disk is being initialized.</li>
         * <li>Creating: The disk is being created.</li>
         * <li>In_use: The disk is in use.</li>
         * <li>Available: The disk can be attached.</li>
         * <li>Attaching: The disk is being attached.</li>
         * <li>Detaching: The disk is being detached.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>In_use</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListInstancesResponseBodyInstancesDisks build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesDisks self = new ListInstancesResponseBodyInstancesDisks();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesDisks setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public ListInstancesResponseBodyInstancesDisks setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListInstancesResponseBodyInstancesDisks setDevice(String device) {
            this.device = device;
            return this;
        }
        public String getDevice() {
            return this.device;
        }

        public ListInstancesResponseBodyInstancesDisks setDiskChargeType(String diskChargeType) {
            this.diskChargeType = diskChargeType;
            return this;
        }
        public String getDiskChargeType() {
            return this.diskChargeType;
        }

        public ListInstancesResponseBodyInstancesDisks setDiskId(String diskId) {
            this.diskId = diskId;
            return this;
        }
        public String getDiskId() {
            return this.diskId;
        }

        public ListInstancesResponseBodyInstancesDisks setDiskName(String diskName) {
            this.diskName = diskName;
            return this;
        }
        public String getDiskName() {
            return this.diskName;
        }

        public ListInstancesResponseBodyInstancesDisks setDiskTags(java.util.List<ListInstancesResponseBodyInstancesDisksDiskTags> diskTags) {
            this.diskTags = diskTags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesDisksDiskTags> getDiskTags() {
            return this.diskTags;
        }

        public ListInstancesResponseBodyInstancesDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public ListInstancesResponseBodyInstancesDisks setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstancesDisks setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public ListInstancesResponseBodyInstancesDisks setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyInstancesDisks setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public ListInstancesResponseBodyInstancesDisks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListInstancesResponseBodyInstancesImage extends TeaModel {
        /**
         * <p>The image provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://selfs****e.console.aliyun.com/ticket/createIndex">https://selfs****e.console.aliyun.com/ticket/createIndex</a></p>
         */
        @NameInMap("ImageContact")
        public String imageContact;

        /**
         * <p>The URL of the image icon.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/imgextra/i3/O****1vdh9651ReKqWNMI2I_!!6000000002136****-24-24.svg">https://img.alicdn.com/imgextra/i3/O****1vdh9651ReKqWNMI2I_!!6000000002136****-24-24.svg</a></p>
         */
        @NameInMap("ImageIconUrl")
        public String imageIconUrl;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>test-custom-1686536882356</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The type of the image. Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>app</li>
         * <li>custom</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>system</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The image tag.</p>
         * 
         * <strong>example:</strong>
         * <p>V3.5</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>The OS.</p>
         * 
         * <strong>example:</strong>
         * <p>windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        public static ListInstancesResponseBodyInstancesImage build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesImage self = new ListInstancesResponseBodyInstancesImage();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesImage setImageContact(String imageContact) {
            this.imageContact = imageContact;
            return this;
        }
        public String getImageContact() {
            return this.imageContact;
        }

        public ListInstancesResponseBodyInstancesImage setImageIconUrl(String imageIconUrl) {
            this.imageIconUrl = imageIconUrl;
            return this;
        }
        public String getImageIconUrl() {
            return this.imageIconUrl;
        }

        public ListInstancesResponseBodyInstancesImage setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListInstancesResponseBodyInstancesImage setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ListInstancesResponseBodyInstancesImage setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public ListInstancesResponseBodyInstancesImage setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

    }

    public static class ListInstancesResponseBodyInstancesResourceSpec extends TeaModel {
        /**
         * <p>The bandwidth of the server. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The number of vCPUs of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Cpu")
        public Integer cpu;

        /**
         * <p>The category of the disk. Valid values:</p>
         * <ul>
         * <li>ESSD: enhanced SSD (ESSD) of PL0</li>
         * <li>SSD: standard SSD</li>
         * <li>CLOUD_EFFICIENCY: ultra disk</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cloud_efficiency</p>
         */
        @NameInMap("DiskCategory")
        public String diskCategory;

        /**
         * <p>The disk size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The amount of the traffic.</p>
         * <ul>
         * <li>A value of 0 indicates the traffic amount of a bandwidth-based simple application server.</li>
         * <li>A non-zero value indicates the traffic amount of a data transfer plan-based simple application server.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>818</p>
         */
        @NameInMap("Flow")
        public Double flow;

        /**
         * <p>The memory size of the server. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Memory")
        public Double memory;

        public static ListInstancesResponseBodyInstancesResourceSpec build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesResourceSpec self = new ListInstancesResponseBodyInstancesResourceSpec();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesResourceSpec setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListInstancesResponseBodyInstancesResourceSpec setCpu(Integer cpu) {
            this.cpu = cpu;
            return this;
        }
        public Integer getCpu() {
            return this.cpu;
        }

        public ListInstancesResponseBodyInstancesResourceSpec setDiskCategory(String diskCategory) {
            this.diskCategory = diskCategory;
            return this;
        }
        public String getDiskCategory() {
            return this.diskCategory;
        }

        public ListInstancesResponseBodyInstancesResourceSpec setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public ListInstancesResponseBodyInstancesResourceSpec setFlow(Double flow) {
            this.flow = flow;
            return this;
        }
        public Double getFlow() {
            return this.flow;
        }

        public ListInstancesResponseBodyInstancesResourceSpec setMemory(Double memory) {
            this.memory = memory;
            return this;
        }
        public Double getMemory() {
            return this.memory;
        }

    }

    public static class ListInstancesResponseBodyInstancesTags extends TeaModel {
        /**
         * <p>The tag key of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListInstancesResponseBodyInstancesTags build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstancesTags self = new ListInstancesResponseBodyInstancesTags();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstancesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListInstancesResponseBodyInstancesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The status of the server. Valid values:</p>
         * <ul>
         * <li>Normal: The server is normal.</li>
         * <li>Expired: The server expires.</li>
         * <li>Overdue: The payment of the server is overdue.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        /**
         * <p>Indicates whether the simple application server uses a bundle plan.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Combination")
        public Boolean combination;

        /**
         * <p>The ID of the simple application server that uses a bundle plan.</p>
         * 
         * <strong>example:</strong>
         * <p>com-f6c9a22****45b5b8de68ad608af1ba</p>
         */
        @NameInMap("CombinationInstanceId")
        public String combinationInstanceId;

        /**
         * <p>The time when the simple application server was created. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-08T05:31:06Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The DDoS protection status of the server. Valid values:</p>
         * <ul>
         * <li>Normal: The DDoS protection status of the server is normal.</li>
         * <li>BlackHole: The server is in blackhole filtering.</li>
         * <li>Defense: The server is being scrubbed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("DdosStatus")
        public String ddosStatus;

        /**
         * <p>The reason why the server is disabled. Valid values:</p>
         * <ul>
         * <li>FINANCIAL: The server is locked due to overdue payments.</li>
         * <li>SECURITY: The server is locked for security reasons.</li>
         * <li>EXPIRED: The server is expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXPIRED</p>
         */
        @NameInMap("DisableReason")
        public String disableReason;

        /**
         * <p>The disks that are attached to the simple application server.</p>
         */
        @NameInMap("Disks")
        public java.util.List<ListInstancesResponseBodyInstancesDisks> disks;

        /**
         * <p>The time when the simple application server expires. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-05-08T16:00:00Z</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        /**
         * <p>The description of the image.</p>
         */
        @NameInMap("Image")
        public ListInstancesResponseBodyInstancesImage image;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>fe9c66133a9d4688872869726b52****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The private IP address of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.26.XX.XX</p>
         */
        @NameInMap("InnerIpAddress")
        public String innerIpAddress;

        /**
         * <p>The ID of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>2ad1ae67295445f598017499dc****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>test-InstanceName</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the instance plan.</p>
         * 
         * <strong>example:</strong>
         * <p>swas.s2.c2m2s50b4t08</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>42.1.XX.XX</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group to which the server belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekz7jmhg5s****</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The specifications of the resource.</p>
         */
        @NameInMap("ResourceSpec")
        public ListInstancesResponseBodyInstancesResourceSpec resourceSpec;

        /**
         * <p>The status of the simple application server. Valid values:</p>
         * <ul>
         * <li>Pending: The server is being prepared.</li>
         * <li>Starting: The server is being started.</li>
         * <li>Running: The server is running.</li>
         * <li>Stopping: The server is being stopped.</li>
         * <li>Stopped: The server is stopped.</li>
         * <li>Resetting: The server is being reset.</li>
         * <li>Upgrading: The server is being upgraded.</li>
         * <li>Disabled: The server is not available.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tags that are added to the simple application server.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListInstancesResponseBodyInstancesTags> tags;

        /**
         * <p>The universally unique identifier (UUID) of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>41f30524-5df7-49c9-9c6e-32****489001</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListInstancesResponseBodyInstances build(java.util.Map<String, ?> map) throws Exception {
            ListInstancesResponseBodyInstances self = new ListInstancesResponseBodyInstances();
            return TeaModel.build(map, self);
        }

        public ListInstancesResponseBodyInstances setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public ListInstancesResponseBodyInstances setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListInstancesResponseBodyInstances setCombination(Boolean combination) {
            this.combination = combination;
            return this;
        }
        public Boolean getCombination() {
            return this.combination;
        }

        public ListInstancesResponseBodyInstances setCombinationInstanceId(String combinationInstanceId) {
            this.combinationInstanceId = combinationInstanceId;
            return this;
        }
        public String getCombinationInstanceId() {
            return this.combinationInstanceId;
        }

        public ListInstancesResponseBodyInstances setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListInstancesResponseBodyInstances setDdosStatus(String ddosStatus) {
            this.ddosStatus = ddosStatus;
            return this;
        }
        public String getDdosStatus() {
            return this.ddosStatus;
        }

        public ListInstancesResponseBodyInstances setDisableReason(String disableReason) {
            this.disableReason = disableReason;
            return this;
        }
        public String getDisableReason() {
            return this.disableReason;
        }

        public ListInstancesResponseBodyInstances setDisks(java.util.List<ListInstancesResponseBodyInstancesDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesDisks> getDisks() {
            return this.disks;
        }

        public ListInstancesResponseBodyInstances setExpiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }
        public String getExpiredTime() {
            return this.expiredTime;
        }

        public ListInstancesResponseBodyInstances setImage(ListInstancesResponseBodyInstancesImage image) {
            this.image = image;
            return this;
        }
        public ListInstancesResponseBodyInstancesImage getImage() {
            return this.image;
        }

        public ListInstancesResponseBodyInstances setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListInstancesResponseBodyInstances setInnerIpAddress(String innerIpAddress) {
            this.innerIpAddress = innerIpAddress;
            return this;
        }
        public String getInnerIpAddress() {
            return this.innerIpAddress;
        }

        public ListInstancesResponseBodyInstances setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListInstancesResponseBodyInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListInstancesResponseBodyInstances setPlanId(String planId) {
            this.planId = planId;
            return this;
        }
        public String getPlanId() {
            return this.planId;
        }

        public ListInstancesResponseBodyInstances setPublicIpAddress(String publicIpAddress) {
            this.publicIpAddress = publicIpAddress;
            return this;
        }
        public String getPublicIpAddress() {
            return this.publicIpAddress;
        }

        public ListInstancesResponseBodyInstances setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListInstancesResponseBodyInstances setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListInstancesResponseBodyInstances setResourceSpec(ListInstancesResponseBodyInstancesResourceSpec resourceSpec) {
            this.resourceSpec = resourceSpec;
            return this;
        }
        public ListInstancesResponseBodyInstancesResourceSpec getResourceSpec() {
            return this.resourceSpec;
        }

        public ListInstancesResponseBodyInstances setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListInstancesResponseBodyInstances setTags(java.util.List<ListInstancesResponseBodyInstancesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListInstancesResponseBodyInstancesTags> getTags() {
            return this.tags;
        }

        public ListInstancesResponseBodyInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
