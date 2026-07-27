// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartPolarClawGatewayRequest extends TeaModel {
    /**
     * <p>The application ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-xxx</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The restart mode. Valid values:</p>
     * <ul>
     * <li>in-process: lightweight restart without applying environment variable changes. This is the default value.</li>
     * <li>pkill: cold start that applies environment variable changes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>in-process</p>
     */
    @NameInMap("Mode")
    public String mode;

    public static RestartPolarClawGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartPolarClawGatewayRequest self = new RestartPolarClawGatewayRequest();
        return TeaModel.build(map, self);
    }

    public RestartPolarClawGatewayRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public RestartPolarClawGatewayRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

}
