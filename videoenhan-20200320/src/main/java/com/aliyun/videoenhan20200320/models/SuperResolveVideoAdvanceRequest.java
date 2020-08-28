// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class SuperResolveVideoAdvanceRequest extends TeaModel {
    @NameInMap("VideoUrlObject")
    @Validation(required = true)
    public java.io.InputStream videoUrlObject;

    @NameInMap("BitRate")
    public Integer bitRate;

    public static SuperResolveVideoAdvanceRequest build(java.util.Map<String, ?> map) throws Exception {
        SuperResolveVideoAdvanceRequest self = new SuperResolveVideoAdvanceRequest();
        return TeaModel.build(map, self);
    }

}
