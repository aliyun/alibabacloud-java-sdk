// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneResponseBody extends TeaModel {
    /**
     * <p>The character set collation of the instance.</p>
     */
    @NameInMap("Collation")
    public String collation;

    /**
     * <p>The instance ID.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The time zone.</p>
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
