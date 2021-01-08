// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdc20180821.models;

import com.aliyun.tea.*;

public class GetBindedUserByDingIdRequest extends TeaModel {
    @NameInMap("DingId")
    public String dingId;

    public static GetBindedUserByDingIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBindedUserByDingIdRequest self = new GetBindedUserByDingIdRequest();
        return TeaModel.build(map, self);
    }

    public GetBindedUserByDingIdRequest setDingId(String dingId) {
        this.dingId = dingId;
        return this;
    }
    public String getDingId() {
        return this.dingId;
    }

}
