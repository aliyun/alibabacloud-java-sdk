// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutStctaskRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("Memo")
    public String memo;

    @NameInMap("ObjectId")
    public String objectId;

    @NameInMap("StageId")
    public String stageId;

    public static CheckLinkeBahamutStctaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutStctaskRequest self = new CheckLinkeBahamutStctaskRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutStctaskRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public CheckLinkeBahamutStctaskRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public CheckLinkeBahamutStctaskRequest setObjectId(String objectId) {
        this.objectId = objectId;
        return this;
    }
    public String getObjectId() {
        return this.objectId;
    }

    public CheckLinkeBahamutStctaskRequest setStageId(String stageId) {
        this.stageId = stageId;
        return this;
    }
    public String getStageId() {
        return this.stageId;
    }

}
