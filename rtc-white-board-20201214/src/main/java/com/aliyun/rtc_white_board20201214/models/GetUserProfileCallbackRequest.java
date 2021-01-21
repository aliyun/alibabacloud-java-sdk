// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class GetUserProfileCallbackRequest extends TeaModel {
    @NameInMap("UserIds")
    public String userIds;

    @NameInMap("DocKey")
    public String docKey;

    public static GetUserProfileCallbackRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserProfileCallbackRequest self = new GetUserProfileCallbackRequest();
        return TeaModel.build(map, self);
    }

    public GetUserProfileCallbackRequest setUserIds(String userIds) {
        this.userIds = userIds;
        return this;
    }
    public String getUserIds() {
        return this.userIds;
    }

    public GetUserProfileCallbackRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

}
