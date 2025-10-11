// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEncryptionDBRolePrivilegeResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("Data")
    public DescribeEncryptionDBRolePrivilegeResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeEncryptionDBRolePrivilegeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEncryptionDBRolePrivilegeResponseBody self = new DescribeEncryptionDBRolePrivilegeResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEncryptionDBRolePrivilegeResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeEncryptionDBRolePrivilegeResponseBody setData(DescribeEncryptionDBRolePrivilegeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeEncryptionDBRolePrivilegeResponseBodyData getData() {
        return this.data;
    }

    public DescribeEncryptionDBRolePrivilegeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEncryptionDBRolePrivilegeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEncryptionDBRolePrivilegeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>[alton01]</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Negation")
        public String negation;

        /**
         * <strong>example:</strong>
         * <p>[alton]</p>
         */
        @NameInMap("NotEncryption")
        public String notEncryption;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RolePrivilegeName")
        public String rolePrivilegeName;

        public static DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList self = new DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList();
            return TeaModel.build(map, self);
        }

        public DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList setNegation(String negation) {
            this.negation = negation;
            return this;
        }
        public String getNegation() {
            return this.negation;
        }

        public DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList setNotEncryption(String notEncryption) {
            this.notEncryption = notEncryption;
            return this;
        }
        public String getNotEncryption() {
            return this.notEncryption;
        }

        public DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList setRolePrivilegeName(String rolePrivilegeName) {
            this.rolePrivilegeName = rolePrivilegeName;
            return this;
        }
        public String getRolePrivilegeName() {
            return this.rolePrivilegeName;
        }

    }

    public static class DescribeEncryptionDBRolePrivilegeResponseBodyData extends TeaModel {
        @NameInMap("RolePrivilegeList")
        public java.util.List<DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList> rolePrivilegeList;

        public static DescribeEncryptionDBRolePrivilegeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEncryptionDBRolePrivilegeResponseBodyData self = new DescribeEncryptionDBRolePrivilegeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeEncryptionDBRolePrivilegeResponseBodyData setRolePrivilegeList(java.util.List<DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList> rolePrivilegeList) {
            this.rolePrivilegeList = rolePrivilegeList;
            return this;
        }
        public java.util.List<DescribeEncryptionDBRolePrivilegeResponseBodyDataRolePrivilegeList> getRolePrivilegeList() {
            return this.rolePrivilegeList;
        }

    }

}
