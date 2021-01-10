// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLinkeBahamutTaskscreatecodequalitycheckandapproveRequest extends TeaModel {
    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("AppListRepeatList")
    public java.util.List<String> appListRepeatList;

    public static CreateLinkeBahamutTaskscreatecodequalitycheckandapproveRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLinkeBahamutTaskscreatecodequalitycheckandapproveRequest self = new CreateLinkeBahamutTaskscreatecodequalitycheckandapproveRequest();
        return TeaModel.build(map, self);
    }

    public CreateLinkeBahamutTaskscreatecodequalitycheckandapproveRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CreateLinkeBahamutTaskscreatecodequalitycheckandapproveRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public CreateLinkeBahamutTaskscreatecodequalitycheckandapproveRequest setAppListRepeatList(java.util.List<String> appListRepeatList) {
        this.appListRepeatList = appListRepeatList;
        return this;
    }
    public java.util.List<String> getAppListRepeatList() {
        return this.appListRepeatList;
    }

}
