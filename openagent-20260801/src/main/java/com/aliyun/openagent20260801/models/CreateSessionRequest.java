// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class CreateSessionRequest extends TeaModel {
    /**
     * <p>The session title.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud resource inspection example</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>Specifies whether to enable session UI enhancement. Only common sessions support this feature.</p>
     */
    @NameInMap("uiEnabled")
    public Boolean uiEnabled;

    public static CreateSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionRequest self = new CreateSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSessionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateSessionRequest setUiEnabled(Boolean uiEnabled) {
        this.uiEnabled = uiEnabled;
        return this;
    }
    public Boolean getUiEnabled() {
        return this.uiEnabled;
    }

}
