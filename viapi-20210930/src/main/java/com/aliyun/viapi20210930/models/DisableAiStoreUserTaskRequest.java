// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.viapi20210930.models;

import com.aliyun.tea.*;

public class DisableAiStoreUserTaskRequest extends TeaModel {
    @NameInMap("AistoreVersion")
    public String aistoreVersion;

    @NameInMap("Id")
    public Long id;

    public static DisableAiStoreUserTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableAiStoreUserTaskRequest self = new DisableAiStoreUserTaskRequest();
        return TeaModel.build(map, self);
    }

    public DisableAiStoreUserTaskRequest setAistoreVersion(String aistoreVersion) {
        this.aistoreVersion = aistoreVersion;
        return this;
    }
    public String getAistoreVersion() {
        return this.aistoreVersion;
    }

    public DisableAiStoreUserTaskRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

}
