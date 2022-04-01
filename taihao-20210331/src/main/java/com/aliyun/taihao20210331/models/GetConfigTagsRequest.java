// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetConfigTagsRequest extends TeaModel {
    // getConfigTagsParam
    @NameInMap("getConfigTagsParam")
    public GetConfigTagsParam getConfigTagsParam;

    public static GetConfigTagsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConfigTagsRequest self = new GetConfigTagsRequest();
        return TeaModel.build(map, self);
    }

    public GetConfigTagsRequest setGetConfigTagsParam(GetConfigTagsParam getConfigTagsParam) {
        this.getConfigTagsParam = getConfigTagsParam;
        return this;
    }
    public GetConfigTagsParam getGetConfigTagsParam() {
        return this.getConfigTagsParam;
    }

}
