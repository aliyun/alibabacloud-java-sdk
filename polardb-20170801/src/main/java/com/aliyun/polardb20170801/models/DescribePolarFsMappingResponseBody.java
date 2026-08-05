// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsMappingResponseBody extends TeaModel {
    /**
     * <p>The default AccessKey ID at the instance level.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("DefaultAccessKeyId")
    public String defaultAccessKeyId;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of records on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The number of entries per page. Valid values:</p>
     * <ul>
     * <li><p><strong>30</strong></p>
     * </li>
     * <li><p><strong>50</strong></p>
     * </li>
     * <li><p><strong>100</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The list of path mappings.</p>
     */
    @NameInMap("PathMappingItems")
    public java.util.List<DescribePolarFsMappingResponseBodyPathMappingItems> pathMappingItems;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribePolarFsMappingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsMappingResponseBody self = new DescribePolarFsMappingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsMappingResponseBody setDefaultAccessKeyId(String defaultAccessKeyId) {
        this.defaultAccessKeyId = defaultAccessKeyId;
        return this;
    }
    public String getDefaultAccessKeyId() {
        return this.defaultAccessKeyId;
    }

    public DescribePolarFsMappingResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolarFsMappingResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribePolarFsMappingResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribePolarFsMappingResponseBody setPathMappingItems(java.util.List<DescribePolarFsMappingResponseBodyPathMappingItems> pathMappingItems) {
        this.pathMappingItems = pathMappingItems;
        return this;
    }
    public java.util.List<DescribePolarFsMappingResponseBodyPathMappingItems> getPathMappingItems() {
        return this.pathMappingItems;
    }

    public DescribePolarFsMappingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolarFsMappingResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribePolarFsMappingResponseBodyPathMappingItems extends TeaModel {
        /**
         * <p>The storage bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-xxx.oss-[regionId]-internal.aliyuncs.com</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The AccessKey ID of the storage bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("BucketAccessKeyId")
        public String bucketAccessKeyId;

        /**
         * <p>The mapping path.</p>
         * 
         * <strong>example:</strong>
         * <p>/test</p>
         */
        @NameInMap("Path")
        public String path;

        public static DescribePolarFsMappingResponseBodyPathMappingItems build(java.util.Map<String, ?> map) throws Exception {
            DescribePolarFsMappingResponseBodyPathMappingItems self = new DescribePolarFsMappingResponseBodyPathMappingItems();
            return TeaModel.build(map, self);
        }

        public DescribePolarFsMappingResponseBodyPathMappingItems setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribePolarFsMappingResponseBodyPathMappingItems setBucketAccessKeyId(String bucketAccessKeyId) {
            this.bucketAccessKeyId = bucketAccessKeyId;
            return this;
        }
        public String getBucketAccessKeyId() {
            return this.bucketAccessKeyId;
        }

        public DescribePolarFsMappingResponseBodyPathMappingItems setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

    }

}
