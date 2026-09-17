// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vs20181212.models;

import com.aliyun.tea.*;

public class ListRenderingImagesResponseBody extends TeaModel {
    /**
     * <p>The session list.</p>
     */
    @NameInMap("Images")
    public java.util.List<ListRenderingImagesResponseBodyImages> images;

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
     * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of matched sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListRenderingImagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRenderingImagesResponseBody self = new ListRenderingImagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRenderingImagesResponseBody setImages(java.util.List<ListRenderingImagesResponseBodyImages> images) {
        this.images = images;
        return this;
    }
    public java.util.List<ListRenderingImagesResponseBodyImages> getImages() {
        return this.images;
    }

    public ListRenderingImagesResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListRenderingImagesResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListRenderingImagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRenderingImagesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListRenderingImagesResponseBodyImages extends TeaModel {
        /**
         * <p>The image description.</p>
         * 
         * <strong>example:</strong>
         * <p>this is test.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>m-0nd0nxyl7zn220n2y</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The publish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-09-17T00:22:53+08:00</p>
         */
        @NameInMap("PublishTime")
        public String publishTime;

        public static ListRenderingImagesResponseBodyImages build(java.util.Map<String, ?> map) throws Exception {
            ListRenderingImagesResponseBodyImages self = new ListRenderingImagesResponseBodyImages();
            return TeaModel.build(map, self);
        }

        public ListRenderingImagesResponseBodyImages setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListRenderingImagesResponseBodyImages setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public ListRenderingImagesResponseBodyImages setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListRenderingImagesResponseBodyImages setPublishTime(String publishTime) {
            this.publishTime = publishTime;
            return this;
        }
        public String getPublishTime() {
            return this.publishTime;
        }

    }

}
