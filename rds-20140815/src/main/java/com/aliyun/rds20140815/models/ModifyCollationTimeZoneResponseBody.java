// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneResponseBody extends TeaModel {
    /**
     * <p>The character set collation of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Latin1_General_CI_AS</p>
     */
    @NameInMap("Collation")
    public String collation;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>8EA054AF-DFA7-497D-9F57-790FFC974C0B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>114413215</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>China Standard Time</p>
     */
    @NameInMap("Timezone")
    public String timezone;

    public static ModifyCollationTimeZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollationTimeZoneResponseBody self = new ModifyCollationTimeZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyCollationTimeZoneResponseBody setCollation(String collation) {
        this.collation = collation;
        return this;
    }
    public String getCollation() {
        return this.collation;
    }

    public ModifyCollationTimeZoneResponseBody setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyCollationTimeZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCollationTimeZoneResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyCollationTimeZoneResponseBody setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

}
