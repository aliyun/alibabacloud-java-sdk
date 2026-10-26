// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagValueRequest extends TeaModel {
    /**
     * <p>The ID of the tag to be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pop_001</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The tag value to be modified.</p>
     * <ul>
     * <li>To clear this tag, set the tag value to ($NULL$).</li>
     * <li>For multiple values, use English commas to separate them.</li>
     * <li>Format validation, maximum length: 3000 characters</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Product Director</p>
     */
    @NameInMap("TagValue")
    public String tagValue;

    /**
     * <p>The user ID for which the tag value is to be modified. This user ID refers to the Quick BI UserID, not the Alibaba Cloud UID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>fe67f61a35a94b7da1a34ba174a7****</p>
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
