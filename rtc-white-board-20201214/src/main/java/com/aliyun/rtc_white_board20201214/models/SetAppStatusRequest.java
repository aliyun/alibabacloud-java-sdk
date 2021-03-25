// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class SetAppStatusRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 白板应用状态（取值：1:启用，2:停用）
    @NameInMap("AppStatus")
    public Long appStatus;

    public static SetAppStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAppStatusRequest self = new SetAppStatusRequest();
        return TeaModel.build(map, self);
    }

    public SetAppStatusRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public SetAppStatusRequest setAppStatus(Long appStatus) {
        this.appStatus = appStatus;
        return this;
    }
    public Long getAppStatus() {
        return this.appStatus;
    }

}
