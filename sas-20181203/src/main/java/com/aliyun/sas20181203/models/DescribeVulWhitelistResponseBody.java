// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulWhitelistResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>An array that consists of information about the whitelist of vulnerabilities.</p>
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
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the vulnerability.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The reason why the vulnerability is added to the whitelist.</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The application scope of the rule. The value is a JSON string that contains the following fields:</p>
         * <br>
         * <p>*   **type**: the type of the assets to which the rule is applied. Valid values:</p>
         * <br>
         * <p>    *   **Uuid**: server</p>
         * <p>    *   **GroupId**: server group</p>
         * <br>
         * <p>*   **groupIds**: the ID of the server group</p>
         * <br>
         * <p>*   **uuids**: the UUID of the server</p>
         * <br>
         * <p>> If this field is empty, the rule is applied to all assets.</p>
         */
        @NameInMap("TargetInfo")
        public String targetInfo;

        /**
         * <p>The type of the vulnerability.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The information about the vulnerability. The value of this parameter is in the JSON format. Valid values:</p>
         * <br>
         * <p>*   **name**: the name of the vulnerability</p>
         * <p>*   **type**: the type of the vulnerability.</p>
         * <p>*   **aliasName**: the alias of the vulnerability</p>
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
