// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class AcceptAgreementRequest extends TeaModel {
    @NameInMap("JwtToken")
    public String jwtToken;

    public static AcceptAgreementRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptAgreementRequest self = new AcceptAgreementRequest();
        return TeaModel.build(map, self);
    }

    public AcceptAgreementRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
