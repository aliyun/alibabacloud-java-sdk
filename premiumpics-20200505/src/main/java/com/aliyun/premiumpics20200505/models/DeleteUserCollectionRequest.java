// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class DeleteUserCollectionRequest extends TeaModel {
    /**
     * <p>BizType</p>
     */
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("UnitId")
    public String unitId;

    /**
     * <p>userid</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static DeleteUserCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserCollectionRequest self = new DeleteUserCollectionRequest();
        return TeaModel.build(map, self);
    }

    public DeleteUserCollectionRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DeleteUserCollectionRequest setUnitId(String unitId) {
        this.unitId = unitId;
        return this;
    }
    public String getUnitId() {
        return this.unitId;
    }

    public DeleteUserCollectionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
