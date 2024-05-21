// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagMetaRequest extends TeaModel {
    @NameInMap("TagDescription")
    public String tagDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>This parameter is required.</p>
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
