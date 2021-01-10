// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogLogsbizinfoRequest extends TeaModel {
    @NameInMap("LogId")
    public String logId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeLinklogLogsbizinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogLogsbizinfoRequest self = new GetLinkeLinklogLogsbizinfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogLogsbizinfoRequest setLogId(String logId) {
        this.logId = logId;
        return this;
    }
    public String getLogId() {
        return this.logId;
    }

    public GetLinkeLinklogLogsbizinfoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
