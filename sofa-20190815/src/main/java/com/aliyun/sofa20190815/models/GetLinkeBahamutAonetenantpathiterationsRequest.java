// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAonetenantpathiterationsRequest extends TeaModel {
    @NameInMap("Q")
    public String q;

    @NameInMap("TenantPath")
    public String tenantPath;

    @NameInMap("Value")
    public String value;

    public static GetLinkeBahamutAonetenantpathiterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAonetenantpathiterationsRequest self = new GetLinkeBahamutAonetenantpathiterationsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAonetenantpathiterationsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

    public GetLinkeBahamutAonetenantpathiterationsRequest setTenantPath(String tenantPath) {
        this.tenantPath = tenantPath;
        return this;
    }
    public String getTenantPath() {
        return this.tenantPath;
    }

    public GetLinkeBahamutAonetenantpathiterationsRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
