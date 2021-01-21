// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class OpenWhiteBoardRequest extends TeaModel {
    @NameInMap("AppID")
    public String appID;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("DocKey")
    public String docKey;

    public static OpenWhiteBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenWhiteBoardRequest self = new OpenWhiteBoardRequest();
        return TeaModel.build(map, self);
    }

    public OpenWhiteBoardRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public OpenWhiteBoardRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public OpenWhiteBoardRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

}
