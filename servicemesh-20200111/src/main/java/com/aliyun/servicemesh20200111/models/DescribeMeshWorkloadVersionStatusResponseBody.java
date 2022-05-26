// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeMeshWorkloadVersionStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("WorkloadVersions")
    public java.util.Map<String, WorkloadVersionsValue> workloadVersions;

    public static DescribeMeshWorkloadVersionStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeshWorkloadVersionStatusResponseBody self = new DescribeMeshWorkloadVersionStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeshWorkloadVersionStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMeshWorkloadVersionStatusResponseBody setWorkloadVersions(java.util.Map<String, WorkloadVersionsValue> workloadVersions) {
        this.workloadVersions = workloadVersions;
        return this;
    }
    public java.util.Map<String, WorkloadVersionsValue> getWorkloadVersions() {
        return this.workloadVersions;
    }

}
