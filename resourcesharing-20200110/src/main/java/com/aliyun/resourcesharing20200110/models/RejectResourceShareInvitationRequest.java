// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class RejectResourceShareInvitationRequest extends TeaModel {
    /**
     * <p>The ID of the resource sharing invitation.</p>
     * <br>
     * <p>You can call the [ListResourceShareInvitations](~~450564~~) operation to obtain the ID of a resource sharing invitation.</p>
     */
    @NameInMap("ResourceShareInvitationId")
    public String resourceShareInvitationId;

    public static RejectResourceShareInvitationRequest build(java.util.Map<String, ?> map) throws Exception {
        RejectResourceShareInvitationRequest self = new RejectResourceShareInvitationRequest();
        return TeaModel.build(map, self);
    }

    public RejectResourceShareInvitationRequest setResourceShareInvitationId(String resourceShareInvitationId) {
        this.resourceShareInvitationId = resourceShareInvitationId;
        return this;
    }
    public String getResourceShareInvitationId() {
        return this.resourceShareInvitationId;
    }

}
