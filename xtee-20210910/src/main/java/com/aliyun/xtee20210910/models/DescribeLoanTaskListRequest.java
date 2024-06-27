// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeLoanTaskListRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("batchNo")
    public String batchNo;

    @NameInMap("currentPage")
    public String currentPage;

    @NameInMap("monitorStatus")
    public String monitorStatus;

    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("regId")
    public String regId;

    public static DescribeLoanTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLoanTaskListRequest self = new DescribeLoanTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLoanTaskListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeLoanTaskListRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public DescribeLoanTaskListRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeLoanTaskListRequest setMonitorStatus(String monitorStatus) {
        this.monitorStatus = monitorStatus;
        return this;
    }
    public String getMonitorStatus() {
        return this.monitorStatus;
    }

    public DescribeLoanTaskListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeLoanTaskListRequest setRegId(String regId) {
        this.regId = regId;
        return this;
    }
    public String getRegId() {
        return this.regId;
    }

}
