// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListAssignmentRequest extends TeaModel {
    /**
     * <p>The maximum number of resources to return. Value range: [1, 100].</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("limit")
    public Integer limit;

    /**
     * <p>The ID of the managed resource, such as a group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>105***b82</p>
     */
    @NameInMap("manage_resource_id")
    public String manageResourceId;

    /**
     * <p>The type of the managed resource. Supported values include:</p>
     * <ul>
     * <li><p>RT_Group (group)</p>
     * </li>
     * <li><p>RT_KnowledgeBase (knowledge base)</p>
     * </li>
     * <li><p>RT_KnowledgeCategory (knowledge category)</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RT_Group</p>
     */
    @NameInMap("manage_resource_type")
    public String manageResourceType;

    /**
     * <p>The pagination marker. The response lists items in alphabetical order, starting after the specified marker. If you omit this parameter, the list starts from the beginning. Default: none.</p>
     * 
     * <strong>example:</strong>
     * <p>NWQ1Yjk4YmI1ZDRlYmU1Y2E0YWE0NmJhYWJmODBhNDQ2NzhlMTRhMg</p>
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
