// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class GetSessionResponseBody extends TeaModel {
    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
     * 
     * <strong>example:</strong>
     * <p>2021-01-21T17:12:35.232Z</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>1557******4904</p>
     */
    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <strong>example:</strong>
     * <p>ECB1F5******C1BF5223</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>se-j6p******dram6</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Title")
    public String title;

    /**
     * <strong>example:</strong>
     * <p>27******94904</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static GetSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSessionResponseBody self = new GetSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSessionResponseBody setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public GetSessionResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetSessionResponseBody setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public GetSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public GetSessionResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public GetSessionResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
