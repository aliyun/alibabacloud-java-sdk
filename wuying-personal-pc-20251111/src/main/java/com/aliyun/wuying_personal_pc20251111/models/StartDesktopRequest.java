// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class StartDesktopRequest extends TeaModel {
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

    public static StartDesktopRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopRequest self = new StartDesktopRequest();
        return TeaModel.build(map, self);
    }

    public StartDesktopRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public StartDesktopRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public StartDesktopRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
