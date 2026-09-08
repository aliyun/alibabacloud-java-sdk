// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class UpdateDataMaskingUsersRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>fullAccess</p>
     */
    @NameInMap("AuthRole")
    public String authRole;

    /**
     * <strong>example:</strong>
     * <p>2145953410000</p>
     */
    @NameInMap("ExpireTime")
    public Long expireTime;

    /**
     * <strong>example:</strong>
     * <p>PRESERVE</p>
     */
    @NameInMap("ExpireTimeOperation")
    public String expireTimeOperation;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>RDS</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("ProductId")
    public Long productId;

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
         * <strong>example:</strong>
         * <p>1001</p>
         */
        @NameInMap("AccountId")
        public String accountId;

        /**
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
