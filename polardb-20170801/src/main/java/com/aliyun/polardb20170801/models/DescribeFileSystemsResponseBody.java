// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeFileSystemsResponseBody extends TeaModel {
    /**
     * <p>The bucket ID.</p>
     * 
     * <strong>example:</strong>
     * <p>bucket-456</p>
     */
    @NameInMap("BucketId")
    public String bucketId;

    /**
     * <p>The total number of files that match the conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("FileCount")
    public Integer fileCount;

    /**
     * <p>The file system ID.</p>
     * 
     * <strong>example:</strong>
     * <p>fs-123</p>
     */
    @NameInMap("FileSystemId")
    public String fileSystemId;

    /**
     * <p>The list of files.</p>
     */
    @NameInMap("FileSystems")
    public java.util.List<DescribeFileSystemsResponseBodyFileSystems> fileSystems;

    /**
     * <p>Indicates whether the results are truncated. If true, you can use NextToken to retrieve subsequent results.</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The maximum number of records returned for this request.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next page.</p>
     * 
     * <strong>example:</strong>
     * <p>nextToken456</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFileSystemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFileSystemsResponseBody self = new DescribeFileSystemsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFileSystemsResponseBody setBucketId(String bucketId) {
        this.bucketId = bucketId;
        return this;
    }
    public String getBucketId() {
        return this.bucketId;
    }

    public DescribeFileSystemsResponseBody setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public Integer getFileCount() {
        return this.fileCount;
    }

    public DescribeFileSystemsResponseBody setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
        return this;
    }
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    public DescribeFileSystemsResponseBody setFileSystems(java.util.List<DescribeFileSystemsResponseBodyFileSystems> fileSystems) {
        this.fileSystems = fileSystems;
        return this;
    }
    public java.util.List<DescribeFileSystemsResponseBodyFileSystems> getFileSystems() {
        return this.fileSystems;
    }

    public DescribeFileSystemsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public DescribeFileSystemsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeFileSystemsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeFileSystemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFileSystemsResponseBodyFileSystems extends TeaModel {
        /**
         * <p>The file capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>100GB</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>test.txt</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The last modified time of the file, in RFC 3339 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-25T09:37:10Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The storage type of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>SSD</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        public static DescribeFileSystemsResponseBodyFileSystems build(java.util.Map<String, ?> map) throws Exception {
            DescribeFileSystemsResponseBodyFileSystems self = new DescribeFileSystemsResponseBodyFileSystems();
            return TeaModel.build(map, self);
        }

        public DescribeFileSystemsResponseBodyFileSystems setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public DescribeFileSystemsResponseBodyFileSystems setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeFileSystemsResponseBodyFileSystems setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public DescribeFileSystemsResponseBodyFileSystems setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

    }

}
