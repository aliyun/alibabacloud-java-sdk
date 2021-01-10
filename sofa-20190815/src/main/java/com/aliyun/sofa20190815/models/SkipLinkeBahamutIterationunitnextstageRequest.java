// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SkipLinkeBahamutIterationunitnextstageRequest extends TeaModel {
    @NameInMap("FromStageId")
    public String fromStageId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("ToStageId")
    public String toStageId;

    @NameInMap("UserAccount")
    public String userAccount;

    public static SkipLinkeBahamutIterationunitnextstageRequest build(java.util.Map<String, ?> map) throws Exception {
        SkipLinkeBahamutIterationunitnextstageRequest self = new SkipLinkeBahamutIterationunitnextstageRequest();
        return TeaModel.build(map, self);
    }

    public SkipLinkeBahamutIterationunitnextstageRequest setFromStageId(String fromStageId) {
        this.fromStageId = fromStageId;
        return this;
    }
    public String getFromStageId() {
        return this.fromStageId;
    }

    public SkipLinkeBahamutIterationunitnextstageRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public SkipLinkeBahamutIterationunitnextstageRequest setToStageId(String toStageId) {
        this.toStageId = toStageId;
        return this;
    }
    public String getToStageId() {
        return this.toStageId;
    }

    public SkipLinkeBahamutIterationunitnextstageRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

}
