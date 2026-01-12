// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ResumeLocationServiceRequest extends TeaModel {
    @NameInMap("Id")
    public Long id;

    @NameInMap("JwtToken")
    public String jwtToken;

    public static ResumeLocationServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeLocationServiceRequest self = new ResumeLocationServiceRequest();
        return TeaModel.build(map, self);
    }

    public ResumeLocationServiceRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ResumeLocationServiceRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

}
