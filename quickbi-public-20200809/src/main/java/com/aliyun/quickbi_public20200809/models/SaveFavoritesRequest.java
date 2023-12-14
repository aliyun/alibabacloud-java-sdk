// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20200809.models;

import com.aliyun.tea.*;

public class SaveFavoritesRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

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
