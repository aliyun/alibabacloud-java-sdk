// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class CreateWhiteBoardRequest extends TeaModel {
    // 创建白板的用户ID（客户业务用户），由1~32位大小写字母、数字、下划线、短划线（-）组成
    @NameInMap("UserId")
    public String userId;

    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    public static CreateWhiteBoardRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateWhiteBoardRequest self = new CreateWhiteBoardRequest();
        return TeaModel.build(map, self);
    }

    public CreateWhiteBoardRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CreateWhiteBoardRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

}
