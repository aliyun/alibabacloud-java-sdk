// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc_white_board20201214.models;

import com.aliyun.tea.*;

public class PauseWhiteBoardRecordingRequest extends TeaModel {
    // 白板应用唯一标识符
    @NameInMap("AppID")
    public String appID;

    // 结束白板录制的用户ID（客户业务用户），由1~32位大小写字母、数字、下划线、短划线（-）组成
    @NameInMap("UserId")
    public String userId;

    // 白板文档唯一标识符
    @NameInMap("DocKey")
    public String docKey;

    // 白板录制Session的唯一标识
    @NameInMap("RecordId")
    public String recordId;

    public static PauseWhiteBoardRecordingRequest build(java.util.Map<String, ?> map) throws Exception {
        PauseWhiteBoardRecordingRequest self = new PauseWhiteBoardRecordingRequest();
        return TeaModel.build(map, self);
    }

    public PauseWhiteBoardRecordingRequest setAppID(String appID) {
        this.appID = appID;
        return this;
    }
    public String getAppID() {
        return this.appID;
    }

    public PauseWhiteBoardRecordingRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public PauseWhiteBoardRecordingRequest setDocKey(String docKey) {
        this.docKey = docKey;
        return this;
    }
    public String getDocKey() {
        return this.docKey;
    }

    public PauseWhiteBoardRecordingRequest setRecordId(String recordId) {
        this.recordId = recordId;
        return this;
    }
    public String getRecordId() {
        return this.recordId;
    }

}
