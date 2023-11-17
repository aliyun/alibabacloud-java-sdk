// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sophonsoar20220728.models;

import com.aliyun.tea.*;

public class DescribePlaybooksResponseBody extends TeaModel {
    @NameInMap("Page")
    public DescribePlaybooksResponseBodyPage page;

    @NameInMap("Playbooks")
    public java.util.List<DescribePlaybooksResponseBodyPlaybooks> playbooks;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribePlaybooksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlaybooksResponseBody self = new DescribePlaybooksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlaybooksResponseBody setPage(DescribePlaybooksResponseBodyPage page) {
        this.page = page;
        return this;
    }
    public DescribePlaybooksResponseBodyPage getPage() {
        return this.page;
    }

    public DescribePlaybooksResponseBody setPlaybooks(java.util.List<DescribePlaybooksResponseBodyPlaybooks> playbooks) {
        this.playbooks = playbooks;
        return this;
    }
    public java.util.List<DescribePlaybooksResponseBodyPlaybooks> getPlaybooks() {
        return this.playbooks;
    }

    public DescribePlaybooksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribePlaybooksResponseBodyPage extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribePlaybooksResponseBodyPage build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybooksResponseBodyPage self = new DescribePlaybooksResponseBodyPage();
            return TeaModel.build(map, self);
        }

        public DescribePlaybooksResponseBodyPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribePlaybooksResponseBodyPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribePlaybooksResponseBodyPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribePlaybooksResponseBodyPlaybooks extends TeaModel {
        @NameInMap("Active")
        public Integer active;

        @NameInMap("DisplayName")
        public String displayName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("LastRuntime")
        public Long lastRuntime;

        @NameInMap("OwnType")
        public String ownType;

        @NameInMap("PlaybookUuid")
        public String playbookUuid;

        public static DescribePlaybooksResponseBodyPlaybooks build(java.util.Map<String, ?> map) throws Exception {
            DescribePlaybooksResponseBodyPlaybooks self = new DescribePlaybooksResponseBodyPlaybooks();
            return TeaModel.build(map, self);
        }

        public DescribePlaybooksResponseBodyPlaybooks setActive(Integer active) {
            this.active = active;
            return this;
        }
        public Integer getActive() {
            return this.active;
        }

        public DescribePlaybooksResponseBodyPlaybooks setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public DescribePlaybooksResponseBodyPlaybooks setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePlaybooksResponseBodyPlaybooks setLastRuntime(Long lastRuntime) {
            this.lastRuntime = lastRuntime;
            return this;
        }
        public Long getLastRuntime() {
            return this.lastRuntime;
        }

        public DescribePlaybooksResponseBodyPlaybooks setOwnType(String ownType) {
            this.ownType = ownType;
            return this;
        }
        public String getOwnType() {
            return this.ownType;
        }

        public DescribePlaybooksResponseBodyPlaybooks setPlaybookUuid(String playbookUuid) {
            this.playbookUuid = playbookUuid;
            return this;
        }
        public String getPlaybookUuid() {
            return this.playbookUuid;
        }

    }

}
