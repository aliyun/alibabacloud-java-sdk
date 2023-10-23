// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateTicketRequest extends TeaModel {
    @NameInMap("playAccessKeyId")
    public String playAccessKeyId;

    @NameInMap("playAccessKeySecret")
    public String playAccessKeySecret;

    public static CreateTicketRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTicketRequest self = new CreateTicketRequest();
        return TeaModel.build(map, self);
    }

    public CreateTicketRequest setPlayAccessKeyId(String playAccessKeyId) {
        this.playAccessKeyId = playAccessKeyId;
        return this;
    }
    public String getPlayAccessKeyId() {
        return this.playAccessKeyId;
    }

    public CreateTicketRequest setPlayAccessKeySecret(String playAccessKeySecret) {
        this.playAccessKeySecret = playAccessKeySecret;
        return this;
    }
    public String getPlayAccessKeySecret() {
        return this.playAccessKeySecret;
    }

}
