// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoRequest extends TeaModel {
    @NameInMap("VideoUrl")
    @Validation(required = true)
    public String videoUrl;

    @NameInMap("BitRate")
    public Integer bitRate;

    public static SuperResolveVideoRequest build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoRequest self = new SuperResolveVideoRequest();
        return TeaModel.build(map, self);
    }

}
