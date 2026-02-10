// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbai20251013.models;

import com.aliyun.tea.*;

public class UpdateMultimodalLabelStudioServiceWhiteListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-2ze454l20me07****</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    @NameInMap("WhiteList")
    public java.util.List<String> whiteList;

    public static UpdateMultimodalLabelStudioServiceWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMultimodalLabelStudioServiceWhiteListRequest self = new UpdateMultimodalLabelStudioServiceWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMultimodalLabelStudioServiceWhiteListRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public UpdateMultimodalLabelStudioServiceWhiteListRequest setWhiteList(java.util.List<String> whiteList) {
        this.whiteList = whiteList;
        return this;
    }
    public java.util.List<String> getWhiteList() {
        return this.whiteList;
    }

}
