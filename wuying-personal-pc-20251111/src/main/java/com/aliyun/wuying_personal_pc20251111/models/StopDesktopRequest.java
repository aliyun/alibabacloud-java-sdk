// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class StopDesktopRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiKey")
    public String apiKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DesktopId")
    public String desktopId;

    @NameInMap("SessionId")
    public String sessionId;

    public static StopDesktopRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDesktopRequest self = new StopDesktopRequest();
        return TeaModel.build(map, self);
    }

    public StopDesktopRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public StopDesktopRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public StopDesktopRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
