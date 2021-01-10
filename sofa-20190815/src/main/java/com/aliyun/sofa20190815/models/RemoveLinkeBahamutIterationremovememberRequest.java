// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeBahamutIterationremovememberRequest extends TeaModel {
    @NameInMap("Account")
    public String account;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static RemoveLinkeBahamutIterationremovememberRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeBahamutIterationremovememberRequest self = new RemoveLinkeBahamutIterationremovememberRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeBahamutIterationremovememberRequest setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return this.account;
    }

    public RemoveLinkeBahamutIterationremovememberRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public RemoveLinkeBahamutIterationremovememberRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
