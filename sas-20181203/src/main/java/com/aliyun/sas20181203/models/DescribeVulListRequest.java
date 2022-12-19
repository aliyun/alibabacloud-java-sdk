// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListRequest extends TeaModel {
    // The name of the vulnerability.
    @NameInMap("AliasName")
    public String aliasName;

    // The additional type of the vulnerability. You can specify this parameter when you query application vulnerabilities. Set the value to **sca**. If you set **Type** to **app**, you must specify this parameter.
    // 
    // >  If you set this parameter to **sca**, application vulnerabilities and the vulnerabilities that are detected based on software component analysis are queried. If you do not specify this parameter, only application vulnerabilities are queried.
    @NameInMap("AttachTypes")
    public String attachTypes;

    // The number of the page to return. Default value: **1**.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // Specifies whether the vulnerability is fixed. Valid values:
    // 
    // *   **y**: yes
    // *   **n**: no
    @NameInMap("Dealed")
    public String dealed;

    // The ID of the asset group.
    // 
    // >  You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups.
    @NameInMap("GroupId")
    public String groupId;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The alias of the vulnerability.
    @NameInMap("Name")
    public String name;

    // The priority to fix the vulnerability. Separate multiple priorities with commas (,). Valid values:
    // 
    // *   **asap**: high
    // *   **later**: medium
    // *   **nntf**: low
    @NameInMap("Necessity")
    public String necessity;

    // The number of entries to return on each page. Default value: **10**.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset.
    @NameInMap("Remark")
    public String remark;

    // The type of the vulnerabilities. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    // *   **cms**: Web-CMS vulnerability
    // *   **app**: application vulnerability that is detected by using web scanner
    // *   **emg**: urgent vulnerability
    // *   **sca**: application vulnerability that is detected by using software component analysis
    @NameInMap("Type")
    public String type;

    // The UUIDs of the servers on which you want to query the vulnerabilities. Separate multiple UUIDs with commas (,).
    @NameInMap("Uuids")
    public String uuids;

    // The IDs of the virtual private clouds (VPCs) in which the vulnerability is detected. Separate multiple IDs with commas (,).
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    public static DescribeVulListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulListRequest self = new DescribeVulListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVulListRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public DescribeVulListRequest setAttachTypes(String attachTypes) {
        this.attachTypes = attachTypes;
        return this;
    }
    public String getAttachTypes() {
        return this.attachTypes;
    }

    public DescribeVulListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeVulListRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeVulListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeVulListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeVulListRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeVulListRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeVulListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeVulListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeVulListRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeVulListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

    public DescribeVulListRequest setVpcInstanceIds(String vpcInstanceIds) {
        this.vpcInstanceIds = vpcInstanceIds;
        return this;
    }
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

}
