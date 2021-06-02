// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class TempPreviewStatusRequest extends TeaModel {
    // 任务ID
    @NameInMap("Key")
    public String key;

    public static TempPreviewStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        TempPreviewStatusRequest self = new TempPreviewStatusRequest();
        return TeaModel.build(map, self);
    }

    public TempPreviewStatusRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
