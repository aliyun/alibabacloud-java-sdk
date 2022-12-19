// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNsasSuspEventTypeRequest extends TeaModel {
    // The name of the container field. Valid values:
    // 
    // *   **clusterId**: the ID of the cluster
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    // The value of the container field.
    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    // The ID of the request source. Set the value to **sas**, which indicates that the request is sent from Security Center.
    @NameInMap("From")
    public String from;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The name of the alert type.
    @NameInMap("Name")
    public String name;

    // The name of the server.
    @NameInMap("Remark")
    public String remark;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The UUIDs of servers. Separate multiple UUIDs with commas (,).
    // 
    // >  You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.
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
