// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypeRegistrationsRequest extends TeaModel {
    /**
     * <p>The entity type. Set the value to Module.</p>
     * 
     * <strong>example:</strong>
     * <p>Module</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The page number. Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the registration record.</p>
     * 
     * <strong>example:</strong>
     * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
     */
    @NameInMap("RegistrationId")
    public String registrationId;

    /**
     * <p>The resource type. The resource type can contain letters, digits, colons (:), and asterisks (\<em>). You can use an asterisk (\</em>) to perform a fuzzy match.</p>
     * 
     * <strong>example:</strong>
     * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The registration state. Valid values:</p>
     * <ul>
     * <li>IN_PROGRESS</li>
     * <li>COMPLETE</li>
     * <li>FAILED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>COMPLETE</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListResourceTypeRegistrationsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypeRegistrationsRequest self = new ListResourceTypeRegistrationsRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypeRegistrationsRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListResourceTypeRegistrationsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListResourceTypeRegistrationsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListResourceTypeRegistrationsRequest setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    public String getRegistrationId() {
        return this.registrationId;
    }

    public ListResourceTypeRegistrationsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public ListResourceTypeRegistrationsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
