// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulWhitelistResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // An array that consists of the whitelist of vulnerabilities.
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
        // The alias of the vulnerability.
        @NameInMap("AliasName")
        public String aliasName;

        // The ID of the rule.
        @NameInMap("Id")
        public String id;

        // The name of the vulnerability.
        @NameInMap("Name")
        public String name;

        // The reason why the vulnerability is added to the whitelist.
        @NameInMap("Reason")
        public String reason;

        // The application scope of the rule. The value is a JSON string that contains the following fields:
        // 
        // *   **type**: the type of the asset to which the rule is applied. Valid values:
        // 
        //        -  **Uuid**: server
        //        -  **GroupId**: server group
        // 
        // *   **groupIds**: the IDs of server groups.
        // 
        // *   **uuids**: the UUIDs of servers.
        // 
        // >  If this field is empty, the rule is applied to all assets.
        @NameInMap("TargetInfo")
        public String targetInfo;

        // The type of the vulnerability.
        @NameInMap("Type")
        public String type;

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
