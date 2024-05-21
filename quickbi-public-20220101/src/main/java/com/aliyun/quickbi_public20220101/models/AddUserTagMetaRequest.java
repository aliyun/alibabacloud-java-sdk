// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class AddUserTagMetaRequest extends TeaModel {
    @NameInMap("TagDescription")
    public String tagDescription;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static AddUserTagMetaRequest build(java.util.Map<String, ?> map) throws Exception {
        AddUserTagMetaRequest self = new AddUserTagMetaRequest();
        return TeaModel.build(map, self);
    }

    public AddUserTagMetaRequest setTagDescription(String tagDescription) {
        this.tagDescription = tagDescription;
        return this;
    }
    public String getTagDescription() {
        return this.tagDescription;
    }

    public AddUserTagMetaRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
