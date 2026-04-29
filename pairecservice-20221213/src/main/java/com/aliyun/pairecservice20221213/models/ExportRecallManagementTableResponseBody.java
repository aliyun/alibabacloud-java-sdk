// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class ExportRecallManagementTableResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallManagementJobId")
    public String recallManagementJobId;

    /**
     * <strong>example:</strong>
     * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ExportRecallManagementTableResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExportRecallManagementTableResponseBody self = new ExportRecallManagementTableResponseBody();
        return TeaModel.build(map, self);
    }

    public ExportRecallManagementTableResponseBody setRecallManagementJobId(String recallManagementJobId) {
        this.recallManagementJobId = recallManagementJobId;
        return this;
    }
    public String getRecallManagementJobId() {
        return this.recallManagementJobId;
    }

    public ExportRecallManagementTableResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
