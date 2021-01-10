// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutIterationunitnextstagecheckRequest extends TeaModel {
    @NameInMap("FromStageId")
    public String fromStageId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("ToStageId")
    public String toStageId;

    @NameInMap("UserAccount")
    public String userAccount;

    public static CheckLinkeBahamutIterationunitnextstagecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutIterationunitnextstagecheckRequest self = new CheckLinkeBahamutIterationunitnextstagecheckRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutIterationunitnextstagecheckRequest setFromStageId(String fromStageId) {
        this.fromStageId = fromStageId;
        return this;
    }
    public String getFromStageId() {
        return this.fromStageId;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckRequest setToStageId(String toStageId) {
        this.toStageId = toStageId;
        return this;
    }
    public String getToStageId() {
        return this.toStageId;
    }

    public CheckLinkeBahamutIterationunitnextstagecheckRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
