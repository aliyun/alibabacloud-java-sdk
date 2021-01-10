// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkelinkflowLinkflowAttachmentsRequest extends TeaModel {
    @NameInMap("ProcessInstanceId")
    public String processInstanceId;

    public static ListLinkelinkflowLinkflowAttachmentsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkelinkflowLinkflowAttachmentsRequest self = new ListLinkelinkflowLinkflowAttachmentsRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkelinkflowLinkflowAttachmentsRequest setProcessInstanceId(String processInstanceId) {
        this.processInstanceId = processInstanceId;
        return this;
    }
    public String getProcessInstanceId() {
        return this.processInstanceId;
    }

}
