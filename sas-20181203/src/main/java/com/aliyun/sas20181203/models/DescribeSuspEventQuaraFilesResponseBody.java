// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesResponseBody extends TeaModel {
    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QuaraFiles")
    public java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> quaraFiles;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Ip")
        public String ip;

        @NameInMap("Link")
        public String link;

        @NameInMap("Md5")
        public String md5;

        @NameInMap("ModifyTime")
        public String modifyTime;

        @NameInMap("Path")
        public String path;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tag")
        public String tag;

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

        public DescribeSuspEventQuaraFilesResponseBodyQuaraFiles setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
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
