// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogLogsresultRequest extends TeaModel {
    @NameInMap("LogId")
    public String logId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeLinklogLogsresultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogLogsresultRequest self = new GetLinkeLinklogLogsresultRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogLogsresultRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public GetLinkeLinklogLogsresultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
