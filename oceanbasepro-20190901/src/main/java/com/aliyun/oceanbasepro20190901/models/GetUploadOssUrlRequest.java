// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetUploadOssUrlRequest extends TeaModel {
    @NameInMap("EffectiveTimeMinutes")
    public Integer effectiveTimeMinutes;

    @NameInMap("Type")
    public String type;

    public static GetUploadOssUrlRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUploadOssUrlRequest self = new GetUploadOssUrlRequest();
        return TeaModel.build(map, self);
    }

    public GetUploadOssUrlRequest setEffectiveTimeMinutes(Integer effectiveTimeMinutes) {
        this.effectiveTimeMinutes = effectiveTimeMinutes;
        return this;
    }
    public Integer getEffectiveTimeMinutes() {
        return this.effectiveTimeMinutes;
    }

    public GetUploadOssUrlRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
