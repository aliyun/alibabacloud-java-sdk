// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class UpdateTagOptionRequest extends TeaModel {
    @NameInMap("Active")
    public Boolean active;

    @NameInMap("TagOptionId")
    public String tagOptionId;

    @NameInMap("Value")
    public String value;

    public static UpdateTagOptionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTagOptionRequest self = new UpdateTagOptionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTagOptionRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public UpdateTagOptionRequest setTagOptionId(String tagOptionId) {
        this.tagOptionId = tagOptionId;
        return this;
    }
    public String getTagOptionId() {
        return this.tagOptionId;
    }

    public UpdateTagOptionRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
