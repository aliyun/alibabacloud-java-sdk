// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetBodyOptionsRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    public static GetBodyOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBodyOptionsRequest self = new GetBodyOptionsRequest();
        return TeaModel.build(map, self);
    }

    public GetBodyOptionsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
