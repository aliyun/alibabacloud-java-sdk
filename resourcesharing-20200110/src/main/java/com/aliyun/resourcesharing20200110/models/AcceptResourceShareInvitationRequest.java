// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AcceptResourceShareInvitationRequest extends TeaModel {
    /**
     * <p>The ID of the invitation.</p>
     */
    @NameInMap("ResourceShareInvitationId")
    public String resourceShareInvitationId;

    public static AcceptResourceShareInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        AcceptResourceShareInvitationRequest self = new AcceptResourceShareInvitationRequest();
        return TeaModel.build(map, self);
    }

    public AcceptResourceShareInvitationRequest setResourceShareInvitationId(String resourceShareInvitationId) {
        this.resourceShareInvitationId = resourceShareInvitationId;
        return this;
    }
    public String getResourceShareInvitationId() {
        return this.resourceShareInvitationId;
    }

}
