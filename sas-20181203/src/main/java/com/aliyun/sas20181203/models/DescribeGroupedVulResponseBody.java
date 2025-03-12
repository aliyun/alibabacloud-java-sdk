// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGroupedVulResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The information about the vulnerability.</p>
     */
    @NameInMap("GroupedVulItems")
    public java.util.List<DescribeGroupedVulResponseBodyGroupedVulItems> groupedVulItems;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
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
     * <p>9BFA6D78-07EA-5C0A-9358-E4434573507B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The alias of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2017:0184-Important: mysql security update</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The number of vulnerabilities that have the <strong>high</strong> priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AsapCount")
        public Integer asapCount;

        /**
         * <p>The timestamp when the vulnerability was first detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639371046000</p>
         */
        @NameInMap("GmtFirst")
        public Long gmtFirst;

        /**
         * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1639371446000</p>
         */
        @NameInMap("GmtLast")
        public Long gmtLast;

        /**
         * <p>The number of handled vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HandledCount")
        public Integer handledCount;

        /**
         * <p>The language type associated with the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>java</strong></li>
         * <li><strong>php</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is valid only for a vulnerability of the sca type.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>java</p>
         */
        @NameInMap("LanguageType")
        public String languageType;

        /**
         * <p>The number of vulnerabilities that have the <strong>medium</strong> priority.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LaterCount")
        public Integer laterCount;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20170184</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The number of vulnerabilities that have the <strong>low</strong> priority.</p>
         * 
         * <strong>example:</strong>
         * <p>59</p>
         */
        @NameInMap("NntfCount")
        public Integer nntfCount;

        /**
         * <p>Indicates whether the application protection feature is supported. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not supported</li>
         * <li><strong>1</strong>: supported</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is not returned, the application protection feature is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RaspDefend")
        public Integer raspDefend;

        /**
         * <p>The IDs of the common vulnerabilities and exposures (CVEs) that are related to the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2023-24881,CVE-2023-24898</p>
         */
        @NameInMap("Related")
        public String related;

        /**
         * <p>The tag of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>Restart required</strong></li>
         * <li><strong>Remote utilization</strong></li>
         * <li><strong>EXP exists</strong></li>
         * <li><strong>Available</strong></li>
         * <li><strong>Elevation of Privilege</strong></li>
         * <li><strong>Code Execution</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Code Execution</p>
         */
        @NameInMap("Tags")
        public String tags;

        /**
         * <p>The total number of fixed vulnerabilities.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalFixCount")
        public Long totalFixCount;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability</li>
         * <li><strong>sys</strong>: Windows system vulnerability</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability</li>
         * <li><strong>app</strong>: application vulnerability</li>
         * <li><strong>emg</strong>: urgent vulnerability</li>
         * <li><strong>sca</strong>: vulnerability that is detected by software component analysis</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
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

        public DescribeGroupedVulResponseBodyGroupedVulItems setGmtFirst(Long gmtFirst) {
            this.gmtFirst = gmtFirst;
            return this;
        }
        public Long getGmtFirst() {
            return this.gmtFirst;
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

        public DescribeGroupedVulResponseBodyGroupedVulItems setLanguageType(String languageType) {
            this.languageType = languageType;
            return this;
        }
        public String getLanguageType() {
            return this.languageType;
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

        public DescribeGroupedVulResponseBodyGroupedVulItems setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
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
