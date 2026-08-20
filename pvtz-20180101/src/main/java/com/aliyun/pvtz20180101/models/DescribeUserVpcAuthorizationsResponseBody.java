// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserVpcAuthorizationsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned data.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of authorizations.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalItems")
    public Integer totalItems;

    /**
     * <p>The total number of pages returned.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalPages")
    public Integer totalPages;

    /**
     * <p>The information about the Alibaba Cloud accounts that own the authorized resources.</p>
     */
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
        /**
         * <p>The authorization type. Valid values:</p>
         * <ul>
         * <li><p>NORMAL: A regular authorization.</p>
         * </li>
         * <li><p>CLOUD_PRODUCT: An authorization for an Alibaba Cloud service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The name of the Alibaba Cloud account that owns the authorized resources.</p>
         * 
         * <strong>example:</strong>
         * <p>alidn****@test.com</p>
         */
        @NameInMap("AuthorizedAliyunId")
        public String authorizedAliyunId;

        /**
         * <p>The ID of the Alibaba Cloud account that owns the authorized resources.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
         */
        @NameInMap("AuthorizedUserId")
        public Long authorizedUserId;

        /**
         * <p>The time when the authorization was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-08T02:31Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The timestamp that indicates when the authorization was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1672740294000</p>
         */
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
