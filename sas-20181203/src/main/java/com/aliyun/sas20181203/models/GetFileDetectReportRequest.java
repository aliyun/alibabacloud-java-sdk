// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetFileDetectReportRequest extends TeaModel {
    /**
     * <p>The event ID that corresponds to the file to be detected.</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The field that you want to query. You can enter multiple fields and separate them with commas (,).</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **ThreatTypes**: the type of the threat intelligence event</p>
     * <p>*   **Intelligences**: the threat intelligence event</p>
     * <p>*   **ThreatLevel**: the level of the threat intelligence event</p>
     * <p>*   **Basic**: the basic information about the report (the scan result)</p>
     * <p>*   **Sandbox**: the cloud sandbox check report</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <p>The hash value of the file to be detected.</p>
     */
    @NameInMap("FileHash")
    public String fileHash;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The data source type. Valid values:</p>
     * <br>
     * <p>*   **machine**: host alerts</p>
     * <p>*   **object_scan**: file detection alerts</p>
     */
    @NameInMap("SourceType")
    public String sourceType;

    public static GetFileDetectReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileDetectReportRequest self = new GetFileDetectReportRequest();
        return TeaModel.build(map, self);
    }

    public GetFileDetectReportRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public GetFileDetectReportRequest setField(String field) {
        this.field = field;
        return this;
    }
    public String getField() {
        return this.field;
    }

    public GetFileDetectReportRequest setFileHash(String fileHash) {
        this.fileHash = fileHash;
        return this;
    }
    public String getFileHash() {
        return this.fileHash;
    }

    public GetFileDetectReportRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetFileDetectReportRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
