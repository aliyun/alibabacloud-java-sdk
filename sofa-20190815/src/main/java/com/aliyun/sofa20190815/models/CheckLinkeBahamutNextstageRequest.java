// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutNextstageRequest extends TeaModel {
    @NameInMap("FromStageId")
    public String fromStageId;

    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    @NameInMap("ToStageId")
    public String toStageId;

    public static CheckLinkeBahamutNextstageRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutNextstageRequest self = new CheckLinkeBahamutNextstageRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutNextstageRequest setFromStageId(String fromStageId) {
        this.fromStageId = fromStageId;
        return this;
    }
    public String getFromStageId() {
        return this.fromStageId;
    }

    public CheckLinkeBahamutNextstageRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

    public CheckLinkeBahamutNextstageRequest setToStageId(String toStageId) {
        this.toStageId = toStageId;
        return this;
    }
    public String getToStageId() {
        return this.toStageId;
    }

}
