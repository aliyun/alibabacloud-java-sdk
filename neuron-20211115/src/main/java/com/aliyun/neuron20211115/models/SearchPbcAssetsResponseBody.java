// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchPbcAssetsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public PbcListResult result;

    public static SearchPbcAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchPbcAssetsResponseBody self = new SearchPbcAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchPbcAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchPbcAssetsResponseBody setResult(PbcListResult result) {
        this.result = result;
        return this;
    }
    public PbcListResult getResult() {
        return this.result;
    }

}
