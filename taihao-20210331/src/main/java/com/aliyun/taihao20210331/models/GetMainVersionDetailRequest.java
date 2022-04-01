// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetMainVersionDetailRequest extends TeaModel {
    @NameInMap("getMainVersionDetailParam")
    public GetMainVersionDetailParam getMainVersionDetailParam;

    public static GetMainVersionDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMainVersionDetailRequest self = new GetMainVersionDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetMainVersionDetailRequest setGetMainVersionDetailParam(GetMainVersionDetailParam getMainVersionDetailParam) {
        this.getMainVersionDetailParam = getMainVersionDetailParam;
        return this;
    }
    public GetMainVersionDetailParam getGetMainVersionDetailParam() {
        return this.getMainVersionDetailParam;
    }

}
