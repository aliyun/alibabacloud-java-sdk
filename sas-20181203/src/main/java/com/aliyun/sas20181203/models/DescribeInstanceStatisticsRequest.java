// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceStatisticsRequest extends TeaModel {
    /**
     * <p>The source of the request. Set the value to <strong>sas</strong>, which indicates that the request is sent from Security Center.</p>
     * <p>This parameter is required.</p>
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
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1.2.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUIDs of the assets to query. Separate multiple UUIDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of assets.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6690a46c-0edb-4663-a641-3629d1a9****</p>
     */
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
