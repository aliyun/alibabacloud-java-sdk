// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateAssetWatchResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public CatalogCommonResult result;

    public static CreateAssetWatchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetWatchResponseBody self = new CreateAssetWatchResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAssetWatchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateAssetWatchResponseBody setResult(CatalogCommonResult result) {
        this.result = result;
        return this;
    }
    public CatalogCommonResult getResult() {
        return this.result;
    }

}
