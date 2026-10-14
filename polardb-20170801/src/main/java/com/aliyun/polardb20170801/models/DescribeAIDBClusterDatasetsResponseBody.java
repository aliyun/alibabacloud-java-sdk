// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeAIDBClusterDatasetsResponseBody extends TeaModel {
    /**
     * <p>The ContinuationToken element is included in the response if the ContinuationToken parameter is specified in the request.</p>
     * 
     * <strong>example:</strong>
     * <p>EFSDF-DF-***</p>
     */
    @NameInMap("ContinuationToken")
    public String continuationToken;

    /**
     * <p>The instance ID of the dataset management service.</p>
     * 
     * <strong>example:</strong>
     * <p>pcs-2zeei***</p>
     */
    @NameInMap("DataServiceId")
    public String dataServiceId;

    /**
     * <p>The dataset ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pds-2ze88***</p>
     */
    @NameInMap("DatasetId")
    public String datasetId;

    /**
     * <p>The training mode of the dataset. Valid values:</p>
     * <ul>
     * <li><strong>sft</strong>: supervised fine-tuning.</li>
     * <li><strong>grpo</strong>: reinforcement learning.</li>
     * <li><strong>text</strong>: text generation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>stf</p>
     */
    @NameInMap("DatasetMode")
    public String datasetMode;

    /**
     * <p>The type of the dataset. Valid values:</p>
     * <ul>
     * <li><strong>train</strong>: training dataset.</li>
     * <li><strong>eval</strong>: evaluation dataset.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>train</p>
     */
    @NameInMap("DatasetType")
    public String datasetType;

    /**
     * <p>The datasets.</p>
     */
    @NameInMap("Datasets")
    public java.util.List<DescribeAIDBClusterDatasetsResponseBodyDatasets> datasets;

    /**
     * <p>The total number of files.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("FileCount")
    public String fileCount;

    /**
     * <p>Indicates whether more datasets exist. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: More datasets exist.</li>
     * <li><strong>false</strong>: No more datasets exist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsTruncated")
    public Boolean isTruncated;

    /**
     * <p>The ContinuationToken for the next listing of files.</p>
     * 
     * <strong>example:</strong>
     * <p>EFSDF-DF-***</p>
     */
    @NameInMap("NextContinuationToken")
    public String nextContinuationToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The page size.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The ID of the database management service.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze88***</p>
     */
    @NameInMap("RelativeDBClusterId")
    public String relativeDBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records. This parameter is returned only when you query a list.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalRecords")
    public String totalRecords;

    public static DescribeAIDBClusterDatasetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAIDBClusterDatasetsResponseBody self = new DescribeAIDBClusterDatasetsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAIDBClusterDatasetsResponseBody setContinuationToken(String continuationToken) {
        this.continuationToken = continuationToken;
        return this;
    }
    public String getContinuationToken() {
        return this.continuationToken;
    }

    public DescribeAIDBClusterDatasetsResponseBody setDataServiceId(String dataServiceId) {
        this.dataServiceId = dataServiceId;
        return this;
    }
    public String getDataServiceId() {
        return this.dataServiceId;
    }

    public DescribeAIDBClusterDatasetsResponseBody setDatasetId(String datasetId) {
        this.datasetId = datasetId;
        return this;
    }
    public String getDatasetId() {
        return this.datasetId;
    }

    public DescribeAIDBClusterDatasetsResponseBody setDatasetMode(String datasetMode) {
        this.datasetMode = datasetMode;
        return this;
    }
    public String getDatasetMode() {
        return this.datasetMode;
    }

    public DescribeAIDBClusterDatasetsResponseBody setDatasetType(String datasetType) {
        this.datasetType = datasetType;
        return this;
    }
    public String getDatasetType() {
        return this.datasetType;
    }

    public DescribeAIDBClusterDatasetsResponseBody setDatasets(java.util.List<DescribeAIDBClusterDatasetsResponseBodyDatasets> datasets) {
        this.datasets = datasets;
        return this;
    }
    public java.util.List<DescribeAIDBClusterDatasetsResponseBodyDatasets> getDatasets() {
        return this.datasets;
    }

    public DescribeAIDBClusterDatasetsResponseBody setFileCount(String fileCount) {
        this.fileCount = fileCount;
        return this;
    }
    public String getFileCount() {
        return this.fileCount;
    }

    public DescribeAIDBClusterDatasetsResponseBody setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    public DescribeAIDBClusterDatasetsResponseBody setNextContinuationToken(String nextContinuationToken) {
        this.nextContinuationToken = nextContinuationToken;
        return this;
    }
    public String getNextContinuationToken() {
        return this.nextContinuationToken;
    }

    public DescribeAIDBClusterDatasetsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeAIDBClusterDatasetsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeAIDBClusterDatasetsResponseBody setRelativeDBClusterId(String relativeDBClusterId) {
        this.relativeDBClusterId = relativeDBClusterId;
        return this;
    }
    public String getRelativeDBClusterId() {
        return this.relativeDBClusterId;
    }

    public DescribeAIDBClusterDatasetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAIDBClusterDatasetsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeAIDBClusterDatasetsResponseBody setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }
    public String getTotalRecords() {
        return this.totalRecords;
    }

    public static class DescribeAIDBClusterDatasetsResponseBodyDatasets extends TeaModel {
        /**
         * <p>The bucket to which the dataset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pcs-2ze22***-q7***</p>
         */
        @NameInMap("BucketName")
        public String bucketName;

        /**
         * <p>The file size.</p>
         * 
         * <strong>example:</strong>
         * <p>2845904</p>
         */
        @NameInMap("Capacity")
        public String capacity;

        /**
         * <p>The creation time.</p>
         * <p>The time is in ISO 8601 format in UTC (format: YYYY-MM-DDTHH:mm:ssZ).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-06T06:50:43Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pds-2ze88***</p>
         */
        @NameInMap("DatasetId")
        public String datasetId;

        /**
         * <p>The type of the dataset. Valid values:</p>
         * <ul>
         * <li><strong>train</strong>: training dataset.</li>
         * <li><strong>eval</strong>: evaluation dataset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>train</p>
         */
        @NameInMap("DatasetType")
        public String datasetType;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>train-***.json</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The last modified time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-11-06T06:50:43Z</p>
         */
        @NameInMap("LastModified")
        public String lastModified;

        /**
         * <p>The dataset path.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb_ai/datasets/train/sft/dataset01/train-***.json</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The storage type. Valid values:</p>
         * <ul>
         * <li><strong>Standard</strong>: Standard storage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Standard</p>
         */
        @NameInMap("StorageType")
        public String storageType;

        /**
         * <p>The training mode of the dataset. Valid values:</p>
         * <ul>
         * <li><strong>sft</strong>: supervised fine-tuning.</li>
         * <li><strong>grpo</strong>: reinforcement learning.</li>
         * <li><strong>text</strong>: text generation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>stf</p>
         */
        @NameInMap("TrainMode")
        public String trainMode;

        public static DescribeAIDBClusterDatasetsResponseBodyDatasets build(java.util.Map<String, ?> map) throws Exception {
            DescribeAIDBClusterDatasetsResponseBodyDatasets self = new DescribeAIDBClusterDatasetsResponseBodyDatasets();
            return TeaModel.build(map, self);
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setCapacity(String capacity) {
            this.capacity = capacity;
            return this;
        }
        public String getCapacity() {
            return this.capacity;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setDatasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }
        public String getDatasetId() {
            return this.datasetId;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setDatasetType(String datasetType) {
            this.datasetType = datasetType;
            return this;
        }
        public String getDatasetType() {
            return this.datasetType;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setLastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }
        public String getLastModified() {
            return this.lastModified;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribeAIDBClusterDatasetsResponseBodyDatasets setTrainMode(String trainMode) {
            this.trainMode = trainMode;
            return this;
        }
        public String getTrainMode() {
            return this.trainMode;
        }

    }

}
