// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutPaasupdateappsRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("ServerInfo")
    public String serverInfo;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutPaasupdateappsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutPaasupdateappsRequest self = new UpdateLinkeBahamutPaasupdateappsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutPaasupdateappsRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public UpdateLinkeBahamutPaasupdateappsRequest setServerInfo(String serverInfo) {
        this.serverInfo = serverInfo;
        return this;
    }
    public String getServerInfo() {
        return this.serverInfo;
    }

    public UpdateLinkeBahamutPaasupdateappsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
