// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetAlertDestinationRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The alert contact ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Integer id;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static GetAlertDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlertDestinationRequest self = new GetAlertDestinationRequest();
        return TeaModel.build(map, self);
    }

    public GetAlertDestinationRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public GetAlertDestinationRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetAlertDestinationRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
