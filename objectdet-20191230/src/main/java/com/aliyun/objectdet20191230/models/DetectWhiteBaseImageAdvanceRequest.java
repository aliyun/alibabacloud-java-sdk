// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectWhiteBaseImageAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static DetectWhiteBaseImageAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectWhiteBaseImageAdvanceRequest self = new DetectWhiteBaseImageAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
