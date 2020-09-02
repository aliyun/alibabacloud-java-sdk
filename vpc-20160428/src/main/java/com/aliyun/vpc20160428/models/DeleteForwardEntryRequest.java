// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteForwardEntryRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ForwardTableId")
    @Validation(required = true)
    public String forwardTableId;

    @NameInMap("ForwardEntryId")
    @Validation(required = true)
    public String forwardEntryId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static DeleteForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteForwardEntryRequest self = new DeleteForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteForwardEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteForwardEntryRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public DeleteForwardEntryRequest setForwardEntryId(String forwardEntryId) {
        this.forwardEntryId = forwardEntryId;
        return this;
    }
    public String getForwardEntryId() {
        return this.forwardEntryId;
    }

    public DeleteForwardEntryRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
