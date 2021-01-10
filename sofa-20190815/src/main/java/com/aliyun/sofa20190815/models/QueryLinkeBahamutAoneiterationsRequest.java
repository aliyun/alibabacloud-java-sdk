// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAoneiterationsRequest extends TeaModel {
    @NameInMap("BahamutTenant")
    public String bahamutTenant;

    @NameInMap("Q")
    public String q;

    @NameInMap("Value")
    public String value;

    public static QueryLinkeBahamutAoneiterationsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAoneiterationsRequest self = new QueryLinkeBahamutAoneiterationsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAoneiterationsRequest setBahamutTenant(String bahamutTenant) {
        this.bahamutTenant = bahamutTenant;
        return this;
    }
    public String getBahamutTenant() {
        return this.bahamutTenant;
    }

    public QueryLinkeBahamutAoneiterationsRequest setQ(String q) {
        this.q = q;
        return this;
    }
    public String getQ() {
        return this.q;
    }

    public QueryLinkeBahamutAoneiterationsRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
