// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paicopilot20250731.models;

import com.aliyun.tea.*;

public class CreateSessionRequest extends TeaModel {
    @NameInMap("Labels")
    public java.util.List<Label> labels;

    @NameInMap("Title")
    public String title;

    public static CreateSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSessionRequest self = new CreateSessionRequest();
        return TeaModel.build(map, self);
    }

    public CreateSessionRequest setLabels(java.util.List<Label> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    public CreateSessionRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
