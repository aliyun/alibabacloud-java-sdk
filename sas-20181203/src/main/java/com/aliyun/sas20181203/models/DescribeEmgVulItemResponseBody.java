// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeEmgVulItemResponseBody extends TeaModel {
    // The page number of the returned page. Pages start from page **1**. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // An array that consists of the urgent vulnerabilities returned.
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> groupedVulItems;

    // The number of entries returned per page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the urgent vulnerabilities returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeEmgVulItemResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEmgVulItemResponseBody self = new DescribeEmgVulItemResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEmgVulItemResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEmgVulItemResponseBody setGroupedVulItems(java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeEmgVulItemResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public DescribeEmgVulItemResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeEmgVulItemResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEmgVulItemResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEmgVulItemResponseBodyGroupedVulItems extends TeaModel {
        // The name of the urgent vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The check method.
        @NameInMap("CheckType")
        public Integer checkType;

        // The timestamp when the urgent vulnerability was last detected. Unit: milliseconds.
        @NameInMap("GmtLastCheck")
        public Long gmtLastCheck;

        // The timestamp when the vulnerability was disclosed. Unit: milliseconds.
        @NameInMap("GmtPublish")
        public Long gmtPublish;

        // The name of the detection rule.
        @NameInMap("Name")
        public String name;

        // The number of unhandled urgent vulnerabilities.
        @NameInMap("PendingCount")
        public Integer pendingCount;

        // The progress of the urgent vulnerability detection task. Valid values: 0 to 100.
        // 
        // >  This parameter is returned only when an urgent vulnerability is being detected.
        @NameInMap("Progress")
        public Integer progress;

        // The detection status of the urgent vulnerability. Valid values:
        // 
        // *   **10**: The urgent vulnerability is not detected.
        // *   **20**: The urgent vulnerability is being detected.
        // *   **30**: The urgent vulnerability detection is complete.
        @NameInMap("Status")
        public Integer status;

        // The method that is used to detect the urgent vulnerability. Valid values:
        // 
        // *   **python**: The Version method is used. Security Center checks the software versions of your server to check whether disclosed vulnerabilities exist on your server.
        // *   **scan**: The Network Scan method is used. Security Center analyzes the access traffic to your server over the Internet to check whether vulnerabilities exist on your server.
        @NameInMap("Type")
        public String type;

        public static DescribeEmgVulItemResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeEmgVulItemResponseBodyGroupedVulItems self = new DescribeEmgVulItemResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setCheckType(Integer checkType) {
            this.checkType = checkType;
            return this;
        }
        public Integer getCheckType() {
            return this.checkType;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setGmtLastCheck(Long gmtLastCheck) {
            this.gmtLastCheck = gmtLastCheck;
            return this;
        }
        public Long getGmtLastCheck() {
            return this.gmtLastCheck;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setGmtPublish(Long gmtPublish) {
            this.gmtPublish = gmtPublish;
            return this;
        }
        public Long getGmtPublish() {
            return this.gmtPublish;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setPendingCount(Integer pendingCount) {
            this.pendingCount = pendingCount;
            return this;
        }
        public Integer getPendingCount() {
            return this.pendingCount;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeEmgVulItemResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
