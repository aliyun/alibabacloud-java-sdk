// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CreateAssetWatchRequest extends TeaModel {
    @NameInMap("body")
    public CreateAssetWatchCmd body;

    public static CreateAssetWatchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAssetWatchRequest self = new CreateAssetWatchRequest();
        return TeaModel.build(map, self);
    }

    public CreateAssetWatchRequest setBody(CreateAssetWatchCmd body) {
        this.body = body;
        return this;
    }
    public CreateAssetWatchCmd getBody() {
        return this.body;
    }

}
