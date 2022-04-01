// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetMainVersionDetailShrinkRequest extends TeaModel {
    @NameInMap("getMainVersionDetailParam")
    public String getMainVersionDetailParamShrink;

    public static GetMainVersionDetailShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMainVersionDetailShrinkRequest self = new GetMainVersionDetailShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetMainVersionDetailShrinkRequest setGetMainVersionDetailParamShrink(String getMainVersionDetailParamShrink) {
        this.getMainVersionDetailParamShrink = getMainVersionDetailParamShrink;
        return this;
    }
    public String getGetMainVersionDetailParamShrink() {
        return this.getMainVersionDetailParamShrink;
    }

}
