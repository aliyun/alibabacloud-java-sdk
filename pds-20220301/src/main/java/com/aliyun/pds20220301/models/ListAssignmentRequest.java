// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAssignmentRequest extends TeaModel {
    @NameInMap("limit")
    public Integer limit;

    @NameInMap("manage_resource_id")
    public String manageResourceId;

    @NameInMap("manage_resource_type")
    public String manageResourceType;

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
