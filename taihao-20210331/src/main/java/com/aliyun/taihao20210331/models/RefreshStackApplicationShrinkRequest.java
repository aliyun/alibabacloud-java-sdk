// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RefreshStackApplicationShrinkRequest extends TeaModel {
    @NameInMap("refreshStackApplicationParam")
    public String refreshStackApplicationParamShrink;

    public static RefreshStackApplicationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshStackApplicationShrinkRequest self = new RefreshStackApplicationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RefreshStackApplicationShrinkRequest setRefreshStackApplicationParamShrink(String refreshStackApplicationParamShrink) {
        this.refreshStackApplicationParamShrink = refreshStackApplicationParamShrink;
        return this;
    }
    public String getRefreshStackApplicationParamShrink() {
        return this.refreshStackApplicationParamShrink;
    }

}
