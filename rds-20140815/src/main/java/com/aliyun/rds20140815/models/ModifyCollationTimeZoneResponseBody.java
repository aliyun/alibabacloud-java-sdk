// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneResponseBody extends TeaModel {
    /**
     * <p>The system character set collation.</p>
     * 
     * <strong>example:</strong>
     * <p>Chinese_PRC_CS_AS</p>
     */
    @NameInMap("Collation")
    public String collation;

    /**
     * <p>The instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-bp15qi0nd1u27****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>58D48758-F035-52D3-A4FB-80C73DA3E95C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>56365****</p>
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
