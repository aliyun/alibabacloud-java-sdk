// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBackUpExportInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeBackUpExportInfoResponseBodyData> data;

    @NameInMap("PageInfo")
    public DescribeBackUpExportInfoResponseBodyPageInfo pageInfo;

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
        @NameInMap("CurrentCount")
        public Integer currentCount;

        @NameInMap("FileName")
        public String fileName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Link")
        public String link;

        @NameInMap("Message")
        public String message;

        @NameInMap("Progress")
        public Integer progress;

        @NameInMap("Status")
        public String status;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
