// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class WaitConditionsQuery extends TeaModel {
    @NameInMap("stackname")
    @Validation(required = true)
    public String stackname;

    @NameInMap("stackid")
    @Validation(required = true)
    public String stackid;

    @NameInMap("resource")
    @Validation(required = true)
    public String resource;

    @NameInMap("expire")
    @Validation(required = true)
    public String expire;

    @NameInMap("signature")
    @Validation(required = true)
    public String signature;

    public static WaitConditionsQuery build(java.util.Map<String, ?> map) throws Exception {
        WaitConditionsQuery self = new WaitConditionsQuery();
        return TeaModel.build(map, self);
    }

}
