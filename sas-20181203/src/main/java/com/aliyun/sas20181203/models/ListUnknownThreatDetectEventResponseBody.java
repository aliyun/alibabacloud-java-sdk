// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectEventResponseBody extends TeaModel {
    /**
     * <p>The returned data details.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListUnknownThreatDetectEventResponseBodyData> data;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListUnknownThreatDetectEventResponseBodyPageInfo pageInfo;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>7532B7EE-7CE7-5F4D-BF04-B12447******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListUnknownThreatDetectEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectEventResponseBody self = new ListUnknownThreatDetectEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectEventResponseBody setData(java.util.List<ListUnknownThreatDetectEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListUnknownThreatDetectEventResponseBodyData> getData() {
        return this.data;
    }

    public ListUnknownThreatDetectEventResponseBody setPageInfo(ListUnknownThreatDetectEventResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListUnknownThreatDetectEventResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListUnknownThreatDetectEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListUnknownThreatDetectEventResponseBodyData extends TeaModel {
        @NameInMap("AnalyzeDesc")
        public String analyzeDesc;

        @NameInMap("AnalyzeResult")
        public String analyzeResult;

        /**
         * <p>The process chain.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;5133&quot;:&quot;pickup -l -t unix -u&quot;},{&quot;1077&quot;:&quot;/usr/libexec/postfix/master -w&quot;},{&quot;1&quot;:&quot;/usr/lib/systemd/systemd --switched-root --system --deserialize 22&quot;}]</p>
         */
        @NameInMap("CmdChain")
        public String cmdChain;

        /**
         * <p>The process command line.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sbin/sshd -D</p>
         */
        @NameInMap("Cmdline")
        public String cmdline;

        /**
         * <p>The number of occurrences.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The timestamp of the first occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("FirstTime")
        public Long firstTime;

        @NameInMap("HandleType")
        public String handleType;

        /**
         * <p>The unique identifier of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>30368144069e7567bbb10eabc2******</p>
         */
        @NameInMap("HashKey")
        public String hashKey;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>centos****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>10.42.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp of the most recent occurrence.</p>
         * 
         * <strong>example:</strong>
         * <p>1694576692000</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        /**
         * <p>The MD5 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>5b394b54ca632fe51c4ab4a6dbaf****</p>
         */
        @NameInMap("Md5")
        public String md5;

        /**
         * <p>The parent command line.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/sbin/sshd -D</p>
         */
        @NameInMap("ParentCmdline")
        public String parentCmdline;

        /**
         * <p>The parent process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("ParentPid")
        public String parentPid;

        /**
         * <p>The parent process path.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/tar</p>
         */
        @NameInMap("ParentProcessPath")
        public String parentProcessPath;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The process path.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/bin/tar</p>
         */
        @NameInMap("ProcessPath")
        public String processPath;

        /**
         * <p>The SHA-256 hash of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>3a6fed5fc11392b3ee9f81caf017b48640d7458766a8eb0382899a605b41****</p>
         */
        @NameInMap("Sha256")
        public String sha256;

        /**
         * <p>The event status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Unhandled.</li>
         * <li><strong>2</strong>: Blocked.</li>
         * <li><strong>3</strong>: Ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The UUID of the asset instance.</p>
         * 
         * <strong>example:</strong>
         * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListUnknownThreatDetectEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectEventResponseBodyData self = new ListUnknownThreatDetectEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectEventResponseBodyData setAnalyzeDesc(String analyzeDesc) {
            this.analyzeDesc = analyzeDesc;
            return this;
        }
        public String getAnalyzeDesc() {
            return this.analyzeDesc;
        }

        public ListUnknownThreatDetectEventResponseBodyData setAnalyzeResult(String analyzeResult) {
            this.analyzeResult = analyzeResult;
            return this;
        }
        public String getAnalyzeResult() {
            return this.analyzeResult;
        }

        public ListUnknownThreatDetectEventResponseBodyData setCmdChain(String cmdChain) {
            this.cmdChain = cmdChain;
            return this;
        }
        public String getCmdChain() {
            return this.cmdChain;
        }

        public ListUnknownThreatDetectEventResponseBodyData setCmdline(String cmdline) {
            this.cmdline = cmdline;
            return this;
        }
        public String getCmdline() {
            return this.cmdline;
        }

        public ListUnknownThreatDetectEventResponseBodyData setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListUnknownThreatDetectEventResponseBodyData setFirstTime(Long firstTime) {
            this.firstTime = firstTime;
            return this;
        }
        public Long getFirstTime() {
            return this.firstTime;
        }

        public ListUnknownThreatDetectEventResponseBodyData setHandleType(String handleType) {
            this.handleType = handleType;
            return this;
        }
        public String getHandleType() {
            return this.handleType;
        }

        public ListUnknownThreatDetectEventResponseBodyData setHashKey(String hashKey) {
            this.hashKey = hashKey;
            return this;
        }
        public String getHashKey() {
            return this.hashKey;
        }

        public ListUnknownThreatDetectEventResponseBodyData setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListUnknownThreatDetectEventResponseBodyData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListUnknownThreatDetectEventResponseBodyData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListUnknownThreatDetectEventResponseBodyData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListUnknownThreatDetectEventResponseBodyData setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public ListUnknownThreatDetectEventResponseBodyData setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public ListUnknownThreatDetectEventResponseBodyData setParentCmdline(String parentCmdline) {
            this.parentCmdline = parentCmdline;
            return this;
        }
        public String getParentCmdline() {
            return this.parentCmdline;
        }

        public ListUnknownThreatDetectEventResponseBodyData setParentPid(String parentPid) {
            this.parentPid = parentPid;
            return this;
        }
        public String getParentPid() {
            return this.parentPid;
        }

        public ListUnknownThreatDetectEventResponseBodyData setParentProcessPath(String parentProcessPath) {
            this.parentProcessPath = parentProcessPath;
            return this;
        }
        public String getParentProcessPath() {
            return this.parentProcessPath;
        }

        public ListUnknownThreatDetectEventResponseBodyData setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public ListUnknownThreatDetectEventResponseBodyData setProcessPath(String processPath) {
            this.processPath = processPath;
            return this;
        }
        public String getProcessPath() {
            return this.processPath;
        }

        public ListUnknownThreatDetectEventResponseBodyData setSha256(String sha256) {
            this.sha256 = sha256;
            return this;
        }
        public String getSha256() {
            return this.sha256;
        }

        public ListUnknownThreatDetectEventResponseBodyData setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListUnknownThreatDetectEventResponseBodyData setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListUnknownThreatDetectEventResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of alerting events displayed on the current page in a paged query. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number of the current page in a paged query. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The maximum number of entries displayed on each page in a paged query. This parameter is used for paging.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>149</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListUnknownThreatDetectEventResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListUnknownThreatDetectEventResponseBodyPageInfo self = new ListUnknownThreatDetectEventResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListUnknownThreatDetectEventResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListUnknownThreatDetectEventResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListUnknownThreatDetectEventResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListUnknownThreatDetectEventResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
