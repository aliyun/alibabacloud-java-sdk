// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeletePbcInvokeRequest extends TeaModel {
    @NameInMap("invoke_pbc_name")
    public String invokePbcName;

    @NameInMap("pbc_name")
    public String pbcName;

    public static DeletePbcInvokeRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePbcInvokeRequest self = new DeletePbcInvokeRequest();
        return TeaModel.build(map, self);
    }

    public DeletePbcInvokeRequest setInvokePbcName(String invokePbcName) {
        this.invokePbcName = invokePbcName;
        return this;
    }
    public String getInvokePbcName() {
        return this.invokePbcName;
    }

    public DeletePbcInvokeRequest setPbcName(String pbcName) {
        this.pbcName = pbcName;
        return this;
    }
    public String getPbcName() {
        return this.pbcName;
    }

}
