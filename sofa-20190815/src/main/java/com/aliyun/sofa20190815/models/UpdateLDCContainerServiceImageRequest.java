// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLDCContainerServiceImageRequest extends TeaModel {
    @NameInMap("Image")
    public String image;

    @NameInMap("Name")
    public String name;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Operator")
    public String operator;

    @NameInMap("Revision")
    public String revision;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    public static UpdateLDCContainerServiceImageRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLDCContainerServiceImageRequest self = new UpdateLDCContainerServiceImageRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLDCContainerServiceImageRequest setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public UpdateLDCContainerServiceImageRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateLDCContainerServiceImageRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UpdateLDCContainerServiceImageRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public UpdateLDCContainerServiceImageRequest setRevision(String revision) {
        this.revision = revision;
        return this;
    }
    public String getRevision() {
        return this.revision;
    }

    public UpdateLDCContainerServiceImageRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

}
