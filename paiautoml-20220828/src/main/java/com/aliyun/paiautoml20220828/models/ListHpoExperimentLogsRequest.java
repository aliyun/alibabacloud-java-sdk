// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentLogsRequest extends TeaModel {
    @NameInMap("LogName")
    public String logName;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListHpoExperimentLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHpoExperimentLogsRequest self = new ListHpoExperimentLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListHpoExperimentLogsRequest setLogName(String logName) {
        this.logName = logName;
        return this;
    }
    public String getLogName() {
        return this.logName;
    }

    public ListHpoExperimentLogsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListHpoExperimentLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
