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
        @NameInMap("AccessKeyId")
        public String accessKeyId;

        @NameInMap("Authed")
        public Boolean authed;

        @NameInMap("Buyed")
        public Boolean buyed;

        @NameInMap("ChargeType")
        public String chargeType;

        @NameInMap("DataMaskColumns")
        public Long dataMaskColumns;

        @NameInMap("DataMaskTasks")
        public Long dataMaskTasks;

        @NameInMap("DatamaskColumns")
        public Long datamaskColumns;

        @NameInMap("DivulgeCount")
        public Long divulgeCount;

        @NameInMap("DlpTotalCount")
        public Long dlpTotalCount;

        @NameInMap("IncSensitiveObjects")
        public Long incSensitiveObjects;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceNum")
        public Integer instanceNum;

        @NameInMap("InstanceStatus")
        public Integer instanceStatus;

        @NameInMap("LabStatus")
        public Integer labStatus;

        @NameInMap("OssBucketSet")
        public Boolean ossBucketSet;

        @NameInMap("OssSize")
        public Long ossSize;

        @NameInMap("RemainDays")
        public Integer remainDays;

        @NameInMap("SensitiveObject")
        public Long sensitiveObject;

        @NameInMap("SensitiveTable")
        public Long sensitiveTable;

        @NameInMap("SensitiveTables")
        public Long sensitiveTables;

        @NameInMap("TotalDataMaskColumns")
        public Long totalDataMaskColumns;

        @NameInMap("Trail")
        public Boolean trail;

        @NameInMap("UseInstanceNum")
        public Integer useInstanceNum;

        @NameInMap("UseOssSize")
        public Long useOssSize;

        public static DescribeUserStatusResponseBodyUserStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserStatusResponseBodyUserStatus self = new DescribeUserStatusResponseBodyUserStatus();
            return TeaModel.build(map, self);
        }

        public DescribeUserStatusResponseBodyUserStatus setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }
        public String getAccessKeyId() {
            return this.accessKeyId;
        }

        public DescribeUserStatusResponseBodyUserStatus setAuthed(Boolean authed) {
            this.authed = authed;
            return this;
        }
        public Boolean getAuthed() {
            return this.authed;
        }

        public DescribeUserStatusResponseBodyUserStatus setBuyed(Boolean buyed) {
            this.buyed = buyed;
            return this;
        }
        public Boolean getBuyed() {
            return this.buyed;
        }

        public DescribeUserStatusResponseBodyUserStatus setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public DescribeUserStatusResponseBodyUserStatus setDataMaskColumns(Long dataMaskColumns) {
            this.dataMaskColumns = dataMaskColumns;
            return this;
        }
        public Long getDataMaskColumns() {
            return this.dataMaskColumns;
        }

        public DescribeUserStatusResponseBodyUserStatus setDataMaskTasks(Long dataMaskTasks) {
            this.dataMaskTasks = dataMaskTasks;
            return this;
        }
        public Long getDataMaskTasks() {
            return this.dataMaskTasks;
        }

        public DescribeUserStatusResponseBodyUserStatus setDatamaskColumns(Long datamaskColumns) {
            this.datamaskColumns = datamaskColumns;
            return this;
        }
        public Long getDatamaskColumns() {
            return this.datamaskColumns;
        }

        public DescribeUserStatusResponseBodyUserStatus setDivulgeCount(Long divulgeCount) {
            this.divulgeCount = divulgeCount;
            return this;
        }
        public Long getDivulgeCount() {
            return this.divulgeCount;
        }

        public DescribeUserStatusResponseBodyUserStatus setDlpTotalCount(Long dlpTotalCount) {
            this.dlpTotalCount = dlpTotalCount;
            return this;
        }
        public Long getDlpTotalCount() {
            return this.dlpTotalCount;
        }

        public DescribeUserStatusResponseBodyUserStatus setIncSensitiveObjects(Long incSensitiveObjects) {
            this.incSensitiveObjects = incSensitiveObjects;
            return this;
        }
        public Long getIncSensitiveObjects() {
            return this.incSensitiveObjects;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceNum(Integer instanceNum) {
            this.instanceNum = instanceNum;
            return this;
        }
        public Integer getInstanceNum() {
            return this.instanceNum;
        }

        public DescribeUserStatusResponseBodyUserStatus setInstanceStatus(Integer instanceStatus) {
            this.instanceStatus = instanceStatus;
            return this;
        }
        public Integer getInstanceStatus() {
            return this.instanceStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setLabStatus(Integer labStatus) {
            this.labStatus = labStatus;
            return this;
        }
        public Integer getLabStatus() {
            return this.labStatus;
        }

        public DescribeUserStatusResponseBodyUserStatus setOssBucketSet(Boolean ossBucketSet) {
            this.ossBucketSet = ossBucketSet;
            return this;
        }
        public Boolean getOssBucketSet() {
            return this.ossBucketSet;
        }

        public DescribeUserStatusResponseBodyUserStatus setOssSize(Long ossSize) {
            this.ossSize = ossSize;
            return this;
        }
        public Long getOssSize() {
            return this.ossSize;
        }

        public DescribeUserStatusResponseBodyUserStatus setRemainDays(Integer remainDays) {
            this.remainDays = remainDays;
            return this;
        }
        public Integer getRemainDays() {
            return this.remainDays;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveObject(Long sensitiveObject) {
            this.sensitiveObject = sensitiveObject;
            return this;
        }
        public Long getSensitiveObject() {
            return this.sensitiveObject;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveTable(Long sensitiveTable) {
            this.sensitiveTable = sensitiveTable;
            return this;
        }
        public Long getSensitiveTable() {
            return this.sensitiveTable;
        }

        public DescribeUserStatusResponseBodyUserStatus setSensitiveTables(Long sensitiveTables) {
            this.sensitiveTables = sensitiveTables;
            return this;
        }
        public Long getSensitiveTables() {
            return this.sensitiveTables;
        }

        public DescribeUserStatusResponseBodyUserStatus setTotalDataMaskColumns(Long totalDataMaskColumns) {
            this.totalDataMaskColumns = totalDataMaskColumns;
            return this;
        }
        public Long getTotalDataMaskColumns() {
            return this.totalDataMaskColumns;
        }

        public DescribeUserStatusResponseBodyUserStatus setTrail(Boolean trail) {
            this.trail = trail;
            return this;
        }
        public Boolean getTrail() {
            return this.trail;
        }

        public DescribeUserStatusResponseBodyUserStatus setUseInstanceNum(Integer useInstanceNum) {
            this.useInstanceNum = useInstanceNum;
            return this;
        }
        public Integer getUseInstanceNum() {
            return this.useInstanceNum;
        }

        public DescribeUserStatusResponseBodyUserStatus setUseOssSize(Long useOssSize) {
            this.useOssSize = useOssSize;
            return this;
        }
        public Long getUseOssSize() {
            return this.useOssSize;
        }

    }

}
