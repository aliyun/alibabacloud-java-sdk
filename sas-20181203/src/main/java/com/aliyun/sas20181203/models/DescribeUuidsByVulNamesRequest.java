// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeUuidsByVulNamesRequest extends TeaModel {
    /**
     * <p>Specifies whether the vulnerability is fixed. Valid values:</p>
     * <ul>
     * <li><strong>y</strong>: the vulnerability is fixed.</li>
     * <li><strong>n</strong>: the vulnerability is not fixed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>n</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The name of the search field that is used to query containers.</p>
     * 
     * <strong>example:</strong>
     * <p>namespace</p>
     */
    @NameInMap("FieldName")
    public String fieldName;

    /**
     * <p>The value of the search field that is used to query containers.</p>
     * 
     * <strong>example:</strong>
     * <p>cas-adad-qeqwe</p>
     */
    @NameInMap("FieldValue")
    public String fieldValue;

    /**
     * <p>The ID of the asset group.</p>
     * 
     * <strong>example:</strong>
     * <p>11286014</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The severity of the vulnerability. Separate multiple severities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>high</strong></li>
     * <li><strong>medium</strong></li>
     * <li><strong>low</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>high,low</p>
     */
    @NameInMap("Level")
    public String level;

    /**
     * <p>The priority based on which the vulnerability is fixed. Separate multiple priorities with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>asap</strong>: high</li>
     * <li><strong>later</strong>: medium</li>
     * <li><strong>nntf</strong>: low</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>asap,later,nntf</p>
     */
    @NameInMap("Necessity")
    public String necessity;

    /**
     * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>10.7.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The tags that are used to search for the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>oval</p>
     */
    @NameInMap("SearchTags")
    public String searchTags;

    /**
     * <p>The status of the vulnerability. Separate multiple states with commas (,). Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: unfixed</li>
     * <li><strong>2</strong>: fix failed</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1,4</p>
     */
    @NameInMap("StatusList")
    public String statusList;

    /**
     * <p>The tag of the vulnerability.</p>
     * 
     * <strong>example:</strong>
     * <p>oval</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The type of the query condition. Valid values:</p>
     * <ul>
     * <li><strong>containerId</strong>: the ID of the container</li>
     * <li><strong>uuid</strong>: the ID of the asset</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>uuid</p>
     */
    @NameInMap("TargetType")
    public String targetType;

    /**
     * <p>The type of the vulnerability. Valid values:</p>
     * <ul>
     * <li><strong>cve</strong>: Linux software vulnerability</li>
     * <li><strong>sys</strong>: Windows system vulnerability</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cve</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The ID of the virtual private cloud (VPC) in which the vulnerability is detected. Separate multiple IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6ssrvbrwe37ekw****,vpc-bp1aevy8sofi8mh1q****</p>
     */
    @NameInMap("VpcInstanceIds")
    public String vpcInstanceIds;

    /**
     * <p>An array that consists of the names of vulnerabilities.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeGroupedVul~~">DescribeGroupedVul</a> operation to obtain the names of vulnerabilities.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
