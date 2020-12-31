// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20150901.models;

import com.aliyun.tea.*;

public class WaitConditionsRequest extends TeaModel {
    @NameInMap("stackname")
    public String stackname;

    @NameInMap("stackid")
    public String stackid;

    @NameInMap("resource")
    public String resource;

    @NameInMap("expire")
    public String expire;

    @NameInMap("signature")
    public String signature;

    public static WaitConditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        WaitConditionsRequest self = new WaitConditionsRequest();
        return TeaModel.build(map, self);
    }

    public WaitConditionsRequest setStackname(String stackname) {
        this.stackname = stackname;
        return this;
    }
    public String getStackname() {
        return this.stackname;
    }

    public WaitConditionsRequest setStackid(String stackid) {
        this.stackid = stackid;
        return this;
    }
    public String getStackid() {
        return this.stackid;
    }

    public WaitConditionsRequest setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public WaitConditionsRequest setExpire(String expire) {
        this.expire = expire;
        return this;
    }
    public String getExpire() {
        return this.expire;
    }

    public WaitConditionsRequest setSignature(String signature) {
        this.signature = signature;
        return this;
    }
    public String getSignature() {
        return this.signature;
    }

}
