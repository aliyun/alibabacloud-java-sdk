// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class Session extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("OwnerId")
    public String ownerId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("SessionTitle")
    public String sessionTitle;

    @NameInMap("UserId")
    public String userId;

    public static Session build(java.util.Map<String, ?> map) throws Exception {
        Session self = new Session();
        return TeaModel.build(map, self);
    }

    public Session setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Session setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public Session setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public Session setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public Session setSessionTitle(String sessionTitle) {
        this.sessionTitle = sessionTitle;
        return this;
    }
    public String getSessionTitle() {
        return this.sessionTitle;
    }

    public Session setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
