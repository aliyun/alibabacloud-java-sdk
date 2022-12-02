// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeNsasSuspEventTypeRequest extends TeaModel {
    @NameInMap("ContainerFieldName")
    public String containerFieldName;

    @NameInMap("ContainerFieldValue")
    public String containerFieldValue;

    @NameInMap("From")
    public String from;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Name")
    public String name;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SourceIp")
    public String sourceIp;

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
