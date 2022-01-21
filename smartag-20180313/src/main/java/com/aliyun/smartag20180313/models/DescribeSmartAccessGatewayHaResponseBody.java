// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeSmartAccessGatewayHaResponseBody extends TeaModel {
    @NameInMap("BackupDeviceId")
    public String backupDeviceId;

    @NameInMap("DeviceLevelBackupState")
    public String deviceLevelBackupState;

    @NameInMap("DeviceLevelBackupType")
    public String deviceLevelBackupType;

    @NameInMap("LinkBackupInfoList")
    public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList linkBackupInfoList;

    @NameInMap("MainDeviceId")
    public String mainDeviceId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SmartAGId")
    public String smartAGId;

    public static DescribeSmartAccessGatewayHaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartAccessGatewayHaResponseBody self = new DescribeSmartAccessGatewayHaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartAccessGatewayHaResponseBody setBackupDeviceId(String backupDeviceId) {
        this.backupDeviceId = backupDeviceId;
        return this;
    }
    public String getBackupDeviceId() {
        return this.backupDeviceId;
    }

    public DescribeSmartAccessGatewayHaResponseBody setDeviceLevelBackupState(String deviceLevelBackupState) {
        this.deviceLevelBackupState = deviceLevelBackupState;
        return this;
    }
    public String getDeviceLevelBackupState() {
        return this.deviceLevelBackupState;
    }

    public DescribeSmartAccessGatewayHaResponseBody setDeviceLevelBackupType(String deviceLevelBackupType) {
        this.deviceLevelBackupType = deviceLevelBackupType;
        return this;
    }
    public String getDeviceLevelBackupType() {
        return this.deviceLevelBackupType;
    }

    public DescribeSmartAccessGatewayHaResponseBody setLinkBackupInfoList(DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList linkBackupInfoList) {
        this.linkBackupInfoList = linkBackupInfoList;
        return this;
    }
    public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList getLinkBackupInfoList() {
        return this.linkBackupInfoList;
    }

    public DescribeSmartAccessGatewayHaResponseBody setMainDeviceId(String mainDeviceId) {
        this.mainDeviceId = mainDeviceId;
        return this;
    }
    public String getMainDeviceId() {
        return this.mainDeviceId;
    }

    public DescribeSmartAccessGatewayHaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartAccessGatewayHaResponseBody setSmartAGId(String smartAGId) {
        this.smartAGId = smartAGId;
        return this;
    }
    public String getSmartAGId() {
        return this.smartAGId;
    }

    public static class DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList extends TeaModel {
        @NameInMap("BackupLinkId")
        public String backupLinkId;

        @NameInMap("BackupLinkState")
        public String backupLinkState;

        @NameInMap("LinkLevelBackupState")
        public String linkLevelBackupState;

        @NameInMap("LinkLevelBackupType")
        public String linkLevelBackupType;

        @NameInMap("MainLinkId")
        public String mainLinkId;

        @NameInMap("MainLinkState")
        public String mainLinkState;

        public static DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList self = new DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList setBackupLinkId(String backupLinkId) {
            this.backupLinkId = backupLinkId;
            return this;
        }
        public String getBackupLinkId() {
            return this.backupLinkId;
        }

        public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList setBackupLinkState(String backupLinkState) {
            this.backupLinkState = backupLinkState;
            return this;
        }
        public String getBackupLinkState() {
            return this.backupLinkState;
        }

        public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList setLinkLevelBackupState(String linkLevelBackupState) {
            this.linkLevelBackupState = linkLevelBackupState;
            return this;
        }
        public String getLinkLevelBackupState() {
            return this.linkLevelBackupState;
        }

        public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList setLinkLevelBackupType(String linkLevelBackupType) {
            this.linkLevelBackupType = linkLevelBackupType;
            return this;
        }
        public String getLinkLevelBackupType() {
            return this.linkLevelBackupType;
        }

        public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList setMainLinkId(String mainLinkId) {
            this.mainLinkId = mainLinkId;
            return this;
        }
        public String getMainLinkId() {
            return this.mainLinkId;
        }

        public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList setMainLinkState(String mainLinkState) {
            this.mainLinkState = mainLinkState;
            return this;
        }
        public String getMainLinkState() {
            return this.mainLinkState;
        }

    }

    public static class DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList extends TeaModel {
        @NameInMap("LinkBackupInfoList")
        public java.util.List<DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList> linkBackupInfoList;

        public static DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList self = new DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoList setLinkBackupInfoList(java.util.List<DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList> linkBackupInfoList) {
            this.linkBackupInfoList = linkBackupInfoList;
            return this;
        }
        public java.util.List<DescribeSmartAccessGatewayHaResponseBodyLinkBackupInfoListLinkBackupInfoList> getLinkBackupInfoList() {
            return this.linkBackupInfoList;
        }

    }

}
