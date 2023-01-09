// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcPrefixListResponseBody extends TeaModel {
    @NameInMap("PrefixListId")
    public String prefixListId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    public static CreateVpcPrefixListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcPrefixListResponseBody self = new CreateVpcPrefixListResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateVpcPrefixListResponseBody setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }
    public String getPrefixListId() {
        return this.prefixListId;
    }

    public CreateVpcPrefixListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateVpcPrefixListResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

}
