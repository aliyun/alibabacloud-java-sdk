// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteServiceMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("Force")
    public Boolean force;

    public static DeleteServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMeshRequest self = new DeleteServiceMeshRequest();
        return TeaModel.build(map, self);
    }

}
