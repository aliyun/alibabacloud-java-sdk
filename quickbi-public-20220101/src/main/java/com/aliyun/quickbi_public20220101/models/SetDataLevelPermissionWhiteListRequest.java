// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionWhiteListRequest extends TeaModel {
    @NameInMap("WhiteListModel")
    public String whiteListModel;

    public static SetDataLevelPermissionWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionWhiteListRequest self = new SetDataLevelPermissionWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionWhiteListRequest setWhiteListModel(String whiteListModel) {
        this.whiteListModel = whiteListModel;
        return this;
    }
    public String getWhiteListModel() {
        return this.whiteListModel;
    }

}
