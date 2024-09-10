// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListBackupRecordResponseBody extends TeaModel {
    /**
     * <p>The details of the backup record.</p>
     */
    @NameInMap("BackupRecordList")
    public java.util.List<ListBackupRecordResponseBodyBackupRecordList> backupRecordList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListBackupRecordResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3956048F-9D73-5EDB-834B-4827BB48****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListBackupRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBackupRecordResponseBody self = new ListBackupRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBackupRecordResponseBody setBackupRecordList(java.util.List<ListBackupRecordResponseBodyBackupRecordList> backupRecordList) {
        this.backupRecordList = backupRecordList;
        return this;
    }
    public java.util.List<ListBackupRecordResponseBodyBackupRecordList> getBackupRecordList() {
        return this.backupRecordList;
    }

    public ListBackupRecordResponseBody setPageInfo(ListBackupRecordResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListBackupRecordResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListBackupRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListBackupRecordResponseBodyBackupRecordList extends TeaModel {
        /**
         * <p>The timestamp when the backup task ended. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1699600611000</p>
         */
        @NameInMap("BackupEndTime")
        public Long backupEndTime;

        /**
         * <p>The backup task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>a006f24d069843c88688672d74ee****</p>
         */
        @NameInMap("BackupJobId")
        public String backupJobId;

        /**
         * <p>The backup plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>plan-000c4tt43nolmx96****</p>
         */
        @NameInMap("BackupPlanId")
        public String backupPlanId;

        /**
         * <p>The timestamp when the backup task started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1699514211000</p>
         */
        @NameInMap("BackupStartTime")
        public Long backupStartTime;

        /**
         * <p>The backup task status. Valid value:</p>
         * <ul>
         * <li><strong>BACKUP_COMPLETE</strong>: The backup task is successful.</li>
         * <li><strong>BACKUP_FAILED</strong>: The backup task failed.</li>
         * <li><strong>PARTIAL_COMPLETE</strong>: The backup task is partially successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BACKUP_COMPLETE</p>
         */
        @NameInMap("BackupStatus")
        public String backupStatus;

        /**
         * <p>The ID of the anti-ransomware agent.</p>
         * 
         * <strong>example:</strong>
         * <p>c-0002bgagelj3d2sc****</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The error code of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE_CACHE_NO_SPACE</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message of the backup task.</p>
         * 
         * <strong>example:</strong>
         * <p>FILE_CACHE_NO_SPACE</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The instance ID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>i-wz9ikn44p46krnic****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The instance name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>openapi</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.1</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The ID of the region in which the backup is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The UUID of the server whose data is backed up based on the anti-ransomware policy.</p>
         * 
         * <strong>example:</strong>
         * <p>b93cccb9-f19f-4886-97fe-47df26ba****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListBackupRecordResponseBodyBackupRecordList build(java.util.Map<String, ?> map) throws Exception {
            ListBackupRecordResponseBodyBackupRecordList self = new ListBackupRecordResponseBodyBackupRecordList();
            return TeaModel.build(map, self);
        }

        public ListBackupRecordResponseBodyBackupRecordList setBackupEndTime(Long backupEndTime) {
            this.backupEndTime = backupEndTime;
            return this;
        }
        public Long getBackupEndTime() {
            return this.backupEndTime;
        }

        public ListBackupRecordResponseBodyBackupRecordList setBackupJobId(String backupJobId) {
            this.backupJobId = backupJobId;
            return this;
        }
        public String getBackupJobId() {
            return this.backupJobId;
        }

        public ListBackupRecordResponseBodyBackupRecordList setBackupPlanId(String backupPlanId) {
            this.backupPlanId = backupPlanId;
            return this;
        }
        public String getBackupPlanId() {
            return this.backupPlanId;
        }

        public ListBackupRecordResponseBodyBackupRecordList setBackupStartTime(Long backupStartTime) {
            this.backupStartTime = backupStartTime;
            return this;
        }
        public Long getBackupStartTime() {
            return this.backupStartTime;
        }

        public ListBackupRecordResponseBodyBackupRecordList setBackupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            return this;
        }
        public String getBackupStatus() {
            return this.backupStatus;
        }

        public ListBackupRecordResponseBodyBackupRecordList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public ListBackupRecordResponseBodyBackupRecordList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListBackupRecordResponseBodyBackupRecordList setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListBackupRecordResponseBodyBackupRecordList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListBackupRecordResponseBodyBackupRecordList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListBackupRecordResponseBodyBackupRecordList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListBackupRecordResponseBodyBackupRecordList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListBackupRecordResponseBodyBackupRecordList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public ListBackupRecordResponseBodyBackupRecordList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public ListBackupRecordResponseBodyBackupRecordList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListBackupRecordResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListBackupRecordResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListBackupRecordResponseBodyPageInfo self = new ListBackupRecordResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListBackupRecordResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListBackupRecordResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListBackupRecordResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBackupRecordResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
