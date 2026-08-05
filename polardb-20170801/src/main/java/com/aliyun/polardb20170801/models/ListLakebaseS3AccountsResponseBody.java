// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ListLakebaseS3AccountsResponseBody extends TeaModel {
    /**
     * <p>The current page number.</p>
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
     * <p>925B84D9-CA72-432C-95CF-738C22******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of S3 accounts.</p>
     */
    @NameInMap("S3Accounts")
    public java.util.List<ListLakebaseS3AccountsResponseBodyS3Accounts> s3Accounts;

    /**
     * <p>The total number of accounts.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListLakebaseS3AccountsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLakebaseS3AccountsResponseBody self = new ListLakebaseS3AccountsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLakebaseS3AccountsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListLakebaseS3AccountsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListLakebaseS3AccountsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLakebaseS3AccountsResponseBody setS3Accounts(java.util.List<ListLakebaseS3AccountsResponseBodyS3Accounts> s3Accounts) {
        this.s3Accounts = s3Accounts;
        return this;
    }
    public java.util.List<ListLakebaseS3AccountsResponseBodyS3Accounts> getS3Accounts() {
        return this.s3Accounts;
    }

    public ListLakebaseS3AccountsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListLakebaseS3AccountsResponseBodyS3Accounts extends TeaModel {
        /**
         * <p>The account type. Valid values:</p>
         * <ul>
         * <li>default: the built-in default account.</li>
         * <li>user: a user-created account.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <p>The access key of the S3 account.</p>
         * 
         * <strong>example:</strong>
         * <p>accname</p>
         */
        @NameInMap("UserAccAk")
        public String userAccAk;

        /**
         * <p>The secret key of the S3 account (displayed in masked format).</p>
         * 
         * <strong>example:</strong>
         * <p>password***</p>
         */
        @NameInMap("UserAccSk")
        public String userAccSk;

        public static ListLakebaseS3AccountsResponseBodyS3Accounts build(java.util.Map<String, ?> map) throws Exception {
            ListLakebaseS3AccountsResponseBodyS3Accounts self = new ListLakebaseS3AccountsResponseBodyS3Accounts();
            return TeaModel.build(map, self);
        }

        public ListLakebaseS3AccountsResponseBodyS3Accounts setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public ListLakebaseS3AccountsResponseBodyS3Accounts setUserAccAk(String userAccAk) {
            this.userAccAk = userAccAk;
            return this;
        }
        public String getUserAccAk() {
            return this.userAccAk;
        }

        public ListLakebaseS3AccountsResponseBodyS3Accounts setUserAccSk(String userAccSk) {
            this.userAccSk = userAccSk;
            return this;
        }
        public String getUserAccSk() {
            return this.userAccSk;
        }

    }

}
