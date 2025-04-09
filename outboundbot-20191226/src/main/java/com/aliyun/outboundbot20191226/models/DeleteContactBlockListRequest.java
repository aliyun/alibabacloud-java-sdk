// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteContactBlockListRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
     */
    @NameInMap("ContactBlockListId")
    public String contactBlockListId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c6320d3c-fa45-4011-b3b1-acdfabe3a8c6</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>160131</p>
     */
    @NameInMap("Operator")
    public String operator;

    public static DeleteContactBlockListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactBlockListRequest self = new DeleteContactBlockListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteContactBlockListRequest setContactBlockListId(String contactBlockListId) {
        this.contactBlockListId = contactBlockListId;
        return this;
    }
    public String getContactBlockListId() {
        return this.contactBlockListId;
    }

    public DeleteContactBlockListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteContactBlockListRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

}
