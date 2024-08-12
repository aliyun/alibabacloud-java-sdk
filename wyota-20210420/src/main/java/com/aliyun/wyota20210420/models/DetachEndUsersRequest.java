// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class DetachEndUsersRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("EndUserIds")
    public String endUserIds;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SerialNo")
    public String serialNo;

    public static DetachEndUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachEndUsersRequest self = new DetachEndUsersRequest();
        return TeaModel.build(map, self);
    }

    public DetachEndUsersRequest setEndUserIds(String endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public String getEndUserIds() {
        return this.endUserIds;
    }

    public DetachEndUsersRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
