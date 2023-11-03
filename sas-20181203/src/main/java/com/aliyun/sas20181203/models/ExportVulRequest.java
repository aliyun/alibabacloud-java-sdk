// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportVulRequest extends TeaModel {
    /**
     * <p>The name of the vulnerability.</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The additional type of the vulnerabilities. You need to specify this parameter when you query application vulnerabilities. If you set the Type parameter to app, you must specify this parameter. Set the value to **sca**.</p>
     * <br>
     * <p>> If this parameter is set to **sca**, **application vulnerabilities** and the **vulnerabilities that are detected based on software component analysis** are queried. If you do not specify this parameter, only application vulnerabilities are queried.</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>要查询漏洞影响的容器名称。</p>
     */
    @NameInMap("ContainerName")
    public String containerName;

    /**
     * <p>首次扫描时间结束时间。</p>
     * <p>> 时间戳，单位为毫秒。</p>
     */
    @NameInMap("CreateTsEnd")
    public Long createTsEnd;

    /**
     * <p>首次扫描时间起始时间。</p>
     * <p>> 时间戳，单位为毫秒。</p>
     */
    @NameInMap("CreateTsStart")
    public Long createTsStart;

    @NameInMap("CveId")
    public String cveId;

    /**
     * <p>Specifies whether the vulnerability is fixed. Valid values:</p>
     * <br>
     * <p>*   **y**: The vulnerability is fixed.</p>
     * <p>*   **n**: The vulnerability is not fixed.</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The server group ID of the server on which the vulnerabilities are detected.</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>要查询漏洞影响的镜像名称。</p>
     */
    @NameInMap("ImageName")
    public String imageName;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   zh: Chinese</p>
     * <p>*   en: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **asap**: high</p>
     * <p>*   **later**: medium</p>
     * <p>*   **nntf**: low</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>要查询漏洞影响的进程路径。</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The tag that is used to search for the vulnerabilities. Valid values:</p>
     * <br>
     * <p>*   Restart required</p>
     * <p>*   Remote exploitation</p>
     * <p>*   Exploit exists</p>
     * <p>*   Exploitable</p>
     * <p>*   Privilege escalation</p>
     * <p>*   Code execution</p>
     */
    @NameInMap("SearchTags")
    public String searchTags;

    /**
     * <p>The type of the vulnerability that you want to export. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability</p>
     * <p>*   **app**: application vulnerability</p>
     * <p>*   **emg**: urgent vulnerability</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server on which the vulnerabilities are detected. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeVpcList](~~DescribeVpcList~~) operation to query the IDs of VPCs.</p>
     */
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

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

}
