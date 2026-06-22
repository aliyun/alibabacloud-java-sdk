// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoDetailRequest extends TeaModel {
    /**
     * <p>The identifier of the request source. Set the value to <strong>sas</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The detection timestamp. Unit: milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1670555392000</p>
     */
    @NameInMap("IncidentTime")
    public Long incidentTime;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request. You do not need to specify this parameter. The system automatically obtains the value.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The vertex type. Set the value to <strong>SAS_INCIDENT</strong> for security alerts.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SAS_INCIDENT</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server to query.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1627f2d7-aaa2-4ed1-b07a-xxxxxxxxxxxxxx</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The vertex ID. You can obtain this value from the AlarmUniqueInfo parameter returned by the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cce1d28dxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeTraceInfoDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceInfoDetailRequest self = new DescribeTraceInfoDetailRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTraceInfoDetailRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeTraceInfoDetailRequest setIncidentTime(Long incidentTime) {
        this.incidentTime = incidentTime;
        return this;
    }
    public Long getIncidentTime() {
        return this.incidentTime;
    }

    public DescribeTraceInfoDetailRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTraceInfoDetailRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeTraceInfoDetailRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeTraceInfoDetailRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeTraceInfoDetailRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
