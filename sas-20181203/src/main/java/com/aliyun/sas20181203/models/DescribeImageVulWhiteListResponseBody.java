// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageVulWhiteListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("ImageVulWhitelist")
    public java.util.List<DescribeImageVulWhiteListResponseBodyImageVulWhitelist> imageVulWhitelist;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageInfo")
    public DescribeImageVulWhiteListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TimeCost")
    public Long timeCost;

    public static DescribeImageVulWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageVulWhiteListResponseBody self = new DescribeImageVulWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageVulWhiteListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeImageVulWhiteListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeImageVulWhiteListResponseBody setImageVulWhitelist(java.util.List<DescribeImageVulWhiteListResponseBodyImageVulWhitelist> imageVulWhitelist) {
        this.imageVulWhitelist = imageVulWhitelist;
        return this;
    }
    public java.util.List<DescribeImageVulWhiteListResponseBodyImageVulWhitelist> getImageVulWhitelist() {
        return this.imageVulWhitelist;
    }

    public DescribeImageVulWhiteListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeImageVulWhiteListResponseBody setPageInfo(DescribeImageVulWhiteListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeImageVulWhiteListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeImageVulWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageVulWhiteListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeImageVulWhiteListResponseBody setTimeCost(Long timeCost) {
        this.timeCost = timeCost;
        return this;
    }
    public Long getTimeCost() {
        return this.timeCost;
    }

    public static class DescribeImageVulWhiteListResponseBodyImageVulWhitelist extends TeaModel {
        @NameInMap("AliasName")
        public String aliasName;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("Target")
        public String target;

        @NameInMap("Type")
        public String type;

        public static DescribeImageVulWhiteListResponseBodyImageVulWhitelist build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulWhiteListResponseBodyImageVulWhitelist self = new DescribeImageVulWhiteListResponseBodyImageVulWhitelist();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeImageVulWhiteListResponseBodyImageVulWhitelist setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeImageVulWhiteListResponseBodyPageInfo extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeImageVulWhiteListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeImageVulWhiteListResponseBodyPageInfo self = new DescribeImageVulWhiteListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeImageVulWhiteListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
