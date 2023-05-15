// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponseBody extends TeaModel {
    /**
     * <p>The number of entries to return on each page. Default value: 10.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems;

    /**
     * <p>The tag that is used to search for the vulnerabilities. Valid values:</p>
     * <br>
     * <p>*   Restart required</p>
     * <p>*   Remote exploitation</p>
     * <p>*   Exploit exists</p>
     * <p>*   Exploitable</p>
     * <p>*   Privilege escalation</p>
     * <p>*   Code execution</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the asset group.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The types of the vulnerabilities.</p>
     * <br>
     * <p>> This parameter is valid only for application vulnerabilities and vulnerabilities that are detected based on software component analysis.</p>
     */
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
        /**
         * <p>The number of handled vulnerabilities.</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The tag that is added to the vulnerability. Valid values:</p>
         * <br>
         * <p>*   Restart required</p>
         * <p>*   Remote exploitation</p>
         * <p>*   Exploit exists</p>
         * <p>*   Exploitable</p>
         * <p>*   Privilege escalation</p>
         * <p>*   Code execution</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <p>An array that consists of the details about the vulnerability.</p>
         */
        @NameInMap("GmtLast")
        public Long gmtLast;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("HandledCount")
        public Integer handledCount;

        /**
         * <p>The number of vulnerabilities that have the **low** priority.</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        /**
         * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <p>The number of entries returned per page. Default value: 10.</p>
         */
        @NameInMap("RaspDefend")
        public Integer raspDefend;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <br>
         * <p>*   **cve**: Linux software vulnerability</p>
         * <p>*   **sys**: Windows system vulnerability</p>
         * <p>*   **cms**: Web-CMS vulnerability</p>
         * <p>*   **app**: application vulnerability</p>
         * <p>*   **emg**: urgent vulnerability</p>
         * <p>*   **sca**: vulnerability that is detected based on software component analysis</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>gmtLast</p>
         */
        @NameInMap("TotalFixCount")
        public Long totalFixCount;

        /**
         * <p>The page number of the returned page.</p>
         */
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

        public DescribeGroupedVulResponseBodyGroupedVulItems setRaspDefend(Integer raspDefend) {
            this.raspDefend = raspDefend;
            return this;
        }
        public Integer getRaspDefend() {
            return this.raspDefend;
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
