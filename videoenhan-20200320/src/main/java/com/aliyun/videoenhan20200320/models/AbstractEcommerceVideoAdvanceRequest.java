// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class AbstractEcommerceVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("Duration")
    @Validation(required = true)
    public Double duration;

    @NameInMap("Width")
    public Integer width;

    @NameInMap("Height")
    public Integer height;

    public static AbstractEcommerceVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AbstractEcommerceVideoAdvanceRequest self = new AbstractEcommerceVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
