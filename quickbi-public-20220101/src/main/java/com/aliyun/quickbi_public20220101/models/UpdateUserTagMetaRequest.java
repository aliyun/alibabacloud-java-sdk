// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class UpdateUserTagMetaRequest extends TeaModel {
    /**
     * <p>The tag description.</p>
     * <ul>
     * <li>Format check: Maximum length is 255 characters.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Job Positions within the Department</p>
     */
    @NameInMap("TagDescription")
    public String tagDescription;

    /**
     * <p>The specified TagID.</p>
     * <ul>
     * <li>Format check: Maximum length is 64 characters.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e82f6c6c0333431bad0225b2f85e****</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The tag name.</p>
     * <ul>
     * <li>Format check: Maximum length is 50 characters.</li>
     * <li>Only Chinese, English, numbers, and /\|<a href=""></a> symbols are allowed.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Department</p>
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
