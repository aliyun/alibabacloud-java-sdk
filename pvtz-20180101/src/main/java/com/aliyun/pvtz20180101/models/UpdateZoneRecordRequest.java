// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRecordRequest extends TeaModel {
    /**
     * <p>A client token that is used to ensure the idempotence of the request. The client generates the value, which must be unique among different requests. The token can contain a maximum of 64 ASCII characters.</p>
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
     * <p>The DNS resolution line. The default value is default.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("Line")
    public String line;

    /**
     * <p>The priority of the MX record. You can set different priorities for mail servers. Valid values: 1 to 99. A smaller value indicates a higher priority.</p>
     * <blockquote>
     * <p>This parameter is required if the record type is MX.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Priority")
    public Integer priority;

    /**
     * <p>The ID of the DNS record. To obtain the ID, call the DescribeZoneRecords operation to query a list of DNS records.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172223****</p>
     */
    @NameInMap("RecordId")
    public Long recordId;

    /**
     * <p>The host record. This is the prefix of a domain name. Common examples include www, @, \* (for wildcard DNS), and mail (for mailboxes).</p>
     * <p>For example, to resolve @.example.com, set the host record to &quot;@&quot;, not an empty string.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>www</p>
     */
    @NameInMap("Rr")
    public String rr;

    /**
     * <p>The time to live (TTL) in seconds (s). Valid values: 5, 30, 60, 3600 (1 hour), 43200 (12 hours), and 86400 (1 day).</p>
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
     * <li><p><strong>SRV</strong>: A service record that specifies the server for a specific service. The format is: Priority Weight Port Target. Each part must be separated by a space.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Before adding a PTR record, configure a reverse lookup zone. For more information, see <a href="https://help.aliyun.com/document_detail/2592976.html">Reverse DNS lookup and PTR records</a></p>
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
     * <p>The record value. Enter a value that corresponds to the record type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>192.16.XX.XX</p>
     */
    @NameInMap("Value")
    public String value;

    /**
     * <p>The weight of the record. Valid values are integers from 1 to 100. The default value is 1. You can set different weights for records to return IP addresses in proportion to their weights.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Weight")
    public Integer weight;

    public static UpdateZoneRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRecordRequest self = new UpdateZoneRecordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRecordRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateZoneRecordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateZoneRecordRequest setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public UpdateZoneRecordRequest setPriority(Integer priority) {
        this.priority = priority;
        return this;
    }
    public Integer getPriority() {
        return this.priority;
    }

    public UpdateZoneRecordRequest setRecordId(Long recordId) {
        this.recordId = recordId;
        return this;
    }
    public Long getRecordId() {
        return this.recordId;
    }

    public UpdateZoneRecordRequest setRr(String rr) {
        this.rr = rr;
        return this;
    }
    public String getRr() {
        return this.rr;
    }

    public UpdateZoneRecordRequest setTtl(Integer ttl) {
        this.ttl = ttl;
        return this;
    }
    public Integer getTtl() {
        return this.ttl;
    }

    public UpdateZoneRecordRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public UpdateZoneRecordRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public UpdateZoneRecordRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public UpdateZoneRecordRequest setWeight(Integer weight) {
        this.weight = weight;
        return this;
    }
    public Integer getWeight() {
        return this.weight;
    }

}
