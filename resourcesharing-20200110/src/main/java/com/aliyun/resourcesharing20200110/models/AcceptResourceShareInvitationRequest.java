// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class AcceptResourceShareInvitationRequest extends TeaModel {
    /**
     * <p>The ID of the resource sharing invitation.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/450564.html">ListResourceShareInvitations</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-pMnItMX19fBJ****</p>
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
