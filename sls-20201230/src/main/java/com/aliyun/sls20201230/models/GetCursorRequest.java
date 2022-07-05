// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetCursorRequest extends TeaModel {
    // 时间点（Unix时间戳）或者字符串begin、end。
    @NameInMap("from")
    public String from;

    // 这里固定为 cursor。
    @NameInMap("type")
    public String type;

    public static GetCursorRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCursorRequest self = new GetCursorRequest();
        return TeaModel.build(map, self);
    }

    public GetCursorRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public GetCursorRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
