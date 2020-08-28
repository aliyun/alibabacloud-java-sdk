// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddClusterIntoServiceMeshResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static AddClusterIntoServiceMeshResponse build(java.util.Map<String, ?> map) throws Exception {
        AddClusterIntoServiceMeshResponse self = new AddClusterIntoServiceMeshResponse();
        return TeaModel.build(map, self);
    }

}
