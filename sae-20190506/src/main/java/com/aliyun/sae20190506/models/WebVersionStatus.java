// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebVersionStatus extends TeaModel {
    /**
     * <p>The error message of the application execution. If the execution is successful, a null value is returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The state of the application execution. Valid values:</p>
     * <ul>
     * <li><strong>Completed</strong>: The execution is successful.</li>
     * <li><strong>Updating</strong>:The instance is being updated.</li>
     * <li><strong>Updating</strong>:The execution failed and a non-null error message is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Completed</p>
     */
    @NameInMap("Status")
    public String status;

    public static WebVersionStatus build(java.util.Map<String, ?> map) throws Exception {
        WebVersionStatus self = new WebVersionStatus();
        return TeaModel.build(map, self);
    }

    public WebVersionStatus setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public WebVersionStatus setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
