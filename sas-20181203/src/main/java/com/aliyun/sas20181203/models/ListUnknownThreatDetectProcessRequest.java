// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListUnknownThreatDetectProcessRequest extends TeaModel {
    /**
     * <p>The analysis result. Valid values:</p>
     * <ul>
     * <li><p><strong>black</strong>: abnormal process</p>
     * </li>
     * <li><p><strong>white</strong>: normal process</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>white</p>
     */
    @NameInMap("AnalyzeResult")
    public String analyzeResult;

    /**
     * <p>The page number to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end of the time range for the first detection, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1768891966345</p>
     */
    @NameInMap("FirstTimeEnd")
    public Long firstTimeEnd;

    /**
     * <p>The start of the time range for the first detection, in milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1768891966344</p>
     */
    @NameInMap("FirstTimeStart")
    public Long firstTimeStart;

    /**
     * <p>The MD5 value of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>0552c44e243abdea1729d4507bce****</p>
     */
    @NameInMap("Md5")
    public String md5;

    /**
     * <p>The number of entries to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The file path.</p>
     * 
     * <strong>example:</strong>
     * <p>/etc/test</p>
     */
    @NameInMap("Path")
    public String path;

    /**
     * <p>The process path.</p>
     * 
     * <strong>example:</strong>
     * <p>/bin/rm</p>
     */
    @NameInMap("ProcessPath")
    public String processPath;

    /**
     * <p>The server name or IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>172.20.XX.XX</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The SHA-256 value of the file.</p>
     * 
     * <strong>example:</strong>
     * <p>f204693a7d2ce99d6c4434e550d985ee1c7be7cb5dd9a76094369af0d2******</p>
     */
    @NameInMap("Sha256")
    public String sha256;

    /**
     * <p>The UUID of the server to query.</p>
     * 
     * <strong>example:</strong>
     * <p>50d213b4-3a35-427a-b8a5-04b0c7e1****</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static ListUnknownThreatDetectProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUnknownThreatDetectProcessRequest self = new ListUnknownThreatDetectProcessRequest();
        return TeaModel.build(map, self);
    }

    public ListUnknownThreatDetectProcessRequest setAnalyzeResult(String analyzeResult) {
        this.analyzeResult = analyzeResult;
        return this;
    }
    public String getAnalyzeResult() {
        return this.analyzeResult;
    }

    public ListUnknownThreatDetectProcessRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListUnknownThreatDetectProcessRequest setFirstTimeEnd(Long firstTimeEnd) {
        this.firstTimeEnd = firstTimeEnd;
        return this;
    }
    public Long getFirstTimeEnd() {
        return this.firstTimeEnd;
    }

    public ListUnknownThreatDetectProcessRequest setFirstTimeStart(Long firstTimeStart) {
        this.firstTimeStart = firstTimeStart;
        return this;
    }
    public Long getFirstTimeStart() {
        return this.firstTimeStart;
    }

    public ListUnknownThreatDetectProcessRequest setMd5(String md5) {
        this.md5 = md5;
        return this;
    }
    public String getMd5() {
        return this.md5;
    }

    public ListUnknownThreatDetectProcessRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListUnknownThreatDetectProcessRequest setPath(String path) {
        this.path = path;
        return this;
    }
    public String getPath() {
        return this.path;
    }

    public ListUnknownThreatDetectProcessRequest setProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }
    public String getProcessPath() {
        return this.processPath;
    }

    public ListUnknownThreatDetectProcessRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public ListUnknownThreatDetectProcessRequest setSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }
    public String getSha256() {
        return this.sha256;
    }

    public ListUnknownThreatDetectProcessRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
