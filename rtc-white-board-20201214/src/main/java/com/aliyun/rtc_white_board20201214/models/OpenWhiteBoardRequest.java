// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class OpenWhiteBoardRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 打开白板的用户ID（客户业务用户），由纯数字组成
    @NameInMap("UserId")
    public String userId;

    // 白板文档唯一标识符
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
