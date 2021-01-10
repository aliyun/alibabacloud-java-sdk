// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutPrepubpipelinecheckRequest extends TeaModel {
    @NameInMap("IterationUnitId")
    public String iterationUnitId;

    public static CheckLinkeBahamutPrepubpipelinecheckRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutPrepubpipelinecheckRequest self = new CheckLinkeBahamutPrepubpipelinecheckRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutPrepubpipelinecheckRequest setIterationUnitId(String iterationUnitId) {
        this.iterationUnitId = iterationUnitId;
        return this;
    }
    public String getIterationUnitId() {
        return this.iterationUnitId;
    }

}
