// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceTypesResponseBody extends TeaModel {
    @NameInMap("InstanceTypes")
    public java.util.List<InstanceType> instanceTypes;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListInstanceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTypesResponseBody self = new ListInstanceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListInstanceTypesResponseBody setInstanceTypes(java.util.List<InstanceType> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }
    public java.util.List<InstanceType> getInstanceTypes() {
        return this.instanceTypes;
    }

    public ListInstanceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
