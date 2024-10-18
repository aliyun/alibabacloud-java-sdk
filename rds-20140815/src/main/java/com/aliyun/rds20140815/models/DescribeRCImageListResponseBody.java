// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCImageListResponseBody extends TeaModel {
    /**
     * <p>The information about the images.</p>
     */
    @NameInMap("Images")
    public java.util.List<DescribeRCImageListResponseBodyImages> images;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2553A660-E4EB-4AF4-A402-8AFF70A49143</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of images.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeRCImageListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCImageListResponseBody self = new DescribeRCImageListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRCImageListResponseBody setImages(java.util.List<DescribeRCImageListResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<DescribeRCImageListResponseBodyImages> getImages() {
        return this.images;
    }

    public DescribeRCImageListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRCImageListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRCImageListResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCImageListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRCImageListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeRCImageListResponseBodyImages extends TeaModel {
        /**
         * <p>The image architecture. Valid values:</p>
         * <ul>
         * <li>x86_64</li>
         * <li>arm64</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>x86_64</p>
         */
        @NameInMap("Architecture")
        public String architecture;

        /**
         * <p>The time when the image was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-25T02:17:40Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-2oqiu973jwcxe****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Created_from_i-2zeh17y17sz677x****</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The image version.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ImageVersion")
        public String imageVersion;

        /**
         * <p>Indicates whether the image is a public image. Public images include public images provided by Alibaba Cloud and custom images published as community images.</p>
         * <ul>
         * <li><strong>true</strong>: The image is a public image.</li>
         * <li><strong>false</strong>: The image is not a public image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsPublic")
        public Boolean isPublic;

        /**
         * <p>The display name of the operating system in Chinese.</p>
         */
        @NameInMap("OSName")
        public String OSName;

        /**
         * <p>The display name of the operating system in English.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud Linux  2.1903 LTS 64 bit Quick Boot</p>
         */
        @NameInMap("OSNameEn")
        public String OSNameEn;

        /**
         * <p>The type of the operating system. Valid values:</p>
         * <ul>
         * <li><strong>windows</strong></li>
         * <li><strong>linux</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>The image size. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Size")
        public Long size;

        /**
         * <p>The image status. Valid values:</p>
         * <ul>
         * <li><strong>Unavailable</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Creating</strong></li>
         * <li><strong>CreateFailed</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Indicates whether the image is used by the RDS Custom instance. Valid values:</p>
         * <ul>
         * <li><strong>instance</strong>: The image is used to create one or more RDS Custom instances.</li>
         * <li><strong>none</strong>: The image is not used to create RDS Custom instances.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>instance</p>
         */
        @NameInMap("Usage")
        public String usage;

        public static DescribeRCImageListResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            DescribeRCImageListResponseBodyImages self = new DescribeRCImageListResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public DescribeRCImageListResponseBodyImages setArchitecture(String architecture) {
            this.architecture = architecture;
            return this;
        }
        public String getArchitecture() {
            return this.architecture;
        }

        public DescribeRCImageListResponseBodyImages setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeRCImageListResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeRCImageListResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeRCImageListResponseBodyImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeRCImageListResponseBodyImages setImageVersion(String imageVersion) {
            this.imageVersion = imageVersion;
            return this;
        }
        public String getImageVersion() {
            return this.imageVersion;
        }

        public DescribeRCImageListResponseBodyImages setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        public DescribeRCImageListResponseBodyImages setOSName(String OSName) {
            this.OSName = OSName;
            return this;
        }
        public String getOSName() {
            return this.OSName;
        }

        public DescribeRCImageListResponseBodyImages setOSNameEn(String OSNameEn) {
            this.OSNameEn = OSNameEn;
            return this;
        }
        public String getOSNameEn() {
            return this.OSNameEn;
        }

        public DescribeRCImageListResponseBodyImages setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeRCImageListResponseBodyImages setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribeRCImageListResponseBodyImages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeRCImageListResponseBodyImages setUsage(String usage) {
            this.usage = usage;
            return this;
        }
        public String getUsage() {
            return this.usage;
        }

    }

}
