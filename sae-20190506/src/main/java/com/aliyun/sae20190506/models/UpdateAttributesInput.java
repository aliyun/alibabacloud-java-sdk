// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateAttributesInput extends TeaModel {
    @NameInMap("description")
    public String description;

    @NameInMap("httpTriggerConfig")
    public HTTPTriggerConfig httpTriggerConfig;

    @NameInMap("versionID")
    public String versionID;

    public static UpdateAttributesInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateAttributesInput self = new UpdateAttributesInput();
        return TeaModel.build(map, self);
    }

    public UpdateAttributesInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAttributesInput setHttpTriggerConfig(HTTPTriggerConfig httpTriggerConfig) {
        this.httpTriggerConfig = httpTriggerConfig;
        return this;
    }
    public HTTPTriggerConfig getHttpTriggerConfig() {
        return this.httpTriggerConfig;
    }

    public UpdateAttributesInput setVersionID(String versionID) {
        this.versionID = versionID;
        return this;
    }
    public String getVersionID() {
        return this.versionID;
    }

}
