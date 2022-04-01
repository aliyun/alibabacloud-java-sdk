// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetClusterScriptDetailShrinkRequest extends TeaModel {
    // getClusterScriptDetailParam
    @NameInMap("getClusterScriptDetailParam")
    public String getClusterScriptDetailParamShrink;

    public static GetClusterScriptDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClusterScriptDetailShrinkRequest self = new GetClusterScriptDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetClusterScriptDetailShrinkRequest setGetClusterScriptDetailParamShrink(String getClusterScriptDetailParamShrink) {
        this.getClusterScriptDetailParamShrink = getClusterScriptDetailParamShrink;
        return this;
    }
    public String getGetClusterScriptDetailParamShrink() {
        return this.getClusterScriptDetailParamShrink;
    }

}
