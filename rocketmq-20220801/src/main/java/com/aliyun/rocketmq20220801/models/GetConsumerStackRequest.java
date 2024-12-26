// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetConsumerStackRequest extends TeaModel {
    /**
     * <p>The client ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.26.76.48@Lqd7dImlp9KJ5V84</p>
     */
    @NameInMap("clientId")
    public String clientId;

    public static GetConsumerStackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetConsumerStackRequest self = new GetConsumerStackRequest();
        return TeaModel.build(map, self);
    }

    public GetConsumerStackRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

}
