// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class UpdateSessionRequest extends TeaModel {
    /**
     * <p>Specifies whether to pin the session. If this parameter is not specified, the pinned status remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("pinned")
    public Boolean pinned;

    /**
     * <p>The updated session title. You can leave this parameter empty if no update is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Updated inspection session</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>Specifies whether to enable session UI enhancement. This feature is supported only for common sessions.</p>
     */
    @NameInMap("uiEnabled")
    public Boolean uiEnabled;

    public static UpdateSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSessionRequest self = new UpdateSessionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSessionRequest setPinned(Boolean pinned) {
        this.pinned = pinned;
        return this;
    }
    public Boolean getPinned() {
        return this.pinned;
    }

    public UpdateSessionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UpdateSessionRequest setUiEnabled(Boolean uiEnabled) {
        this.uiEnabled = uiEnabled;
        return this;
    }
    public Boolean getUiEnabled() {
        return this.uiEnabled;
    }

}
