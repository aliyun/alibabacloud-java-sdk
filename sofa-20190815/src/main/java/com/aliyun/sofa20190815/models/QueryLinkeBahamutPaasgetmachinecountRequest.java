// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutPaasgetmachinecountRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    public static QueryLinkeBahamutPaasgetmachinecountRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutPaasgetmachinecountRequest self = new QueryLinkeBahamutPaasgetmachinecountRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutPaasgetmachinecountRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
