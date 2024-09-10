// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventQuaraFilesResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>An array that consists of the quarantined files.</p>
     */
    @NameInMap("QuaraFiles")
    public java.util.List<DescribeSuspEventQuaraFilesResponseBodyQuaraFiles> quaraFiles;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>32A73759-4C0F-4801-BE98-901223ACEE9A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>38</p>
     */
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
        /**
         * <p>The name of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>WEBSHELL</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The type of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>WebshellQuaraEventType</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The ID of the quarantined file.</p>
         * 
         * <strong>example:</strong>
         * <p>26918</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2ze9t1qp36n1436m****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the server on which the quarantined file is located.</p>
         * 
         * <strong>example:</strong>
         * <p>iZwz98dkiw3vbrtqrt5v****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server on which the quarantined file is located.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.131</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server on which the quarantined file is located.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The public IP address of the server on which the quarantined file is located.</p>
         * 
         * <strong>example:</strong>
         * <p>47.XX.XX.131</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The download link of the quarantined file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://xxx.xxx/xxx">https://xxx.xxx/xxx</a></p>
         */
        @NameInMap("Link")
        public String link;

        /**
         * <p>The MD5 hash value of the quarantined file.</p>
         * 
         * <strong>example:</strong>
         * <p>5ddebe926acc7ed39a664409bfd0ec10</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The time when the quarantined file was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-06-11 20:37:08</p>
         */
        @NameInMap("ModifyTime")
        public String modifyTime;

        /**
         * <p>The path to the quarantined file on the server.</p>
         * 
         * <strong>example:</strong>
         * <p>/var/www/html/webshell-sample-master/others/defc3e21bab59e2a2ab49f7eda99f65f83d4d349.jpg</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The status of the quarantined file. Valid values:</p>
         * <ul>
         * <li><strong>quaraFailed</strong>: The file fails to be quarantined.</li>
         * <li><strong>quaraDone</strong>: The file is quarantined.</li>
         * <li><strong>quaraing</strong>: The file is being quarantined.</li>
         * <li><strong>rollbackFailed</strong>: The system fails to cancel quarantining the file.</li>
         * <li><strong>rollbackDone</strong>: The system cancelled quarantining the file.</li>
         * <li><strong>rollbacking</strong>: The system is cancelling quarantining the file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rollbackDone</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The unique ID of the event.</p>
         * 
         * <strong>example:</strong>
         * <p>228f890e56eae9eec6a42c7ea801b538</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>04a0e735-ad32-4835-b635-0458d77b****</p>
         */
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
