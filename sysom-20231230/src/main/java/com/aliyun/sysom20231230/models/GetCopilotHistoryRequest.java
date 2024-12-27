// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class GetCopilotHistoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("count")
    public Long count;

    public static GetCopilotHistoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCopilotHistoryRequest self = new GetCopilotHistoryRequest();
        return TeaModel.build(map, self);
    }

    public GetCopilotHistoryRequest setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

}
