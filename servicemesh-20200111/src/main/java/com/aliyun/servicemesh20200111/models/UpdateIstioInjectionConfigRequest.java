// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class UpdateIstioInjectionConfigRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("EnableIstioInjection")
    @Validation(required = true)
    public Boolean enableIstioInjection;

    public static UpdateIstioInjectionConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIstioInjectionConfigRequest self = new UpdateIstioInjectionConfigRequest();
        return TeaModel.build(map, self);
    }

}
