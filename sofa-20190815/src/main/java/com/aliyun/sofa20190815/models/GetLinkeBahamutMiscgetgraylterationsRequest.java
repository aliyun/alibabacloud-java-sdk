// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetgraylterationsRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("To")
    public String to;

    public static GetLinkeBahamutMiscgetgraylterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetgraylterationsRequest self = new GetLinkeBahamutMiscgetgraylterationsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetgraylterationsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetLinkeBahamutMiscgetgraylterationsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetLinkeBahamutMiscgetgraylterationsRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
