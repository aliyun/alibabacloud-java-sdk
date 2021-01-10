// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ConfirmAKSProductsEnabledRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    public static ConfirmAKSProductsEnabledRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmAKSProductsEnabledRequest self = new ConfirmAKSProductsEnabledRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmAKSProductsEnabledRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
