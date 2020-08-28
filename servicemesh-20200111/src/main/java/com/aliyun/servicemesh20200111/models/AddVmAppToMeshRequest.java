// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class AddVmAppToMeshRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    public String serviceMeshId;

    @NameInMap("Namespace")
    @Validation(required = true)
    public String namespace;

    @NameInMap("ServiceName")
    @Validation(required = true)
    public String serviceName;

    @NameInMap("Ips")
    @Validation(required = true)
    public String ips;

    @NameInMap("Ports")
    @Validation(required = true)
    public String ports;

    @NameInMap("Labels")
    @Validation(required = true)
    public String labels;

    @NameInMap("Annotations")
    public String annotations;

    @NameInMap("ServiceAccount")
    public String serviceAccount;

    @NameInMap("Force")
    public Boolean force;

    public static AddVmAppToMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        AddVmAppToMeshRequest self = new AddVmAppToMeshRequest();
        return TeaModel.build(map, self);
    }

}
