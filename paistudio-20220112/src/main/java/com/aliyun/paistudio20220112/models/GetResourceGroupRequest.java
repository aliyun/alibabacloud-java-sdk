// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupRequest extends TeaModel {
    @NameInMap("IsAIWorkspaceDataEnabled")
    public Boolean isAIWorkspaceDataEnabled;

    public static GetResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupRequest self = new GetResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupRequest setIsAIWorkspaceDataEnabled(Boolean isAIWorkspaceDataEnabled) {
        this.isAIWorkspaceDataEnabled = isAIWorkspaceDataEnabled;
        return this;
    }
    public Boolean getIsAIWorkspaceDataEnabled() {
        return this.isAIWorkspaceDataEnabled;
    }

}
