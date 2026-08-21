// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class DeleteAlertDestinationRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>The ID of the alert contact.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    public Integer id;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static DeleteAlertDestinationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAlertDestinationRequest self = new DeleteAlertDestinationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAlertDestinationRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public DeleteAlertDestinationRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public DeleteAlertDestinationRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
