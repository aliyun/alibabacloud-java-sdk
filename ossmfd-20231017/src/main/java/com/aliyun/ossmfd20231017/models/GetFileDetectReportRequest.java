// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossmfd20231017.models;

import com.aliyun.tea.*;

public class GetFileDetectReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>100******</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <strong>example:</strong>
     * <p>Basic,ThreatTypes,Intelligences,Sandbox</p>
     */
    @NameInMap("Field")
    public String field;

    /**
     * <strong>example:</strong>
     * <p>7ab4ee98d535623991bc178718******</p>
     */
    @NameInMap("FileHash")
    public String fileHash;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>object_scan</p>
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
