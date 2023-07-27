// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusRequest extends TeaModel {
    /**
     * <p>The check mode of the ASM instance. Valid values:</p>
     * <br>
     * <p>*   `normal`: checks the Server Load Balancer (SLB) instances created for exposing the API server and Istio Pilot, audit logs, and installation of Logtail for clusters on the data plane.</p>
     * <p>*   `full`: checks control plane logs, access logs, security groups, and the elastic IP addresses (EIPs) of the API server in addition to the check items in normal mode.</p>
     */
    @NameInMap("CheckMode")
    public String checkMode;

    /**
     * <p>The ID of the ASM instance.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DescribeServiceMeshAdditionalStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceMeshAdditionalStatusRequest self = new DescribeServiceMeshAdditionalStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceMeshAdditionalStatusRequest setCheckMode(String checkMode) {
        this.checkMode = checkMode;
        return this;
    }
    public String getCheckMode() {
        return this.checkMode;
    }

    public DescribeServiceMeshAdditionalStatusRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
