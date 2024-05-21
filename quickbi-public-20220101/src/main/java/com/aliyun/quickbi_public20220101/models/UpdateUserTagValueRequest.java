// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagValueRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagValue")
    public String tagValue;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static UpdateUserTagValueRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserTagValueRequest self = new UpdateUserTagValueRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserTagValueRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public UpdateUserTagValueRequest setTagValue(String tagValue) {
        this.tagValue = tagValue;
        return this;
    }
    public String getTagValue() {
        return this.tagValue;
    }

    public UpdateUserTagValueRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
