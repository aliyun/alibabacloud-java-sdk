// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tunnel_service20210509.models;

import com.aliyun.tea.*;

public class CreateSessionRequest extends TeaModel {
    @NameInMap("sessionName")
    public String sessionName;

    public static CreateSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionRequest self = new CreateSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSessionRequest setSessionName(String sessionName) {
        this.sessionName = sessionName;
        return this;
    }
    public String getSessionName() {
        return this.sessionName;
    }

}
