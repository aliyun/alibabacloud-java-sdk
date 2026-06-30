// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DeleteSandboxTemplateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ra-supabase-8moov5lxba****</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <strong>example:</strong>
     * <p>FE9C65D7-930F-57A5-A207-8C396329****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSandboxTemplateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSandboxTemplateResponseBody self = new DeleteSandboxTemplateResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSandboxTemplateResponseBody setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public DeleteSandboxTemplateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
