// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateSelectionKeyByTypeRequest extends TeaModel {
    @NameInMap("BusinessType")
    public String businessType;

    @NameInMap("SelectionKey")
    public String selectionKey;

    public static UpdateSelectionKeyByTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSelectionKeyByTypeRequest self = new UpdateSelectionKeyByTypeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSelectionKeyByTypeRequest setBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }
    public String getBusinessType() {
        return this.businessType;
    }

    public UpdateSelectionKeyByTypeRequest setSelectionKey(String selectionKey) {
        this.selectionKey = selectionKey;
        return this;
    }
    public String getSelectionKey() {
        return this.selectionKey;
    }

}
