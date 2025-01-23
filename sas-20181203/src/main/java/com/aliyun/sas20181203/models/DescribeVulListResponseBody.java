// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The value of NextToken that is returned when the NextToken method is used.</p>
     * 
     * <strong>example:</strong>
     * <p>E17B501887A2D3AA5E8360A6EFA3B***</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>2F26AB2A-1075-488F-8472-40E5DB486ACC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of vulnerabilities returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The information about the vulnerability.</p>
     */
    @NameInMap("VulRecords")
    public java.util.List<DescribeVulListResponseBodyVulRecords> vulRecords;

    public static DescribeVulListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListResponseBody self = new DescribeVulListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeVulListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVulListResponseBody setVulRecords(java.util.List<DescribeVulListResponseBodyVulRecords> vulRecords) {
        this.vulRecords = vulRecords;
        return this;
    }
    public java.util.List<DescribeVulListResponseBodyVulRecords> getVulRecords() {
        return this.vulRecords;
    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity extends TeaModel {
        /**
         * <p>The asset importance score. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: important asset.</li>
         * <li><strong>1</strong>: common asset.</li>
         * <li><strong>0</strong>: test asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Assets_factor")
        public String assetsFactor;

        /**
         * <p>The Common Vulnerability Scoring System (CVSS) score.</p>
         * 
         * <strong>example:</strong>
         * <p>7.8</p>
         */
        @NameInMap("Cvss_factor")
        public String cvssFactor;

        /**
         * <p>The environment score.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Enviroment_factor")
        public String enviromentFactor;

        /**
         * <p>Indicates whether the vulnerability priority score is calculated. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Is_calc")
        public String isCalc;

        /**
         * <p>The status of the vulnerability priority score. Valid values:</p>
         * <ul>
         * <li><strong>none</strong>: No score is generated.</li>
         * <li><strong>pending</strong>: The score is pending calculation.</li>
         * <li><strong>normal</strong>: The calculation is normal.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The time score.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Time_factor")
        public String timeFactor;

        /**
         * <p>The vulnerability priority score.</p>
         * <p>The following list describes scores and related fixing suggestions:</p>
         * <ul>
         * <li>If the score is from <strong>13.5 to 15</strong>, the vulnerability is a high-risk vulnerability. You must fix the vulnerability at the earliest opportunity.</li>
         * <li>If the score is <strong>greater than or equal to 7 but less than 13.5</strong>, the vulnerability is a medium-risk vulnerability. You can fix the vulnerability at your convenience.</li>
         * <li>If the score is <strong>less than 7</strong>, the vulnerability is a low-risk vulnerability. You can ignore the vulnerability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7.8</p>
         */
        @NameInMap("Total_score")
        public String totalScore;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity self = new DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setAssetsFactor(String assetsFactor) {
            this.assetsFactor = assetsFactor;
            return this;
        }
        public String getAssetsFactor() {
            return this.assetsFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setCvssFactor(String cvssFactor) {
            this.cvssFactor = cvssFactor;
            return this;
        }
        public String getCvssFactor() {
            return this.cvssFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setEnviromentFactor(String enviromentFactor) {
            this.enviromentFactor = enviromentFactor;
            return this;
        }
        public String getEnviromentFactor() {
            return this.enviromentFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setIsCalc(String isCalc) {
            this.isCalc = isCalc;
            return this;
        }
        public String getIsCalc() {
            return this.isCalc;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setTimeFactor(String timeFactor) {
            this.timeFactor = timeFactor;
            return this;
        }
        public String getTimeFactor() {
            return this.timeFactor;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity setTotalScore(String totalScore) {
            this.totalScore = totalScore;
            return this;
        }
        public String getTotalScore() {
            return this.totalScore;
        }

    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList extends TeaModel {
        /**
         * <p>The name of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s_67895c4_xxx</p>
         */
        @NameInMap("ContainerName")
        public String containerName;

        /**
         * <p>The extended information about the software package that has the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;msg_no_lookups_configured_CVE_2021_44228&quot;: &quot;false&quot;, &quot;jndi_class_not_exist&quot;: &quot;false&quot;}</p>
         */
        @NameInMap("ExtendField")
        public String extendField;

        /**
         * <p>The complete version number.</p>
         * 
         * <strong>example:</strong>
         * <p>3.10.0-693.2.2.el7</p>
         */
        @NameInMap("FullVersion")
        public String fullVersion;

        /**
         * <p>The name of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>registry_387ytb_xxx</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The reason why the vulnerability is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>python-perf version less than 0:3.10.0-693.21.1.el7</p>
         */
        @NameInMap("MatchDetail")
        public String matchDetail;

        /**
         * <p>The rules that are used to detect the vulnerability.</p>
         */
        @NameInMap("MatchList")
        public java.util.List<String> matchList;

        /**
         * <p>The name of the RPM package.</p>
         * 
         * <strong>example:</strong>
         * <p>python-perf</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The path to the software that has the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>/usr/lib64/python2.7/site-packages</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The process ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8664</p>
         */
        @NameInMap("Pid")
        public String pid;

        /**
         * <p>The command that is used to fix the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>*** update python-perf</p>
         */
        @NameInMap("UpdateCmd")
        public String updateCmd;

        /**
         * <p>The version number of the package of the software that has the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>3.10.0</p>
         */
        @NameInMap("Version")
        public String version;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList self = new DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setContainerName(String containerName) {
            this.containerName = containerName;
            return this;
        }
        public String getContainerName() {
            return this.containerName;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setExtendField(String extendField) {
            this.extendField = extendField;
            return this;
        }
        public String getExtendField() {
            return this.extendField;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setFullVersion(String fullVersion) {
            this.fullVersion = fullVersion;
            return this;
        }
        public String getFullVersion() {
            return this.fullVersion;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchDetail(String matchDetail) {
            this.matchDetail = matchDetail;
            return this;
        }
        public String getMatchDetail() {
            return this.matchDetail;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setMatchList(java.util.List<String> matchList) {
            this.matchList = matchList;
            return this;
        }
        public java.util.List<String> getMatchList() {
            return this.matchList;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setPid(String pid) {
            this.pid = pid;
            return this;
        }
        public String getPid() {
            return this.pid;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setUpdateCmd(String updateCmd) {
            this.updateCmd = updateCmd;
            return this;
        }
        public String getUpdateCmd() {
            return this.updateCmd;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class DescribeVulListResponseBodyVulRecordsExtendContentJson extends TeaModel {
        /**
         * <p>The path to the package of the software that has the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>/roo/www/web</p>
         */
        @NameInMap("AbsolutePath")
        public String absolutePath;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2019:0230-Important: polkit security update</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The description of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>kernel version:5.10.84-10.2.al8.x86_64</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The returned message that indicates the urgent vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>com.xxl.rpc.util.XxlRpcException: xxl-rpc request data is empty.\n\tat com.xxl.rpc.remoting.net.impl.servlet.serve&quot;</p>
         */
        @NameInMap("EmgProof")
        public String emgProof;

        /**
         * <p>The public IP address of the asset that is associated with the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("Ip")
        public String ip;

        /**
         * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620404763000</p>
         */
        @NameInMap("LastTs")
        public Long lastTs;

        /**
         * <p>Indicates whether the vulnerability needs to be fixed.</p>
         */
        @NameInMap("Necessity")
        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity necessity;

        /**
         * <p>The name of the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>centos</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>The information about the operating system version.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        @NameInMap("OsRelease")
        public String osRelease;

        /**
         * <p>The ID of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("PrimaryId")
        public Long primaryId;

        /**
         * <p>The information about RPM Package Manager (RPM) packages.</p>
         */
        @NameInMap("RpmEntityList")
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList;

        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: unfixed.</li>
         * <li><strong>2</strong>: fix failed.</li>
         * <li>3: rollback failed.</li>
         * <li><strong>4</strong>: being fixed.</li>
         * <li><strong>5</strong>: being rolled back.</li>
         * <li><strong>6</strong>: being verified.</li>
         * <li><strong>7</strong>: fixed.</li>
         * <li><strong>8</strong>: fixed and to be restarted.</li>
         * <li><strong>9</strong>: rolled back.</li>
         * <li><strong>10</strong>: ignored.</li>
         * <li><strong>11</strong>: rolled back and to be restarted.</li>
         * <li><strong>12</strong>: not found.</li>
         * <li><strong>20</strong>: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag that is added to the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The URL of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://39.99.XX.XX:30005/toLogin">http://39.99.XX.XX:30005/toLogin</a></p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The CVE list.</p>
         */
        @NameInMap("cveList")
        public java.util.List<String> cveList;

        public static DescribeVulListResponseBodyVulRecordsExtendContentJson build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecordsExtendContentJson self = new DescribeVulListResponseBodyVulRecordsExtendContentJson();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setAbsolutePath(String absolutePath) {
            this.absolutePath = absolutePath;
            return this;
        }
        public String getAbsolutePath() {
            return this.absolutePath;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setEmgProof(String emgProof) {
            this.emgProof = emgProof;
            return this;
        }
        public String getEmgProof() {
            return this.emgProof;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setNecessity(DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity necessity) {
            this.necessity = necessity;
            return this;
        }
        public DescribeVulListResponseBodyVulRecordsExtendContentJsonNecessity getNecessity() {
            return this.necessity;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setOsRelease(String osRelease) {
            this.osRelease = osRelease;
            return this;
        }
        public String getOsRelease() {
            return this.osRelease;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setRpmEntityList(java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> rpmEntityList) {
            this.rpmEntityList = rpmEntityList;
            return this;
        }
        public java.util.List<DescribeVulListResponseBodyVulRecordsExtendContentJsonRpmEntityList> getRpmEntityList() {
            return this.rpmEntityList;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public DescribeVulListResponseBodyVulRecordsExtendContentJson setCveList(java.util.List<String> cveList) {
            this.cveList = cveList;
            return this;
        }
        public java.util.List<String> getCveList() {
            return this.cveList;
        }

    }

    public static class DescribeVulListResponseBodyVulRecords extends TeaModel {
        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>RHSA-2019:0230-Important: polkit security update</p>
         */
        @NameInMap("AliasName")
        public String aliasName;

        /**
         * <p>The edition of Security Center that is authorized to scan the asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic.</li>
         * <li><strong>6</strong>: Anti-virus.</li>
         * <li><strong>5</strong>: Advanced.</li>
         * <li><strong>3</strong>: Enterprise.</li>
         * <li><strong>7</strong>: Ultimate.</li>
         * <li><strong>10</strong>: Value-added Plan.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthVersion")
        public String authVersion;

        /**
         * <p>Indicates whether Security Center is authorized to scan the asset. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Bind")
        public Boolean bind;

        /**
         * <p>The extended information about the vulnerability.</p>
         */
        @NameInMap("ExtendContentJson")
        public DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson;

        /**
         * <p>The timestamp when the vulnerability was first detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1554189334000</p>
         */
        @NameInMap("FirstTs")
        public Long firstTs;

        /**
         * <p>The ID of the asset group.</p>
         * 
         * <strong>example:</strong>
         * <p>281801</p>
         */
        @NameInMap("GroupId")
        public Integer groupId;

        /**
         * <p>The ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp18t***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>testInstance</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the cluster.</p>
         * <blockquote>
         * <p> The value of this parameter is returned only if you use the Ultimate edition of Security Center that can protect container assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c863dc93bed3843de9934d4346dc4****</p>
         */
        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        /**
         * <p>The namespace.</p>
         * <blockquote>
         * <p> If you use the Ultimate edition of Security Center, the value of this parameter is queried from container assets. If you do not use the Ultimate edition, the value of this parameter is queried from the Security Center agent.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        /**
         * <p>The ID of the node.</p>
         * <blockquote>
         * <p> The value of this parameter is returned only if you use the Ultimate edition of Security Center that can protect container assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>i-bp1ifm6suw9mnbsr****</p>
         */
        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        /**
         * <p>The name of the node.</p>
         * <blockquote>
         * <p> The value of this parameter is returned only if you use the Ultimate edition of Security Center that can protect container assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deployment-riskai-7b67d68975-m****</p>
         */
        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        /**
         * <p>The name of the pod.</p>
         * <blockquote>
         * <p> The value of this parameter is returned only if you use the Ultimate edition of Security Center that can protect container assets.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>deployment-riskai-7b67d68975-m****</p>
         */
        @NameInMap("K8sPodName")
        public String k8sPodName;

        /**
         * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620404763000</p>
         */
        @NameInMap("LastTs")
        public Long lastTs;

        /**
         * <p>The timestamp when the vulnerability status was modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620404763000</p>
         */
        @NameInMap("ModifyTs")
        public Long modifyTs;

        /**
         * <p>The name of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval:com.redhat.rhsa:def:20170574</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The priority to fix the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>asap</strong>: high.</li>
         * <li><strong>later</strong>: medium.</li>
         * <li><strong>nntf</strong>: low.</li>
         * </ul>
         * <blockquote>
         * <p> We recommend that you fix <strong>high-risk</strong> vulnerabilities at the earliest opportunity.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>asap</p>
         */
        @NameInMap("Necessity")
        public String necessity;

        /**
         * <p>Indicates whether the Security Center agent on the asset is online. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>The name of the operating system for your asset.</p>
         * 
         * <strong>example:</strong>
         * <p>CentOS 7.2 64-bit</p>
         */
        @NameInMap("OsName")
        public String osName;

        /**
         * <p>The name of the operating system for your asset.</p>
         * 
         * <strong>example:</strong>
         * <p>linux</p>
         */
        @NameInMap("OsVersion")
        public String osVersion;

        /**
         * <p>The ID of the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>101162078</p>
         */
        @NameInMap("PrimaryId")
        public Long primaryId;

        /**
         * <p>The progress of the vulnerability fixing.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>Indicates whether the application protection feature is supported. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no.</li>
         * <li><strong>1</strong>: yes.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is not returned, the application protection feature is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RaspDefend")
        public Integer raspDefend;

        /**
         * <p>The protection mode of the application protection feature. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: unprotected.</li>
         * <li><strong>1</strong>: the Monitor mode.</li>
         * <li><strong>2</strong>: the Block mode.</li>
         * <li><strong>3</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RaspStatus")
        public Integer raspStatus;

        /**
         * <p>Indicates whether the vulnerability is easily exploited. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RealRisk")
        public Boolean realRisk;

        /**
         * <p>The region ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The Common Vulnerabilities and Exposures (CVE) IDs related to the vulnerability. Multiple CVE IDs are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>CVE-2017-7518,CVE-2017-12188</p>
         */
        @NameInMap("Related")
        public String related;

        /**
         * <p>The timestamp when the vulnerability was fixed. Unit: milliseconds. This parameter is returned only if you fix vulnerabilities in the Security Center console.</p>
         * 
         * <strong>example:</strong>
         * <p>1541207563000</p>
         */
        @NameInMap("RepairTs")
        public Long repairTs;

        /**
         * <p>The code that indicates the vulnerability fixing result.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The message that indicates the vulnerability fixing result.</p>
         * 
         * <strong>example:</strong>
         * <p>timeout</p>
         */
        @NameInMap("ResultMessage")
        public String resultMessage;

        /**
         * <p>The status of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: unfixed.</li>
         * <li><strong>2</strong>: fix failed.</li>
         * <li><strong>3</strong>: rollback failed.</li>
         * <li><strong>4</strong>: being fixed.</li>
         * <li><strong>5</strong>: being rolled back.</li>
         * <li><strong>6</strong>: being verified.</li>
         * <li><strong>7</strong>: fixed.</li>
         * <li><strong>8</strong>: fixed and to be restarted.</li>
         * <li><strong>9</strong>: rolled back.</li>
         * <li><strong>10</strong>: ignored.</li>
         * <li><strong>11</strong>: rolled back and to be restarted.</li>
         * <li><strong>12</strong>: not found.</li>
         * <li><strong>20</strong>: expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public Integer status;

        /**
         * <p>The tag that is added to the vulnerability.</p>
         * 
         * <strong>example:</strong>
         * <p>oval</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The type of the vulnerability. Valid values:</p>
         * <ul>
         * <li><strong>cve</strong>: Linux software vulnerability.</li>
         * <li><strong>sys</strong>: Windows system vulnerability.</li>
         * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
         * <li><strong>emg</strong>: urgent vulnerability.</li>
         * <li><strong>app</strong>: application vulnerability.</li>
         * <li><strong>sca</strong>: application vulnerability that is detected by using software component analysis.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cve</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The UUID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>04c56617-23fc-43a5-ab9b-****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeVulListResponseBodyVulRecords build(java.util.Map<String, ?> map) throws Exception {
            DescribeVulListResponseBodyVulRecords self = new DescribeVulListResponseBodyVulRecords();
            return TeaModel.build(map, self);
        }

        public DescribeVulListResponseBodyVulRecords setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public DescribeVulListResponseBodyVulRecords setAuthVersion(String authVersion) {
            this.authVersion = authVersion;
            return this;
        }
        public String getAuthVersion() {
            return this.authVersion;
        }

        public DescribeVulListResponseBodyVulRecords setBind(Boolean bind) {
            this.bind = bind;
            return this;
        }
        public Boolean getBind() {
            return this.bind;
        }

        public DescribeVulListResponseBodyVulRecords setExtendContentJson(DescribeVulListResponseBodyVulRecordsExtendContentJson extendContentJson) {
            this.extendContentJson = extendContentJson;
            return this;
        }
        public DescribeVulListResponseBodyVulRecordsExtendContentJson getExtendContentJson() {
            return this.extendContentJson;
        }

        public DescribeVulListResponseBodyVulRecords setFirstTs(Long firstTs) {
            this.firstTs = firstTs;
            return this;
        }
        public Long getFirstTs() {
            return this.firstTs;
        }

        public DescribeVulListResponseBodyVulRecords setGroupId(Integer groupId) {
            this.groupId = groupId;
            return this;
        }
        public Integer getGroupId() {
            return this.groupId;
        }

        public DescribeVulListResponseBodyVulRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeVulListResponseBodyVulRecords setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeVulListResponseBodyVulRecords setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeVulListResponseBodyVulRecords setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeVulListResponseBodyVulRecords setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeVulListResponseBodyVulRecords setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public DescribeVulListResponseBodyVulRecords setK8sNodeId(String k8sNodeId) {
            this.k8sNodeId = k8sNodeId;
            return this;
        }
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        public DescribeVulListResponseBodyVulRecords setK8sNodeName(String k8sNodeName) {
            this.k8sNodeName = k8sNodeName;
            return this;
        }
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        public DescribeVulListResponseBodyVulRecords setK8sPodName(String k8sPodName) {
            this.k8sPodName = k8sPodName;
            return this;
        }
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        public DescribeVulListResponseBodyVulRecords setLastTs(Long lastTs) {
            this.lastTs = lastTs;
            return this;
        }
        public Long getLastTs() {
            return this.lastTs;
        }

        public DescribeVulListResponseBodyVulRecords setModifyTs(Long modifyTs) {
            this.modifyTs = modifyTs;
            return this;
        }
        public Long getModifyTs() {
            return this.modifyTs;
        }

        public DescribeVulListResponseBodyVulRecords setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeVulListResponseBodyVulRecords setNecessity(String necessity) {
            this.necessity = necessity;
            return this;
        }
        public String getNecessity() {
            return this.necessity;
        }

        public DescribeVulListResponseBodyVulRecords setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public DescribeVulListResponseBodyVulRecords setOsName(String osName) {
            this.osName = osName;
            return this;
        }
        public String getOsName() {
            return this.osName;
        }

        public DescribeVulListResponseBodyVulRecords setOsVersion(String osVersion) {
            this.osVersion = osVersion;
            return this;
        }
        public String getOsVersion() {
            return this.osVersion;
        }

        public DescribeVulListResponseBodyVulRecords setPrimaryId(Long primaryId) {
            this.primaryId = primaryId;
            return this;
        }
        public Long getPrimaryId() {
            return this.primaryId;
        }

        public DescribeVulListResponseBodyVulRecords setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
        }

        public DescribeVulListResponseBodyVulRecords setRaspDefend(Integer raspDefend) {
            this.raspDefend = raspDefend;
            return this;
        }
        public Integer getRaspDefend() {
            return this.raspDefend;
        }

        public DescribeVulListResponseBodyVulRecords setRaspStatus(Integer raspStatus) {
            this.raspStatus = raspStatus;
            return this;
        }
        public Integer getRaspStatus() {
            return this.raspStatus;
        }

        public DescribeVulListResponseBodyVulRecords setRealRisk(Boolean realRisk) {
            this.realRisk = realRisk;
            return this;
        }
        public Boolean getRealRisk() {
            return this.realRisk;
        }

        public DescribeVulListResponseBodyVulRecords setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeVulListResponseBodyVulRecords setRelated(String related) {
            this.related = related;
            return this;
        }
        public String getRelated() {
            return this.related;
        }

        public DescribeVulListResponseBodyVulRecords setRepairTs(Long repairTs) {
            this.repairTs = repairTs;
            return this;
        }
        public Long getRepairTs() {
            return this.repairTs;
        }

        public DescribeVulListResponseBodyVulRecords setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVulListResponseBodyVulRecords setResultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }
        public String getResultMessage() {
            return this.resultMessage;
        }

        public DescribeVulListResponseBodyVulRecords setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public DescribeVulListResponseBodyVulRecords setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public DescribeVulListResponseBodyVulRecords setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeVulListResponseBodyVulRecords setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
