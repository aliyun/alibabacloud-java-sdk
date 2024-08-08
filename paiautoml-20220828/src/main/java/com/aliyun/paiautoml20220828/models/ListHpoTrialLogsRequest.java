// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoTrialLogsRequest extends TeaModel {
    /**
     * <p>Log file name.</p>
     * 
     * <strong>example:</strong>
     * <p>trial.log</p>
     */
    @NameInMap("LogName")
    public String logName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListHpoTrialLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHpoTrialLogsRequest self = new ListHpoTrialLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListHpoTrialLogsRequest setLogName(String logName) {
        this.logName = logName;
        return this;
    }
    public String getLogName() {
        return this.logName;
    }

    public ListHpoTrialLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHpoTrialLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
