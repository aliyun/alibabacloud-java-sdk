// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApprovaltaskscountRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("Stage")
    public String stage;

    @NameInMap("StageId")
    public String stageId;

    public static GetLinkeBahamutApprovaltaskscountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApprovaltaskscountRequest self = new GetLinkeBahamutApprovaltaskscountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApprovaltaskscountRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutApprovaltaskscountRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public GetLinkeBahamutApprovaltaskscountRequest setStage(String stage) {
        this.stage = stage;
        return this;
    }
    public String getStage() {
        return this.stage;
    }

    public GetLinkeBahamutApprovaltaskscountRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
