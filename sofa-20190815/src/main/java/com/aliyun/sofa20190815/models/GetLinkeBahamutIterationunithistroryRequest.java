// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationunithistroryRequest extends TeaModel {
    @NameInMap("TypeName")
    public String typeName;

    @NameInMap("UnitStageId")
    public String unitStageId;

    public static GetLinkeBahamutIterationunithistroryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationunithistroryRequest self = new GetLinkeBahamutIterationunithistroryRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationunithistroryRequest setTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }
    public String getTypeName() {
        return this.typeName;
    }

    public GetLinkeBahamutIterationunithistroryRequest setUnitStageId(String unitStageId) {
        this.unitStageId = unitStageId;
        return this;
    }
    public String getUnitStageId() {
        return this.unitStageId;
    }

}
