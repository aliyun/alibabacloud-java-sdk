// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentLogsRequest extends TeaModel {
    /**
     * <p>Log name to be listed.</p>
     * 
     * <strong>example:</strong>
     * <p>nnimanager.log</p>
     */
    @NameInMap("LogName")
    public String logName;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
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
