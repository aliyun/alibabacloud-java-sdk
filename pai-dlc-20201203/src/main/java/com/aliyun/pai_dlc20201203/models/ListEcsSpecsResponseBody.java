// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ListEcsSpecsResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("requestId")
    public String requestId;

    // ECS规格
    @NameInMap("EcsSpec")
    public java.util.List<EcsSpec> ecsSpec;

    // 符合过滤条件的总数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListEcsSpecsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsResponseBody self = new ListEcsSpecsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEcsSpecsResponseBody setEcsSpec(java.util.List<EcsSpec> ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public java.util.List<EcsSpec> getEcsSpec() {
        return this.ecsSpec;
    }

    public ListEcsSpecsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
