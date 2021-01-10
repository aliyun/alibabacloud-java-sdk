// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RemoveLinkeLinktWorkitemtagRequest extends TeaModel {
    @NameInMap("TagId")
    public String tagId;

    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static RemoveLinkeLinktWorkitemtagRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveLinkeLinktWorkitemtagRequest self = new RemoveLinkeLinktWorkitemtagRequest();
        return TeaModel.build(map, self);
    }

    public RemoveLinkeLinktWorkitemtagRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public RemoveLinkeLinktWorkitemtagRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
