// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class CreateDBInstanceResponseBody extends TeaModel {
    /**
     * <p>The internal endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****.mysql.rds.aliyuncs.com</p>
     */
    @NameInMap("ConnectionString")
    public String connectionString;

    /**
     * <p>The instance ID. If you set the <strong>Amount</strong> parameter to a value greater than <strong>1</strong>, the number of instance IDs that corresponds to the value is returned, separated by commas.</p>
     * <p>For example, if <strong>Amount</strong> is set to <strong>3</strong>, three instance IDs are returned. Example:
     * <code>rm-uf6wjk5*****1，rm-uf6wjk5*****2，rm-uf6wjk5*****3</code></p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Indicates that a dry run is performed before the instance is created.</p>
     * <ul>
     * <li>The return value is always <strong>true</strong>.</li>
     * <li>If no dry run is performed, this parameter is not returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Indicates whether the dry run for instance creation passed. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The dry run passed.</li>
     * <li><strong>false</strong>: The dry run failed.</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>If no dry run is performed, this parameter is not returned.</li>
     * <li>If the dry run fails, the corresponding error is returned.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("DryRunResult")
    public Boolean dryRunResult;

    /**
     * <p>The message for the batch creation task.</p>
     * <blockquote>
     * <p>This parameter is returned only when the <strong>Amount</strong> parameter is greater than 1.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Batch Create DBInstance Task Is In Process.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1007893702****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>The port number that corresponds to the internal endpoint of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>3306</p>
     */
    @NameInMap("Port")
    public String port;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1E43AAE0-BEE8-43DA-860D-EAF2AA0724DC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether tags are successfully bound to the instance. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Tags are successfully bound.</li>
     * <li><strong>false</strong>: Tags failed to be bound.</li>
     * </ul>
     * <blockquote>
     * <p>If no tags are bound to the instance, this parameter is not returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("TagResult")
    public Boolean tagResult;

    /**
     * <p>The task ID of the batch creation task.</p>
     * <ul>
     * <li>This parameter is returned only when the <strong>Amount</strong> parameter is greater than 1.</li>
     * <li>Querying tasks by <strong>TaskId</strong> is not supported at this time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>s2365879-a9d0-55af-fgae-f2****</p>
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
