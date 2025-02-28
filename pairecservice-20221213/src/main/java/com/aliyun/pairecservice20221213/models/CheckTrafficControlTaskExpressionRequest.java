// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class CheckTrafficControlTaskExpressionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Expression")
    public String expression;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableMetaId")
    public String tableMetaId;

    public static CheckTrafficControlTaskExpressionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckTrafficControlTaskExpressionRequest self = new CheckTrafficControlTaskExpressionRequest();
        return TeaModel.build(map, self);
    }

    public CheckTrafficControlTaskExpressionRequest setExpression(String expression) {
        this.expression = expression;
        return this;
    }
    public String getExpression() {
        return this.expression;
    }

    public CheckTrafficControlTaskExpressionRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CheckTrafficControlTaskExpressionRequest setTableMetaId(String tableMetaId) {
        this.tableMetaId = tableMetaId;
        return this;
    }
    public String getTableMetaId() {
        return this.tableMetaId;
    }

}
