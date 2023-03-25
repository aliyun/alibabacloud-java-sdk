// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the image vulnerabilities.</p>
     */
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeImageGroupedVulListResponseBodyGroupedVulItems> groupedVulItems;

    /**
     * <p>The number of entries returned per page. Default value: **20**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image system vulnerabilities.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeImageGroupedVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageGroupedVulListResponseBody self = new DescribeImageGroupedVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageGroupedVulListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeImageGroupedVulListResponseBody setGroupedVulItems(java.util.List<DescribeImageGroupedVulListResponseBodyGroupedVulItems> groupedVulItems) {
        this.groupedVulItems = groupedVulItems;
        return this;
    }
    public java.util.List<DescribeImageGroupedVulListResponseBodyGroupedVulItems> getGroupedVulItems() {
        return this.groupedVulItems;
    }

    public DescribeImageGroupedVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeImageGroupedVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageGroupedVulListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeImageGroupedVulListResponseBodyGroupedVulItems extends TeaModel {
        /**
         * <p>The alias of the vulnerability.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The number of vulnerabilities that have the high priority.</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        @NameInMap("CanFix")
        public String canFix;

        /**
         * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("GmtLast")
        public Long gmtLast;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The number of vulnerabilities that have the medium priority.</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of vulnerabilities that have the low priority.</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **0**: unhandled</p>
         * <p>*   **1**: handled</p>
         * <p>*   **2**: verifying</p>
         * <p>*   **3**: added to the whitelist</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   Restart required</p>
         * <p>*   Remote exploitation</p>
         * <p>*   Exploit exists</p>
         * <p>*   Exploitable</p>
         * <p>*   Privilege escalation</p>
         * <p>*   Code execution</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: image system vulnerability</p>
         * <p>*   **sca**: image application vulnerability</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeImageGroupedVulListResponseBodyGroupedVulItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageGroupedVulListResponseBodyGroupedVulItems self = new DescribeImageGroupedVulListResponseBodyGroupedVulItems();
            return TeaModel.build(map, self);
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setAsapCount(Integer asapCount) {
            this.asapCount = asapCount;
            return this;
        }
        public Integer getAsapCount() {
            return this.asapCount;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setCanFix(String canFix) {
            this.canFix = canFix;
            return this;
        }
        public String getCanFix() {
            return this.canFix;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setGmtLast(Long gmtLast) {
            this.gmtLast = gmtLast;
            return this;
        }
        public Long getGmtLast() {
            return this.gmtLast;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setLastScanTime(Long lastScanTime) {
            this.lastScanTime = lastScanTime;
            return this;
        }
        public Long getLastScanTime() {
            return this.lastScanTime;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setLaterCount(Integer laterCount) {
            this.laterCount = laterCount;
            return this;
        }
        public Integer getLaterCount() {
            return this.laterCount;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setNntfCount(Integer nntfCount) {
            this.nntfCount = nntfCount;
            return this;
        }
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public DescribeImageGroupedVulListResponseBodyGroupedVulItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
