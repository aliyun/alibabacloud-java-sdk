// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteServiceMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static DeleteServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMeshResponse self = new DeleteServiceMeshResponse();
        return TeaModel.build(map, self);
    }

}
