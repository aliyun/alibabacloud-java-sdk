// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateUnknownThreatDetectStrategyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>F8B6F758-BCD4-597A-8A2C-DA5A552C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateUnknownThreatDetectStrategyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUnknownThreatDetectStrategyResponseBody self = new CreateUnknownThreatDetectStrategyResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUnknownThreatDetectStrategyResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateUnknownThreatDetectStrategyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
