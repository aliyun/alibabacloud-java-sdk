// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutMiscgetreleasedunitRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("From")
    public String from;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("To")
    public String to;

    public static GetLinkeBahamutMiscgetreleasedunitRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutMiscgetreleasedunitRequest self = new GetLinkeBahamutMiscgetreleasedunitRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutMiscgetreleasedunitRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutMiscgetreleasedunitRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetLinkeBahamutMiscgetreleasedunitRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetLinkeBahamutMiscgetreleasedunitRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
