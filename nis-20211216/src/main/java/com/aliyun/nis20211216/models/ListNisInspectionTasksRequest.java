// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nis20211216.models;

import com.aliyun.tea.*;

public class ListNisInspectionTasksRequest extends TeaModel {
    /**
     * <p>The name of the network inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>NIS inspection</p>
     */
    @NameInMap("InspectionName")
    public String inspectionName;

    /**
     * <p>The type of inspection solution that the network inspection task uses. Valid values: basic and customized.</p>
     * 
     * <strong>example:</strong>
     * <p>basic</p>
     */
    @NameInMap("InspectionProject")
    public String inspectionProject;

    /**
     * <p>The ID of the network inspection task.</p>
     * 
     * <strong>example:</strong>
     * <p>ni-8svm******hzr7fh79</p>
     */
    @NameInMap("InspectionTaskId")
    public String inspectionTaskId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token that is used to retrieve the next page of results. Set this parameter to the NextToken value returned from a previous call.</p>
     * 
     * <strong>example:</strong>
     * <p>hKrS+MVXkuOgztXnvdml1/R9jhHkiH8eW3CfaOYU0CEL7yiT0zae6J8v1zYNg+d1</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The running status of the task. Valid values:</p>
     * <ul>
     * <li><p>Creating</p>
     * </li>
     * <li><p>Active</p>
     * </li>
     * <li><p>Running</p>
     * </li>
     * <li><p>Inactive</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Active</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListNisInspectionTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNisInspectionTasksRequest self = new ListNisInspectionTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListNisInspectionTasksRequest setInspectionName(String inspectionName) {
        this.inspectionName = inspectionName;
        return this;
    }
    public String getInspectionName() {
        return this.inspectionName;
    }

    public ListNisInspectionTasksRequest setInspectionProject(String inspectionProject) {
        this.inspectionProject = inspectionProject;
        return this;
    }
    public String getInspectionProject() {
        return this.inspectionProject;
    }

    public ListNisInspectionTasksRequest setInspectionTaskId(String inspectionTaskId) {
        this.inspectionTaskId = inspectionTaskId;
        return this;
    }
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    public ListNisInspectionTasksRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNisInspectionTasksRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNisInspectionTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
