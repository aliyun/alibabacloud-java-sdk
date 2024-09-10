// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoNodeRequest extends TeaModel {
    /**
     * <p>The name of the alert event.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the names of alerts events.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WEBSHELL</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The ID of the request source. Set the value to sas.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>sas</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The time when the alert event was first detected.</p>
     * 
     * <strong>example:</strong>
     * <p>1635978934000</p>
     */
    @NameInMap("IncidentTime")
    public Long incidentTime;

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
     * <p>The source IP address of the request. The value of this parameter is specified by the system.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the vertex. You can call the <a href="~~DescribeTraceInfoDetail~~">DescribeTraceInfoDetail</a> operation to query the types of vertexes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SAS_ASSET</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server. You can call the <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> operation to query the UUIDs of servers.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>6f346617-eef9-45e6-b6d1-946xxxxxxxx</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The ID of the vertex.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>03da4e2350a3eb50cd25a18cexxxxxxx</p>
     */
    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeTraceInfoNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTraceInfoNodeRequest self = new DescribeTraceInfoNodeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTraceInfoNodeRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeTraceInfoNodeRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public DescribeTraceInfoNodeRequest setIncidentTime(Long incidentTime) {
        this.incidentTime = incidentTime;
        return this;
    }
    public Long getIncidentTime() {
        return this.incidentTime;
    }

    public DescribeTraceInfoNodeRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTraceInfoNodeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeTraceInfoNodeRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeTraceInfoNodeRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

    public DescribeTraceInfoNodeRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
