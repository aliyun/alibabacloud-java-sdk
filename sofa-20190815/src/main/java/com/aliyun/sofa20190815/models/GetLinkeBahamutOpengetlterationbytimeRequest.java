// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetlterationbytimeRequest extends TeaModel {
    @NameInMap("From")
    public String from;

    @NameInMap("Status")
    public String status;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("To")
    public String to;

    public static GetLinkeBahamutOpengetlterationbytimeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetlterationbytimeRequest self = new GetLinkeBahamutOpengetlterationbytimeRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetlterationbytimeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetLinkeBahamutOpengetlterationbytimeRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLinkeBahamutOpengetlterationbytimeRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public GetLinkeBahamutOpengetlterationbytimeRequest setTo(String to) {
        this.to = to;
        return this;
    }
    public String getTo() {
        return this.to;
    }

}
