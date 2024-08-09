// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class UpdateUdfArtifactResult extends TeaModel {
    @NameInMap("collidingClasses")
    public java.util.List<UdfClass> collidingClasses;

    @NameInMap("message")
    public String message;

    @NameInMap("missingClasses")
    public java.util.List<UdfClass> missingClasses;

    @NameInMap("udfArtifact")
    public UdfArtifact udfArtifact;

    @NameInMap("updateSuccess")
    public Boolean updateSuccess;

    public static UpdateUdfArtifactResult build(java.util.Map<String, ?> map) throws Exception {
        UpdateUdfArtifactResult self = new UpdateUdfArtifactResult();
        return TeaModel.build(map, self);
    }

    public UpdateUdfArtifactResult setCollidingClasses(java.util.List<UdfClass> collidingClasses) {
        this.collidingClasses = collidingClasses;
        return this;
    }
    public java.util.List<UdfClass> getCollidingClasses() {
        return this.collidingClasses;
    }

    public UpdateUdfArtifactResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateUdfArtifactResult setMissingClasses(java.util.List<UdfClass> missingClasses) {
        this.missingClasses = missingClasses;
        return this;
    }
    public java.util.List<UdfClass> getMissingClasses() {
        return this.missingClasses;
    }

    public UpdateUdfArtifactResult setUdfArtifact(UdfArtifact udfArtifact) {
        this.udfArtifact = udfArtifact;
        return this;
    }
    public UdfArtifact getUdfArtifact() {
        return this.udfArtifact;
    }

    public UpdateUdfArtifactResult setUpdateSuccess(Boolean updateSuccess) {
        this.updateSuccess = updateSuccess;
        return this;
    }
    public Boolean getUpdateSuccess() {
        return this.updateSuccess;
    }

}
