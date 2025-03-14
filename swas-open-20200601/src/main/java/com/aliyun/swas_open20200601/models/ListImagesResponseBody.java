// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListImagesResponseBody extends TeaModel {
    /**
     * <p>Details of the queried images.</p>
     */
    @NameInMap("Images")
    public java.util.List<ListImagesResponseBodyImages> images;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListImagesResponseBody self = new ListImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListImagesResponseBody setImages(java.util.List<ListImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public ListImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListImagesResponseBodyImages extends TeaModel {
        /**
         * <p>The description of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Apps ImageOS ImageCustom Images
         * WordPress is a popular and powerful platform that allows you to build blogs and content management websites and implement custom features by using third-party templates and plug-ins. This WordPress image is built based on CentOS 7.9, PHP 7.4, MySQL 5.7, and Apache 2.4.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>794c230fd3e64ea19f83f4d7a0ad****</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>WordPress-4.8.1</p>
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
         * <p>app</p>
         */
        @NameInMap("ImageType")
        public String imageType;

        /**
         * <p>The operating system type of the image. Valid values:</p>
         * <ul>
         * <li>Linux</li>
         * <li>Windows</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("Platform")
        public String platform;

        public static ListImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListImagesResponseBodyImages self = new ListImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListImagesResponseBodyImages setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public ListImagesResponseBodyImages setImageType(String imageType) {
            this.imageType = imageType;
            return this;
        }
        public String getImageType() {
            return this.imageType;
        }

        public ListImagesResponseBodyImages setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

    }

}
