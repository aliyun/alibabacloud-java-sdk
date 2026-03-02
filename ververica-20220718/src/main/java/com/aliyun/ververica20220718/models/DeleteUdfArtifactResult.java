// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class DeleteUdfArtifactResult extends TeaModel {
    /**
     * <p>Indicates whether the JAR file was deleted.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deleteSuccess")
    public Boolean deleteSuccess;

    /**
     * <p>The message used to delete the JAR file.</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>All associated classes.</p>
     */
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
