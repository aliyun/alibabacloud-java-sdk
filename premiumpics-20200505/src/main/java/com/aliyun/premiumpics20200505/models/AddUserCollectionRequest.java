// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class AddUserCollectionRequest extends TeaModel {
    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("UnitId")
    public String unitId;

    @NameInMap("UnitName")
    public String unitName;

    public static AddUserCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserCollectionRequest self = new AddUserCollectionRequest();
        return TeaModel.build(map, self);
    }

    public AddUserCollectionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public AddUserCollectionRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

    public AddUserCollectionRequest setUnitName(String unitName) {
        this.unitName = unitName;
        return this;
    }
    public String getUnitName() {
        return this.unitName;
    }

}
