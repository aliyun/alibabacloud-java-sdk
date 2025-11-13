// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteCheckItemRequest extends TeaModel {
    /**
     * <p>List of check item IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    public static DeleteCheckItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCheckItemRequest self = new DeleteCheckItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCheckItemRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

}
