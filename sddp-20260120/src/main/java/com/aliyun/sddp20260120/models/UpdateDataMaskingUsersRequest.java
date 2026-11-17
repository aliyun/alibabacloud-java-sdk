// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingUsersRequest extends TeaModel {
    /**
     * <p>The column encryption access permissions. Valid values: fullAccess: Allows plaintext access. restrictedAccess: Allows restricted access. noneAccess: Prohibits decryption. noneAccess applies only to ApsaraDB RDS for MySQL instances whose active key pattern is client_key.</p>
     * 
     * <strong>example:</strong>
     * <p>fullAccess</p>
     */
    @NameInMap("AuthRole")
    public String authRole;

    /**
     * <p>The expiration time of the plaintext access permissions. The value is a UNIX timestamp in milliseconds that have elapsed since 00:00:00 UTC on January 1, 1970. Specify this parameter only when ExpireTimeOperation is set to SET. The value must be later than the current time and no greater than 2145953410000. The server saves the value with second-level precision. Do not specify this parameter when ExpireTimeOperation is set to PRESERVE or CLEAR.</p>
     * 
     * <strong>example:</strong>
     * <p>2145953410000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The processing method for the permission expiration time. Valid values: PRESERVE: retains the original expiration time. CLEAR: clears the expiration time. SET: sets ExpireTime. Default value: PRESERVE. Only fullAccess supports setting an expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>PRESERVE</p>
     */
    @NameInMap("ExpireTimeOperation")
    public String expireTimeOperation;

    /**
     * <p>The language of the response message. Valid values: zh: Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud service code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must match.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud service type identifier. Valid values: 5: RDS, 8: POLARDB, and 27: PolarDBX2. If both ProductId and ProductCode are specified, they must match.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The list of database accounts for which you want to configure permissions.</p>
     */
    @NameInMap("UserList")
    public java.util.List<UpdateDataMaskingUsersRequestUserList> userList;

    public static UpdateDataMaskingUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataMaskingUsersRequest self = new UpdateDataMaskingUsersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDataMaskingUsersRequest setAuthRole(String authRole) {
        this.authRole = authRole;
        return this;
    }
    public String getAuthRole() {
        return this.authRole;
    }

    public UpdateDataMaskingUsersRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public UpdateDataMaskingUsersRequest setExpireTimeOperation(String expireTimeOperation) {
        this.expireTimeOperation = expireTimeOperation;
        return this;
    }
    public String getExpireTimeOperation() {
        return this.expireTimeOperation;
    }

    public UpdateDataMaskingUsersRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateDataMaskingUsersRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public UpdateDataMaskingUsersRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public UpdateDataMaskingUsersRequest setUserList(java.util.List<UpdateDataMaskingUsersRequestUserList> userList) {
        this.userList = userList;
        return this;
    }
    public java.util.List<UpdateDataMaskingUsersRequestUserList> getUserList() {
        return this.userList;
    }

    public static class UpdateDataMaskingUsersRequestUserList extends TeaModel {
        /**
         * <p>The name of the database account. Obtain the value from Items[].AccountName in the response of ListDataAssetAccounts and pass it as a string without modification. Do not pass Items[].Id. Each AccountId must correspond to the InstanceId in the same item. Accounts with the same name in different instances are considered different targets.</p>
         * 
         * <strong>example:</strong>
         * <p>app_reader</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The authentication database of MongoDB.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        @NameInMap("AuthDb")
        public String authDb;

        /**
         * <p>The database instance identity. You can obtain the value from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze1abcdefgh****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static UpdateDataMaskingUsersRequestUserList build(java.util.Map<String, ?> map) throws Exception {
            UpdateDataMaskingUsersRequestUserList self = new UpdateDataMaskingUsersRequestUserList();
            return TeaModel.build(map, self);
        }

        public UpdateDataMaskingUsersRequestUserList setAccountId(String accountId) {
            this.accountId = accountId;
            return this;
        }
        public String getAccountId() {
            return this.accountId;
        }

        public UpdateDataMaskingUsersRequestUserList setAuthDb(String authDb) {
            this.authDb = authDb;
            return this;
        }
        public String getAuthDb() {
            return this.authDb;
        }

        public UpdateDataMaskingUsersRequestUserList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
