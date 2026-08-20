// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class AddZoneRecordRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. A client generates this value to ensure that it is unique among different requests. The value can be up to 64 ASCII characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>6447728c8578e66aacf062d2df4446dc</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><p>zh: Chinese.</p>
     * </li>
     * <li><p>en: English.</p>
     * </li>
     * </ul>
     * <p>Default value: en</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source of the DNS resolution request. Valid values:</p>
     * <ul>
     * <li><p>default: The default line. This is equivalent to a global line. Configure a default line to ensure that a DNS record is returned even if no smart line is hit.</p>
     * </li>
     * <li><p>Alibaba Cloud line: The DNS resolution request comes from Alibaba Cloud, including Public Cloud, Alibaba Finance Cloud, and Alibaba Gov Cloud.</p>
     * </li>
     * <li><p>Custom line: Customize internal domain name resolution to return a specific IP address for DNS query requests from a specific IP address segment.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Only zones in built-in authoritative acceleration regions support adding DNS resolution request source lines.</p>
     * </li>
     * <li><p>To use the default line, enter &quot;default&quot;. For Alibaba Cloud lines and custom lines, enter the specified line code. Example: aliyun_r_cn-beijing-a</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the MX record. A smaller value indicates a higher priority. Valid values: <strong>[1, 99]</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The remarks.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The host record. A host record is the prefix of a domain name. Common host records include www, @, \* (for wildcard DNS), and mail (for mailboxes).</p>
     * <p>For example, to resolve @.example.com, set the host record to &quot;@&quot;, not an empty string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The time to live (TTL). The unit is seconds (s). Valid values are 5, 30, 60, 3600 (1 hour), 43200 (12 hours), and 86400 (1 day). The default value is 60.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Ttl")
    public Integer ttl;

    /**
     * <p>The type of the DNS record. The following types are supported:</p>
     * <ul>
     * <li><p><strong>A</strong>: Maps a domain name to an IPv4 address in dotted decimal notation.</p>
     * </li>
     * <li><p><strong>AAAA</strong>: Maps a domain name to an IPv6 address.</p>
     * </li>
     * <li><p><strong>CNAME</strong>: Maps a domain name to another domain name.</p>
     * </li>
     * <li><p><strong>TXT</strong>: A text record. The text can be up to 255 characters in length. TXT records are often used for Sender Policy Framework (SPF) records to prevent spam.</p>
     * </li>
     * <li><p><strong>MX</strong>: Maps a domain name to the domain name of a mail server.</p>
     * </li>
     * <li><p><strong>PTR</strong>: Maps an IP address to a domain name.</p>
     * </li>
     * <li><p><strong>SRV</strong>: Specifies the server for a specific service. The format is: Priority Weight Port Target. Separate each value with a space.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Before adding a PTR record, configure a reverse lookup zone. For more information, see <a href="https://help.aliyun.com/document_detail/2592976.html">Reverse DNS lookups and PTR records</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>A</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The record value. Enter a value based on the DNS record type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>114.55.XX.XX</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The weight. Valid values are integers from 1 to 100. The default value is 1. Set different weights for each address to return addresses based on the weight ratio for DNS queries.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    /**
     * <p>The ID of the zone. This is the unique identifier of the zone.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>df2d03865266bd9842306db586d3****</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    public static AddZoneRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        AddZoneRecordRequest self = new AddZoneRecordRequest();
        return TeaModel.build(map, self);
    }

    public AddZoneRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public AddZoneRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public AddZoneRecordRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public AddZoneRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public AddZoneRecordRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddZoneRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public AddZoneRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public AddZoneRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddZoneRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public AddZoneRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public AddZoneRecordRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

    public AddZoneRecordRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
