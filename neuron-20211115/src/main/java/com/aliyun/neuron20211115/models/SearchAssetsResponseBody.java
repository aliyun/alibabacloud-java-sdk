// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class SearchAssetsResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public java.util.List<DTO> result;

    public static SearchAssetsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAssetsResponseBody self = new SearchAssetsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAssetsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAssetsResponseBody setResult(java.util.List<DTO> result) {
        this.result = result;
        return this;
    }
    public java.util.List<DTO> getResult() {
        return this.result;
    }

}
