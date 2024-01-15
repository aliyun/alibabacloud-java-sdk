// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class UpdateAlertRequest extends TeaModel {
    @NameInMap("body")
    public UpdateAlertReq body;

    public static UpdateAlertRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAlertRequest self = new UpdateAlertRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAlertRequest setBody(UpdateAlertReq body) {
        this.body = body;
        return this;
    }
    public UpdateAlertReq getBody() {
        return this.body;
    }

}
