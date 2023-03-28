// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the BGP group.</p>
     */
    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateBgpGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateBgpGroupResponseBody self = new CreateBgpGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateBgpGroupResponseBody setBgpGroupId(String bgpGroupId) {
        this.bgpGroupId = bgpGroupId;
        return this;
    }
    public String getBgpGroupId() {
        return this.bgpGroupId;
    }

    public CreateBgpGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
