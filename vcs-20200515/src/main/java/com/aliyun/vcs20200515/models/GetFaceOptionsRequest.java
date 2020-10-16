// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class GetFaceOptionsRequest extends TeaModel {
    @NameInMap("CorpId")
    public String corpId;

    public static GetFaceOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFaceOptionsRequest self = new GetFaceOptionsRequest();
        return TeaModel.build(map, self);
    }

    public GetFaceOptionsRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
