// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetLoginUserInfoResponseBody extends TeaModel {
    @NameInMap("result")
    public BucUser result;

    public static GetLoginUserInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLoginUserInfoResponseBody self = new GetLoginUserInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLoginUserInfoResponseBody setResult(BucUser result) {
        this.result = result;
        return this;
    }
    public BucUser getResult() {
        return this.result;
    }

}
