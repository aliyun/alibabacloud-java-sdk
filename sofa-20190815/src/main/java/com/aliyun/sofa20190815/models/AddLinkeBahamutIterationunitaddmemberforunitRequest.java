// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationunitaddmemberforunitRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static AddLinkeBahamutIterationunitaddmemberforunitRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationunitaddmemberforunitRequest self = new AddLinkeBahamutIterationunitaddmemberforunitRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationunitaddmemberforunitRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public AddLinkeBahamutIterationunitaddmemberforunitRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
