// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("CheckWarnings")
    public java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> checkWarnings;

    public static DescribeCheckWarningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningsResponseBody self = new DescribeCheckWarningsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeCheckWarningsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCheckWarningsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCheckWarningsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeCheckWarningsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeCheckWarningsResponseBody setCheckWarnings(java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> checkWarnings) {
        this.checkWarnings = checkWarnings;
        return this;
    }
    public java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> getCheckWarnings() {
        return this.checkWarnings;
    }

    public static class DescribeCheckWarningsResponseBodyCheckWarnings extends TeaModel {
        @NameInMap("Status")
        public Integer status;

        @NameInMap("CheckWarningId")
        public Long checkWarningId;

        @NameInMap("Type")
        public String type;

        @NameInMap("Uuid")
        public String uuid;

        @NameInMap("Item")
        public String item;

        @NameInMap("CheckId")
        public Long checkId;

        @NameInMap("Level")
        public String level;

        public static DescribeCheckWarningsResponseBodyCheckWarnings build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningsResponseBodyCheckWarnings self = new DescribeCheckWarningsResponseBodyCheckWarnings();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setCheckWarningId(Long checkWarningId) {
            this.checkWarningId = checkWarningId;
            return this;
        }
        public Long getCheckWarningId() {
            return this.checkWarningId;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

}
