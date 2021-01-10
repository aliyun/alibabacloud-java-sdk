// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternaluncloseddefectnumbeRequest extends TeaModel {
    @NameInMap("AssignToMe")
    public String assignToMe;

    @NameInMap("ExternalId")
    public String externalId;

    public static GetLinkeBahamutAoneinternaluncloseddefectnumbeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternaluncloseddefectnumbeRequest self = new GetLinkeBahamutAoneinternaluncloseddefectnumbeRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeRequest setAssignToMe(String assignToMe) {
        this.assignToMe = assignToMe;
        return this;
    }
    public String getAssignToMe() {
        return this.assignToMe;
    }

    public GetLinkeBahamutAoneinternaluncloseddefectnumbeRequest setExternalId(String externalId) {
        this.externalId = externalId;
        return this;
    }
    public String getExternalId() {
        return this.externalId;
    }

}
