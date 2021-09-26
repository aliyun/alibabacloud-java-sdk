// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeUserStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserStatus")
    public DescribeUserStatusResponseBodyUserStatus userStatus;

    public static DescribeUserStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserStatusResponseBody self = new DescribeUserStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserStatusResponseBody setUserStatus(DescribeUserStatusResponseBodyUserStatus userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    public DescribeUserStatusResponseBodyUserStatus getUserStatus() {
        return this.userStatus;
    }

    public static class DescribeUserStatusResponseBodyUserStatus extends TeaModel {
        @NameInMap("UseOssSize")
        public Long useOssSize;

        @NameInMap("UseInstanceNum")
        public Integer useInstanceNum;

        @NameInMap("InstanceNum")
        public Integer instanceNum;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("IncSensitiveTables")
        public Long incSensitiveTables;

        @NameInMap("AuditUpgradeStatus")
        public Boolean auditUpgradeStatus;

        @NameInMap("DataMaskTasks")
        public Long dataMaskTasks;

        @NameInMap("Authed")
        public Boolean authed;

        @NameInMap("LabStatus")
        public Integer labStatus;

        @NameInMap("OdpsSet")
        public Boolean odpsSet;

        @NameInMap("OssBucketSet")
        public Boolean ossBucketSet;

        @NameInMap("SensitiveTable")
        public Long sensitiveTable;

        @NameInMap("RemainDays")
        public Integer remainDays;

        @NameInMap("TotalDataMaskColumns")
        public Long totalDataMaskColumns;

        @NameInMap("DatamaskColumns")
        public Long datamaskColumns;

        @NameInMap("AuthProductList")
        public String authProductList;

        @NameInMap("Trail")
        public Boolean trail;

        @NameInMap("DivulgeCount")
        public Long divulgeCount;

        @NameInMap("RdsSet")
        public Boolean rdsSet;

        @NameInMap("DbAuditStatus")
        public Integer dbAuditStatus;

        @NameInMap("RenewStatus")
        public Boolean renewStatus;

        @NameInMap("SensitiveObjects")
        public Long sensitiveObjects;

        @NameInMap("DataMaskColumns")
        public Long dataMaskColumns;

        @NameInMap("DlpTotalCount")
        public Long dlpTotalCount;

        @NameInMap("SensitiveObject")
        public Long sensitiveObject;

        @NameInMap("DlpCount")
        public Long dlpCount;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("OssSize")
        public Long ossSize;

        @NameInMap("SensitiveTotalTop")
        public String sensitiveTotalTop;

        @NameInMap("SensitiveTables")
        public Long sensitiveTables;

        @NameInMap("SensitiveTop")
        public String sensitiveTop;

        @NameInMap("Buyed")
        public Boolean buyed;

        @NameInMap("IncSensitiveObjects")
        public Long incSensitiveObjects;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("AssetScanned")
        public Boolean assetScanned;

        @NameInMap("AlarmCount")
        public Long alarmCount;

        @NameInMap("DisplayTime")
        public String displayTime;

        public static DescribeUserStatusResponseBodyUserStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserStatusResponseBodyUserStatus self = new DescribeUserStatusResponseBodyUserStatus();
            return TeaModel.build(map, self);
        }

        public DescribeUserStatusResponseBodyUserStatus setUseOssSize(Long useOssSize) {
            this.useOssSize = useOssSize;
            return this;
        }
        public Long getUseOssSize() {
            return this.useOssSize;
        }

        public DescribeUserStatusResponseBodyUserStatus setUseInstanceNum(Integer useInstanceNum) {
            this.useInstanceNum = useInstanceNum;
            return this;
        }
        public Integer getUseInstanceNum() {
            return this.useInstanceNum;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public DescribeUserStatusResponseBodyUserStatus setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeUserStatusResponseBodyUserStatus setIncSensitiveTables(Long incSensitiveTables) {
            this.incSensitiveTables = incSensitiveTables;
            return this;
        }
        public Long getIncSensitiveTables() {
            return this.incSensitiveTables;
        }

        public DescribeUserStatusResponseBodyUserStatus setAuditUpgradeStatus(Boolean auditUpgradeStatus) {
            this.auditUpgradeStatus = auditUpgradeStatus;
            return this;
        }
        public Boolean getAuditUpgradeStatus() {
            return this.auditUpgradeStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setDataMaskTasks(Long dataMaskTasks) {
            this.dataMaskTasks = dataMaskTasks;
            return this;
        }
        public Long getDataMaskTasks() {
            return this.dataMaskTasks;
        }

        public DescribeUserStatusResponseBodyUserStatus setAuthed(Boolean authed) {
            this.authed = authed;
            return this;
        }
        public Boolean getAuthed() {
            return this.authed;
        }

        public DescribeUserStatusResponseBodyUserStatus setLabStatus(Integer labStatus) {
            this.labStatus = labStatus;
            return this;
        }
        public Integer getLabStatus() {
            return this.labStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setOdpsSet(Boolean odpsSet) {
            this.odpsSet = odpsSet;
            return this;
        }
        public Boolean getOdpsSet() {
            return this.odpsSet;
        }

        public DescribeUserStatusResponseBodyUserStatus setOssBucketSet(Boolean ossBucketSet) {
            this.ossBucketSet = ossBucketSet;
            return this;
        }
        public Boolean getOssBucketSet() {
            return this.ossBucketSet;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveTable(Long sensitiveTable) {
            this.sensitiveTable = sensitiveTable;
            return this;
        }
        public Long getSensitiveTable() {
            return this.sensitiveTable;
        }

        public DescribeUserStatusResponseBodyUserStatus setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeUserStatusResponseBodyUserStatus setTotalDataMaskColumns(Long totalDataMaskColumns) {
            this.totalDataMaskColumns = totalDataMaskColumns;
            return this;
        }
        public Long getTotalDataMaskColumns() {
            return this.totalDataMaskColumns;
        }

        public DescribeUserStatusResponseBodyUserStatus setDatamaskColumns(Long datamaskColumns) {
            this.datamaskColumns = datamaskColumns;
            return this;
        }
        public Long getDatamaskColumns() {
            return this.datamaskColumns;
        }

        public DescribeUserStatusResponseBodyUserStatus setAuthProductList(String authProductList) {
            this.authProductList = authProductList;
            return this;
        }
        public String getAuthProductList() {
            return this.authProductList;
        }

        public DescribeUserStatusResponseBodyUserStatus setTrail(Boolean trail) {
            this.trail = trail;
            return this;
        }
        public Boolean getTrail() {
            return this.trail;
        }

        public DescribeUserStatusResponseBodyUserStatus setDivulgeCount(Long divulgeCount) {
            this.divulgeCount = divulgeCount;
            return this;
        }
        public Long getDivulgeCount() {
            return this.divulgeCount;
        }

        public DescribeUserStatusResponseBodyUserStatus setRdsSet(Boolean rdsSet) {
            this.rdsSet = rdsSet;
            return this;
        }
        public Boolean getRdsSet() {
            return this.rdsSet;
        }

        public DescribeUserStatusResponseBodyUserStatus setDbAuditStatus(Integer dbAuditStatus) {
            this.dbAuditStatus = dbAuditStatus;
            return this;
        }
        public Integer getDbAuditStatus() {
            return this.dbAuditStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setRenewStatus(Boolean renewStatus) {
            this.renewStatus = renewStatus;
            return this;
        }
        public Boolean getRenewStatus() {
            return this.renewStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveObjects(Long sensitiveObjects) {
            this.sensitiveObjects = sensitiveObjects;
            return this;
        }
        public Long getSensitiveObjects() {
            return this.sensitiveObjects;
        }

        public DescribeUserStatusResponseBodyUserStatus setDataMaskColumns(Long dataMaskColumns) {
            this.dataMaskColumns = dataMaskColumns;
            return this;
        }
        public Long getDataMaskColumns() {
            return this.dataMaskColumns;
        }

        public DescribeUserStatusResponseBodyUserStatus setDlpTotalCount(Long dlpTotalCount) {
            this.dlpTotalCount = dlpTotalCount;
            return this;
        }
        public Long getDlpTotalCount() {
            return this.dlpTotalCount;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveObject(Long sensitiveObject) {
            this.sensitiveObject = sensitiveObject;
            return this;
        }
        public Long getSensitiveObject() {
            return this.sensitiveObject;
        }

        public DescribeUserStatusResponseBodyUserStatus setDlpCount(Long dlpCount) {
            this.dlpCount = dlpCount;
            return this;
        }
        public Long getDlpCount() {
            return this.dlpCount;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUserStatusResponseBodyUserStatus setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeUserStatusResponseBodyUserStatus setOssSize(Long ossSize) {
            this.ossSize = ossSize;
            return this;
        }
        public Long getOssSize() {
            return this.ossSize;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveTotalTop(String sensitiveTotalTop) {
            this.sensitiveTotalTop = sensitiveTotalTop;
            return this;
        }
        public String getSensitiveTotalTop() {
            return this.sensitiveTotalTop;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveTables(Long sensitiveTables) {
            this.sensitiveTables = sensitiveTables;
            return this;
        }
        public Long getSensitiveTables() {
            return this.sensitiveTables;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveTop(String sensitiveTop) {
            this.sensitiveTop = sensitiveTop;
            return this;
        }
        public String getSensitiveTop() {
            return this.sensitiveTop;
        }

        public DescribeUserStatusResponseBodyUserStatus setBuyed(Boolean buyed) {
            this.buyed = buyed;
            return this;
        }
        public Boolean getBuyed() {
            return this.buyed;
        }

        public DescribeUserStatusResponseBodyUserStatus setIncSensitiveObjects(Long incSensitiveObjects) {
            this.incSensitiveObjects = incSensitiveObjects;
            return this;
        }
        public Long getIncSensitiveObjects() {
            return this.incSensitiveObjects;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setAssetScanned(Boolean assetScanned) {
            this.assetScanned = assetScanned;
            return this;
        }
        public Boolean getAssetScanned() {
            return this.assetScanned;
        }

        public DescribeUserStatusResponseBodyUserStatus setAlarmCount(Long alarmCount) {
            this.alarmCount = alarmCount;
            return this;
        }
        public Long getAlarmCount() {
            return this.alarmCount;
        }

        public DescribeUserStatusResponseBodyUserStatus setDisplayTime(String displayTime) {
            this.displayTime = displayTime;
            return this;
        }
        public String getDisplayTime() {
            return this.displayTime;
        }

    }

}
