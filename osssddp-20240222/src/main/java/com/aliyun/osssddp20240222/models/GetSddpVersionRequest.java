// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.osssddp20240222.models;

import com.aliyun.tea.*;

public class GetSddpVersionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    public static GetSddpVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSddpVersionRequest self = new GetSddpVersionRequest();
        return TeaModel.build(map, self);
    }

    public GetSddpVersionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
