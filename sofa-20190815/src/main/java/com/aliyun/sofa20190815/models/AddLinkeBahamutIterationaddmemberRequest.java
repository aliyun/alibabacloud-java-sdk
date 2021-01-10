// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationaddmemberRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static AddLinkeBahamutIterationaddmemberRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationaddmemberRequest self = new AddLinkeBahamutIterationaddmemberRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationaddmemberRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public AddLinkeBahamutIterationaddmemberRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public AddLinkeBahamutIterationaddmemberRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
