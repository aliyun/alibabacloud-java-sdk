// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210806_151255420.models;

import com.aliyun.tea.*;

public class MutilComplexShrinkRequest extends TeaModel {
    @NameInMap("arg0")
    public String arg0;

    @NameInMap("arg1")
    public Integer arg1;

    @NameInMap("arg2")
    public String arg2Shrink;

    public static MutilComplexShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MutilComplexShrinkRequest self = new MutilComplexShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MutilComplexShrinkRequest setArg0(String arg0) {
        this.arg0 = arg0;
        return this;
    }
    public String getArg0() {
        return this.arg0;
    }

    public MutilComplexShrinkRequest setArg1(Integer arg1) {
        this.arg1 = arg1;
        return this;
    }
    public Integer getArg1() {
        return this.arg1;
    }

    public MutilComplexShrinkRequest setArg2Shrink(String arg2Shrink) {
        this.arg2Shrink = arg2Shrink;
        return this;
    }
    public String getArg2Shrink() {
        return this.arg2Shrink;
    }

}
