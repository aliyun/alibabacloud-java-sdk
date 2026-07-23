// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementTableResponseBody extends TeaModel {
    /**
     * <p><strong>The ID of the recall management table.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RecallManagementTableId")
    public String recallManagementTableId;

    /**
     * <p><strong>The ID of the request.</strong></p>
     * 
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecallManagementTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementTableResponseBody self = new CreateRecallManagementTableResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementTableResponseBody setRecallManagementTableId(String recallManagementTableId) {
        this.recallManagementTableId = recallManagementTableId;
        return this;
    }
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    public CreateRecallManagementTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
