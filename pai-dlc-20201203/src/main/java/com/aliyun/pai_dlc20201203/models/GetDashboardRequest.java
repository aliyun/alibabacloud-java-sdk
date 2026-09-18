// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetDashboardRequest extends TeaModel {
    /**
     * <p>Specifies whether the link is a shared link. If set to true, the token parameter is also required.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isShared")
    public Boolean isShared;

    /**
     * <p>The token obtained from the GetToken operation.</p>
     * 
     * <strong>example:</strong>
     * <p>some_token_value</p>
     */
    @NameInMap("token")
    public String token;

    public static GetDashboardRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDashboardRequest self = new GetDashboardRequest();
        return TeaModel.build(map, self);
    }

    public GetDashboardRequest setIsShared(Boolean isShared) {
        this.isShared = isShared;
        return this;
    }
    public Boolean getIsShared() {
        return this.isShared;
    }

    public GetDashboardRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
