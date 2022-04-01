// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetApplicationActionsRequest extends TeaModel {
    // getApplicationActionsParam
    @NameInMap("getApplicationActionsParam")
    public GetApplicationActionsParam getApplicationActionsParam;

    public static GetApplicationActionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationActionsRequest self = new GetApplicationActionsRequest();
        return TeaModel.build(map, self);
    }

    public GetApplicationActionsRequest setGetApplicationActionsParam(GetApplicationActionsParam getApplicationActionsParam) {
        this.getApplicationActionsParam = getApplicationActionsParam;
        return this;
    }
    public GetApplicationActionsParam getGetApplicationActionsParam() {
        return this.getApplicationActionsParam;
    }

}
