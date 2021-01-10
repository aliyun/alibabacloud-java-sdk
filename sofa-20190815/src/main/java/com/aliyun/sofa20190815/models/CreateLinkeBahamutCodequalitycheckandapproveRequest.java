// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCodequalitycheckandapproveRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("AppListRepeatList")
    public java.util.List<String> appListRepeatList;

    public static CreateLinkeBahamutCodequalitycheckandapproveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCodequalitycheckandapproveRequest self = new CreateLinkeBahamutCodequalitycheckandapproveRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCodequalitycheckandapproveRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CreateLinkeBahamutCodequalitycheckandapproveRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public CreateLinkeBahamutCodequalitycheckandapproveRequest setAppListRepeatList(java.util.List<String> appListRepeatList) {
        this.appListRepeatList = appListRepeatList;
        return this;
    }
    public java.util.List<String> getAppListRepeatList() {
        return this.appListRepeatList;
    }

}
