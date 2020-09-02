// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpGroupResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("BgpGroupId")
    @Validation(required = true)
    public String bgpGroupId;

    public static CreateBgpGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpGroupResponse self = new CreateBgpGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateBgpGroupResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateBgpGroupResponse setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

}
