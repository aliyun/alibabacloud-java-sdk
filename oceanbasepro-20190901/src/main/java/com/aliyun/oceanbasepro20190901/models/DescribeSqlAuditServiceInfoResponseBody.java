// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSqlAuditServiceInfoResponseBody extends TeaModel {
    @NameInMap("Data")
    public DescribeSqlAuditServiceInfoResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeSqlAuditServiceInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSqlAuditServiceInfoResponseBody self = new DescribeSqlAuditServiceInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSqlAuditServiceInfoResponseBody setData(DescribeSqlAuditServiceInfoResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSqlAuditServiceInfoResponseBodyData getData() {
        return this.data;
    }

    public DescribeSqlAuditServiceInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeSqlAuditServiceInfoResponseBodyData extends TeaModel {
        @NameInMap("DatabaseName")
        public String databaseName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LaunchSqlAudit")
        public Boolean launchSqlAudit;

        @NameInMap("TenantId")
        public String tenantId;

        public static DescribeSqlAuditServiceInfoResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSqlAuditServiceInfoResponseBodyData self = new DescribeSqlAuditServiceInfoResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSqlAuditServiceInfoResponseBodyData setDatabaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public String getDatabaseName() {
            return this.databaseName;
        }

        public DescribeSqlAuditServiceInfoResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSqlAuditServiceInfoResponseBodyData setLaunchSqlAudit(Boolean launchSqlAudit) {
            this.launchSqlAudit = launchSqlAudit;
            return this;
        }
        public Boolean getLaunchSqlAudit() {
            return this.launchSqlAudit;
        }

        public DescribeSqlAuditServiceInfoResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
