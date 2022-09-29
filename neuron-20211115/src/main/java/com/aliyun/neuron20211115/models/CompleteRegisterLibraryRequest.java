// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CompleteRegisterLibraryRequest extends TeaModel {
    @NameInMap("dependIntegral")
    public Integer dependIntegral;

    public static CompleteRegisterLibraryRequest build(java.util.Map<String, ?> map) throws Exception {
        CompleteRegisterLibraryRequest self = new CompleteRegisterLibraryRequest();
        return TeaModel.build(map, self);
    }

    public CompleteRegisterLibraryRequest setDependIntegral(Integer dependIntegral) {
        this.dependIntegral = dependIntegral;
        return this;
    }
    public Integer getDependIntegral() {
        return this.dependIntegral;
    }

}
