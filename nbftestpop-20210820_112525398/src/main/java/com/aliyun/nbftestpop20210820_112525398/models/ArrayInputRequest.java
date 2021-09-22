// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbftestpop20210820_112525398.models;

import com.aliyun.tea.*;

public class ArrayInputRequest extends TeaModel {
    @NameInMap("firstInput")
    public java.util.List<String> firstInput;

    public static ArrayInputRequest build(java.util.Map<String, ?> map) throws Exception {
        ArrayInputRequest self = new ArrayInputRequest();
        return TeaModel.build(map, self);
    }

    public ArrayInputRequest setFirstInput(java.util.List<String> firstInput) {
        this.firstInput = firstInput;
        return this;
    }
    public java.util.List<String> getFirstInput() {
        return this.firstInput;
    }

}
