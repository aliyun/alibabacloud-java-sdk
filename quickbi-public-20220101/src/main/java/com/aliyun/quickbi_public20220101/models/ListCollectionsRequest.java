// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCollectionsRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static ListCollectionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCollectionsRequest self = new ListCollectionsRequest();
        return TeaModel.build(map, self);
    }

    public ListCollectionsRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
