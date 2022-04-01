// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterScriptDetailRequest extends TeaModel {
    // getClusterScriptDetailParam
    @NameInMap("getClusterScriptDetailParam")
    public GetClusterScriptDetailParam getClusterScriptDetailParam;

    public static GetClusterScriptDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScriptDetailRequest self = new GetClusterScriptDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterScriptDetailRequest setGetClusterScriptDetailParam(GetClusterScriptDetailParam getClusterScriptDetailParam) {
        this.getClusterScriptDetailParam = getClusterScriptDetailParam;
        return this;
    }
    public GetClusterScriptDetailParam getGetClusterScriptDetailParam() {
        return this.getClusterScriptDetailParam;
    }

}
