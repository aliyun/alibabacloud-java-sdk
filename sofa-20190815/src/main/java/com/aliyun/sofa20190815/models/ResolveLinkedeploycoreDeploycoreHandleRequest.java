// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResolveLinkedeploycoreDeploycoreHandleRequest extends TeaModel {
    @NameInMap("ArgsRepeatList")
    public java.util.List<String> argsRepeatList;

    @NameInMap("Message")
    public String message;

    public static ResolveLinkedeploycoreDeploycoreHandleRequest build(java.util.Map<String, ?> map) throws Exception {
        ResolveLinkedeploycoreDeploycoreHandleRequest self = new ResolveLinkedeploycoreDeploycoreHandleRequest();
        return TeaModel.build(map, self);
    }

    public ResolveLinkedeploycoreDeploycoreHandleRequest setArgsRepeatList(java.util.List<String> argsRepeatList) {
        this.argsRepeatList = argsRepeatList;
        return this;
    }
    public java.util.List<String> getArgsRepeatList() {
        return this.argsRepeatList;
    }

    public ResolveLinkedeploycoreDeploycoreHandleRequest setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
