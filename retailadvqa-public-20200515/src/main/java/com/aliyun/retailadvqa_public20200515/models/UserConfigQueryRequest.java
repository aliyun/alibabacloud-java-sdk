// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class UserConfigQueryRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("UserId")
    public String userId;

    public static UserConfigQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        UserConfigQueryRequest self = new UserConfigQueryRequest();
        return TeaModel.build(map, self);
    }

    public UserConfigQueryRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public UserConfigQueryRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public UserConfigQueryRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
