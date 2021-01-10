// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPaasgetreleasedappRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("To")
    public String to;

    public static GetLinkeBahamutPaasgetreleasedappRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPaasgetreleasedappRequest self = new GetLinkeBahamutPaasgetreleasedappRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPaasgetreleasedappRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetLinkeBahamutPaasgetreleasedappRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetLinkeBahamutPaasgetreleasedappRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
