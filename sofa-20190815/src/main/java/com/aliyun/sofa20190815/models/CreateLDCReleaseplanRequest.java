// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateLDCReleaseplanRequest extends TeaModel {
    @NameInMap("IsAutoExecute")
    public Boolean isAutoExecute;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("OpsType")
    public String opsType;

    @NameInMap("Title")
    public String title;

    @NameInMap("WorkspaceGroup")
    public String workspaceGroup;

    @NameInMap("AppServices")
    public java.util.List<CreateLDCReleaseplanRequestAppServices> appServices;

    public static CreateLDCReleaseplanRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLDCReleaseplanRequest self = new CreateLDCReleaseplanRequest();
        return TeaModel.build(map, self);
    }

    public CreateLDCReleaseplanRequest setIsAutoExecute(Boolean isAutoExecute) {
        this.isAutoExecute = isAutoExecute;
        return this;
    }
    public Boolean getIsAutoExecute() {
        return this.isAutoExecute;
    }

    public CreateLDCReleaseplanRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateLDCReleaseplanRequest setOpsType(String opsType) {
        this.opsType = opsType;
        return this;
    }
    public String getOpsType() {
        return this.opsType;
    }

    public CreateLDCReleaseplanRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public CreateLDCReleaseplanRequest setWorkspaceGroup(String workspaceGroup) {
        this.workspaceGroup = workspaceGroup;
        return this;
    }
    public String getWorkspaceGroup() {
        return this.workspaceGroup;
    }

    public CreateLDCReleaseplanRequest setAppServices(java.util.List<CreateLDCReleaseplanRequestAppServices> appServices) {
        this.appServices = appServices;
        return this;
    }
    public java.util.List<CreateLDCReleaseplanRequestAppServices> getAppServices() {
        return this.appServices;
    }

    public static class CreateLDCReleaseplanRequestAppServices extends TeaModel {
        @NameInMap("Dependencies")
        public java.util.List<String> dependencies;

        @NameInMap("Name")
        public String name;

        @NameInMap("Revision")
        public String revision;

        public static CreateLDCReleaseplanRequestAppServices build(java.util.Map<String, ?> map) throws Exception {
            CreateLDCReleaseplanRequestAppServices self = new CreateLDCReleaseplanRequestAppServices();
            return TeaModel.build(map, self);
        }

        public CreateLDCReleaseplanRequestAppServices setDependencies(java.util.List<String> dependencies) {
            this.dependencies = dependencies;
            return this;
        }
        public java.util.List<String> getDependencies() {
            return this.dependencies;
        }

        public CreateLDCReleaseplanRequestAppServices setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateLDCReleaseplanRequestAppServices setRevision(String revision) {
            this.revision = revision;
            return this;
        }
        public String getRevision() {
            return this.revision;
        }

    }

}
