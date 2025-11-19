// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DeleteDesktopRequest extends TeaModel {
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

    public static DeleteDesktopRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteDesktopRequest self = new DeleteDesktopRequest();
        return TeaModel.build(map, self);
    }

    public DeleteDesktopRequest setApiKey(String apiKey) {
        this.apiKey = apiKey;
        return this;
    }
    public String getApiKey() {
        return this.apiKey;
    }

    public DeleteDesktopRequest setDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public String getDesktopId() {
        return this.desktopId;
    }

    public DeleteDesktopRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
