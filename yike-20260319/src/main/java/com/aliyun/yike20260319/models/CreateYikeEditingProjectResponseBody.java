// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yike20260319.models;

import com.aliyun.tea.*;

public class CreateYikeEditingProjectResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><em><strong>545bc38a94aa9840c89aff017b</strong></em></p>
     */
    @NameInMap("EditingProjectId")
    public String editingProjectId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateYikeEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateYikeEditingProjectResponseBody self = new CreateYikeEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateYikeEditingProjectResponseBody setEditingProjectId(String editingProjectId) {
        this.editingProjectId = editingProjectId;
        return this;
    }
    public String getEditingProjectId() {
        return this.editingProjectId;
    }

    public CreateYikeEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
