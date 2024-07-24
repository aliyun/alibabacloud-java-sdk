// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetTaskStatusResponseBody extends TeaModel {
    /**
     * <p>The state of the task.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>running</p>
     * <!-- -->
     * 
     * <p>: The task is</p>
     * <!-- -->
     * 
     * <p>running</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>failed</p>
     * <!-- -->
     * 
     * <p>: The task</p>
     * <!-- -->
     * 
     * <p>fails</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * <li><p>succeeded</p>
     * <!-- -->
     * 
     * <p>: The task is</p>
     * <!-- -->
     * 
     * <p>successful</p>
     * <!-- -->
     * 
     * <p>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("status")
    public String status;

    public static GetTaskStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTaskStatusResponseBody self = new GetTaskStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTaskStatusResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
