// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ResultCallbackRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("HandleReason")
    public String handleReason;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Status")
    public Integer status;

    public static ResultCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        ResultCallbackRequest self = new ResultCallbackRequest();
        return TeaModel.build(map, self);
    }

    public ResultCallbackRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ResultCallbackRequest setHandleReason(String handleReason) {
        this.handleReason = handleReason;
        return this;
    }
    public String getHandleReason() {
        return this.handleReason;
    }

    public ResultCallbackRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
