// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteContactWhiteListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>111111</p>
     */
    @NameInMap("ContactWhiteListId")
    public String contactWhiteListId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>af81a389-91f0-4157-8d82-720edd02b66a</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>160131</p>
     */
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
