// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The endpoint of the instance.</p>
     * <br>
     * <p>> The **DBInstanceNetType** parameter indicates whether the endpoint is internal or public.</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The ID of the instance If the value of the **Amount** parameter is greater than **1**, more than one instance ID is returned. The number of instance IDs that are returned is the same as the value of the Amount parameter. The returned instance IDs are separated by commas (,).</p>
     * <br>
     * <p>For example, if the value of the **Amount** parameter is **3**, three instance IDs are returned. Example: `rm-uf6wjk5*****1,rm-uf6wjk5*****2,rm-uf6wjk5*****3`</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Indicates that the system prechecks the request before the system creates the instance.</p>
     * <br>
     * <br>
     * <br>
     * <p>> *   The return value is fixed as **true**.</p>
     * <br>
     * <p>> *   If the system does not perform a precheck, this parameter is not returned.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Indicates whether the request passed the precheck. Valid values:</p>
     * <br>
     * <p>*   **true**: The request passed the precheck.</p>
     * <p>*   **false**: The request failed the precheck.</p>
     * <br>
     * <br>
     * <p>> </p>
     * <p>*   If the system does not perform a precheck, this parameter is not returned.</p>
     * <p>> </p>
     * <p>*   If the request failed the precheck, an error is returned.</p>
     */
    @NameInMap("DryRunResult")
    public Boolean dryRunResult;

    /**
     * <p>The message that indicates whether multiple instances are created.</p>
     * <br>
     * <p>> The parameter is returned only when the value of the **Amount** parameter is greater than 1.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the order.</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The port that is used to connect to the instance.</p>
     * <br>
     * <p>> The **DBInstanceNetType** parameter indicates whether the port number is internal or public.</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the specified tag is added to the instance. Valid values:</p>
     * <br>
     * <p>*   **true**: The specified tag is added to the instance.</p>
     * <p>*   **false**: The specified tag fails to be added to the instance.</p>
     * <br>
     * <p>> If you do not add a tag to the instance, this parameter is not returned.</p>
     */
    @NameInMap("TagResult")
    public Boolean tagResult;

    /**
     * <p>The ID of the task that is run to create multiple instances.</p>
     * <br>
     * <br>
     * <br>
     * <p>> *   This parameter is returned only when the value of the **Amount** parameter is greater than 1.</p>
     * <br>
     * <p>> *   The **TaskID** parameter cannot be used to query a task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreateDBInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDBInstanceResponseBody self = new CreateDBInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDBInstanceResponseBody setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }
    public String getConnectionString() {
        return this.connectionString;
    }

    public CreateDBInstanceResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public CreateDBInstanceResponseBody setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateDBInstanceResponseBody setDryRunResult(Boolean dryRunResult) {
        this.dryRunResult = dryRunResult;
        return this;
    }
    public Boolean getDryRunResult() {
        return this.dryRunResult;
    }

    public CreateDBInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateDBInstanceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateDBInstanceResponseBody setPort(String port) {
        this.port = port;
        return this;
    }
    public String getPort() {
        return this.port;
    }

    public CreateDBInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDBInstanceResponseBody setTagResult(Boolean tagResult) {
        this.tagResult = tagResult;
        return this;
    }
    public Boolean getTagResult() {
        return this.tagResult;
    }

    public CreateDBInstanceResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
