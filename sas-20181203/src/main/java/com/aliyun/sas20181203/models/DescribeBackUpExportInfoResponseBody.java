// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackUpExportInfoResponseBody extends TeaModel {
    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public java.util.List<DescribeBackUpExportInfoResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeBackUpExportInfoResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackUpExportInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackUpExportInfoResponseBody self = new DescribeBackUpExportInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackUpExportInfoResponseBody setData(java.util.List<DescribeBackUpExportInfoResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeBackUpExportInfoResponseBodyData> getData() {
        return this.data;
    }

    public DescribeBackUpExportInfoResponseBody setPageInfo(DescribeBackUpExportInfoResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBackUpExportInfoResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBackUpExportInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBackUpExportInfoResponseBodyData extends TeaModel {
        /**
         * <p>The number of exported entries.</p>
         */
        @NameInMap("CurrentCount")
        public Integer currentCount;

        /**
         * <p>The name of the file.</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The time when the export task was created.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the export task.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The URL at which you can download the archived information.</p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The error message that is returned when the export task fails.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The progress percentage of the export task.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The status of the export task. Valid values:</p>
         * <br>
         * <p>*   **init**: The task is being initialized.</p>
         * <p>*   **exporting**: The task is in progress.</p>
         * <p>*   **success**: The task is complete.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The total number of entries in the file.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBackUpExportInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackUpExportInfoResponseBodyData self = new DescribeBackUpExportInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeBackUpExportInfoResponseBodyData setCurrentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }
        public Integer getCurrentCount() {
            return this.currentCount;
        }

        public DescribeBackUpExportInfoResponseBodyData setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribeBackUpExportInfoResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeBackUpExportInfoResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeBackUpExportInfoResponseBodyData setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public DescribeBackUpExportInfoResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeBackUpExportInfoResponseBodyData setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeBackUpExportInfoResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeBackUpExportInfoResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeBackUpExportInfoResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the returned page.</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBackUpExportInfoResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBackUpExportInfoResponseBodyPageInfo self = new DescribeBackUpExportInfoResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBackUpExportInfoResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBackUpExportInfoResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBackUpExportInfoResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBackUpExportInfoResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
