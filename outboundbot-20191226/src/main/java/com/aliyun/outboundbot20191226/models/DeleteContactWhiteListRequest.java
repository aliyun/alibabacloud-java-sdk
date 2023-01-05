// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteContactWhiteListRequest extends TeaModel {
    @NameInMap("ContactWhiteListId")
    public String contactWhiteListId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Operator")
    public String operator;

    public static DeleteContactWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactWhiteListRequest self = new DeleteContactWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactWhiteListRequest setContactWhiteListId(String contactWhiteListId) {
        this.contactWhiteListId = contactWhiteListId;
        return this;
    }
    public String getContactWhiteListId() {
        return this.contactWhiteListId;
    }

    public DeleteContactWhiteListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteContactWhiteListRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
