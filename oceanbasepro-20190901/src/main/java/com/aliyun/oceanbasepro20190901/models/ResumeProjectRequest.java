// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class ResumeProjectRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    public static ResumeProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ResumeProjectRequest self = new ResumeProjectRequest();
        return TeaModel.build(map, self);
    }

    public ResumeProjectRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
