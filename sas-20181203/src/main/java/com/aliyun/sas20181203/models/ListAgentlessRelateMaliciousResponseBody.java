// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessRelateMaliciousResponseBody extends TeaModel {
    /**
     * <p>The list of hosts that are associated with the risk.</p>
     */
    @NameInMap("List")
    public java.util.List<ListAgentlessRelateMaliciousResponseBodyList> list;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListAgentlessRelateMaliciousResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>FCA270CC-24C8-5DA1-9184-20F2605C****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAgentlessRelateMaliciousResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessRelateMaliciousResponseBody self = new ListAgentlessRelateMaliciousResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentlessRelateMaliciousResponseBody setList(java.util.List<ListAgentlessRelateMaliciousResponseBodyList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<ListAgentlessRelateMaliciousResponseBodyList> getList() {
        return this.list;
    }

    public ListAgentlessRelateMaliciousResponseBody setPageInfo(ListAgentlessRelateMaliciousResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAgentlessRelateMaliciousResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentlessRelateMaliciousResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAgentlessRelateMaliciousResponseBodyListDetails extends TeaModel {
        /**
         * <p>The name of the detailed item.</p>
         * 
         * <strong>example:</strong>
         * <p>MD5</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The name key of the detailed item.</p>
         * 
         * <strong>example:</strong>
         * <p>${suspicious.mp.db.maliciousfilemd5}</p>
         */
        @NameInMap("NameKey")
        public String nameKey;

        /**
         * <p>The type of the detailed item.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The value of the detailed item.</p>
         * 
         * <strong>example:</strong>
         * <p>1f2e13a7c51ee89316ae50066515****</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListAgentlessRelateMaliciousResponseBodyListDetails build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRelateMaliciousResponseBodyListDetails self = new ListAgentlessRelateMaliciousResponseBodyListDetails();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRelateMaliciousResponseBodyListDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListAgentlessRelateMaliciousResponseBodyListDetails setNameKey(String nameKey) {
            this.nameKey = nameKey;
            return this;
        }
        public String getNameKey() {
            return this.nameKey;
        }

        public ListAgentlessRelateMaliciousResponseBodyListDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListAgentlessRelateMaliciousResponseBodyListDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListAgentlessRelateMaliciousResponseBodyList extends TeaModel {
        /**
         * <p>The details of the alert events.</p>
         */
        @NameInMap("Details")
        public java.util.List<ListAgentlessRelateMaliciousResponseBodyListDetails> details;

        /**
         * <p>The URL to download the malicious image sample.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://upgrade-rule-pkg.oss-cn-beijing.aliyuncs.com/totalpackage/">https://upgrade-rule-pkg.oss-cn-beijing.aliyuncs.com/totalpackage/</a>***</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The file path.</p>
         * 
         * <strong>example:</strong>
         * <p>/root/logs/arms/tracelogs/log****</p>
         */
        @NameInMap("FilePath")
        public String filePath;

        /**
         * <p>The timestamp when the first scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>168257753****</p>
         */
        @NameInMap("FirstScanTimestamp")
        public Long firstScanTimestamp;

        /**
         * <p>The highlighted JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;highlight\&quot;:{\&quot;ruleVersion\&quot;:\&quot;20230223\&quot;,\&quot;ruleId\&quot;:600139,\&quot;events\&quot;:[[207,284]]}}</p>
         */
        @NameInMap("HighLight")
        public String highLight;

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8012</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>sql-test-0****</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>8.210.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>172.25.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The timestamp when the last scan was performed. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>168257753****</p>
         */
        @NameInMap("LatestScanTimestamp")
        public Long latestScanTimestamp;

        /**
         * <p>The severity of the malicious file. Valid values:</p>
         * <ul>
         * <li>serious</li>
         * <li>suspicious</li>
         * <li>remind</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The MD5 hash value of the malicious file.</p>
         * 
         * <strong>example:</strong>
         * <p>1f2e13a7c51ee89316ae50066515****</p>
         */
        @NameInMap("MaliciousMd5")
        public String maliciousMd5;

        /**
         * <p>The name of the malicious file.</p>
         * 
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        @NameInMap("MaliciousName")
        public String maliciousName;

        /**
         * <p>The type of the virus.</p>
         * 
         * <strong>example:</strong>
         * <p>WebShell</p>
         */
        @NameInMap("MaliciousType")
        public String maliciousType;

        /**
         * <p>The handling result of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>addWhitelist.USER.Success</p>
         */
        @NameInMap("OperateResult")
        public String operateResult;

        /**
         * <p>The timestamp when the alert is handled. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>168257753****</p>
         */
        @NameInMap("OperateTimestamp")
        public String operateTimestamp;

        /**
         * <p>The partition of the disk.</p>
         * 
         * <strong>example:</strong>
         * <p>/dev/xvda1</p>
         */
        @NameInMap("Partition")
        public String partition;

        /**
         * <p>The ID of the task object.</p>
         * 
         * <strong>example:</strong>
         * <p>m-****</p>
         */
        @NameInMap("TargetId")
        public String targetId;

        /**
         * <p>The name of the task object.</p>
         * 
         * <strong>example:</strong>
         * <p>image_***</p>
         */
        @NameInMap("TargetName")
        public String targetName;

        /**
         * <p>The type of the task object. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: snapshot.</li>
         * <li><strong>2</strong>: image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TargetType")
        public String targetType;

        /**
         * <p>The UUID of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>49e25e0f-bb51-4a5a-a1b3-13a4ddaa****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static ListAgentlessRelateMaliciousResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRelateMaliciousResponseBodyList self = new ListAgentlessRelateMaliciousResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRelateMaliciousResponseBodyList setDetails(java.util.List<ListAgentlessRelateMaliciousResponseBodyListDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListAgentlessRelateMaliciousResponseBodyListDetails> getDetails() {
            return this.details;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setFilePath(String filePath) {
            this.filePath = filePath;
            return this;
        }
        public String getFilePath() {
            return this.filePath;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setFirstScanTimestamp(Long firstScanTimestamp) {
            this.firstScanTimestamp = firstScanTimestamp;
            return this;
        }
        public Long getFirstScanTimestamp() {
            return this.firstScanTimestamp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setHighLight(String highLight) {
            this.highLight = highLight;
            return this;
        }
        public String getHighLight() {
            return this.highLight;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setLatestScanTimestamp(Long latestScanTimestamp) {
            this.latestScanTimestamp = latestScanTimestamp;
            return this;
        }
        public Long getLatestScanTimestamp() {
            return this.latestScanTimestamp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setMaliciousMd5(String maliciousMd5) {
            this.maliciousMd5 = maliciousMd5;
            return this;
        }
        public String getMaliciousMd5() {
            return this.maliciousMd5;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setMaliciousName(String maliciousName) {
            this.maliciousName = maliciousName;
            return this;
        }
        public String getMaliciousName() {
            return this.maliciousName;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setMaliciousType(String maliciousType) {
            this.maliciousType = maliciousType;
            return this;
        }
        public String getMaliciousType() {
            return this.maliciousType;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setOperateResult(String operateResult) {
            this.operateResult = operateResult;
            return this;
        }
        public String getOperateResult() {
            return this.operateResult;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setOperateTimestamp(String operateTimestamp) {
            this.operateTimestamp = operateTimestamp;
            return this;
        }
        public String getOperateTimestamp() {
            return this.operateTimestamp;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setPartition(String partition) {
            this.partition = partition;
            return this;
        }
        public String getPartition() {
            return this.partition;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setTargetId(String targetId) {
            this.targetId = targetId;
            return this;
        }
        public String getTargetId() {
            return this.targetId;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

        public ListAgentlessRelateMaliciousResponseBodyList setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class ListAgentlessRelateMaliciousResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>197</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAgentlessRelateMaliciousResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAgentlessRelateMaliciousResponseBodyPageInfo self = new ListAgentlessRelateMaliciousResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAgentlessRelateMaliciousResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
