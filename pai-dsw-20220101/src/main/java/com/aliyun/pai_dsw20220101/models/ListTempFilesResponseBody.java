// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class ListTempFilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;200&quot;</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>&quot;XXX&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Quota")
    public ListTempFilesResponseBodyQuota quota;

    /**
     * <strong>example:</strong>
     * <p>E7D55162-4489-1619-AAF5-3F97D5FCA948</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TempFiles")
    public java.util.List<ListTempFilesResponseBodyTempFiles> tempFiles;

    /**
     * <strong>example:</strong>
     * <p>35</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListTempFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTempFilesResponseBody self = new ListTempFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTempFilesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTempFilesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTempFilesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTempFilesResponseBody setQuota(ListTempFilesResponseBodyQuota quota) {
        this.quota = quota;
        return this;
    }
    public ListTempFilesResponseBodyQuota getQuota() {
        return this.quota;
    }

    public ListTempFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListTempFilesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListTempFilesResponseBody setTempFiles(java.util.List<ListTempFilesResponseBodyTempFiles> tempFiles) {
        this.tempFiles = tempFiles;
        return this;
    }
    public java.util.List<ListTempFilesResponseBodyTempFiles> getTempFiles() {
        return this.tempFiles;
    }

    public ListTempFilesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListTempFilesResponseBodyQuota extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TotalCapacity")
        public Long totalCapacity;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("TotalFileNum")
        public Long totalFileNum;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("UsedCapacity")
        public Long usedCapacity;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("UsedFileNum")
        public Long usedFileNum;

        public static ListTempFilesResponseBodyQuota build(java.util.Map<String, ?> map) throws Exception {
            ListTempFilesResponseBodyQuota self = new ListTempFilesResponseBodyQuota();
            return TeaModel.build(map, self);
        }

        public ListTempFilesResponseBodyQuota setTotalCapacity(Long totalCapacity) {
            this.totalCapacity = totalCapacity;
            return this;
        }
        public Long getTotalCapacity() {
            return this.totalCapacity;
        }

        public ListTempFilesResponseBodyQuota setTotalFileNum(Long totalFileNum) {
            this.totalFileNum = totalFileNum;
            return this;
        }
        public Long getTotalFileNum() {
            return this.totalFileNum;
        }

        public ListTempFilesResponseBodyQuota setUsedCapacity(Long usedCapacity) {
            this.usedCapacity = usedCapacity;
            return this;
        }
        public Long getUsedCapacity() {
            return this.usedCapacity;
        }

        public ListTempFilesResponseBodyQuota setUsedFileNum(Long usedFileNum) {
            this.usedFileNum = usedFileNum;
            return this;
        }
        public Long getUsedFileNum() {
            return this.usedFileNum;
        }

    }

    public static class ListTempFilesResponseBodyTempFiles extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>10Mi</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Capacity")
        public Long capacity;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p><a href="http://examplebucket.yourEndpoint/exampledir/exampleobject.txt?Expires=1703123270&OSSAccessKeyId&Signature=Fn7xSv2kRQraU6UqRZ3+DMzQK14=">http://examplebucket.yourEndpoint/exampledir/exampleobject.txt?Expires=1703123270&amp;OSSAccessKeyId&amp;Signature=Fn7xSv2kRQraU6UqRZ3+DMzQK14=</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtCreateTime")
        public String gmtCreateTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtExpiredTime")
        public String gmtExpiredTime;

        /**
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        @NameInMap("GmtModifiedTime")
        public String gmtModifiedTime;

        /**
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>filename</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>Owner Id</p>
         * 
         * <strong>example:</strong>
         * <p>1612285282502324</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <strong>example:</strong>
         * <p>/1079135428626537/209170658818096848/</p>
         */
        @NameInMap("Prefix")
        public String prefix;

        /**
         * <strong>example:</strong>
         * <p>Created</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>task-05cexxxxxxxxx</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>type</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p><a href="http://examplebucket.yourEndpoint/exampledir/exampleobject.txt?Expires=1703123154&OSSAccessKeyId&Signature=5ekVo7r+CeeU5oYmCpnmrzrx2IM=">http://examplebucket.yourEndpoint/exampledir/exampleobject.txt?Expires=1703123154&amp;OSSAccessKeyId&amp;Signature=5ekVo7r+CeeU5oYmCpnmrzrx2IM=</a></p>
         */
        @NameInMap("UploadUrl")
        public String uploadUrl;

        /**
         * <strong>example:</strong>
         * <p>1612285282502324</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <strong>example:</strong>
         * <p>tempfile-05cexxxxxxxxx</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListTempFilesResponseBodyTempFiles build(java.util.Map<String, ?> map) throws Exception {
            ListTempFilesResponseBodyTempFiles self = new ListTempFilesResponseBodyTempFiles();
            return TeaModel.build(map, self);
        }

        public ListTempFilesResponseBodyTempFiles setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public ListTempFilesResponseBodyTempFiles setCapacity(Long capacity) {
            this.capacity = capacity;
            return this;
        }
        public Long getCapacity() {
            return this.capacity;
        }

        public ListTempFilesResponseBodyTempFiles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListTempFilesResponseBodyTempFiles setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListTempFilesResponseBodyTempFiles setGmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        public ListTempFilesResponseBodyTempFiles setGmtExpiredTime(String gmtExpiredTime) {
            this.gmtExpiredTime = gmtExpiredTime;
            return this;
        }
        public String getGmtExpiredTime() {
            return this.gmtExpiredTime;
        }

        public ListTempFilesResponseBodyTempFiles setGmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        public ListTempFilesResponseBodyTempFiles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTempFilesResponseBodyTempFiles setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListTempFilesResponseBodyTempFiles setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public ListTempFilesResponseBodyTempFiles setPrefix(String prefix) {
            this.prefix = prefix;
            return this;
        }
        public String getPrefix() {
            return this.prefix;
        }

        public ListTempFilesResponseBodyTempFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListTempFilesResponseBodyTempFiles setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTempFilesResponseBodyTempFiles setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListTempFilesResponseBodyTempFiles setUploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }
        public String getUploadUrl() {
            return this.uploadUrl;
        }

        public ListTempFilesResponseBodyTempFiles setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListTempFilesResponseBodyTempFiles setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
