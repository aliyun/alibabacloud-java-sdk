// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeEncryptionDBRolePrivilegeResponseBody extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-****************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The result set.</p>
     */
    @NameInMap("Data")
    public DescribeEncryptionDBRolePrivilegeResponseBodyData data;

    /**
     * <p>The response message.</p>
     * <blockquote>
     * <p>If the request is successful, \<code>Successful\\</code> is returned. If the request fails, an error message, such as an error code, is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>D0CEC6AC-7760-409A-A0D5-E6CD86******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
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
         * <p>The regular users.</p>
         * 
         * <strong>example:</strong>
         * <p>[alton01]</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <p>Other users.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Negation")
        public String negation;

        /**
         * <p>The privileged users.</p>
         * 
         * <strong>example:</strong>
         * <p>[alton]</p>
         */
        @NameInMap("NotEncryption")
        public String notEncryption;

        /**
         * <p>The name of the role permission.</p>
         * 
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
        /**
         * <p>A list of role access policies.</p>
         */
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
