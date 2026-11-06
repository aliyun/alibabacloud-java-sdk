// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDataProcessJobsResponseBody extends TeaModel {
    /**
     * <p>The list of data processing jobs.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataProcessJobsResponseBodyItems> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The number of jobs returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2921D843-433A-5FB3-A03B-4EC093B219F8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of jobs that match the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeDataProcessJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataProcessJobsResponseBody self = new DescribeDataProcessJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataProcessJobsResponseBody setItems(java.util.List<DescribeDataProcessJobsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataProcessJobsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataProcessJobsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDataProcessJobsResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeDataProcessJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataProcessJobsResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeDataProcessJobsResponseBodyItems extends TeaModel {
        /**
         * <p>The time when the job was created, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-01T00:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the data processing job.</p>
         * 
         * <strong>example:</strong>
         * <p>Image data processing job</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of the destination PolarDB cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-test123456</p>
         */
        @NameInMap("DestinationId")
        public String destinationId;

        /**
         * <p>The name of the destination database.</p>
         * 
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DestinationPath")
        public String destinationPath;

        /**
         * <p>The type of the destination. Currently, only PolarDB is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarDB</p>
         */
        @NameInMap("DestinationType")
        public String destinationType;

        /**
         * <p>The ID of the data processing job.</p>
         * 
         * <strong>example:</strong>
         * <p>job-123456</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The data processing mode. Valid values: Full, Incremental, and Both.</p>
         * 
         * <strong>example:</strong>
         * <p>Full</p>
         */
        @NameInMap("ProcessingMode")
        public String processingMode;

        /**
         * <p>The ID of the region where the data processing job resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the source PolarFS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-123456</p>
         */
        @NameInMap("SourceId")
        public String sourceId;

        /**
         * <p>The source data path in PolarFS.</p>
         * 
         * <strong>example:</strong>
         * <p>/data/input</p>
         */
        @NameInMap("SourcePath")
        public String sourcePath;

        /**
         * <p>The type of the data source. Currently, only PolarFS is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>PolarFS</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The status of the data processing job.</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the template used by the job.</p>
         * 
         * <strong>example:</strong>
         * <p>tpl-123456</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        public static DescribeDataProcessJobsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataProcessJobsResponseBodyItems self = new DescribeDataProcessJobsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataProcessJobsResponseBodyItems setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeDataProcessJobsResponseBodyItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeDataProcessJobsResponseBodyItems setDestinationId(String destinationId) {
            this.destinationId = destinationId;
            return this;
        }
        public String getDestinationId() {
            return this.destinationId;
        }

        public DescribeDataProcessJobsResponseBodyItems setDestinationPath(String destinationPath) {
            this.destinationPath = destinationPath;
            return this;
        }
        public String getDestinationPath() {
            return this.destinationPath;
        }

        public DescribeDataProcessJobsResponseBodyItems setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public DescribeDataProcessJobsResponseBodyItems setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeDataProcessJobsResponseBodyItems setProcessingMode(String processingMode) {
            this.processingMode = processingMode;
            return this;
        }
        public String getProcessingMode() {
            return this.processingMode;
        }

        public DescribeDataProcessJobsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataProcessJobsResponseBodyItems setSourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public String getSourceId() {
            return this.sourceId;
        }

        public DescribeDataProcessJobsResponseBodyItems setSourcePath(String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }
        public String getSourcePath() {
            return this.sourcePath;
        }

        public DescribeDataProcessJobsResponseBodyItems setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeDataProcessJobsResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDataProcessJobsResponseBodyItems setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

    }

}
