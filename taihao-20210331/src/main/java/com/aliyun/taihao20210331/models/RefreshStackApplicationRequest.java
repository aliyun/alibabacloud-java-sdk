// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class RefreshStackApplicationRequest extends TeaModel {
    @NameInMap("refreshStackApplicationParam")
    public RefreshStackApplicationParam refreshStackApplicationParam;

    public static RefreshStackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshStackApplicationRequest self = new RefreshStackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public RefreshStackApplicationRequest setRefreshStackApplicationParam(RefreshStackApplicationParam refreshStackApplicationParam) {
        this.refreshStackApplicationParam = refreshStackApplicationParam;
        return this;
    }
    public RefreshStackApplicationParam getRefreshStackApplicationParam() {
        return this.refreshStackApplicationParam;
    }

}
