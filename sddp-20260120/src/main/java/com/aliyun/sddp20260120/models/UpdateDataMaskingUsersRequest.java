// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingUsersRequest extends TeaModel {
    /**
     * <p>The column encryption access permissions. Valid values:</p>
     * <ul>
     * <li>fullAccess: plaintext access.</li>
     * <li>restrictedAccess: restricted access.</li>
     * <li>noneAccess: decryption denied.</li>
     * </ul>
     * <p>noneAccess applies only to ApsaraDB RDS for MySQL instances whose active key pattern is client_key.</p>
     * 
     * <strong>example:</strong>
     * <p>fullAccess</p>
     */
    @NameInMap("AuthRole")
    public String authRole;

    /**
     * <p>The expiration time of the plaintext access permissions. Specify a UNIX timestamp in milliseconds since 1970-01-01 00:00:00 UTC. This parameter is required only when ExpireTimeOperation is set to SET. The value must be later than the current time and no later than 2145953410000. The server stores the value with second-level precision. Do not specify this parameter when ExpireTimeOperation is set to PRESERVE or CLEAR.</p>
     * 
     * <strong>example:</strong>
     * <p>2145953410000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <p>The action to take on the permission expiration time. Valid values:</p>
     * <ul>
     * <li>PRESERVE: Retains the existing expiration time.</li>
     * <li>CLEAR: Clears the expiration time.</li>
     * <li>SET: Sets the expiration time to the value specified by ExpireTime.</li>
     * </ul>
     * <p>Default value: PRESERVE. Only fullAccess supports configuring a validity period.</p>
     * 
     * <strong>example:</strong>
     * <p>PRESERVE</p>
     */
    @NameInMap("ExpireTimeOperation")
    public String expireTimeOperation;

    /**
     * <p>The language of the response description. Valid values:</p>
     * <ul>
     * <li>zh: Chinese.</li>
     * <li>en: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The cloud product code. Column encryption supports RDS, POLARDB, and PolarDBX2. If ProductId is also specified, the two parameters must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The cloud product type identifier. Valid values:</p>
     * <ul>
     * <li>5: RDS.</li>
     * <li>8: POLARDB.</li>
     * <li>27: PolarDBX2.</li>
     * </ul>
     * <p>If both ProductId and ProductCode are specified, they must correspond to each other.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    /**
     * <p>The list of database accounts for which to set permissions.</p>
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
         * <p>The database account identifier. Obtain this value from Items[].Id in the response of ListDataAssetAccounts and pass it as a string.</p>
         * 
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
         * <p>The database instance identity. Obtain this value from Items[].InstanceId in the response of ListDataMaskingInstances.</p>
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

        public UpdateDataMaskingUsersRequestUserList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
