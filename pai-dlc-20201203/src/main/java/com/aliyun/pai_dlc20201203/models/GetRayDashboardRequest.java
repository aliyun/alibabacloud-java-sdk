// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRayDashboardRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isShared")
    public Boolean isShared;

    /**
     * <strong>example:</strong>
     * <p>some_token_value</p>
     */
    @NameInMap("token")
    public String token;

    public static GetRayDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRayDashboardRequest self = new GetRayDashboardRequest();
        return TeaModel.build(map, self);
    }

    public GetRayDashboardRequest setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public GetRayDashboardRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
