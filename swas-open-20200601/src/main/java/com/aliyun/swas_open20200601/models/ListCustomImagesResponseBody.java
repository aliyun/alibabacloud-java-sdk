// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImagesResponseBody extends TeaModel {
    /**
     * <p>The queried custom images.</p>
     */
    @NameInMap("CustomImages")
    public java.util.List<ListCustomImagesResponseBodyCustomImages> customImages;

    /**
     * <p>The page number.</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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

    public static class ListCustomImagesResponseBodyCustomImages extends TeaModel {
        /**
         * <p>The time when the snapshot was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The ID of the data disk snapshot.</p>
         */
        @NameInMap("DataSnapshotId")
        public String dataSnapshotId;

        /**
         * <p>The name of the data disk snapshot.</p>
         */
        @NameInMap("DataSnapshotName")
        public String dataSnapshotName;

        /**
         * <p>The description of the custom image.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the custom image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>Indicates whether the custom image is shared with Elastic Compute Service (ECS).</p>
         */
        @NameInMap("InShare")
        public Boolean inShare;

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
         * <p>The name of the custom image.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the custom images.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The status of the custom image.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the system disk snapshot.</p>
         */
        @NameInMap("SystemSnapshotId")
        public String systemSnapshotId;

        /**
         * <p>The name of the system disk snapshot.</p>
         */
        @NameInMap("SystemSnapshotName")
        public String systemSnapshotName;

        public static ListCustomImagesResponseBodyCustomImages build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImagesResponseBodyCustomImages self = new ListCustomImagesResponseBodyCustomImages();
            return TeaModel.build(map, self);
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

        public ListCustomImagesResponseBodyCustomImages setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

    }

}
