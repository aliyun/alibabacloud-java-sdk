// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRuleCyclesRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static ListClriskRuleCyclesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRuleCyclesRequest self = new ListClriskRuleCyclesRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskRuleCyclesRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
