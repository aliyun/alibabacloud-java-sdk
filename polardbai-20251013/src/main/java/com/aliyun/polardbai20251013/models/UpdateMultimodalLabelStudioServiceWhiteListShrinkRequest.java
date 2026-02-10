// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class UpdateMultimodalLabelStudioServiceWhiteListShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("WhiteList")
    public String whiteListShrink;

    public static UpdateMultimodalLabelStudioServiceWhiteListShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultimodalLabelStudioServiceWhiteListShrinkRequest self = new UpdateMultimodalLabelStudioServiceWhiteListShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultimodalLabelStudioServiceWhiteListShrinkRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateMultimodalLabelStudioServiceWhiteListShrinkRequest setWhiteListShrink(String whiteListShrink) {
        this.whiteListShrink = whiteListShrink;
        return this;
    }
    public String getWhiteListShrink() {
        return this.whiteListShrink;
    }

}
