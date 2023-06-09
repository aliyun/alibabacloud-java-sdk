// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateABTestFixedFlowDividersRequest extends TeaModel {
    @NameInMap("body")
    public java.util.List<String> body;

    public static UpdateABTestFixedFlowDividersRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateABTestFixedFlowDividersRequest self = new UpdateABTestFixedFlowDividersRequest();
        return TeaModel.build(map, self);
    }

    public UpdateABTestFixedFlowDividersRequest setBody(java.util.List<String> body) {
        this.body = body;
        return this;
    }
    public java.util.List<String> getBody() {
        return this.body;
    }

}
