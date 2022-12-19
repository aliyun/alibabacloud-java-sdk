// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckWarningsResponseBody extends TeaModel {
    // An array that consists of the check items.
    @NameInMap("CheckWarnings")
    public java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> checkWarnings;

    // The number of entries returned on the current page.
    @NameInMap("Count")
    public Integer count;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page. Default value: **20**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeCheckWarningsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckWarningsResponseBody self = new DescribeCheckWarningsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCheckWarningsResponseBody setCheckWarnings(java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> checkWarnings) {
        this.checkWarnings = checkWarnings;
        return this;
    }
    public java.util.List<DescribeCheckWarningsResponseBodyCheckWarnings> getCheckWarnings() {
        return this.checkWarnings;
    }

    public DescribeCheckWarningsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
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

    public static class DescribeCheckWarningsResponseBodyCheckWarnings extends TeaModel {
        // The ID of the check item.
        @NameInMap("CheckId")
        public Long checkId;

        // The ID of the alert that is triggered by the check item.
        @NameInMap("CheckWarningId")
        public Long checkWarningId;

        // The fixing status of the check item. Valid values:
        // 
        // *   **0**: disabled
        // *   **1**: enabled
        @NameInMap("FixStatus")
        public Integer fixStatus;

        // The name of the check item.
        @NameInMap("Item")
        public String item;

        // The risk level of the risk item. Valid values:
        // 
        // *   **high**
        // *   **medium**
        // *   **low**
        @NameInMap("Level")
        public String level;

        // The remarks.
        @NameInMap("Reason")
        public String reason;

        // The status of the check item. Valid values:
        // 
        // *   **1**: failed
        // *   **2**: verifying
        // *   **3**: passed
        // *   **5**: expired
        // *   **6**: ignored
        @NameInMap("Status")
        public Integer status;

        // The type of the check item.
        @NameInMap("Type")
        public String type;

        // The UUID of the server on which the baseline check is performed.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeCheckWarningsResponseBodyCheckWarnings build(java.util.Map<String, ?> map) throws Exception {
            DescribeCheckWarningsResponseBodyCheckWarnings self = new DescribeCheckWarningsResponseBodyCheckWarnings();
            return TeaModel.build(map, self);
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setCheckId(Long checkId) {
            this.checkId = checkId;
            return this;
        }
        public Long getCheckId() {
            return this.checkId;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setCheckWarningId(Long checkWarningId) {
            this.checkWarningId = checkWarningId;
            return this;
        }
        public Long getCheckWarningId() {
            return this.checkWarningId;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setFixStatus(Integer fixStatus) {
            this.fixStatus = fixStatus;
            return this;
        }
        public Integer getFixStatus() {
            return this.fixStatus;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setItem(String item) {
            this.item = item;
            return this;
        }
        public String getItem() {
            return this.item;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeCheckWarningsResponseBodyCheckWarnings setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
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

    }

}
