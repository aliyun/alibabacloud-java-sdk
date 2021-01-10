// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktWorkitemstampRequest extends TeaModel {
    @NameInMap("StatusId")
    public String statusId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("WorkItemSign")
    public String workItemSign;

    public static UpdateLinkeLinktWorkitemstampRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktWorkitemstampRequest self = new UpdateLinkeLinktWorkitemstampRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktWorkitemstampRequest setStatusId(String statusId) {
        this.statusId = statusId;
        return this;
    }
    public String getStatusId() {
        return this.statusId;
    }

    public UpdateLinkeLinktWorkitemstampRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateLinkeLinktWorkitemstampRequest setWorkItemSign(String workItemSign) {
        this.workItemSign = workItemSign;
        return this;
    }
    public String getWorkItemSign() {
        return this.workItemSign;
    }

}
