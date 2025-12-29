// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateSortScriptRequest extends TeaModel {
    @NameInMap("description")
    public String description;

    public static UpdateSortScriptRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSortScriptRequest self = new UpdateSortScriptRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSortScriptRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
