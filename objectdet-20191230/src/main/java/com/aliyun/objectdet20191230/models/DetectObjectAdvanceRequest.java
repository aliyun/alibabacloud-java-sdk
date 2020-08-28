// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectAdvanceRequest extends TeaModel {
    @NameInMap("ImageURLObject")
    @Validation(required = true)
    public java.io.InputStream imageURLObject;

    public static DetectObjectAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectAdvanceRequest self = new DetectObjectAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
