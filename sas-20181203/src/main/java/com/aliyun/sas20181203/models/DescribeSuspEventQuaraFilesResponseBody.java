// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesResponseBody extends TeaModel {
    // The number of entries returned on the current page.
    @NameInMap("Count")
    public Integer count;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // An array that consists of the quarantined files.
    @NameInMap("QuaraFiles")
    public java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> quaraFiles;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of entries returned.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSuspEventQuaraFilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventQuaraFilesResponseBody self = new DescribeSuspEventQuaraFilesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventQuaraFilesResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeSuspEventQuaraFilesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventQuaraFilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventQuaraFilesResponseBody setQuaraFiles(java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> quaraFiles) {
        this.quaraFiles = quaraFiles;
        return this;
    }
    public java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> getQuaraFiles() {
        return this.quaraFiles;
    }

    public DescribeSuspEventQuaraFilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventQuaraFilesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSuspEventQuaraFilesResponseBodyQuaraFiles extends TeaModel {
        // The name of the event.
        @NameInMap("EventName")
        public String eventName;

        // The type of the event.
        @NameInMap("EventType")
        public String eventType;

        // The ID of the quarantined file.
        @NameInMap("Id")
        public Integer id;

        // The instance ID of the asset.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the server on which the quarantined file is located.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the server on which the quarantined file is located.
        @NameInMap("InternetIp")
        public String internetIp;

        // The public IP address of the server on which the quarantined file is located.
        @NameInMap("Ip")
        public String ip;

        // The download link of the quarantined file.
        @NameInMap("Link")
        public String link;

        // The MD5 hash value of the quarantined file.
        @NameInMap("Md5")
        public String md5;

        // The time when the quarantined file was last modified.
        @NameInMap("ModifyTime")
        public String modifyTime;

        // The path to the quarantined file on the server.
        @NameInMap("Path")
        public String path;

        // The status of the quarantined file. Valid values:
        // 
        // *   **quaraFailed**: The file fails to be quarantined.
        // *   **quaraDone**: The file is quarantined.
        // *   **quaraing**: The file is being quarantined.
        // *   **rollbackFailed**: The system fails to cancel quarantining the file.
        // *   **rollbackDone**: The system cancelled quarantining the file.
        // *   **rollbacking**: The system is cancelling quarantining the file.
        @NameInMap("Status")
        public String status;

        // The unique ID of the event.
        @NameInMap("Tag")
        public String tag;

        // The UUID of the server.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSuspEventQuaraFilesResponseBodyQuaraFiles build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventQuaraFilesResponseBodyQuaraFiles self = new DescribeSuspEventQuaraFilesResponseBodyQuaraFiles();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setLink(String link) {
            this.link = link;
            return this;
        }
        public String getLink() {
            return this.link;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setModifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }
        public String getModifyTime() {
            return this.modifyTime;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
