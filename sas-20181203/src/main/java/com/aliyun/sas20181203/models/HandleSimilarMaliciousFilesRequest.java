// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarMaliciousFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("ScanRange")
    public String scanRange;

    /**
     * <strong>example:</strong>
     * <p>same_file_md5</p>
     */
    @NameInMap("Scenario")
    public String scenario;

    public static HandleSimilarMaliciousFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        HandleSimilarMaliciousFilesRequest self = new HandleSimilarMaliciousFilesRequest();
        return TeaModel.build(map, self);
    }

    public HandleSimilarMaliciousFilesRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public HandleSimilarMaliciousFilesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public HandleSimilarMaliciousFilesRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public HandleSimilarMaliciousFilesRequest setScanRange(String scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public String getScanRange() {
        return this.scanRange;
    }

    public HandleSimilarMaliciousFilesRequest setScenario(String scenario) {
        this.scenario = scenario;
        return this;
    }
    public String getScenario() {
        return this.scenario;
    }

}
