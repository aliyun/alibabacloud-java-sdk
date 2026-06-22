// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulWhitelistResponseBody extends TeaModel {
    /**
     * <p>The number of entries on the current page in paging.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the current page in paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page in paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>74F97EF7-B543-43FD-A4E9-18456731F9C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The list of whitelisted vulnerabilities.</p>
     */
    @NameInMap("VulWhitelists")
    public java.util.List<DescribeVulWhitelistResponseBodyVulWhitelists> vulWhitelists;

    public static DescribeVulWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulWhitelistResponseBody self = new DescribeVulWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulWhitelistResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeVulWhitelistResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulWhitelistResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulWhitelistResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVulWhitelistResponseBody setVulWhitelists(java.util.List<DescribeVulWhitelistResponseBodyVulWhitelists> vulWhitelists) {
        this.vulWhitelists = vulWhitelists;
        return this;
    }
    public java.util.List<DescribeVulWhitelistResponseBodyVulWhitelists> getVulWhitelists() {
        return this.vulWhitelists;
    }

    public static class DescribeVulWhitelistResponseBodyVulWhitelists extends TeaModel {
        /**
         * <p>The alias of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2017:3263: curl security update</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1275</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20173263</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The reason for adding the vulnerability to the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>ignore</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The scope of the rule. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li><p><strong>type</strong>: The applicable type. Valid values:</p>
         * <ul>
         * <li><strong>Uuid</strong>: host</li>
         * <li><strong>GroupId</strong>: group</li>
         * </ul>
         * </li>
         * <li><p><strong>groupIds</strong>: The IDs of the applicable asset groups.</p>
         * </li>
         * <li><p><strong>uuids</strong>: The UUIDs of the applicable assets.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>If this value is empty, the rule applies to all assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;GroupId&quot;,&quot;groupIds&quot;:[916****],&quot;uuids&quot;:[]}</p>
         */
        @NameInMap("TargetInfo")
        public String targetInfo;

        /**
         * <p>The vulnerability type.</p>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The vulnerability information. The value is in JSON format.</p>
         * <ul>
         * <li><strong>name</strong>: The name of the vulnerability.</li>
         * <li><strong>type</strong>: The type of the vulnerability.</li>
         * <li><strong>aliasName</strong>: The alias of the vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{
         * &quot;name&quot;:&quot;oval:com.redhat.rhsa:def:20173263&quot;,
         * &quot;type&quot;:&quot;cve&quot;,
         * &quot;aliasName&quot;:&quot;RHSA-2017:3263: curl security update&quot;
         * }]</p>
         */
        @NameInMap("Whitelist")
        public String whitelist;

        public static DescribeVulWhitelistResponseBodyVulWhitelists build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulWhitelistResponseBodyVulWhitelists self = new DescribeVulWhitelistResponseBodyVulWhitelists();
            return TeaModel.build(map, self);
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setTargetInfo(String targetInfo) {
            this.targetInfo = targetInfo;
            return this;
        }
        public String getTargetInfo() {
            return this.targetInfo;
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setWhitelist(String whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public String getWhitelist() {
            return this.whitelist;
        }

    }

}
