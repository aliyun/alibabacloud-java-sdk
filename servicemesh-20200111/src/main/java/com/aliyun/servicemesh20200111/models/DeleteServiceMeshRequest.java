// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteServiceMeshRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly delete the ASM instance. Valid values:</p>
     * <ul>
     * <li><code>true</code>: forcibly deletes the ASM instance.</li>
     * <li><code>false</code>: does not forcibly delete the ASM instance.</li>
     * </ul>
     * <p>Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>A JSON string that can be parsed into a string array. You can use this JSON string to specify the IDs of the resource instances that need to be retained when the ASM instance is deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot; lb-bp1fxvl3q8akbj6m*****&quot;, &quot;lb-bp1hoxkolggdw0y3*****&quot;]</p>
     */
    @NameInMap("RetainResources")
    public String retainResources;

    /**
     * <p>The ASM instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
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
