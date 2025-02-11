// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImagesResponseBody extends TeaModel {
    /**
     * <p>The array of queried custom images.</p>
     */
    @NameInMap("CustomImages")
    public java.util.List<ListCustomImagesResponseBodyCustomImages> customImages;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListCustomImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImagesResponseBody self = new ListCustomImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomImagesResponseBody setCustomImages(java.util.List<ListCustomImagesResponseBodyCustomImages> customImages) {
        this.customImages = customImages;
        return this;
    }
    public java.util.List<ListCustomImagesResponseBodyCustomImages> getCustomImages() {
        return this.customImages;
    }

    public ListCustomImagesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomImagesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListCustomImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomImagesResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomImagesResponseBodyCustomImagesTags extends TeaModel {
        /**
         * <p>The tag key of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListCustomImagesResponseBodyCustomImagesTags build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyCustomImagesTags self = new ListCustomImagesResponseBodyCustomImagesTags();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyCustomImagesTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListCustomImagesResponseBodyCustomImagesTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListCustomImagesResponseBodyCustomImages extends TeaModel {
        /**
         * <p>The simple application servers created from the image.</p>
         */
        @NameInMap("CreateInstances")
        public java.util.List<String> createInstances;

        /**
         * <p>The time when the snapshot was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-09T02:28:06Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the data disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp19rn9u8eqzlfb***</p>
         */
        @NameInMap("DataSnapshotId")
        public String dataSnapshotId;

        /**
         * <p>The name of the data disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>data disk snapshot</p>
         */
        @NameInMap("DataSnapshotName")
        public String dataSnapshotName;

        /**
         * <p>The description of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>test-custom-image</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>m-bp1e79zktg26n2b***</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Indicates whether the custom image is shared to Elastic Compute Service (ECS).</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InShare")
        public Boolean inShare;

        /**
         * <p>Indicates whether the custom image is shared across accounts.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("InShareUser")
        public Boolean inShareUser;

        /**
         * <p>The ID of the simple application server from which the image is derived.</p>
         * 
         * <strong>example:</strong>
         * <p>2d06ee0520b44de1ae88d4be****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>swas-asdf23***</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The name of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>hua</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The operating system type of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The size of the image data disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RequiredDataDiskSize")
        public Integer requiredDataDiskSize;

        /**
         * <p>The size of the image system disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("RequiredSystemDiskSize")
        public Integer requiredSystemDiskSize;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2h2lvp3ublq</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The name of the source image that is used to create the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS</p>
         */
        @NameInMap("SourceImageName")
        public String sourceImageName;

        /**
         * <p>The version of the source image that is used to create the simple application server.</p>
         * 
         * <strong>example:</strong>
         * <p>8.0</p>
         */
        @NameInMap("SourceImageVersion")
        public String sourceImageVersion;

        /**
         * <p>The status of the custom image. Valid values:</p>
         * <ul>
         * <li>0: copying</li>
         * <li>1: available</li>
         * <li>2: unavailable</li>
         * <li>3: creation failed</li>
         * <li>4: creating</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the system disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp1h173hj21puxb***</p>
         */
        @NameInMap("SystemSnapshotId")
        public String systemSnapshotId;

        /**
         * <p>The name of the system disk snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>system disk snapshot</p>
         */
        @NameInMap("SystemSnapshotName")
        public String systemSnapshotName;

        /**
         * <p>The tags of the custom image.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListCustomImagesResponseBodyCustomImagesTags> tags;

        /**
         * <p>The ID of the Alibaba Cloud account to which the image belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>180185828710****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListCustomImagesResponseBodyCustomImages build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyCustomImages self = new ListCustomImagesResponseBodyCustomImages();
            return TeaModel.build(map, self);
        }

        public ListCustomImagesResponseBodyCustomImages setCreateInstances(java.util.List<String> createInstances) {
            this.createInstances = createInstances;
            return this;
        }
        public java.util.List<String> getCreateInstances() {
            return this.createInstances;
        }

        public ListCustomImagesResponseBodyCustomImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListCustomImagesResponseBodyCustomImages setDataSnapshotId(String dataSnapshotId) {
            this.dataSnapshotId = dataSnapshotId;
            return this;
        }
        public String getDataSnapshotId() {
            return this.dataSnapshotId;
        }

        public ListCustomImagesResponseBodyCustomImages setDataSnapshotName(String dataSnapshotName) {
            this.dataSnapshotName = dataSnapshotName;
            return this;
        }
        public String getDataSnapshotName() {
            return this.dataSnapshotName;
        }

        public ListCustomImagesResponseBodyCustomImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListCustomImagesResponseBodyCustomImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListCustomImagesResponseBodyCustomImages setInShare(Boolean inShare) {
            this.inShare = inShare;
            return this;
        }
        public Boolean getInShare() {
            return this.inShare;
        }

        public ListCustomImagesResponseBodyCustomImages setInShareUser(Boolean inShareUser) {
            this.inShareUser = inShareUser;
            return this;
        }
        public Boolean getInShareUser() {
            return this.inShareUser;
        }

        public ListCustomImagesResponseBodyCustomImages setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCustomImagesResponseBodyCustomImages setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListCustomImagesResponseBodyCustomImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListCustomImagesResponseBodyCustomImages setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public ListCustomImagesResponseBodyCustomImages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListCustomImagesResponseBodyCustomImages setRequiredDataDiskSize(Integer requiredDataDiskSize) {
            this.requiredDataDiskSize = requiredDataDiskSize;
            return this;
        }
        public Integer getRequiredDataDiskSize() {
            return this.requiredDataDiskSize;
        }

        public ListCustomImagesResponseBodyCustomImages setRequiredSystemDiskSize(Integer requiredSystemDiskSize) {
            this.requiredSystemDiskSize = requiredSystemDiskSize;
            return this;
        }
        public Integer getRequiredSystemDiskSize() {
            return this.requiredSystemDiskSize;
        }

        public ListCustomImagesResponseBodyCustomImages setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public ListCustomImagesResponseBodyCustomImages setSourceImageName(String sourceImageName) {
            this.sourceImageName = sourceImageName;
            return this;
        }
        public String getSourceImageName() {
            return this.sourceImageName;
        }

        public ListCustomImagesResponseBodyCustomImages setSourceImageVersion(String sourceImageVersion) {
            this.sourceImageVersion = sourceImageVersion;
            return this;
        }
        public String getSourceImageVersion() {
            return this.sourceImageVersion;
        }

        public ListCustomImagesResponseBodyCustomImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCustomImagesResponseBodyCustomImages setSystemSnapshotId(String systemSnapshotId) {
            this.systemSnapshotId = systemSnapshotId;
            return this;
        }
        public String getSystemSnapshotId() {
            return this.systemSnapshotId;
        }

        public ListCustomImagesResponseBodyCustomImages setSystemSnapshotName(String systemSnapshotName) {
            this.systemSnapshotName = systemSnapshotName;
            return this;
        }
        public String getSystemSnapshotName() {
            return this.systemSnapshotName;
        }

        public ListCustomImagesResponseBodyCustomImages setTags(java.util.List<ListCustomImagesResponseBodyCustomImagesTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListCustomImagesResponseBodyCustomImagesTags> getTags() {
            return this.tags;
        }

        public ListCustomImagesResponseBodyCustomImages setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
