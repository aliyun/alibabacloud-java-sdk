// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListCustomImageShareAccountsResponseBody extends TeaModel {
    /**
     * <p>The information about the shared custom images.</p>
     */
    @NameInMap("ImageShareUsers")
    public java.util.List<ListCustomImageShareAccountsResponseBodyImageShareUsers> imageShareUsers;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
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
     * <p>30637AD6-D977-4833-A54C-CC89483E****</p>
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

    public static ListCustomImageShareAccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCustomImageShareAccountsResponseBody self = new ListCustomImageShareAccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCustomImageShareAccountsResponseBody setImageShareUsers(java.util.List<ListCustomImageShareAccountsResponseBodyImageShareUsers> imageShareUsers) {
        this.imageShareUsers = imageShareUsers;
        return this;
    }
    public java.util.List<ListCustomImageShareAccountsResponseBodyImageShareUsers> getImageShareUsers() {
        return this.imageShareUsers;
    }

    public ListCustomImageShareAccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomImageShareAccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomImageShareAccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCustomImageShareAccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListCustomImageShareAccountsResponseBodyImageShareUsers extends TeaModel {
        /**
         * <p>The time when the custom image is shared.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-07-15 13:59:21.0</p>
         */
        @NameInMap("SharedTime")
        public String sharedTime;

        /**
         * <p>The ID of the Alibaba Cloud account whose custom image is shared.</p>
         * 
         * <strong>example:</strong>
         * <p>125111425233****</p>
         */
        @NameInMap("UserId")
        public Long userId;

        public static ListCustomImageShareAccountsResponseBodyImageShareUsers build(java.util.Map<String, ?> map) throws Exception {
            ListCustomImageShareAccountsResponseBodyImageShareUsers self = new ListCustomImageShareAccountsResponseBodyImageShareUsers();
            return TeaModel.build(map, self);
        }

        public ListCustomImageShareAccountsResponseBodyImageShareUsers setSharedTime(String sharedTime) {
            this.sharedTime = sharedTime;
            return this;
        }
        public String getSharedTime() {
            return this.sharedTime;
        }

        public ListCustomImageShareAccountsResponseBodyImageShareUsers setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

}
