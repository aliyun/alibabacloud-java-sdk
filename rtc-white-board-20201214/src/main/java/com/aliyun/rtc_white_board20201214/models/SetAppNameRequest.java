// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppNameRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 白板应用名，由不超过32位的中文、英文、数字或下划线组成
    @NameInMap("AppName")
    public String appName;

    public static SetAppNameRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppNameRequest self = new SetAppNameRequest();
        return TeaModel.build(map, self);
    }

    public SetAppNameRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public SetAppNameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

}
