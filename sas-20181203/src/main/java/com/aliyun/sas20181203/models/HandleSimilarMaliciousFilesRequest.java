// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class HandleSimilarMaliciousFilesRequest extends TeaModel {
    /**
     * <p>The ID of the target alert.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The handling action. Valid values:</p>
     * <ul>
     * <li>addWhitelist: Adds the alert to the whitelist.</li>
     * <li>offWhitelist: Removes the alert from the whitelist.</li>
     * <li>offline_handled: Marks the alert as handled offline.</li>
     * <li>mark_mis_info: Submits the alert as a false positive.</li>
     * <li>ignore: Ignores the alert.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The file source. Valid values:</p>
     * <ul>
     * <li>agentless: Host detection.</li>
     * <li>ecs_snapshot: User snapshot detection.</li>
     * <li>ecs_image: Custom image detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("ScanRange")
    public String scanRange;

    /**
     * <p>The scenario for batch processing. Valid values:</p>
     * <ul>
     * <li>same_file_md5: The same file MD5.</li>
     * <li>default: The same alerting type. This is the default value.</li>
     * </ul>
     * 
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
