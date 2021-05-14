// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulWhitelistResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("VulWhitelists")
    public java.util.List<DescribeVulWhitelistResponseBodyVulWhitelists> vulWhitelists;

    public static DescribeVulWhitelistResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulWhitelistResponseBody self = new DescribeVulWhitelistResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulWhitelistResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulWhitelistResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulWhitelistResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
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
        @NameInMap("Type")
        public String type;

        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        public static DescribeVulWhitelistResponseBodyVulWhitelists build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulWhitelistResponseBodyVulWhitelists self = new DescribeVulWhitelistResponseBodyVulWhitelists();
            return TeaModel.build(map, self);
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVulWhitelistResponseBodyVulWhitelists setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
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

    }

}
