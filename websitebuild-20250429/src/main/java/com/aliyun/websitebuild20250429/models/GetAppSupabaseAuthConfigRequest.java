// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppSupabaseAuthConfigRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ALL_AUTH_FLAG</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <strong>example:</strong>
     * <p>WS20250801152639000005</p>
     */
    @NameInMap("BizId")
    public String bizId;

    public static GetAppSupabaseAuthConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAppSupabaseAuthConfigRequest self = new GetAppSupabaseAuthConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAppSupabaseAuthConfigRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public GetAppSupabaseAuthConfigRequest setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

}
