// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class CreateAlertRequest extends TeaModel {
    @NameInMap("body")
    public CreateAlertReq body;

    public static CreateAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlertRequest self = new CreateAlertRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlertRequest setBody(CreateAlertReq body) {
        this.body = body;
        return this;
    }
    public CreateAlertReq getBody() {
        return this.body;
    }

}
