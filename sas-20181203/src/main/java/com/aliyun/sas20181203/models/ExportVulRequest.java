// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportVulRequest extends TeaModel {
    /**
     * <p>The name of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>RHSA-2019:3197-Important: sudo security update</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The asset type where the vulnerability is detected. Separate multiple types with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>ECS</strong>: host asset</li>
     * <li><strong>CONTAINER</strong>: container asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ECS</p>
     */
    @NameInMap("AssetType")
    public String assetType;

    /**
     * <p>The additional vulnerability type when querying application vulnerabilities. This parameter is required when Type is set to app. The value is fixed as <strong>sca</strong>.</p>
     * <blockquote>
     * <p>If this parameter is set to <strong>sca</strong>, both application vulnerabilities (<strong>app</strong> type) and software composition analysis (<strong>sca</strong> type) vulnerabilities are queried. If this parameter is not set, only application vulnerabilities are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>sca</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>The name of the container affected by the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>xxljob-7b87597b99-mcskr</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>The end of the time range during which the first scan was performed.</p>
     * <blockquote>
     * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1696186800000</p>
     */
    @NameInMap("CreateTsEnd")
    public Long createTsEnd;

    /**
     * <p>The start of the time range during which the first scan was performed.</p>
     * <blockquote>
     * <p>The value is a UNIX timestamp. Unit: milliseconds.</p>
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
     * <p>Specifies whether the vulnerability is fixed. Valid values:</p>
     * <ul>
     * <li><strong>y</strong>: fixed</li>
     * <li><strong>n</strong>: not fixed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The ID of the asset group to which the server with the vulnerability belongs.</p>
     * <blockquote>
     * <p>Call the <a href="~~DescribeAllGroups~~">DescribeAllGroups</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8834224</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the image affected by the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>container-<em><strong>:</strong></em>*</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li>zh: Chinese</li>
     * <li>en: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The priority of the vulnerability to query. Separate multiple priorities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>asap</strong>: high</li>
     * <li><strong>later</strong>: medium</li>
     * <li><strong>nntf</strong>: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The path of the process affected by the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>/etc/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>Specifies whether runtime application self-protection (RASP) supports real-time protection against the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not supported.</li>
     * <li><strong>1</strong>: Supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RaspDefend")
    public Integer raspDefend;

    /**
     * <p>The ID of the resource directory account.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    /**
     * <p>Filters results by label. Valid values:</p>
     * <p>&lt;props=&quot;china&quot;&gt;</p>
     * <ul>
     * <li>Restart required</li>
     * <li>Remote utilization</li>
     * <li>EXP exists</li>
     * <li>Exploitable</li>
     * <li>Privilege escalation</li>
     * <li>Code execution</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;</p>
     * <ul>
     * <li><strong>Restart required</strong></li>
     * <li><strong>Remote utilization</strong></li>
     * <li><strong>EXP exists</strong></li>
     * <li><strong>Available</strong></li>
     * <li><strong>Elevation of Privilege</strong></li>
     * <li><strong>Code Execution</strong></li>
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
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * <li><strong>cms</strong>: Web-CMS vulnerability</li>
     * <li><strong>app</strong>: application vulnerability</li>
     * <li><strong>emg</strong>: emergency vulnerability</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>app</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the servers to query for vulnerabilities. Separate multiple UUIDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1587bedb-fdb4-48c4-9330-****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The instance IDs of the VPC-connected instances to query for vulnerabilities. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p>Invoke the <a href="~~DescribeVpcList~~">DescribeVpcList</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ins-133****,ins-5414****</p>
     */
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    /**
     * <p>The list of vulnerability component information.</p>
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

    public ExportVulRequest setAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }
    public String getAssetType() {
        return this.assetType;
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
         * <p>The name of the component.</p>
         * 
         * <strong>example:</strong>
         * <p>Ollama</p>
         */
        @NameInMap("EntityName")
        public String entityName;

        /**
         * <p>The version of the component.</p>
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
