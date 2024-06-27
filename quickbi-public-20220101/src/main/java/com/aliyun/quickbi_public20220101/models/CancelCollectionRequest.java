// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class CancelCollectionRequest extends TeaModel {
    /**
     * <p>The ID of the favorite user. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>121344444790****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the work to cancel the collection.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5d6ae4e7-cede-43cd-b4d3-d2fd442a9202</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static CancelCollectionRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelCollectionRequest self = new CancelCollectionRequest();
        return TeaModel.build(map, self);
    }

    public CancelCollectionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public CancelCollectionRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
