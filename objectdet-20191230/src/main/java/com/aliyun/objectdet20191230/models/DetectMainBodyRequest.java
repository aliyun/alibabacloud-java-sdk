// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.objectdet20191230.models;

import com.aliyun.tea.*;

public class DetectMainBodyRequest extends TeaModel {
    @NameInMap("ImageURL")
    @Validation(required = true)
    public String imageURL;

    public static DetectMainBodyRequest build(java.util.Map<String, ?> map) throws Exception {
        DetectMainBodyRequest self = new DetectMainBodyRequest();
        return TeaModel.build(map, self);
    }

}
