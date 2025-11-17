// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class ListCollectionsRequest extends TeaModel {
    /**
     * <p>User ID. This refers to the UserID in Quick BI, not the Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe67f61a35a94b7da1a34ba174a7****</p>
     */
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
