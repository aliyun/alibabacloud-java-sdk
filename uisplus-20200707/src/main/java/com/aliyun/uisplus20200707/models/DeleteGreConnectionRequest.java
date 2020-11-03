// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DeleteGreConnectionRequest extends TeaModel {
    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("GreConnectionId")
    @Validation(required = true)
    public String greConnectionId;

    public static DeleteGreConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteGreConnectionRequest self = new DeleteGreConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteGreConnectionRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DeleteGreConnectionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteGreConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteGreConnectionRequest setGreConnectionId(String greConnectionId) {
        this.greConnectionId = greConnectionId;
        return this;
    }
    public String getGreConnectionId() {
        return this.greConnectionId;
    }

}
