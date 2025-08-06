// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DisplayAIAuditSwitchRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    public static DisplayAIAuditSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        DisplayAIAuditSwitchRequest self = new DisplayAIAuditSwitchRequest();
        return TeaModel.build(map, self);
    }

    public DisplayAIAuditSwitchRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
