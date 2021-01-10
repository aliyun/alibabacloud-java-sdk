// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UploadLinkeantcodeAntcodeNamespaceprojectuploadsRequest extends TeaModel {
    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("Project")
    public String project;

    @NameInMap("RequestGitOperate")
    public String requestGitOperate;

    public static UploadLinkeantcodeAntcodeNamespaceprojectuploadsRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadLinkeantcodeAntcodeNamespaceprojectuploadsRequest self = new UploadLinkeantcodeAntcodeNamespaceprojectuploadsRequest();
        return TeaModel.build(map, self);
    }

    public UploadLinkeantcodeAntcodeNamespaceprojectuploadsRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public UploadLinkeantcodeAntcodeNamespaceprojectuploadsRequest setProject(String project) {
        this.project = project;
        return this;
    }
    public String getProject() {
        return this.project;
    }

    public UploadLinkeantcodeAntcodeNamespaceprojectuploadsRequest setRequestGitOperate(String requestGitOperate) {
        this.requestGitOperate = requestGitOperate;
        return this;
    }
    public String getRequestGitOperate() {
        return this.requestGitOperate;
    }

}
