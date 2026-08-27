// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    /**
     * <p>The entity type. Valid values:  </p>
     * <ul>
     * <li><p>All: all resource types.</p>
     * </li>
     * <li><p>Resource (default): regular resource types. For more information, see <a href="https://help.aliyun.com/document_detail/28863.html">Resources</a>.</p>
     * </li>
     * <li><p>DataSource: data source resource types. For more information, see <a href="https://help.aliyun.com/document_detail/404753.html">Data source resources</a>.</p>
     * </li>
     * <li><p>Module: modules.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The resource type provider. Valid values:</p>
     * <ul>
     * <li>ROS (default): Resource Orchestration Service.</li>
     * <li>Self: the user.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ROS</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The resource type. The value can contain uppercase and lowercase letters, digits, colons (:), and asterisks (\*). If an asterisk is used, fuzzy match is performed.</p>
     * 
     * <strong>example:</strong>
     * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ListResourceTypesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesRequest self = new ListResourceTypesRequest();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesRequest setEntityType(String entityType) {
        this.entityType = entityType;
        return this;
    }
    public String getEntityType() {
        return this.entityType;
    }

    public ListResourceTypesRequest setProvider(String provider) {
        this.provider = provider;
        return this;
    }
    public String getProvider() {
        return this.provider;
    }

    public ListResourceTypesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
