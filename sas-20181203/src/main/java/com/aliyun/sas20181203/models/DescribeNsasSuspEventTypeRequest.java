// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNsasSuspEventTypeRequest extends TeaModel {
    /**
     * <p>The name of the container field. Valid values:</p>
     * <ul>
     * <li><strong>clusterId</strong>: the ID of the cluster</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clusterId</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container field.</p>
     * 
     * <strong>example:</strong>
     * <p>ca3108551c83c4d949106e1ab9e1e****</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The ID of the request source. Set the value to <strong>sas</strong>, which indicates that the request is sent from Security Center.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

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
     * <p>The type of the accounts that you want to query. Default value: <strong>0</strong>. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the current account.</li>
     * <li><strong>1</strong>: all accounts.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MultiAccountActionType")
    public Integer multiAccountActionType;

    /**
     * <p>The name of the alert type.</p>
     * 
     * <strong>example:</strong>
     * <p>Unusual Logon</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the server.</p>
     * 
     * <strong>example:</strong>
     * <p>testECS</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>180.212.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUIDs of servers. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>f56406cb-916d-42db-b6f7-2ff79e34****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeNsasSuspEventTypeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNsasSuspEventTypeRequest self = new DescribeNsasSuspEventTypeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNsasSuspEventTypeRequest setContainerFieldName(String containerFieldName) {
        this.containerFieldName = containerFieldName;
        return this;
    }
    public String getContainerFieldName() {
        return this.containerFieldName;
    }

    public DescribeNsasSuspEventTypeRequest setContainerFieldValue(String containerFieldValue) {
        this.containerFieldValue = containerFieldValue;
        return this;
    }
    public String getContainerFieldValue() {
        return this.containerFieldValue;
    }

    public DescribeNsasSuspEventTypeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeNsasSuspEventTypeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeNsasSuspEventTypeRequest setMultiAccountActionType(Integer multiAccountActionType) {
        this.multiAccountActionType = multiAccountActionType;
        return this;
    }
    public Integer getMultiAccountActionType() {
        return this.multiAccountActionType;
    }

    public DescribeNsasSuspEventTypeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeNsasSuspEventTypeRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public DescribeNsasSuspEventTypeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeNsasSuspEventTypeRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
