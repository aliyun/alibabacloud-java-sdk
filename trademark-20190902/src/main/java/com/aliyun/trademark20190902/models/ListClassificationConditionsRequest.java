// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class ListClassificationConditionsRequest extends TeaModel {
    @NameInMap("TagName")
    public String tagName;

    @NameInMap("Type")
    public Long type;

    public static ListClassificationConditionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListClassificationConditionsRequest self = new ListClassificationConditionsRequest();
        return TeaModel.build(map, self);
    }

    public ListClassificationConditionsRequest setTagName(String tagName) {
        this.tagName = tagName;
        return this;
    }
    public String getTagName() {
        return this.tagName;
    }

    public ListClassificationConditionsRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
