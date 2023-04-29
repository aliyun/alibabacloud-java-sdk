// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeTraceInfoDetailRequest extends TeaModel {
    /**
     * <p>The ID of the request source. Set the value to **sas**.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The timestamp of the detection. Unit: milliseconds.</p>
     */
    @NameInMap("IncidentTime")
    public Long incidentTime;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request. The value of this parameter is specified by the system.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the vertex. Set the value to **SAS_INCIDENT**.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The UUID of the server.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    /**
     * <p>The ID of the vertex. You can call the [DescribeSuspEvents](~~DescribeSuspEvents~~) operation to query the ID.</p>
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
