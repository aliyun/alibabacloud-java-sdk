// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetUserClusterWarningRequest extends TeaModel {
    @NameInMap("userID")
    public String userID;

    public static GetUserClusterWarningRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserClusterWarningRequest self = new GetUserClusterWarningRequest();
        return TeaModel.build(map, self);
    }

    public GetUserClusterWarningRequest setUserID(String userID) {
        this.userID = userID;
        return this;
    }
    public String getUserID() {
        return this.userID;
    }

}
