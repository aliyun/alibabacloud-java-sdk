// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class StopInstanceV2Request extends TeaModel {
    @NameInMap("SaveImage")
    public Boolean saveImage;

    public static StopInstanceV2Request build(java.util.Map<String, ?> map) throws Exception {
        StopInstanceV2Request self = new StopInstanceV2Request();
        return TeaModel.build(map, self);
    }

    public StopInstanceV2Request setSaveImage(Boolean saveImage) {
        this.saveImage = saveImage;
        return this;
    }
    public Boolean getSaveImage() {
        return this.saveImage;
    }

}
