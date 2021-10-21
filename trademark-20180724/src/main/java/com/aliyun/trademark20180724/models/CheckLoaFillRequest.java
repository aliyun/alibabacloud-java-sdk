// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class CheckLoaFillRequest extends TeaModel {
    @NameInMap("OssKey")
    public String ossKey;

    @NameInMap("Type")
    public String type;

    public static CheckLoaFillRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLoaFillRequest self = new CheckLoaFillRequest();
        return TeaModel.build(map, self);
    }

    public CheckLoaFillRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

    public CheckLoaFillRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
