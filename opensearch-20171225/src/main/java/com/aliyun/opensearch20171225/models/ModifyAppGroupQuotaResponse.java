// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ModifyAppGroupQuotaResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAppGroupQuotaResponseBody body;

    public static ModifyAppGroupQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAppGroupQuotaResponse self = new ModifyAppGroupQuotaResponse();
        return TeaModel.build(map, self);
    }

}
