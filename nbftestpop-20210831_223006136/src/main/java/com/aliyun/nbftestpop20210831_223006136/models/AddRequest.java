// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210831_223006136.models;

import com.aliyun.tea.*;

public class AddRequest extends TeaModel {
    @NameInMap("arg0")
    public Integer arg0;

    @NameInMap("arg1")
    public Integer arg1;

    public static AddRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRequest self = new AddRequest();
        return TeaModel.build(map, self);
    }

    public AddRequest setArg0(Integer arg0) {
        this.arg0 = arg0;
        return this;
    }
    public Integer getArg0() {
        return this.arg0;
    }

    public AddRequest setArg1(Integer arg1) {
        this.arg1 = arg1;
        return this;
    }
    public Integer getArg1() {
        return this.arg1;
    }

}
