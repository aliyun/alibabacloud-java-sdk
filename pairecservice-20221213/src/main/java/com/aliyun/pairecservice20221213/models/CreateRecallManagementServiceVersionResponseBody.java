// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceVersionResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallManagementServiceVersionId")
    public String recallManagementServiceVersionId;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecallManagementServiceVersionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceVersionResponseBody self = new CreateRecallManagementServiceVersionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceVersionResponseBody setRecallManagementServiceVersionId(String recallManagementServiceVersionId) {
        this.recallManagementServiceVersionId = recallManagementServiceVersionId;
        return this;
    }
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    public CreateRecallManagementServiceVersionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
