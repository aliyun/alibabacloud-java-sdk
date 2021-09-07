// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeAccountListResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<DescribeAccountListResponseBodyData> data;

    public static DescribeAccountListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccountListResponseBody self = new DescribeAccountListResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeAccountListResponseBody setData(java.util.List<DescribeAccountListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeAccountListResponseBodyData> getData() {
        return this.data;
    }

    public static class DescribeAccountListResponseBodyData extends TeaModel {
        @NameInMap("GmtCreated")
        public String gmtCreated;

        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        @NameInMap("AccountDescription")
        public String accountDescription;

        @NameInMap("DBName")
        public String DBName;

        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        @NameInMap("AccountType")
        public String accountType;

        @NameInMap("AccountName")
        public String accountName;

        public static DescribeAccountListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeAccountListResponseBodyData self = new DescribeAccountListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeAccountListResponseBodyData setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeAccountListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeAccountListResponseBodyData setAccountDescription(String accountDescription) {
            this.accountDescription = accountDescription;
            return this;
        }
        public String getAccountDescription() {
            return this.accountDescription;
        }

        public DescribeAccountListResponseBodyData setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
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

        public DescribeAccountListResponseBodyData setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

    }

}
