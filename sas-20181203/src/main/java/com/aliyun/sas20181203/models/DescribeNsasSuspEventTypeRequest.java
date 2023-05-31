// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNsasSuspEventTypeRequest extends TeaModel {
    /**
     * <p>The name of the container field. Valid values:</p>
     * <br>
     * <p>*   **clusterId**: the ID of the cluster</p>
     */
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    /**
     * <p>The value of the container field.</p>
     */
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    /**
     * <p>The ID of the request source. Set the value to **sas**, which indicates that the request is sent from Security Center.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The name of the alert type.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The name of the server.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUIDs of servers. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.</p>
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
