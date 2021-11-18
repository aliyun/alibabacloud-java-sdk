// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstanceTypesRequest extends TeaModel {
    // AcceleratorType
    @NameInMap("AcceleratorType")
    public String acceleratorType;

    public static ListInstanceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceTypesRequest self = new ListInstanceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListInstanceTypesRequest setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }
    public String getAcceleratorType() {
        return this.acceleratorType;
    }

}
