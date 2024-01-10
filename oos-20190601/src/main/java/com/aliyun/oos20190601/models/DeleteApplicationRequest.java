// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class DeleteApplicationRequest extends TeaModel {
    /**
     * <p>Specifies whether to forcibly delete the application. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("Force")
    public Boolean force;

    /**
     * <p>The application name.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID. Set the value to cn-hangzhou.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to retain resources created by application manager when deleting the application. Valid values:</p>
     * <p>- true</p>
     * <p>- false</p>
     */
    @NameInMap("RetainResource")
    public Boolean retainResource;

    public static DeleteApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationRequest self = new DeleteApplicationRequest();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationRequest setForce(Boolean force) {
        this.force = force;
        return this;
    }
    public Boolean getForce() {
        return this.force;
    }

    public DeleteApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DeleteApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteApplicationRequest setRetainResource(Boolean retainResource) {
        this.retainResource = retainResource;
        return this;
    }
    public Boolean getRetainResource() {
        return this.retainResource;
    }

}
