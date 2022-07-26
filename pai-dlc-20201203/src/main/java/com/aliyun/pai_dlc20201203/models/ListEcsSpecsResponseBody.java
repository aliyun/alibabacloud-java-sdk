// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListEcsSpecsResponseBody extends TeaModel {
    @NameInMap("EcsSpecs")
    public java.util.List<EcsSpec> ecsSpecs;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEcsSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsResponseBody self = new ListEcsSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsResponseBody setEcsSpecs(java.util.List<EcsSpec> ecsSpecs) {
        this.ecsSpecs = ecsSpecs;
        return this;
    }
    public java.util.List<EcsSpec> getEcsSpecs() {
        return this.ecsSpecs;
    }

    public ListEcsSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEcsSpecsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
