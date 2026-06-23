// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGatewayConsumerForPolarDBXResponseBody extends TeaModel {
    /**
     * <p>The instance name.</p>
     * 
     * <strong>example:</strong>
     * <p>pxc-**************</p>
     */
    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>A501A191-BD70-5E50-98A9-C2A486A82****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The backend task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>422922413</p>
     */
    @NameInMap("TaskId")
    public Integer taskId;

    public static CreateGatewayConsumerForPolarDBXResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGatewayConsumerForPolarDBXResponseBody self = new CreateGatewayConsumerForPolarDBXResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGatewayConsumerForPolarDBXResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public CreateGatewayConsumerForPolarDBXResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGatewayConsumerForPolarDBXResponseBody setTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }
    public Integer getTaskId() {
        return this.taskId;
    }

}
