// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRulesRequest extends TeaModel {
    @NameInMap("ModelCode")
    public String modelCode;

    public static ListClriskRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRulesRequest self = new ListClriskRulesRequest();
        return TeaModel.build(map, self);
    }

    public ListClriskRulesRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

}
