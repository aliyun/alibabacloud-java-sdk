// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ListResourceTypesRequest extends TeaModel {
    /**
     * <p>The entity type. Valid values:</p>
     * <br>
     * <p>*   All: all types of resources.</p>
     * <p>*   Resource (default): regular resources. For more information, see [Resources](~~28863~~).</p>
     * <p>*   DataSource: DataSource resources. For more information, see [DataSource resources](~~404753~~).</p>
     * <p>*   Module: modules.</p>
     */
    @NameInMap("EntityType")
    public String entityType;

    /**
     * <p>The provider of the resource type. Valid values:</p>
     * <br>
     * <p>*   ROS (default): The resource type is provided by Resource Orchestration Service (ROS).</p>
     * <p>*   Self: The resource type is provided by you.</p>
     */
    @NameInMap("Provider")
    public String provider;

    /**
     * <p>The resource type. The resource type can contain letters, digits, colons (:), and asterisks (\*). You can use an asterisk (\*) to perform a fuzzy match.</p>
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
