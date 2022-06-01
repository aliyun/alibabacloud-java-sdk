// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ListResourceGroupsResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // pai resource groups
    @NameInMap("ResourceGroups")
    public java.util.List<ResourceGroup> resourceGroups;

    // list到的资源组的数量
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceGroupsResponseBody self = new ListResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceGroupsResponseBody setResourceGroups(java.util.List<ResourceGroup> resourceGroups) {
        this.resourceGroups = resourceGroups;
        return this;
    }
    public java.util.List<ResourceGroup> getResourceGroups() {
        return this.resourceGroups;
    }

    public ListResourceGroupsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
