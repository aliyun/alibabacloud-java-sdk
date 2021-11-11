// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbf20211110_21312586.models;

import com.aliyun.tea.*;

public class DeleteApiRequest extends TeaModel {
    @NameInMap("apiExternalId")
    public java.io.InputStream apiExternalId;

    public static DeleteApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiRequest self = new DeleteApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApiRequest setApiExternalId(java.io.InputStream apiExternalId) {
        this.apiExternalId = apiExternalId;
        return this;
    }
    public java.io.InputStream getApiExternalId() {
        return this.apiExternalId;
    }

}
