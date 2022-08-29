// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GetDefaultDriveRequest extends TeaModel {
    @NameInMap("user_id")
    public String userId;

    public static GetDefaultDriveRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDefaultDriveRequest self = new GetDefaultDriveRequest();
        return TeaModel.build(map, self);
    }

    public GetDefaultDriveRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
