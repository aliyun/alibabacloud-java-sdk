// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserVpcAuthorizationsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalItems")
    public Integer totalItems;

    @NameInMap("TotalPages")
    public Integer totalPages;

    @NameInMap("Users")
    public java.util.List<DescribeUserVpcAuthorizationsResponseBodyUsers> users;

    public static DescribeUserVpcAuthorizationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserVpcAuthorizationsResponseBody self = new DescribeUserVpcAuthorizationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserVpcAuthorizationsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeUserVpcAuthorizationsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeUserVpcAuthorizationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserVpcAuthorizationsResponseBody setTotalItems(Integer totalItems) {
        this.totalItems = totalItems;
        return this;
    }
    public Integer getTotalItems() {
        return this.totalItems;
    }

    public DescribeUserVpcAuthorizationsResponseBody setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public DescribeUserVpcAuthorizationsResponseBody setUsers(java.util.List<DescribeUserVpcAuthorizationsResponseBodyUsers> users) {
        this.users = users;
        return this;
    }
    public java.util.List<DescribeUserVpcAuthorizationsResponseBodyUsers> getUsers() {
        return this.users;
    }

    public static class DescribeUserVpcAuthorizationsResponseBodyUsers extends TeaModel {
        @NameInMap("AuthType")
        public String authType;

        @NameInMap("AuthorizedAliyunId")
        public String authorizedAliyunId;

        @NameInMap("AuthorizedUserId")
        public Long authorizedUserId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        public static DescribeUserVpcAuthorizationsResponseBodyUsers build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserVpcAuthorizationsResponseBodyUsers self = new DescribeUserVpcAuthorizationsResponseBodyUsers();
            return TeaModel.build(map, self);
        }

        public DescribeUserVpcAuthorizationsResponseBodyUsers setAuthType(String authType) {
            this.authType = authType;
            return this;
        }
        public String getAuthType() {
            return this.authType;
        }

        public DescribeUserVpcAuthorizationsResponseBodyUsers setAuthorizedAliyunId(String authorizedAliyunId) {
            this.authorizedAliyunId = authorizedAliyunId;
            return this;
        }
        public String getAuthorizedAliyunId() {
            return this.authorizedAliyunId;
        }

        public DescribeUserVpcAuthorizationsResponseBodyUsers setAuthorizedUserId(Long authorizedUserId) {
            this.authorizedUserId = authorizedUserId;
            return this;
        }
        public Long getAuthorizedUserId() {
            return this.authorizedUserId;
        }

        public DescribeUserVpcAuthorizationsResponseBodyUsers setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeUserVpcAuthorizationsResponseBodyUsers setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

    }

}
