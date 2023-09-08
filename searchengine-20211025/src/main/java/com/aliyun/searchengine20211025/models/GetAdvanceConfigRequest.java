// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetAdvanceConfigRequest extends TeaModel {
    @NameInMap("type")
    public String type;

    public static GetAdvanceConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAdvanceConfigRequest self = new GetAdvanceConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetAdvanceConfigRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
