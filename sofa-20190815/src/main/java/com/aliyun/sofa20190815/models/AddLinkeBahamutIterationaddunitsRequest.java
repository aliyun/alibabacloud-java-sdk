// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutIterationaddunitsRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("UserAccount")
    public String userAccount;

    @NameInMap("UnitFormsRepeatList")
    public java.util.List<String> unitFormsRepeatList;

    public static AddLinkeBahamutIterationaddunitsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutIterationaddunitsRequest self = new AddLinkeBahamutIterationaddunitsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutIterationaddunitsRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public AddLinkeBahamutIterationaddunitsRequest setUserAccount(String userAccount) {
        this.userAccount = userAccount;
        return this;
    }
    public String getUserAccount() {
        return this.userAccount;
    }

    public AddLinkeBahamutIterationaddunitsRequest setUnitFormsRepeatList(java.util.List<String> unitFormsRepeatList) {
        this.unitFormsRepeatList = unitFormsRepeatList;
        return this;
    }
    public java.util.List<String> getUnitFormsRepeatList() {
        return this.unitFormsRepeatList;
    }

}
