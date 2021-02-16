// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSqlLogTrialStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("EverTrialed")
    public String everTrialed;

    @NameInMap("OpenTrial")
    public String openTrial;

    @NameInMap("RemainDays")
    public String remainDays;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("UsedDays")
    public String usedDays;

    public static DescribeSqlLogTrialStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlLogTrialStatusResponseBody self = new DescribeSqlLogTrialStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlLogTrialStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSqlLogTrialStatusResponseBody setEverTrialed(String everTrialed) {
        this.everTrialed = everTrialed;
        return this;
    }
    public String getEverTrialed() {
        return this.everTrialed;
    }

    public DescribeSqlLogTrialStatusResponseBody setOpenTrial(String openTrial) {
        this.openTrial = openTrial;
        return this;
    }
    public String getOpenTrial() {
        return this.openTrial;
    }

    public DescribeSqlLogTrialStatusResponseBody setRemainDays(String remainDays) {
        this.remainDays = remainDays;
        return this;
    }
    public String getRemainDays() {
        return this.remainDays;
    }

    public DescribeSqlLogTrialStatusResponseBody setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public DescribeSqlLogTrialStatusResponseBody setUsedDays(String usedDays) {
        this.usedDays = usedDays;
        return this;
    }
    public String getUsedDays() {
        return this.usedDays;
    }

}
