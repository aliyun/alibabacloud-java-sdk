// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailcloud20180313.models;

import com.aliyun.tea.*;

public class GetRdsBackUpResponseBody extends TeaModel {
    @NameInMap("Code")
    public Integer code;

    @NameInMap("ErrMsg")
    public String errMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetRdsBackUpResponseBodyResult result;

    public static GetRdsBackUpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRdsBackUpResponseBody self = new GetRdsBackUpResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRdsBackUpResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetRdsBackUpResponseBody setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        return this;
    }
    public String getErrMsg() {
        return this.errMsg;
    }

    public GetRdsBackUpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRdsBackUpResponseBody setResult(GetRdsBackUpResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetRdsBackUpResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetRdsBackUpResponseBodyResultItems extends TeaModel {
        @NameInMap("BackupDBNames")
        public String backupDBNames;

        @NameInMap("BackupEndTime")
        public String backupEndTime;

        @NameInMap("BackupExtractionStatus")
        public String backupExtractionStatus;

        @NameInMap("BackupId")
        public String backupId;

        @NameInMap("BackupLocation")
        public String backupLocation;

        @NameInMap("BackupMethod")
        public String backupMethod;

        @NameInMap("BackupMode")
        public String backupMode;

        @NameInMap("BackupScale")
        public String backupScale;

        @NameInMap("BackupSize")
        public Long backupSize;

        @NameInMap("BackupStartTime")
        public String backupStartTime;

        @NameInMap("BackupStatus")
        public String backupStatus;

        @NameInMap("BackupType")
        public String backupType;

        @NameInMap("DBInstanceId")
        public String DBInstanceId;

        @NameInMap("HostInstanceID")
        public String hostInstanceID;

        @NameInMap("MetaStatus")
        public String metaStatus;

        @NameInMap("StoreStatus")
        public String storeStatus;

        @NameInMap("TotalBackupSize")
        public Long totalBackupSize;

        public static GetRdsBackUpResponseBodyResultItems build(java.util.Map<String, ?> map) throws Exception {
            GetRdsBackUpResponseBodyResultItems self = new GetRdsBackUpResponseBodyResultItems();
            return TeaModel.build(map, self);
        }

        public GetRdsBackUpResponseBodyResultItems setBackupDBNames(String backupDBNames) {
            this.backupDBNames = backupDBNames;
            return this;
        }
        public String getBackupDBNames() {
            return this.backupDBNames;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupEndTime(String backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public String getBackupEndTime() {
            return this.backupEndTime;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupExtractionStatus(String backupExtractionStatus) {
            this.backupExtractionStatus = backupExtractionStatus;
            return this;
        }
        public String getBackupExtractionStatus() {
            return this.backupExtractionStatus;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupId(String backupId) {
            this.backupId = backupId;
            return this;
        }
        public String getBackupId() {
            return this.backupId;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupLocation(String backupLocation) {
            this.backupLocation = backupLocation;
            return this;
        }
        public String getBackupLocation() {
            return this.backupLocation;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupMethod(String backupMethod) {
            this.backupMethod = backupMethod;
            return this;
        }
        public String getBackupMethod() {
            return this.backupMethod;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupMode(String backupMode) {
            this.backupMode = backupMode;
            return this;
        }
        public String getBackupMode() {
            return this.backupMode;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupScale(String backupScale) {
            this.backupScale = backupScale;
            return this;
        }
        public String getBackupScale() {
            return this.backupScale;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupSize(Long backupSize) {
            this.backupSize = backupSize;
            return this;
        }
        public Long getBackupSize() {
            return this.backupSize;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupStartTime(String backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public String getBackupStartTime() {
            return this.backupStartTime;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public GetRdsBackUpResponseBodyResultItems setBackupType(String backupType) {
            this.backupType = backupType;
            return this;
        }
        public String getBackupType() {
            return this.backupType;
        }

        public GetRdsBackUpResponseBodyResultItems setDBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        public GetRdsBackUpResponseBodyResultItems setHostInstanceID(String hostInstanceID) {
            this.hostInstanceID = hostInstanceID;
            return this;
        }
        public String getHostInstanceID() {
            return this.hostInstanceID;
        }

        public GetRdsBackUpResponseBodyResultItems setMetaStatus(String metaStatus) {
            this.metaStatus = metaStatus;
            return this;
        }
        public String getMetaStatus() {
            return this.metaStatus;
        }

        public GetRdsBackUpResponseBodyResultItems setStoreStatus(String storeStatus) {
            this.storeStatus = storeStatus;
            return this;
        }
        public String getStoreStatus() {
            return this.storeStatus;
        }

        public GetRdsBackUpResponseBodyResultItems setTotalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
            return this;
        }
        public Long getTotalBackupSize() {
            return this.totalBackupSize;
        }

    }

    public static class GetRdsBackUpResponseBodyResult extends TeaModel {
        @NameInMap("Items")
        public java.util.List<GetRdsBackUpResponseBodyResultItems> items;

        @NameInMap("PageNumber")
        public String pageNumber;

        @NameInMap("PageRecordCount")
        public String pageRecordCount;

        @NameInMap("TotalBackupSize")
        public Long totalBackupSize;

        @NameInMap("TotalRecordCount")
        public String totalRecordCount;

        public static GetRdsBackUpResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetRdsBackUpResponseBodyResult self = new GetRdsBackUpResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetRdsBackUpResponseBodyResult setItems(java.util.List<GetRdsBackUpResponseBodyResultItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetRdsBackUpResponseBodyResultItems> getItems() {
            return this.items;
        }

        public GetRdsBackUpResponseBodyResult setPageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public String getPageNumber() {
            return this.pageNumber;
        }

        public GetRdsBackUpResponseBodyResult setPageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }
        public String getPageRecordCount() {
            return this.pageRecordCount;
        }

        public GetRdsBackUpResponseBodyResult setTotalBackupSize(Long totalBackupSize) {
            this.totalBackupSize = totalBackupSize;
            return this;
        }
        public Long getTotalBackupSize() {
            return this.totalBackupSize;
        }

        public GetRdsBackUpResponseBodyResult setTotalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }
        public String getTotalRecordCount() {
            return this.totalRecordCount;
        }

    }

}
