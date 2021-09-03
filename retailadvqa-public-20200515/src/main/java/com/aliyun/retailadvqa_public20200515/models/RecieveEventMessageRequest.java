// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class RecieveEventMessageRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("EventMessageModelListStr")
    public String eventMessageModelListStr;

    public static RecieveEventMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecieveEventMessageRequest self = new RecieveEventMessageRequest();
        return TeaModel.build(map, self);
    }

    public RecieveEventMessageRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public RecieveEventMessageRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public RecieveEventMessageRequest setEventMessageModelListStr(String eventMessageModelListStr) {
        this.eventMessageModelListStr = eventMessageModelListStr;
        return this;
    }
    public String getEventMessageModelListStr() {
        return this.eventMessageModelListStr;
    }

}
