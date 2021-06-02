// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class TempPreviewRequest extends TeaModel {
    // 场景ID
    @NameInMap("Id")
    public String id;

    public static TempPreviewRequest build(java.util.Map<String, ?> map) throws Exception {
        TempPreviewRequest self = new TempPreviewRequest();
        return TeaModel.build(map, self);
    }

    public TempPreviewRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
