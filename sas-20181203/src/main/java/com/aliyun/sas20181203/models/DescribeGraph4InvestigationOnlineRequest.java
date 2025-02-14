// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeGraph4InvestigationOnlineRequest extends TeaModel {
    /**
     * <p>The ID of the alert event. You can call <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> to obtain the alert event ID, with the value path being: data.SuspEvents[index].UniqueInfo.</p>
     * 
     * <strong>example:</strong>
     * <p>786fc80896b25422b5324cb6e57bxxxx</p>
     */
    @NameInMap("AnomalyId")
    public String anomalyId;

    /**
     * <p>The UUID of the alert event asset. You can call <a href="~~DescribeSuspEvents~~">DescribeSuspEvents</a> to obtain the asset UUID, with the value path being: data.SuspEvents[index].Uuid.</p>
     * 
     * <strong>example:</strong>
     * <p>3502e4b0-f362-4059-84a2-f47fa2b5exxx</p>
     */
    @NameInMap("AnomalyUuid")
    public String anomalyUuid;

    /**
     * <p>Sets the language type for the request and response messages. The default is <strong>zh</strong>. Values:</p>
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
     * <p>The namespace of the graph, which is fixed as: hundun_dc_online.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>hundun_dc_online</p>
     */
    @NameInMap("Namespace")
    public String namespace;

    /**
     * <p>Vertex ID. This does not need to be proactively provided.</p>
     * 
     * <strong>example:</strong>
     * <p>29872354f741b1b044b8a9b4e2ab****</p>
     */
    @NameInMap("VertexId")
    public String vertexId;

    public static DescribeGraph4InvestigationOnlineRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGraph4InvestigationOnlineRequest self = new DescribeGraph4InvestigationOnlineRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGraph4InvestigationOnlineRequest setAnomalyId(String anomalyId) {
        this.anomalyId = anomalyId;
        return this;
    }
    public String getAnomalyId() {
        return this.anomalyId;
    }

    public DescribeGraph4InvestigationOnlineRequest setAnomalyUuid(String anomalyUuid) {
        this.anomalyUuid = anomalyUuid;
        return this;
    }
    public String getAnomalyUuid() {
        return this.anomalyUuid;
    }

    public DescribeGraph4InvestigationOnlineRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeGraph4InvestigationOnlineRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public DescribeGraph4InvestigationOnlineRequest setVertexId(String vertexId) {
        this.vertexId = vertexId;
        return this;
    }
    public String getVertexId() {
        return this.vertexId;
    }

}
