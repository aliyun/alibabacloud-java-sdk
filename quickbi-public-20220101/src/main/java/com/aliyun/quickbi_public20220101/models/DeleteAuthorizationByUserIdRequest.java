// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DeleteAuthorizationByUserIdRequest extends TeaModel {
    /**
     * <p>The Quick BI user ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cc4b***94fa4</p>
     */
    @NameInMap("QbiUserId")
    public String qbiUserId;

    /**
     * <p>The resource ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>al*************7ufv</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the resource. Valid values:</p>
     * <ul>
     * <li>dashboard: dashboard</li>
     * <li>report: workbook</li>
     * <li>dashboardOfflineQuery: self-service data retrieval</li>
     * <li>cube: dataset</li>
     * <li>datasource: data source</li>
     * <li>screen: data dashboard</li>
     * <li>ANALYSIS: ad hoc analysis</li>
     * <li>dataForm: data entry form</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>report</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static DeleteAuthorizationByUserIdRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAuthorizationByUserIdRequest self = new DeleteAuthorizationByUserIdRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAuthorizationByUserIdRequest setQbiUserId(String qbiUserId) {
        this.qbiUserId = qbiUserId;
        return this;
    }
    public String getQbiUserId() {
        return this.qbiUserId;
    }

    public DeleteAuthorizationByUserIdRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public DeleteAuthorizationByUserIdRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
