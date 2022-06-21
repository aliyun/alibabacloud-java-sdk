// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qssj20220112.models;

import com.aliyun.tea.*;

public class GetTrendImageDetailRequest extends TeaModel {
    @NameInMap("AiImgId")
    public String aiImgId;

    public static GetTrendImageDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrendImageDetailRequest self = new GetTrendImageDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetTrendImageDetailRequest setAiImgId(String aiImgId) {
        this.aiImgId = aiImgId;
        return this;
    }
    public String getAiImgId() {
        return this.aiImgId;
    }

}
