// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.push20160801.models;

import com.aliyun.tea.*;

public class RemoveTagRequest extends TeaModel {
    /**
     * <p>The AppKey value.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>23267207</p>
     */
    @NameInMap("AppKey")
    public Long appKey;

    /**
     * <p>The name of the tag to remove. You can remove only one tag at a time. Maximum length: 128 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tag</p>
     */
    @NameInMap("TagName")
    public String tagName;

    public static RemoveTagRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveTagRequest self = new RemoveTagRequest();
        return TeaModel.build(map, self);
    }

    public RemoveTagRequest setAppKey(Long appKey) {
        this.appKey = appKey;
        return this;
    }
    public Long getAppKey() {
        return this.appKey;
    }

    public RemoveTagRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

}
