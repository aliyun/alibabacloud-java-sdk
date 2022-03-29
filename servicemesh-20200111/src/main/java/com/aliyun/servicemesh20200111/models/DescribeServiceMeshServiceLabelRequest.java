// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshServiceLabelRequest extends TeaModel {
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    @NameInMap("ServiceNames")
    public String serviceNames;

    @NameInMap("ServiceNamespaces")
    public String serviceNamespaces;

    public static DescribeServiceMeshServiceLabelRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshServiceLabelRequest self = new DescribeServiceMeshServiceLabelRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshServiceLabelRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public DescribeServiceMeshServiceLabelRequest setServiceNames(String serviceNames) {
        this.serviceNames = serviceNames;
        return this;
    }
    public String getServiceNames() {
        return this.serviceNames;
    }

    public DescribeServiceMeshServiceLabelRequest setServiceNamespaces(String serviceNamespaces) {
        this.serviceNamespaces = serviceNamespaces;
        return this;
    }
    public String getServiceNamespaces() {
        return this.serviceNamespaces;
    }

}
