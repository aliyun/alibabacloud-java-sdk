// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsRequest extends TeaModel {
    // The source of the request. Set the value to **sas**, which indicates that the request is sent from Security Center.
    @NameInMap("From")
    public String from;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The UUIDs of the assets to query. Separate multiple UUIDs with commas (,).
    // > You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of assets.
    @NameInMap("Uuid")
    public String uuid;

    public static DescribeInstanceStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceStatisticsRequest self = new DescribeInstanceStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceStatisticsRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeInstanceStatisticsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeInstanceStatisticsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeInstanceStatisticsRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
