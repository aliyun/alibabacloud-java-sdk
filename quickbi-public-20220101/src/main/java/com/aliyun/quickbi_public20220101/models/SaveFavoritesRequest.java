// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SaveFavoritesRequest extends TeaModel {
    /**
     * <p>The user ID of the collection. The user ID is the UserID of the Quick BI, not the UID of Alibaba Cloud.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The ID of the collection.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorksId")
    public String worksId;

    public static SaveFavoritesRequest build(java.util.Map<String, ?> map) throws Exception {
        SaveFavoritesRequest self = new SaveFavoritesRequest();
        return TeaModel.build(map, self);
    }

    public SaveFavoritesRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public SaveFavoritesRequest setWorksId(String worksId) {
        this.worksId = worksId;
        return this;
    }
    public String getWorksId() {
        return this.worksId;
    }

}
