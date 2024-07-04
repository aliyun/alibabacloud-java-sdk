// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetTensorboardSharedUrlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>86400</p>
     */
    @NameInMap("ExpireTimeSeconds")
    public String expireTimeSeconds;

    public static GetTensorboardSharedUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTensorboardSharedUrlRequest self = new GetTensorboardSharedUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetTensorboardSharedUrlRequest setExpireTimeSeconds(String expireTimeSeconds) {
        this.expireTimeSeconds = expireTimeSeconds;
        return this;
    }
    public String getExpireTimeSeconds() {
        return this.expireTimeSeconds;
    }

}
