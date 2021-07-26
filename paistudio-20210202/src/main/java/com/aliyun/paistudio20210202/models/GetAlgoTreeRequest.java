// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetAlgoTreeRequest extends TeaModel {
    @NameInMap("Source")
    public String source;

    public static GetAlgoTreeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgoTreeRequest self = new GetAlgoTreeRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgoTreeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
