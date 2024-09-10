// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAgentlessMaliciousFilesRequest extends TeaModel {
    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Specifies whether the vulnerability is handled. Valid values:</p>
     * <ul>
     * <li>Y: The vulnerability is handled.</li>
     * <li>N: The vulnerability is not handled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("Dealed")
    public String dealed;

    /**
     * <p>The event ID.</p>
     * 
     * <strong>example:</strong>
     * <p>81****</p>
     */
    @NameInMap("EventId")
    public Long eventId;

    /**
     * <p>The name of the malicious file that you want to query.</p>
     * <blockquote>
     * <p>Fuzzy match is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WebShell</p>
     */
    @NameInMap("FuzzyMaliciousName")
    public String fuzzyMaliciousName;

    /**
     * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The severities of the malicious files. Separate multiple values with commas (,). Valid values:</p>
     * <ul>
     * <li>serious</li>
     * <li>suspicious</li>
     * <li>remind</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>remind,suspicious</p>
     */
    @NameInMap("Levels")
    public String levels;

    /**
     * <p>The MD5 hash value of the malicious file.</p>
     * 
     * <strong>example:</strong>
     * <p>d836968041f7683b5459****</p>
     */
    @NameInMap("MaliciousMd5")
    public String maliciousMd5;

    /**
     * <p>The alert type.</p>
     * <p>Valid values when Lang is set to zh:</p>
     * <ul>
     * <li>WebShell</li>
     * <li>Malicious Software</li>
     * <li>Malicious Script</li>
     * </ul>
     * <p>Valid values when Lang is set to en:</p>
     * <ul>
     * <li>WebShell</li>
     * <li>Malicious Software</li>
     * <li>Malicious Script</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WebShell</p>
     */
    @NameInMap("MaliciousType")
    public String maliciousType;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The remarks for the asset affected by the vulnerability. The value can be the private IP address, public IP address, or name of the asset. Fuzzy match is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The source of the malicious file.</p>
     */
    @NameInMap("ScanRange")
    public java.util.List<String> scanRange;

    /**
     * <p>The UUID of the asset.</p>
     * 
     * <strong>example:</strong>
     * <p>d2d94e8b-bb25-4744-8004-1e08a53c****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListAgentlessMaliciousFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentlessMaliciousFilesRequest self = new ListAgentlessMaliciousFilesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentlessMaliciousFilesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListAgentlessMaliciousFilesRequest setDealed(String dealed) {
        this.dealed = dealed;
        return this;
    }
    public String getDealed() {
        return this.dealed;
    }

    public ListAgentlessMaliciousFilesRequest setEventId(Long eventId) {
        this.eventId = eventId;
        return this;
    }
    public Long getEventId() {
        return this.eventId;
    }

    public ListAgentlessMaliciousFilesRequest setFuzzyMaliciousName(String fuzzyMaliciousName) {
        this.fuzzyMaliciousName = fuzzyMaliciousName;
        return this;
    }
    public String getFuzzyMaliciousName() {
        return this.fuzzyMaliciousName;
    }

    public ListAgentlessMaliciousFilesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListAgentlessMaliciousFilesRequest setLevels(String levels) {
        this.levels = levels;
        return this;
    }
    public String getLevels() {
        return this.levels;
    }

    public ListAgentlessMaliciousFilesRequest setMaliciousMd5(String maliciousMd5) {
        this.maliciousMd5 = maliciousMd5;
        return this;
    }
    public String getMaliciousMd5() {
        return this.maliciousMd5;
    }

    public ListAgentlessMaliciousFilesRequest setMaliciousType(String maliciousType) {
        this.maliciousType = maliciousType;
        return this;
    }
    public String getMaliciousType() {
        return this.maliciousType;
    }

    public ListAgentlessMaliciousFilesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAgentlessMaliciousFilesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListAgentlessMaliciousFilesRequest setScanRange(java.util.List<String> scanRange) {
        this.scanRange = scanRange;
        return this;
    }
    public java.util.List<String> getScanRange() {
        return this.scanRange;
    }

    public ListAgentlessMaliciousFilesRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
