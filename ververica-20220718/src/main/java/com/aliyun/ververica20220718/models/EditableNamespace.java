// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class EditableNamespace extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Role")
    public String role;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static EditableNamespace build(java.util.Map<String, ?> map) throws Exception {
        EditableNamespace self = new EditableNamespace();
        return TeaModel.build(map, self);
    }

    public EditableNamespace setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public EditableNamespace setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public EditableNamespace setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
