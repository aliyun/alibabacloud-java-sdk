// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class DeleteInstanceAclRequest extends TeaModel {
    /**
     * <p>The name of the resource on which the permissions are granted.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("resourceName")
    public String resourceName;

    /**
     * <p>The type of the resource on which the permissions are granted.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>Group</li>
     * <li>Topic</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Topic</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static DeleteInstanceAclRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceAclRequest self = new DeleteInstanceAclRequest();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceAclRequest setResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }
    public String getResourceName() {
        return this.resourceName;
    }

    public DeleteInstanceAclRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
