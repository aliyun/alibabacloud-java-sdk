// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteServiceMeshRequest extends TeaModel {
    /**
     * <p>A JSON string that can be parsed into a string array. You can use this JSON string to specify the IDs of the resource instances that need to be retained when the ASM instance is deleted.</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RetainResources")
    public String retainResources;

    /**
     * <p>Specifies whether to forcibly delete the ASM instance. Valid values:</p>
     * <br>
     * <p>*   `true`: forcibly deletes the ASM instance.</p>
     * <p>*   `false`: does not forcibly delete the ASM instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ServiceMeshId")
    public String serviceMeshId;

    public static DeleteServiceMeshRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceMeshRequest self = new DeleteServiceMeshRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceMeshRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteServiceMeshRequest setRetainResources(String retainResources) {
        this.retainResources = retainResources;
        return this;
    }
    public String getRetainResources() {
        return this.retainResources;
    }

    public DeleteServiceMeshRequest setServiceMeshId(String serviceMeshId) {
        this.serviceMeshId = serviceMeshId;
        return this;
    }
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

}
