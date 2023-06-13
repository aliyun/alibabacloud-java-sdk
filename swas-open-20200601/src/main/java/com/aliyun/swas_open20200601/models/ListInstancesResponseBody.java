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
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of simple application servers returned.</p>
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

    public static class ListInstancesResponseBodyInstancesImage extends TeaModel {
        @NameInMap("ImageContact")
        public String imageContact;

        @NameInMap("ImageIconUrl")
        public String imageIconUrl;

        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageType")
        public String imageType;

        @NameInMap("ImageVersion")
        public String imageVersion;

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
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("Cpu")
        public Integer cpu;

        @NameInMap("DiskCategory")
        public String diskCategory;

        @NameInMap("DiskSize")
        public Integer diskSize;

        @NameInMap("Flow")
        public Double flow;

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

    public static class ListInstancesResponseBodyInstances extends TeaModel {
        /**
         * <p>The status of the simple application server. Valid values:</p>
         * <br>
         * <p>*   Normal</p>
         * <p>*   Expired</p>
         * <p>*   Overdue</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The billing method of the simple application server.</p>
         */
        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("Combination")
        public Boolean combination;

        @NameInMap("CombinationInstanceId")
        public String combinationInstanceId;

        /**
         * <p>The time when the simple application server was created. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The DDoS protection status. Valid values:</p>
         * <br>
         * <p>*   Normal: Normal</p>
         * <p>*   BlackHole: Blackholing</p>
         * <p>*   Defense: Cleaning</p>
         */
        @NameInMap("DdosStatus")
        public String ddosStatus;

        @NameInMap("DisableReason")
        public String disableReason;

        /**
         * <p>The time when the simple application server expires. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("ExpiredTime")
        public String expiredTime;

        @NameInMap("Image")
        public ListInstancesResponseBodyInstancesImage image;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The internal IP address of the simple application server.</p>
         */
        @NameInMap("InnerIpAddress")
        public String innerIpAddress;

        /**
         * <p>The ID of the simple application server.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the simple application server.</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The ID of the plan.</p>
         */
        @NameInMap("PlanId")
        public String planId;

        /**
         * <p>The public IP address.</p>
         */
        @NameInMap("PublicIpAddress")
        public String publicIpAddress;

        /**
         * <p>The region ID of the simple application servers.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceSpec")
        public ListInstancesResponseBodyInstancesResourceSpec resourceSpec;

        /**
         * <p>The status of the simple application server. Valid values:</p>
         * <br>
         * <p>*   Pending</p>
         * <p>*   Starting</p>
         * <p>*   Running</p>
         * <p>*   Stopping</p>
         * <p>*   Stopped</p>
         * <p>*   Resetting</p>
         * <p>*   Upgrading</p>
         * <p>*   Disabled</p>
         */
        @NameInMap("Status")
        public String status;

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

        public ListInstancesResponseBodyInstances setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
