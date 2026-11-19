// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagMetaRequest extends TeaModel {
    /**
     * <p>The description of the tag. The maximum length is 255 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>Job positions within the department</p>
     */
    @NameInMap("TagDescription")
    public String tagDescription;

    /**
     * <p>The specified tag ID. The maximum length is 64 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e82f6c6c0333431bad0225b2f85e****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The name of the tag. The maximum length is 50 characters. Only letters, digits, and the /, \, |, [, ], (, and ) symbols are allowed.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Position</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static UpdateUserTagMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateUserTagMetaRequest self = new UpdateUserTagMetaRequest();
        return TeaModel.build(map, self);
    }

    public UpdateUserTagMetaRequest setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
        return this;
    }
    public String getTagDescription() {
        return this.tagDescription;
    }

    public UpdateUserTagMetaRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public UpdateUserTagMetaRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
