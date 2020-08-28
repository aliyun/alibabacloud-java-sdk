// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpgradeMeshVersionResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpgradeMeshVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpgradeMeshVersionResponse self = new UpgradeMeshVersionResponse();
        return TeaModel.build(map, self);
    }

}
