// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ExportVulRequest extends TeaModel {
    // The alias of the vulnerability.
    @NameInMap("AliasName")
    public String aliasName;

    // The additional type of the vulnerabilities. You can specify this parameter when you query application vulnerabilities. If you set Type to app, you must specify this parameter. If you set Type to a different value, this parameter is invalid. Set the value to **sca**.
    // 
    // >  If this parameter is set to **sca**, application vulnerabilities and the vulnerabilities that are detected based on software component analysis are queried. If you do not specify this parameter, only application vulnerabilities are queried.
    @NameInMap("AttachTypes")
    public String attachTypes;

    // Specifies whether the vulnerabilities are fixed. Valid values:
    // 
    // *   **y**: yes
    // *   **n**: no
    @NameInMap("Dealed")
    public String dealed;

    // The server group ID of the server on which the vulnerabilities are detected.
    // 
    // >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of server groups.
    @NameInMap("GroupId")
    public String groupId;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   zh: Chinese
    // *   en: English
    @NameInMap("Lang")
    public String lang;

    // The priority to fix the vulnerabilities. Separate multiple priorities with commas (,). Valid values:
    // 
    // *   **asap**: high
    // *   **later**: medium
    // *   **nntf**: low
    @NameInMap("Necessity")
    public String necessity;

    // The tag that is used to search for the vulnerabilities. Valid values:
    // 
    // *   Restart required
    // *   Remote exploitation
    // *   Exploit exists
    // *   Exploitable
    // *   Privilege escalation
    // *   Code execution
    @NameInMap("SearchTags")
    public String searchTags;

    // The type of the vulnerabilities that you want to export. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    // *   **cms**: Web-CMS vulnerability
    // *   **app**: application vulnerability
    // *   **emg**: urgent vulnerability
    @NameInMap("Type")
    public String type;

    // The UUID of the server on which the vulnerabilities are detected. Separate multiple UUIDs with commas (,).
    @NameInMap("Uuids")
    public String uuids;

    // The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).
    // 
    // >  You can call the [DescribeVpcList](~~DescribeVpcList~~) operation to query the IDs of VPCs.
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
