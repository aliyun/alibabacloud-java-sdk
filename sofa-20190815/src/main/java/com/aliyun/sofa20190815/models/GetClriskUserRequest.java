// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskUserRequest extends TeaModel {
    @NameInMap("OriginId")
    public String originId;

    public static GetClriskUserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskUserRequest self = new GetClriskUserRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskUserRequest setOriginId(String originId) {
        this.originId = originId;
        return this;
    }
    public String getOriginId() {
        return this.originId;
    }

}
