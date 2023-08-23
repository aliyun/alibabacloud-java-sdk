// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulListRequest extends TeaModel {
    /**
     * <p>The name of the vulnerability.</p>
     */
    @NameInMap("AliasName")
    public String aliasName;

    /**
     * <p>The additional type of the vulnerabilities. You need to specify this parameter when you query application vulnerabilities. Set the value to **sca**. If you set **Type** to **app**, you must specify this parameter.</p>
     * <br>
     * <p>> If you set this parameter to **sca**, application vulnerabilities and the vulnerabilities that are detected based on software component analysis are queried. If you do not specify this parameter, only application vulnerabilities are queried.</p>
     */
    @NameInMap("AttachTypes")
    public String attachTypes;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the vulnerabilities are fixed. Valid values:</p>
     * <br>
     * <p>*   **y**: yes</p>
     * <p>*   **n**: no</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The ID of the asset group.</p>
     * <br>
     * <p>> You can call the [DescribeAllGroups](~~DescribeAllGroups~~) operation to query the IDs of asset groups.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The alias of the vulnerability.</p>
     */
    @NameInMap("Name")
    public String name;

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
     * <p>The number of entries per page. Default value: **10**.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset.</p>
     */
    @NameInMap("Remark")
    public String remark;

    @NameInMap("ResourceDirectoryAccountId")
    public Long resourceDirectoryAccountId;

    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     * <p>*   **cms**: Web-CMS vulnerability.</p>
     * <p>*   **app**: application vulnerability that is detected by using web scanner</p>
     * <p>*   **emg**: urgent vulnerability.</p>
     * <p>*   **sca**: application vulnerability that is detected by using software component analysis</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUIDs of the servers on which you want to query the vulnerabilities. Separate multiple UUIDs with commas (,).</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the vulnerabilities are detected. Separate multiple IDs with commas (,).</p>
     */
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

    public DescribeVulListRequest setResourceDirectoryAccountId(Long resourceDirectoryAccountId) {
        this.resourceDirectoryAccountId = resourceDirectoryAccountId;
        return this;
    }
    public Long getResourceDirectoryAccountId() {
        return this.resourceDirectoryAccountId;
    }

    public DescribeVulListRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
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
