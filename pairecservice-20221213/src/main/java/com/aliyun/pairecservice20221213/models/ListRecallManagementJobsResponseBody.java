// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ListRecallManagementJobsResponseBody extends TeaModel {
    /**
     * <p>Reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Reserved.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>A list of synchronization jobs.</p>
     */
    @NameInMap("RecallManagementJobs")
    public java.util.List<ListRecallManagementJobsResponseBodyRecallManagementJobs> recallManagementJobs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total count of synchronization jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListRecallManagementJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRecallManagementJobsResponseBody self = new ListRecallManagementJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRecallManagementJobsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListRecallManagementJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListRecallManagementJobsResponseBody setRecallManagementJobs(java.util.List<ListRecallManagementJobsResponseBodyRecallManagementJobs> recallManagementJobs) {
        this.recallManagementJobs = recallManagementJobs;
        return this;
    }
    public java.util.List<ListRecallManagementJobsResponseBodyRecallManagementJobs> getRecallManagementJobs() {
        return this.recallManagementJobs;
    }

    public ListRecallManagementJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRecallManagementJobsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo extends TeaModel {
        /**
         * <p>The data version.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20250701</p>
         */
        @NameInMap("DataVersion")
        public String dataVersion;

        /**
         * <p>The table version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RecallManagementTableVersionId")
        public String recallManagementTableVersionId;

        /**
         * <p>The source table data size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceTableDataSize")
        public String sourceTableDataSize;

        /**
         * <p>The source table row count.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceTableRowCount")
        public String sourceTableRowCount;

        public static ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo self = new ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo();
            return TeaModel.build(map, self);
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo setDataVersion(String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public String getDataVersion() {
            return this.dataVersion;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo setRecallManagementTableVersionId(String recallManagementTableVersionId) {
            this.recallManagementTableVersionId = recallManagementTableVersionId;
            return this;
        }
        public String getRecallManagementTableVersionId() {
            return this.recallManagementTableVersionId;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo setSourceTableDataSize(String sourceTableDataSize) {
            this.sourceTableDataSize = sourceTableDataSize;
            return this;
        }
        public String getSourceTableDataSize() {
            return this.sourceTableDataSize;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo setSourceTableRowCount(String sourceTableRowCount) {
            this.sourceTableRowCount = sourceTableRowCount;
            return this;
        }
        public String getSourceTableRowCount() {
            return this.sourceTableRowCount;
        }

    }

    public static class ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo extends TeaModel {
        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20250701</p>
         */
        @NameInMap("DataVersion")
        public String dataVersion;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("RecallManagementTableVersionId")
        public String recallManagementTableVersionId;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("SourceTableDataSize")
        public String sourceTableDataSize;

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SourceTableRowCount")
        public String sourceTableRowCount;

        public static ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo build(java.util.Map<String, ?> map) throws Exception {
            ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo self = new ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo();
            return TeaModel.build(map, self);
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo setDataVersion(String dataVersion) {
            this.dataVersion = dataVersion;
            return this;
        }
        public String getDataVersion() {
            return this.dataVersion;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo setRecallManagementTableVersionId(String recallManagementTableVersionId) {
            this.recallManagementTableVersionId = recallManagementTableVersionId;
            return this;
        }
        public String getRecallManagementTableVersionId() {
            return this.recallManagementTableVersionId;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo setSourceTableDataSize(String sourceTableDataSize) {
            this.sourceTableDataSize = sourceTableDataSize;
            return this;
        }
        public String getSourceTableDataSize() {
            return this.sourceTableDataSize;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo setSourceTableRowCount(String sourceTableRowCount) {
            this.sourceTableRowCount = sourceTableRowCount;
            return this;
        }
        public String getSourceTableRowCount() {
            return this.sourceTableRowCount;
        }

    }

    public static class ListRecallManagementJobsResponseBodyRecallManagementJobs extends TeaModel {
        /**
         * <p>The end time of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-28T10:24Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The synchronization job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RecallManagementJobId")
        public String recallManagementJobId;

        /**
         * <p>Information about the recall management table.</p>
         */
        @NameInMap("RecallManagementTableInfo")
        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo recallManagementTableInfo;

        /**
         * <p>This parameter is deprecated.</p>
         */
        @NameInMap("RecallManagerTableInfo")
        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo recallManagerTableInfo;

        /**
         * <p>The start time of the synchronization job.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-01-28T10:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The status of the synchronization job. Valid values: <code>Init</code> (initializing), <code>Running</code> (running), <code>Success</code> (succeeded), and <code>Failed</code> (failed).</p>
         * 
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        public static ListRecallManagementJobsResponseBodyRecallManagementJobs build(java.util.Map<String, ?> map) throws Exception {
            ListRecallManagementJobsResponseBodyRecallManagementJobs self = new ListRecallManagementJobsResponseBodyRecallManagementJobs();
            return TeaModel.build(map, self);
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobs setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobs setRecallManagementJobId(String recallManagementJobId) {
            this.recallManagementJobId = recallManagementJobId;
            return this;
        }
        public String getRecallManagementJobId() {
            return this.recallManagementJobId;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobs setRecallManagementTableInfo(ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo recallManagementTableInfo) {
            this.recallManagementTableInfo = recallManagementTableInfo;
            return this;
        }
        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagementTableInfo getRecallManagementTableInfo() {
            return this.recallManagementTableInfo;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobs setRecallManagerTableInfo(ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo recallManagerTableInfo) {
            this.recallManagerTableInfo = recallManagerTableInfo;
            return this;
        }
        public ListRecallManagementJobsResponseBodyRecallManagementJobsRecallManagerTableInfo getRecallManagerTableInfo() {
            return this.recallManagerTableInfo;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobs setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListRecallManagementJobsResponseBodyRecallManagementJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
