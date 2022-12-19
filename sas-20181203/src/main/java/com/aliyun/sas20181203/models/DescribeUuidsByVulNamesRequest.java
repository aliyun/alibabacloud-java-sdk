// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesRequest extends TeaModel {
    // Specifies whether the vulnerability is handled. Valid values:
    // 
    // **y**: yes. **n**: no.
    @NameInMap("Dealed")
    public String dealed;

    // The name of the search field that is used to query containers.
    @NameInMap("FieldName")
    public String fieldName;

    // The value of the search field that is used to query containers.
    @NameInMap("FieldValue")
    public String fieldValue;

    // The ID of the asset group.
    @NameInMap("GroupId")
    public Long groupId;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The severity of the vulnerability. Separate multiple severities with commas (,). Valid values:
    // 
    // *   **high**
    // *   **medium**
    // *   **low**
    @NameInMap("Level")
    public String level;

    // The priority based on which the vulnerability is fixed. Separate multiple priorities with commas (,). Valid values:
    // 
    // *   **asap**: high
    // *   **later**: medium
    // *   **nntf**: low
    @NameInMap("Necessity")
    public String necessity;

    // The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset. Fuzzy match is supported.
    @NameInMap("Remark")
    public String remark;

    // The tags that are used to search for the vulnerability.
    @NameInMap("SearchTags")
    public String searchTags;

    // The status of the vulnerability. Separate multiple states with commas (,). Valid values:
    // 
    // *   **1**: unfixed
    // *   **4**: being fixed
    // *   **7**: fixed
    @NameInMap("StatusList")
    public String statusList;

    // The tag that is added to the vulnerability.
    @NameInMap("Tag")
    public String tag;

    // The type of the query condition. Valid values:
    // 
    // *   **containerId**: the ID of the container
    // *   **uuid**: the ID of the asset
    @NameInMap("TargetType")
    public String targetType;

    // The type of the vulnerability. Valid values:
    // 
    // *   **cve**: Linux software vulnerability
    // *   **sys**: Windows system vulnerability
    // *   **cms**: Web-CMS vulnerabilities
    // *   **app**: application vulnerability
    // *   **emg**: urgent vulnerabilities
    // *   **sca**: vulnerabilities that are detected based on software component analysis
    @NameInMap("Type")
    public String type;

    // The ID of the virtual private cloud (VPC) in which the vulnerability is detected. Separate multiple IDs with commas (,).
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    // An array that consists of the names of vulnerabilities.
    // 
    // >  You can call the [DescribeGroupedVul](~~DescribeGroupedVul~~) operation to obtain the names of vulnerabilities.
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
