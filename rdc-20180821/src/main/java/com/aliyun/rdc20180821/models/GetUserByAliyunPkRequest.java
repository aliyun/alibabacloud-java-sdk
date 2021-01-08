// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetUserByAliyunPkRequest extends TeaModel {
    @NameInMap("Pk")
    public String pk;

    public static GetUserByAliyunPkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserByAliyunPkRequest self = new GetUserByAliyunPkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserByAliyunPkRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
