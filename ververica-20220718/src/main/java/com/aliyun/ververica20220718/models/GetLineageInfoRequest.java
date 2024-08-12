// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetLineageInfoRequest extends TeaModel {
    /**
     * <p>The parameters about the lineage information.</p>
     */
    @NameInMap("body")
    public GetLineageInfoParams body;

    public static GetLineageInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLineageInfoRequest self = new GetLineageInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetLineageInfoRequest setBody(GetLineageInfoParams body) {
        this.body = body;
        return this;
    }
    public GetLineageInfoParams getBody() {
        return this.body;
    }

}
