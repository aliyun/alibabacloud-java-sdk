// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class GetUnditerminedRequestRequest extends TeaModel {
    @NameInMap("OriginRequestId")
    public String originRequestId;

    public static GetUnditerminedRequestRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnditerminedRequestRequest self = new GetUnditerminedRequestRequest();
        return TeaModel.build(map, self);
    }

    public GetUnditerminedRequestRequest setOriginRequestId(String originRequestId) {
        this.originRequestId = originRequestId;
        return this;
    }
    public String getOriginRequestId() {
        return this.originRequestId;
    }

}
