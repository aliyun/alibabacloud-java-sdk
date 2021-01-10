// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CountLinkeBahamutStageuncompleteflowtasksRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("StageId")
    public String stageId;

    public static CountLinkeBahamutStageuncompleteflowtasksRequest build(java.util.Map<String, ?> map) throws Exception {
        CountLinkeBahamutStageuncompleteflowtasksRequest self = new CountLinkeBahamutStageuncompleteflowtasksRequest();
        return TeaModel.build(map, self);
    }

    public CountLinkeBahamutStageuncompleteflowtasksRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public CountLinkeBahamutStageuncompleteflowtasksRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public CountLinkeBahamutStageuncompleteflowtasksRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public CountLinkeBahamutStageuncompleteflowtasksRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
