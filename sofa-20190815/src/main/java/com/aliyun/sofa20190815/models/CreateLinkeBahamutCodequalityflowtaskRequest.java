// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutCodequalityflowtaskRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("AppListRepeatList")
    public java.util.List<String> appListRepeatList;

    public static CreateLinkeBahamutCodequalityflowtaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutCodequalityflowtaskRequest self = new CreateLinkeBahamutCodequalityflowtaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutCodequalityflowtaskRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CreateLinkeBahamutCodequalityflowtaskRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public CreateLinkeBahamutCodequalityflowtaskRequest setAppListRepeatList(java.util.List<String> appListRepeatList) {
        this.appListRepeatList = appListRepeatList;
        return this;
    }
    public java.util.List<String> getAppListRepeatList() {
        return this.appListRepeatList;
    }

}
