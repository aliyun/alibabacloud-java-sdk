// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InitialSysomRequest extends TeaModel {
    @NameInMap("check_only")
    public Boolean checkOnly;

    public static InitialSysomRequest build(java.util.Map<String, ?> map) throws Exception {
        InitialSysomRequest self = new InitialSysomRequest();
        return TeaModel.build(map, self);
    }

    public InitialSysomRequest setCheckOnly(Boolean checkOnly) {
        this.checkOnly = checkOnly;
        return this;
    }
    public Boolean getCheckOnly() {
        return this.checkOnly;
    }

}
