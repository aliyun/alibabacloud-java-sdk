// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesRequest extends TeaModel {
    @NameInMap("Dealed")
    public String dealed;

    @NameInMap("FieldName")
    public String fieldName;

    @NameInMap("FieldValue")
    public String fieldValue;

    @NameInMap("GroupId")
    public Long groupId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Level")
    public String level;

    @NameInMap("Necessity")
    public String necessity;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SearchTags")
    public String searchTags;

    @NameInMap("StatusList")
    public String statusList;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("TargetType")
    public String targetType;

    @NameInMap("Type")
    public String type;

    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

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
