// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class RecieveUserMessageRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("CustomerMessageModelListStr")
    public String customerMessageModelListStr;

    public static RecieveUserMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        RecieveUserMessageRequest self = new RecieveUserMessageRequest();
        return TeaModel.build(map, self);
    }

    public RecieveUserMessageRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public RecieveUserMessageRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public RecieveUserMessageRequest setCustomerMessageModelListStr(String customerMessageModelListStr) {
        this.customerMessageModelListStr = customerMessageModelListStr;
        return this;
    }
    public String getCustomerMessageModelListStr() {
        return this.customerMessageModelListStr;
    }

}
