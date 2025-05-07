// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetRayDashboardRequest extends TeaModel {
    /**
     * <p>Specifies whether the link is a sharing link. If yes, a token is required.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("isShared")
    public Boolean isShared;

    /**
     * <p>The token obtained from GetToken</p>
     * 
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
