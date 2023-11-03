// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesRequest extends TeaModel {
    /**
     * <p>Specifies whether the vulnerability is fixed. Valid values:</p>
     * <br>
     * <p>*   **y**: the vulnerability is fixed.</p>
     * <p>*   **n**: the vulnerability is not fixed.</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The name of the search field that is used to query containers.</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The value of the search field that is used to query containers.</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The ID of the asset group.</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The severity of the vulnerability. Separate multiple severities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **high**</p>
     * <p>*   **medium**</p>
     * <p>*   **low**</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The priority based on which the vulnerability is fixed. Separate multiple priorities with commas (,). Valid values:</p>
     * <br>
     * <p>*   **asap**: high</p>
     * <p>*   **later**: medium</p>
     * <p>*   **nntf**: low</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset. Fuzzy match is supported.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The tags that are used to search for the vulnerability.</p>
     */
    @NameInMap("SearchTags")
    public String searchTags;

    /**
     * <p>The status of the vulnerability. Separate multiple states with commas (,). Valid values:</p>
     * <br>
     * <p>*   **1**: unfixed</p>
     * <p>*   **2**: fix failed</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The tag of the vulnerability.</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <br>
     * <p>*   **containerId**: the ID of the container</p>
     * <p>*   **uuid**: the ID of the asset</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <br>
     * <p>*   **cve**: Linux software vulnerability</p>
     * <p>*   **sys**: Windows system vulnerability</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the vulnerability is detected. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    /**
     * <p>An array that consists of the names of vulnerabilities.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedVul](~~DescribeGroupedVul~~) operation to obtain the names of vulnerabilities.</p>
     */
    @NameInMap("VulNames")
    public java.util.List<String> vulNames;

    public static DescribeUuidsByVulNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeUuidsByVulNamesRequest self = new DescribeUuidsByVulNamesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeUuidsByVulNamesRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public DescribeUuidsByVulNamesRequest setFieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }
    public String getFieldName() {
        return this.fieldName;
    }

    public DescribeUuidsByVulNamesRequest setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }
    public String getFieldValue() {
        return this.fieldValue;
    }

    public DescribeUuidsByVulNamesRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public DescribeUuidsByVulNamesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeUuidsByVulNamesRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public DescribeUuidsByVulNamesRequest setNecessity(String necessity) {
        this.necessity = necessity;
        return this;
    }
    public String getNecessity() {
        return this.necessity;
    }

    public DescribeUuidsByVulNamesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeUuidsByVulNamesRequest setSearchTags(String searchTags) {
        this.searchTags = searchTags;
        return this;
    }
    public String getSearchTags() {
        return this.searchTags;
    }

    public DescribeUuidsByVulNamesRequest setStatusList(String statusList) {
        this.statusList = statusList;
        return this;
    }
    public String getStatusList() {
        return this.statusList;
    }

    public DescribeUuidsByVulNamesRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public DescribeUuidsByVulNamesRequest setTargetType(String targetType) {
        this.targetType = targetType;
        return this;
    }
    public String getTargetType() {
        return this.targetType;
    }

    public DescribeUuidsByVulNamesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeUuidsByVulNamesRequest setVpcInstanceIds(String vpcInstanceIds) {
        this.vpcInstanceIds = vpcInstanceIds;
        return this;
    }
    public String getVpcInstanceIds() {
        return this.vpcInstanceIds;
    }

    public DescribeUuidsByVulNamesRequest setVulNames(java.util.List<String> vulNames) {
        this.vulNames = vulNames;
        return this;
    }
    public java.util.List<String> getVulNames() {
        return this.vulNames;
    }

}
