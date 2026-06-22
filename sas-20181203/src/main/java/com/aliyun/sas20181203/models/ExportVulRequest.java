// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportVulRequest extends TeaModel {
    /**
     * <p>The vulnerability name.</p>
     * 
     * <strong>example:</strong>
     * <p>RHSA-2019:3197-Important: sudo security update</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>An additional vulnerability type to export. This parameter is required and must be set to <strong>sca</strong> if the <code>Type</code> parameter is set to <code>app</code>.</p>
     * <blockquote>
     * <p>If you set this parameter to <strong>sca</strong>, the query returns both application vulnerabilities (<strong>app</strong>) and software composition analysis (<strong>sca</strong>) vulnerabilities. If you do not set this parameter, only application vulnerabilities are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>The affected container name.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-7b87597b99-mcskr</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The end of the creation time range for the vulnerabilities to export.</p>
     * <blockquote>
     * <p>A Unix timestamp in milliseconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1696186800000</p>
     */
    @NameInMap("CreateTsEnd")
    public Long createTsEnd;

    /**
     * <p>The start of the creation time range for the vulnerabilities to export.</p>
     * <blockquote>
     * <p>A Unix timestamp in milliseconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1696128144000</p>
     */
    @NameInMap("CreateTsStart")
    public Long createTsStart;

    /**
     * <p>The CVE ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CVE-2022-44702</p>
     */
    @NameInMap("CveId")
    public String cveId;

    /**
     * <p>Indicates whether the vulnerability is remediated. Valid values:</p>
     * <ul>
     * <li><p><strong>y</strong>: Remediated</p>
     * </li>
     * <li><p><strong>n</strong>: Not remediated</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The ID of the asset group that contains the affected servers.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8834224</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The affected image name.</p>
     * 
     * <strong>example:</strong>
     * <p>container-<em><strong>:</strong></em>*</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The language of the request and response. The default value is <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong>: Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The remediation priority of the vulnerabilities to export. Separate multiple priorities with commas. Valid values:</p>
     * <ul>
     * <li><p><strong>asap</strong>: High</p>
     * </li>
     * <li><p><strong>later</strong>: Medium</p>
     * </li>
     * <li><p><strong>nntf</strong>: Low</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The affected process path.</p>
     * 
     * <strong>example:</strong>
     * <p>/etc/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specifies whether the vulnerability is protected by runtime application self-protection (RASP). Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Not supported</p>
     * </li>
     * <li><p><strong>1</strong>: Supported</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RaspDefend")
    public Integer raspDefend;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>A tag for filtering vulnerabilities. Separate multiple tags with commas. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li><p>Restart required</p>
     * </li>
     * <li><p>remote exploitation</p>
     * </li>
     * <li><p>exploit exists</p>
     * </li>
     * <li><p>exploitable</p>
     * </li>
     * <li><p>Elevation of Privilege</p>
     * </li>
     * <li><p>Code Execution</p>
     * </li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><p><strong>Restart required</strong></p>
     * </li>
     * <li><p><strong>remote exploitation</strong></p>
     * </li>
     * <li><p><strong>exploit exists</strong></p>
     * </li>
     * <li><p><strong>exploitable</strong></p>
     * </li>
     * <li><p><strong>Elevation of Privilege</strong></p>
     * </li>
     * <li><p><strong>Code Execution</strong></p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Restart required</p>
     */
    @NameInMap("SearchTags")
    public String searchTags;

    /**
     * <p>The type of vulnerabilities to export. Valid values:</p>
     * <ul>
     * <li><p><strong>cve</strong>: Linux software vulnerability</p>
     * </li>
     * <li><p><strong>sys</strong>: Windows system vulnerability</p>
     * </li>
     * <li><p><strong>cms</strong>: Web-CMS vulnerability</p>
     * </li>
     * <li><p><strong>app</strong>: application vulnerability</p>
     * </li>
     * <li><p><strong>emg</strong>: emergency vulnerability</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the servers for which to export vulnerabilities. Separate multiple UUIDs with commas.</p>
     * 
     * <strong>example:</strong>
     * <p>1587bedb-fdb4-48c4-9330-****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The IDs of the VPC instances for which to export vulnerabilities. Separate multiple IDs with commas.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ins-133****,ins-5414****</p>
     */
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    /**
     * <p>A list of vulnerability component information.</p>
     */
    @NameInMap("VulEntityList")
    public java.util.List<ExportVulRequestVulEntityList> vulEntityList;

    public static ExportVulRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportVulRequest self = new ExportVulRequest();
        return TeaModel.build(map, self);
    }

    public ExportVulRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public ExportVulRequest setAttachTypes(String attachTypes) {
        this.attachTypes = attachTypes;
        return this;
    }
    public String getAttachTypes() {
        return this.attachTypes;
    }

    public ExportVulRequest setContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }
    public String getContainerName() {
        return this.containerName;
    }

    public ExportVulRequest setCreateTsEnd(Long createTsEnd) {
        this.createTsEnd = createTsEnd;
        return this;
    }
    public Long getCreateTsEnd() {
        return this.createTsEnd;
    }

    public ExportVulRequest setCreateTsStart(Long createTsStart) {
        this.createTsStart = createTsStart;
        return this;
    }
    public Long getCreateTsStart() {
        return this.createTsStart;
    }

    public ExportVulRequest setCveId(String cveId) {
        this.cveId = cveId;
        return this;
    }
    public String getCveId() {
        return this.cveId;
    }

    public ExportVulRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ExportVulRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ExportVulRequest setImageName(String imageName) {
        this.imageName = imageName;
        return this;
    }
    public String getImageName() {
        return this.imageName;
    }

    public ExportVulRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ExportVulRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public ExportVulRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ExportVulRequest setRaspDefend(Integer raspDefend) {
        this.raspDefend = raspDefend;
        return this;
    }
    public Integer getRaspDefend() {
        return this.raspDefend;
    }

    public ExportVulRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public ExportVulRequest setSearchTags(String searchTags) {
        this.searchTags = searchTags;
        return this;
    }
    public String getSearchTags() {
        return this.searchTags;
    }

    public ExportVulRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public ExportVulRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public ExportVulRequest setVpcInstanceIds(String vpcInstanceIds) {
        this.vpcInstanceIds = vpcInstanceIds;
        return this;
    }
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

    public ExportVulRequest setVulEntityList(java.util.List<ExportVulRequestVulEntityList> vulEntityList) {
        this.vulEntityList = vulEntityList;
        return this;
    }
    public java.util.List<ExportVulRequestVulEntityList> getVulEntityList() {
        return this.vulEntityList;
    }

    public static class ExportVulRequestVulEntityList extends TeaModel {
        /**
         * <p>The component name.</p>
         * 
         * <strong>example:</strong>
         * <p>Ollama</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The component version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("EntityVersion")
        public String entityVersion;

        public static ExportVulRequestVulEntityList build(java.util.Map<String, ?> map) throws Exception {
            ExportVulRequestVulEntityList self = new ExportVulRequestVulEntityList();
            return TeaModel.build(map, self);
        }

        public ExportVulRequestVulEntityList setEntityName(String entityName) {
            this.entityName = entityName;
            return this;
        }
        public String getEntityName() {
            return this.entityName;
        }

        public ExportVulRequestVulEntityList setEntityVersion(String entityVersion) {
            this.entityVersion = entityVersion;
            return this;
        }
        public String getEntityVersion() {
            return this.entityVersion;
        }

    }

}
