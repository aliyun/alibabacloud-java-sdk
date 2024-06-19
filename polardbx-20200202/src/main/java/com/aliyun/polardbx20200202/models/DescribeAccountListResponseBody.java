// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeAccountListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeAccountListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9B2F3840-5C98-475C-B269-2D5C3A31797C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAccountListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountListResponseBody self = new DescribeAccountListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAccountListResponseBody setData(java.util.List<DescribeAccountListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAccountListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeAccountListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAccountListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAccountListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAccountListResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>testaccount desc</p>
         */
        @NameInMap("AccountDescription")
        public String accountDescription;

        /**
         * <strong>example:</strong>
         * <p>testAccount</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AccountType")
        public String accountType;

        /**
         * <strong>example:</strong>
         * <p>pxc-*********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>testdb</p>
         */
        @NameInMap("DBName")
        public String DBName;

        /**
         * <strong>example:</strong>
         * <p>2012-06-08T15:00Z</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        public static DescribeAccountListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountListResponseBodyData self = new DescribeAccountListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountListResponseBodyData setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountListResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeAccountListResponseBodyData setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

        public DescribeAccountListResponseBodyData setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        public String getAccountType() {
            return this.accountType;
        }

        public DescribeAccountListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeAccountListResponseBodyData setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

        public DescribeAccountListResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

    }

}
