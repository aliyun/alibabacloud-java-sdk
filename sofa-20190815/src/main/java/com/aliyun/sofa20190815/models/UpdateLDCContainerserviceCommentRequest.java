// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCContainerserviceCommentRequest extends TeaModel {
    @NameInMap("Comment")
    public String comment;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCContainerserviceCommentRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCContainerserviceCommentRequest self = new UpdateLDCContainerserviceCommentRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCContainerserviceCommentRequest setComment(String comment) {
        this.comment = comment;
        return this;
    }
    public String getComment() {
        return this.comment;
    }

    public UpdateLDCContainerserviceCommentRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCContainerserviceCommentRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateLDCContainerserviceCommentRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateLDCContainerserviceCommentRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
