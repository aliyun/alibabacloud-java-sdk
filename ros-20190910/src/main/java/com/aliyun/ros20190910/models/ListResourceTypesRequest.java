// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    /**
     * <p>The entity type. Valid values:</p>
     * <ul>
     * <li>All: all types of resources.</li>
     * <li>Resource (default): regular resources. For more information, see <a href="https://help.aliyun.com/document_detail/28863.html">Resources</a>.</li>
     * <li>DataSource: DataSource resources. For more information, see <a href="https://help.aliyun.com/document_detail/404753.html">DataSource resources</a>.</li>
     * <li>Module: modules.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Resource</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The provider of the resource type. Valid values:</p>
     * <ul>
     * <li>ROS (default): The resource type is provided by Resource Orchestration Service (ROS).</li>
     * <li>Self: The resource type is provided by you.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ROS</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The resource type. The resource type can contain letters, digits, colons (:), and asterisks (\<em>). You can use an asterisk (\</em>) to perform a fuzzy match.</p>
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
