// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CreateRecallManagementServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallManagementServiceId")
    public String recallManagementServiceId;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RecallManagementServiceVersionId")
    public String recallManagementServiceVersionId;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRecallManagementServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRecallManagementServiceResponseBody self = new CreateRecallManagementServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRecallManagementServiceResponseBody setRecallManagementServiceId(String recallManagementServiceId) {
        this.recallManagementServiceId = recallManagementServiceId;
        return this;
    }
    public String getRecallManagementServiceId() {
        return this.recallManagementServiceId;
    }

    public CreateRecallManagementServiceResponseBody setRecallManagementServiceVersionId(String recallManagementServiceVersionId) {
        this.recallManagementServiceVersionId = recallManagementServiceVersionId;
        return this;
    }
    public String getRecallManagementServiceVersionId() {
        return this.recallManagementServiceVersionId;
    }

    public CreateRecallManagementServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
