// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class StartWhiteBoardRecordingRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 启动白板录制的用户ID（客户业务用户），由1~32位大小写字母、数字、下划线、短划线（-）组成
    @NameInMap("UserId")
    public String userId;

    // 白板文档唯一标识符
    @NameInMap("DocKey")
    public String docKey;

    public static StartWhiteBoardRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        StartWhiteBoardRecordingRequest self = new StartWhiteBoardRecordingRequest();
        return TeaModel.build(map, self);
    }

    public StartWhiteBoardRecordingRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public StartWhiteBoardRecordingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public StartWhiteBoardRecordingRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

}
