// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybookReleasesResponseBody extends TeaModel {
    @NameInMap("Page")
    public DescribePlaybookReleasesResponseBodyPage page;

    @NameInMap("Records")
    public java.util.List<DescribePlaybookReleasesResponseBodyRecords> records;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybookReleasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybookReleasesResponseBody self = new DescribePlaybookReleasesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybookReleasesResponseBody setPage(DescribePlaybookReleasesResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribePlaybookReleasesResponseBodyPage getPage() {
        return this.page;
    }

    public DescribePlaybookReleasesResponseBody setRecords(java.util.List<DescribePlaybookReleasesResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<DescribePlaybookReleasesResponseBodyRecords> getRecords() {
        return this.records;
    }

    public DescribePlaybookReleasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybookReleasesResponseBodyPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePlaybookReleasesResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookReleasesResponseBodyPage self = new DescribePlaybookReleasesResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookReleasesResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribePlaybookReleasesResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePlaybookReleasesResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePlaybookReleasesResponseBodyRecords extends TeaModel {
        @NameInMap("Creator")
        public String creator;

        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("TaskflowMd5")
        public String taskflowMd5;

        public static DescribePlaybookReleasesResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybookReleasesResponseBodyRecords self = new DescribePlaybookReleasesResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public DescribePlaybookReleasesResponseBodyRecords setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public DescribePlaybookReleasesResponseBodyRecords setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePlaybookReleasesResponseBodyRecords setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePlaybookReleasesResponseBodyRecords setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribePlaybookReleasesResponseBodyRecords setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribePlaybookReleasesResponseBodyRecords setTaskflowMd5(String taskflowMd5) {
            this.taskflowMd5 = taskflowMd5;
            return this;
        }
        public String getTaskflowMd5() {
            return this.taskflowMd5;
        }

    }

}
