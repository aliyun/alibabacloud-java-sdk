// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetLinkeBahamutReviewRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static SetLinkeBahamutReviewRequest build(java.util.Map<String, ?> map) throws Exception {
        SetLinkeBahamutReviewRequest self = new SetLinkeBahamutReviewRequest();
        return TeaModel.build(map, self);
    }

    public SetLinkeBahamutReviewRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
