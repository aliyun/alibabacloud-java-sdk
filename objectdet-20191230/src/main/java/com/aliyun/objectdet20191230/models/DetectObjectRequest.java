// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectObjectRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static DetectObjectRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectObjectRequest self = new DetectObjectRequest();
        return TeaModel.build(map, self);
    }

}
