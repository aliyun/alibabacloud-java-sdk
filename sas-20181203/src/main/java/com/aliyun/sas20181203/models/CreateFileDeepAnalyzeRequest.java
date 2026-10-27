// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateFileDeepAnalyzeRequest extends TeaModel {
    /**
     * <p>The request context information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Context")
    public String context;

    /**
     * <p>The event ID. If a file-related alert event already exists, you can use this parameter to trigger deep analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>100000001</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The file hash. If the file already exists in the cloud, you can use this parameter to trigger deep analysis.</p>
     * 
     * <strong>example:</strong>
     * <p>d41d8cd98f00b204e9800998ecf8427e</p>
     */
    @NameInMap("Hash")
    public String hash;

    /**
     * <p>The request source. The system verifies the purchased edition based on the request source. Valid values:</p>
     * <ul>
     * <li><p><strong>edr</strong>: AgenticEDR.</p>
     * </li>
     * <li><p><strong>secOpsAgent</strong>: Security operations agent.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>edr</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The IP address of the access source.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateFileDeepAnalyzeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFileDeepAnalyzeRequest self = new CreateFileDeepAnalyzeRequest();
        return TeaModel.build(map, self);
    }

    public CreateFileDeepAnalyzeRequest setContext(String context) {
        this.context = context;
        return this;
    }
    public String getContext() {
        return this.context;
    }

    public CreateFileDeepAnalyzeRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public CreateFileDeepAnalyzeRequest setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public CreateFileDeepAnalyzeRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateFileDeepAnalyzeRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
