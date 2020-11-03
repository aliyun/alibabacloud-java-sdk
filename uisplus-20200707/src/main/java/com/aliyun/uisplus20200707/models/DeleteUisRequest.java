// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DeleteUisRequest extends TeaModel {
    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DeleteUisRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUisRequest self = new DeleteUisRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUisRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DeleteUisRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteUisRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
