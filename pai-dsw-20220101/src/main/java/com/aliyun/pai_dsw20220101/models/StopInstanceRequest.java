// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class StopInstanceRequest extends TeaModel {
    // 是否保存环境后再关闭实例
    @NameInMap("SaveImage")
    public Boolean saveImage;

    public static StopInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceRequest self = new StopInstanceRequest();
        return TeaModel.build(map, self);
    }

    public StopInstanceRequest setSaveImage(Boolean saveImage) {
        this.saveImage = saveImage;
        return this;
    }
    public Boolean getSaveImage() {
        return this.saveImage;
    }

}
