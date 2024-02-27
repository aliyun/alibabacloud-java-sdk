// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_verify_agent20240131.models;

import com.aliyun.tea.*;

public class GetMobileWithTokenRequest extends TeaModel {
    @NameInMap("apiCode")
    public Integer apiCode;

    @NameInMap("operatorId")
    public Integer operatorId;

    @NameInMap("osType")
    public String osType;

    @NameInMap("schemeCode")
    public String schemeCode;

    @NameInMap("token")
    public String token;

    public static GetMobileWithTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMobileWithTokenRequest self = new GetMobileWithTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetMobileWithTokenRequest setApiCode(Integer apiCode) {
        this.apiCode = apiCode;
        return this;
    }
    public Integer getApiCode() {
        return this.apiCode;
    }

    public GetMobileWithTokenRequest setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public Integer getOperatorId() {
        return this.operatorId;
    }

    public GetMobileWithTokenRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
    }

    public GetMobileWithTokenRequest setSchemeCode(String schemeCode) {
        this.schemeCode = schemeCode;
        return this;
    }
    public String getSchemeCode() {
        return this.schemeCode;
    }

    public GetMobileWithTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
