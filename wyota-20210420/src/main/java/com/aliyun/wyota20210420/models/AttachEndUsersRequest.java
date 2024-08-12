// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wyota20210420.models;

import com.aliyun.tea.*;

public class AttachEndUsersRequest extends TeaModel {
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

    public static AttachEndUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachEndUsersRequest self = new AttachEndUsersRequest();
        return TeaModel.build(map, self);
    }

    public AttachEndUsersRequest setEndUserIds(String endUserIds) {
        this.endUserIds = endUserIds;
        return this;
    }
    public String getEndUserIds() {
        return this.endUserIds;
    }

    public AttachEndUsersRequest setSerialNo(String serialNo) {
        this.serialNo = serialNo;
        return this;
    }
    public String getSerialNo() {
        return this.serialNo;
    }

}
