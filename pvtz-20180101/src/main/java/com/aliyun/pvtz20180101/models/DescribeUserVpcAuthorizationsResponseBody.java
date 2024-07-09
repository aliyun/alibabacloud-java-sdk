// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribeUserVpcAuthorizationsResponseBody extends TeaModel {
    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>46973D4C-E3E4-4ABA-9190-9A9DE406C7E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
     * <p>The information about the Alibaba Cloud accounts.</p>
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
         * <p>The authorization scope. Valid value:</p>
         * <ul>
         * <li>NORMAL: general authorization.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("AuthType")
        public String authType;

        /**
         * <p>The name of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>alidns***@test.com</p>
         */
        @NameInMap("AuthorizedAliyunId")
        public String authorizedAliyunId;

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>111222333</p>
         */
        @NameInMap("AuthorizedUserId")
        public Long authorizedUserId;

        /**
         * <p>The time when the authorization was performed. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-08T02:31Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The time when the authorization was performed. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
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
