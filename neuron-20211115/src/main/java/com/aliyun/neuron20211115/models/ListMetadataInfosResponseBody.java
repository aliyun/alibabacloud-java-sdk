// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMetadataInfosResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("result")
    public MetadataInfoListResult result;

    public static ListMetadataInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMetadataInfosResponseBody self = new ListMetadataInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMetadataInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMetadataInfosResponseBody setResult(MetadataInfoListResult result) {
        this.result = result;
        return this;
    }
    public MetadataInfoListResult getResult() {
        return this.result;
    }

}
