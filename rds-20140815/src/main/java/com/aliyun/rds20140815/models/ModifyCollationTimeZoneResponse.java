// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyCollationTimeZoneResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DBInstanceId")
    @Validation(required = true)
    public String DBInstanceId;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("Timezone")
    @Validation(required = true)
    public String timezone;

    @NameInMap("Collation")
    @Validation(required = true)
    public String collation;

    public static ModifyCollationTimeZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyCollationTimeZoneResponse self = new ModifyCollationTimeZoneResponse();
        return TeaModel.build(map, self);
    }

    public ModifyCollationTimeZoneResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifyCollationTimeZoneResponse setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyCollationTimeZoneResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public ModifyCollationTimeZoneResponse setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }
    public String getTimezone() {
        return this.timezone;
    }

    public ModifyCollationTimeZoneResponse setCollation(String collation) {
        this.collation = collation;
        return this;
    }
    public String getCollation() {
        return this.collation;
    }

}
