// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAlluserRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    public static GetLinkeBahamutAlluserRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAlluserRequest self = new GetLinkeBahamutAlluserRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAlluserRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

}
