// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateEngineConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EngineConfigId")
    public String engineConfigId;

    /**
     * <strong>example:</strong>
     * <p>E15A1443-7917-5BE0-AE70-25538ECF398D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEngineConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEngineConfigResponseBody self = new CreateEngineConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEngineConfigResponseBody setEngineConfigId(String engineConfigId) {
        this.engineConfigId = engineConfigId;
        return this;
    }
    public String getEngineConfigId() {
        return this.engineConfigId;
    }

    public CreateEngineConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
