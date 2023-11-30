// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAssignmentRequest extends TeaModel {
    /**
     * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
     * <br>
     * <p>The number of returned results must be less than or equal to the specified number.</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The ID of the managed resource, such as a group ID.</p>
     */
    @NameInMap("manage_resource_id")
    public String manageResourceId;

    /**
     * <p>The type of the managed resource. Set the value to RT_Group, which specifies that the administrators of a group are queried.</p>
     */
    @NameInMap("manage_resource_type")
    public String manageResourceType;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of marker. By default, this parameter is empty.</p>
     */
    @NameInMap("marker")
    public String marker;

    public static ListAssignmentRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAssignmentRequest self = new ListAssignmentRequest();
        return TeaModel.build(map, self);
    }

    public ListAssignmentRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public ListAssignmentRequest setManageResourceId(String manageResourceId) {
        this.manageResourceId = manageResourceId;
        return this;
    }
    public String getManageResourceId() {
        return this.manageResourceId;
    }

    public ListAssignmentRequest setManageResourceType(String manageResourceType) {
        this.manageResourceType = manageResourceType;
        return this;
    }
    public String getManageResourceType() {
        return this.manageResourceType;
    }

    public ListAssignmentRequest setMarker(String marker) {
        this.marker = marker;
        return this;
    }
    public String getMarker() {
        return this.marker;
    }

}
