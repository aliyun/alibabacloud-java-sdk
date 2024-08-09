// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class CreateUdfArtifactResult extends TeaModel {
    @NameInMap("collidingClasses")
    public java.util.List<UdfClass> collidingClasses;

    @NameInMap("createSuccess")
    public Boolean createSuccess;

    @NameInMap("message")
    public String message;

    @NameInMap("udfArtifact")
    public UdfArtifact udfArtifact;

    public static CreateUdfArtifactResult build(java.util.Map<String, ?> map) throws Exception {
        CreateUdfArtifactResult self = new CreateUdfArtifactResult();
        return TeaModel.build(map, self);
    }

    public CreateUdfArtifactResult setCollidingClasses(java.util.List<UdfClass> collidingClasses) {
        this.collidingClasses = collidingClasses;
        return this;
    }
    public java.util.List<UdfClass> getCollidingClasses() {
        return this.collidingClasses;
    }

    public CreateUdfArtifactResult setCreateSuccess(Boolean createSuccess) {
        this.createSuccess = createSuccess;
        return this;
    }
    public Boolean getCreateSuccess() {
        return this.createSuccess;
    }

    public CreateUdfArtifactResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUdfArtifactResult setUdfArtifact(UdfArtifact udfArtifact) {
        this.udfArtifact = udfArtifact;
        return this;
    }
    public UdfArtifact getUdfArtifact() {
        return this.udfArtifact;
    }

}
