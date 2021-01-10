// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmrworkitemsRequest extends TeaModel {
    @NameInMap("IterationExternalId")
    public String iterationExternalId;

    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    public static GetLinkeBahamutVcsmrworkitemsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmrworkitemsRequest self = new GetLinkeBahamutVcsmrworkitemsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmrworkitemsRequest setIterationExternalId(String iterationExternalId) {
        this.iterationExternalId = iterationExternalId;
        return this;
    }
    public String getIterationExternalId() {
        return this.iterationExternalId;
    }

    public GetLinkeBahamutVcsmrworkitemsRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

}
