// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class OperateApplicationRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The operation type. Valid values:</p>
     * <ul>
     * <li><strong>restart</strong>: restart</li>
     * <li><strong>stop</strong>: stop</li>
     * <li><strong>start</strong>: start.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>restart</p>
     */
    @NameInMap("Operation")
    public String operation;

    public static OperateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateApplicationRequest self = new OperateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public OperateApplicationRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public OperateApplicationRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

}
