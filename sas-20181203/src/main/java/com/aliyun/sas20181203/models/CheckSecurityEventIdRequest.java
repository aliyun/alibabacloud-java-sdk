// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CheckSecurityEventIdRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    @NameInMap("SecurityEventIds")
    public java.util.List<String> securityEventIds;

    public static CheckSecurityEventIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckSecurityEventIdRequest self = new CheckSecurityEventIdRequest();
        return TeaModel.build(map, self);
    }

    public CheckSecurityEventIdRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public CheckSecurityEventIdRequest setSecurityEventIds(java.util.List<String> securityEventIds) {
        this.securityEventIds = securityEventIds;
        return this;
    }
    public java.util.List<String> getSecurityEventIds() {
        return this.securityEventIds;
    }

}
