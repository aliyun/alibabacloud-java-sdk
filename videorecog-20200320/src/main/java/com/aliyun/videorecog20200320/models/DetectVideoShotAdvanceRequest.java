// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videorecog20200320.models;

import com.aliyun.tea.*;

public class DetectVideoShotAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    public static DetectVideoShotAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectVideoShotAdvanceRequest self = new DetectVideoShotAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
