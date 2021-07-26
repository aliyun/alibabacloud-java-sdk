// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class UpdateExperimentContentRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Version")
    public Long version;

    public static UpdateExperimentContentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateExperimentContentRequest self = new UpdateExperimentContentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateExperimentContentRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateExperimentContentRequest setVersion(Long version) {
        this.version = version;
        return this;
    }
    public Long getVersion() {
        return this.version;
    }

}
