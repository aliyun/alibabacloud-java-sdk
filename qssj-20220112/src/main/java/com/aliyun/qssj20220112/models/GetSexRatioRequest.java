// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetSexRatioRequest extends TeaModel {
    @NameInMap("CateIds")
    public String cateIds;

    public static GetSexRatioRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSexRatioRequest self = new GetSexRatioRequest();
        return TeaModel.build(map, self);
    }

    public GetSexRatioRequest setCateIds(String cateIds) {
        this.cateIds = cateIds;
        return this;
    }
    public String getCateIds() {
        return this.cateIds;
    }

}
