// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceVersionConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallManagementServiceVersionConfigId")
    public String recallManagementServiceVersionConfigId;

    /**
     * <strong>example:</strong>
     * <p>F8F613A9-DF1C-551A-88E1-397A3981A785</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecallManagementServiceVersionConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceVersionConfigResponseBody self = new CreateRecallManagementServiceVersionConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceVersionConfigResponseBody setRecallManagementServiceVersionConfigId(String recallManagementServiceVersionConfigId) {
        this.recallManagementServiceVersionConfigId = recallManagementServiceVersionConfigId;
        return this;
    }
    public String getRecallManagementServiceVersionConfigId() {
        return this.recallManagementServiceVersionConfigId;
    }

    public CreateRecallManagementServiceVersionConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
