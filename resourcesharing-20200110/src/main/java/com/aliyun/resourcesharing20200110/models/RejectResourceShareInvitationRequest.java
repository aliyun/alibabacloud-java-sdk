// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class RejectResourceShareInvitationRequest extends TeaModel {
    /**
     * <p>The ID of the resource sharing invitation.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/450564.html">ListResourceShareInvitations</a> operation to obtain the ID of a resource sharing invitation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-yyTWbkjHArYh****</p>
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
