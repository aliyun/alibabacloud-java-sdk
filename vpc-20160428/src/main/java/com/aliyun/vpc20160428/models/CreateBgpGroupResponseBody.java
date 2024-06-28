// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateBgpGroupResponseBody extends TeaModel {
    /**
     * <p>The ID of the BGP group.</p>
     * 
     * <strong>example:</strong>
     * <p>bgpg-bp1k25cyp26cllath****</p>
     */
    @NameInMap("BgpGroupId")
    public String bgpGroupId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C1221A1F-2ACD-4592-8F27-474E02883159</p>
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
