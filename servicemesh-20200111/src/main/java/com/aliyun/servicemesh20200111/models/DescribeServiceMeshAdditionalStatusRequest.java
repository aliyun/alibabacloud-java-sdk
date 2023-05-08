// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeServiceMeshAdditionalStatusRequest extends TeaModel {
    /**
     * <p>The check result of the SLB instance. Valid values:</p>
     * <br>
     * <p>*   `exist`: The SLB instance exists.</p>
     * <p>*   `not_exist`: The SLB instance does not exist.</p>
     * <p>*   `conflict`: Conflicts are detected.</p>
     * <p>*   `failed`: The check fails.</p>
     * <p>*   `time_out`: The check times out.</p>
     */
    @NameInMap("CheckMode")
    public String checkMode;

    /**
     * <p>The check results of the SLB instances created for exposing the API server.</p>
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
