// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CancelClusterOrdersRequest extends TeaModel {
    // cancelClusterOrdersParam
    @NameInMap("cancelClusterOrdersParam")
    public CancelClusterOrdersParam cancelClusterOrdersParam;

    public static CancelClusterOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelClusterOrdersRequest self = new CancelClusterOrdersRequest();
        return TeaModel.build(map, self);
    }

    public CancelClusterOrdersRequest setCancelClusterOrdersParam(CancelClusterOrdersParam cancelClusterOrdersParam) {
        this.cancelClusterOrdersParam = cancelClusterOrdersParam;
        return this;
    }
    public CancelClusterOrdersParam getCancelClusterOrdersParam() {
        return this.cancelClusterOrdersParam;
    }

}
