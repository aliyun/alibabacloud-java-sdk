// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponseBody extends TeaModel {
    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // An array that consists of the vulnerabilities.
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems;

    // The number of entries returned per page. Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGroupedVulResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGroupedVulResponseBody self = new DescribeGroupedVulResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGroupedVulResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeGroupedVulResponseBody setGroupedVulItems(java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public DescribeGroupedVulResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGroupedVulResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGroupedVulResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGroupedVulResponseBodyGroupedVulItems extends TeaModel {
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The number of vulnerabilities that have the **high** priority.
        @NameInMap("AsapCount")
        public Integer asapCount;

        // The timestamp when the vulnerability was last detected. Unit: milliseconds.
        @NameInMap("GmtLast")
        public Long gmtLast;

        // The number of handled vulnerabilities.
        @NameInMap("HandledCount")
        public Integer handledCount;

        // The number of vulnerabilities that have the **medium** priority.
        @NameInMap("LaterCount")
        public Integer laterCount;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The number of vulnerabilities that have the **low** priority.
        @NameInMap("NntfCount")
        public Integer nntfCount;

        // The tag that is added to the vulnerability. Valid values:
        // 
        // *   Restart required
        // *   Remote exploitation
        // *   Exploit exists
        // *   Exploitable
        // *   Privilege escalation
        // *   Code execution
        @NameInMap("Tags")
        public String tags;

        // The total number of fixed vulnerabilities.
        @NameInMap("TotalFixCount")
        public Long totalFixCount;

        // The type of the vulnerability. Valid values:
        // 
        // *   **cve**: Linux software vulnerability
        // *   **sys**: Windows system vulnerability
        // *   **cms**: Web-CMS vulnerability
        // *   **app**: application vulnerability
        // *   **emg**: urgent vulnerability
        // *   **sca**: vulnerability that is detected based on software component analysis
        @NameInMap("Type")
        public String type;

        public static DescribeGroupedVulResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeGroupedVulResponseBodyGroupedVulItems self = new DescribeGroupedVulResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setGmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }
        public Long getGmtLast() {
            return this.gmtLast;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setHandledCount(Integer handledCount) {
            this.handledCount = handledCount;
            return this;
        }
        public Integer getHandledCount() {
            return this.handledCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setTotalFixCount(Long totalFixCount) {
            this.totalFixCount = totalFixCount;
            return this;
        }
        public Long getTotalFixCount() {
            return this.totalFixCount;
        }

        public DescribeGroupedVulResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
