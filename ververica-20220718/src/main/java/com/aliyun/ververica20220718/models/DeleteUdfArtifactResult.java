// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteUdfArtifactResult extends TeaModel {
    @NameInMap("deleteSuccess")
    public Boolean deleteSuccess;

    @NameInMap("message")
    public String message;

    @NameInMap("referencedClasses")
    public java.util.List<UdfClass> referencedClasses;

    public static DeleteUdfArtifactResult build(java.util.Map<String, ?> map) throws Exception {
        DeleteUdfArtifactResult self = new DeleteUdfArtifactResult();
        return TeaModel.build(map, self);
    }

    public DeleteUdfArtifactResult setDeleteSuccess(Boolean deleteSuccess) {
        this.deleteSuccess = deleteSuccess;
        return this;
    }
    public Boolean getDeleteSuccess() {
        return this.deleteSuccess;
    }

    public DeleteUdfArtifactResult setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteUdfArtifactResult setReferencedClasses(java.util.List<UdfClass> referencedClasses) {
        this.referencedClasses = referencedClasses;
        return this;
    }
    public java.util.List<UdfClass> getReferencedClasses() {
        return this.referencedClasses;
    }

}
