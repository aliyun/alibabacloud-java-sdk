// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class GetStackApplicationRequest extends TeaModel {
    @NameInMap("getStackApplicationParam")
    public GetStackApplicationParam getStackApplicationParam;

    public static GetStackApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackApplicationRequest self = new GetStackApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetStackApplicationRequest setGetStackApplicationParam(GetStackApplicationParam getStackApplicationParam) {
        this.getStackApplicationParam = getStackApplicationParam;
        return this;
    }
    public GetStackApplicationParam getGetStackApplicationParam() {
        return this.getStackApplicationParam;
    }

}
