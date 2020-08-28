// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    public static DetectVideoShotRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoShotRequest self = new DetectVideoShotRequest();
        return TeaModel.build(map, self);
    }

}
