// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddAssetSelectionCriteriaResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static AddAssetSelectionCriteriaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddAssetSelectionCriteriaResponseBody self = new AddAssetSelectionCriteriaResponseBody();
        return TeaModel.build(map, self);
    }

    public AddAssetSelectionCriteriaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
