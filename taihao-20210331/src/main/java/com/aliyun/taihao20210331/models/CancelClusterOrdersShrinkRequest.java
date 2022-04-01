// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CancelClusterOrdersShrinkRequest extends TeaModel {
    // cancelClusterOrdersParam
    @NameInMap("cancelClusterOrdersParam")
    public String cancelClusterOrdersParamShrink;

    public static CancelClusterOrdersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelClusterOrdersShrinkRequest self = new CancelClusterOrdersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CancelClusterOrdersShrinkRequest setCancelClusterOrdersParamShrink(String cancelClusterOrdersParamShrink) {
        this.cancelClusterOrdersParamShrink = cancelClusterOrdersParamShrink;
        return this;
    }
    public String getCancelClusterOrdersParamShrink() {
        return this.cancelClusterOrdersParamShrink;
    }

}
