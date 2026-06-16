// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeLoanExecListRequest extends TeaModel {
    /**
     * <p>The language type for sending requests and receiving responses. Default value: <strong>zh</strong>. Valid values:</p>
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
     * <p>The import batch number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("batchNo")
    public String batchNo;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public String currentPage;

    /**
     * <p>The monitoring metric data.</p>
     * 
     * <strong>example:</strong>
     * <p>de_afghcf6411</p>
     */
    @NameInMap("monitorObj")
    public String monitorObj;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>WAIT</p>
     */
    @NameInMap("monitorStatus")
    public String monitorStatus;

    /**
     * <p>The number of entries per page. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("regId")
    public String regId;

    public static DescribeLoanExecListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoanExecListRequest self = new DescribeLoanExecListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoanExecListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeLoanExecListRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public DescribeLoanExecListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeLoanExecListRequest setMonitorObj(String monitorObj) {
        this.monitorObj = monitorObj;
        return this;
    }
    public String getMonitorObj() {
        return this.monitorObj;
    }

    public DescribeLoanExecListRequest setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public DescribeLoanExecListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLoanExecListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
