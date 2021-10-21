// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class ConvertImageToGrayRequest extends TeaModel {
    @NameInMap("OssKey")
    public String ossKey;

    public static ConvertImageToGrayRequest build(java.util.Map<String, ?> map) throws Exception {
        ConvertImageToGrayRequest self = new ConvertImageToGrayRequest();
        return TeaModel.build(map, self);
    }

    public ConvertImageToGrayRequest setOssKey(String ossKey) {
        this.ossKey = ossKey;
        return this;
    }
    public String getOssKey() {
        return this.ossKey;
    }

}
