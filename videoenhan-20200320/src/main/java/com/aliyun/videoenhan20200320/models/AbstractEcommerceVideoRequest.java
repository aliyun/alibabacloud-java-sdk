// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("Duration")
    @Validation(required = true)
    public Double duration;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    public static AbstractEcommerceVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoRequest self = new AbstractEcommerceVideoRequest();
        return TeaModel.build(map, self);
    }

}
