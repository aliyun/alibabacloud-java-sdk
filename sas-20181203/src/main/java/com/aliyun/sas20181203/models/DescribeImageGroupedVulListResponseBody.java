// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageGroupedVulListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the image vulnerabilities.</p>
     */
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeImageGroupedVulListResponseBodyGroupedVulItems> groupedVulItems;

    /**
     * <p>The number of entries returned per page. Default value: <strong>20</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5E244439-UJND-8BF7-26F36E21B9AA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of image system vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>21</p>
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
         * 
         * <strong>example:</strong>
         * <p>RHSA-2017:3075-Important: wget security update</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The number of vulnerabilities that have the high priority.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <p>Indicates whether the vulnerability can be fixed in the Security Center console. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("CanFix")
        public String canFix;

        /**
         * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1611201274000</p>
         */
        @NameInMap("GmtLast")
        public Long gmtLast;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1611201274000</p>
         */
        @NameInMap("LastScanTime")
        public Long lastScanTime;

        /**
         * <p>The number of vulnerabilities that have the medium priority.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>debian:9:CVE-2019-3858</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of vulnerabilities that have the low priority.</p>
         * 
         * <strong>example:</strong>
         * <p>29</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unhandled</li>
         * <li><strong>1</strong>: handled</li>
         * <li><strong>2</strong>: verifying</li>
         * <li><strong>3</strong>: added to the whitelist</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag of the vulnerability. Valid values:</p>
         * <ul>
         * <li>Restart required</li>
         * <li>Remote exploitation</li>
         * <li>Exploit exists</li>
         * <li>Exploitable</li>
         * <li>Privilege escalation</li>
         * <li>Code execution</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EXP exists</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: image system vulnerability</li>
         * <li><strong>sca</strong>: image application vulnerability</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
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
