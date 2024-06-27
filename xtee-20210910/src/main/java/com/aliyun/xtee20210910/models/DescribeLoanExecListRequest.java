// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeLoanExecListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("batchNo")
    public String batchNo;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("monitorObj")
    public String monitorObj;

    @NameInMap("monitorStatus")
    public String monitorStatus;

    @NameInMap("pageSize")
    public String pageSize;

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
