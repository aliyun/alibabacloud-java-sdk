// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectEventRequest extends TeaModel {
    @NameInMap("AnalyzeResult")
    public String analyzeResult;

    /**
     * <p>The page number of the current page in a paged query. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The unique identifier of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>0a212417e65c26ff133cfff28f6c****</p>
     */
    @NameInMap("HashKey")
    public String hashKey;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return on each page in a paged query. This parameter is used for paging.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The parent process path.</p>
     * 
     * <strong>example:</strong>
     * <p>/bin/bash</p>
     */
    @NameInMap("ParentProcessPath")
    public String parentProcessPath;

    /**
     * <p>The process path.</p>
     * 
     * <strong>example:</strong>
     * <p>/test</p>
     */
    @NameInMap("ProcessPath")
    public String processPath;

    /**
     * <p>The filter condition. You can filter by instance name or IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.167.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The event status. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Unhandled.</li>
     * <li><strong>2</strong>: Blocked.</li>
     * <li><strong>3</strong>: Ignored.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The UUID of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>18b7336e-d469-473b-af83-8e5420f9****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListUnknownThreatDetectEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectEventRequest self = new ListUnknownThreatDetectEventRequest();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectEventRequest setAnalyzeResult(String analyzeResult) {
        this.analyzeResult = analyzeResult;
        return this;
    }
    public String getAnalyzeResult() {
        return this.analyzeResult;
    }

    public ListUnknownThreatDetectEventRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUnknownThreatDetectEventRequest setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public ListUnknownThreatDetectEventRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ListUnknownThreatDetectEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUnknownThreatDetectEventRequest setParentProcessPath(String parentProcessPath) {
        this.parentProcessPath = parentProcessPath;
        return this;
    }
    public String getParentProcessPath() {
        return this.parentProcessPath;
    }

    public ListUnknownThreatDetectEventRequest setProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }
    public String getProcessPath() {
        return this.processPath;
    }

    public ListUnknownThreatDetectEventRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListUnknownThreatDetectEventRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ListUnknownThreatDetectEventRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
