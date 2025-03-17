// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ResultCallbackRequest extends TeaModel {
    /**
     * <p>The ID of the approval process.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c5ea0db8-<strong><strong>-</strong></strong>-9081-04bc0df4c6a3</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The reason for the approval.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>You are not a Division A analyst.</p>
     */
    @NameInMap("HandleReason")
    public String handleReason;

    /**
     * <p>Approval result:</p>
     * <ul>
     * <li>1: passed</li>
     * <li>2: rejected</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
