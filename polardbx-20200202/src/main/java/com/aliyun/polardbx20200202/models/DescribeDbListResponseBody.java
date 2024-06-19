// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeDbListResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeDbListResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C458B1E8-1683-3645-B154-6BA32080EEA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeDbListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDbListResponseBody self = new DescribeDbListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDbListResponseBody setData(java.util.List<DescribeDbListResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeDbListResponseBodyData> getData() {
        return this.data;
    }

    public DescribeDbListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDbListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDbListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDbListResponseBodyDataAccounts extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>root4test</p>
         */
        @NameInMap("AccountName")
        public String accountName;

        /**
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        @NameInMap("AccountPrivilege")
        public String accountPrivilege;

        public static DescribeDbListResponseBodyDataAccounts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbListResponseBodyDataAccounts self = new DescribeDbListResponseBodyDataAccounts();
            return TeaModel.build(map, self);
        }

        public DescribeDbListResponseBodyDataAccounts setAccountName(String accountName) {
            this.accountName = accountName;
            return this;
        }
        public String getAccountName() {
            return this.accountName;
        }

        public DescribeDbListResponseBodyDataAccounts setAccountPrivilege(String accountPrivilege) {
            this.accountPrivilege = accountPrivilege;
            return this;
        }
        public String getAccountPrivilege() {
            return this.accountPrivilege;
        }

    }

    public static class DescribeDbListResponseBodyData extends TeaModel {
        @NameInMap("Accounts")
        public java.util.List<DescribeDbListResponseBodyDataAccounts> accounts;

        /**
         * <strong>example:</strong>
         * <p>utf8mb4</p>
         */
        @NameInMap("CharacterSetName")
        public String characterSetName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBDescription")
        public String DBDescription;

        /**
         * <strong>example:</strong>
         * <p>pxc-********</p>
         */
        @NameInMap("DBInstanceName")
        public String DBInstanceName;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("DBName")
        public String DBName;

        public static DescribeDbListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDbListResponseBodyData self = new DescribeDbListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDbListResponseBodyData setAccounts(java.util.List<DescribeDbListResponseBodyDataAccounts> accounts) {
            this.accounts = accounts;
            return this;
        }
        public java.util.List<DescribeDbListResponseBodyDataAccounts> getAccounts() {
            return this.accounts;
        }

        public DescribeDbListResponseBodyData setCharacterSetName(String characterSetName) {
            this.characterSetName = characterSetName;
            return this;
        }
        public String getCharacterSetName() {
            return this.characterSetName;
        }

        public DescribeDbListResponseBodyData setDBDescription(String DBDescription) {
            this.DBDescription = DBDescription;
            return this;
        }
        public String getDBDescription() {
            return this.DBDescription;
        }

        public DescribeDbListResponseBodyData setDBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }
        public String getDBInstanceName() {
            return this.DBInstanceName;
        }

        public DescribeDbListResponseBodyData setDBName(String DBName) {
            this.DBName = DBName;
            return this;
        }
        public String getDBName() {
            return this.DBName;
        }

    }

}
