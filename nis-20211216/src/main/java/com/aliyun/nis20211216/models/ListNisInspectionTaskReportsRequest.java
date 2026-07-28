// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionTaskReportsRequest extends TeaModel {
    /**
     * <p>The ID of the inspection task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ni-8svmpe0yso2bhzr7fh79</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. You do not need to specify this parameter for the first query.</p>
     * 
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml194Cz/lMNdmr+DEh0th6dVlNEo/F148UPCh2itDku7Qj</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    public static ListNisInspectionTaskReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionTaskReportsRequest self = new ListNisInspectionTaskReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionTaskReportsRequest setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    public ListNisInspectionTaskReportsRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNisInspectionTaskReportsRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

}
