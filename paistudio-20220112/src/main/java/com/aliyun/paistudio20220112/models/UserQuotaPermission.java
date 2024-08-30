// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class UserQuotaPermission extends TeaModel {
    @NameInMap("Permissions")
    public java.util.List<String> permissions;

    @NameInMap("QuotaId")
    public String quotaId;

    public static UserQuotaPermission build(java.util.Map<String, ?> map) throws Exception {
        UserQuotaPermission self = new UserQuotaPermission();
        return TeaModel.build(map, self);
    }

    public UserQuotaPermission setPermissions(java.util.List<String> permissions) {
        this.permissions = permissions;
        return this;
    }
    public java.util.List<String> getPermissions() {
        return this.permissions;
    }

    public UserQuotaPermission setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

}
