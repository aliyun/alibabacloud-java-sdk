// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class CreateAlgorithmRequest extends TeaModel {
    @NameInMap("AlgorithmDescription")
    public String algorithmDescription;

    @NameInMap("AlgorithmName")
    public String algorithmName;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static CreateAlgorithmRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAlgorithmRequest self = new CreateAlgorithmRequest();
        return TeaModel.build(map, self);
    }

    public CreateAlgorithmRequest setAlgorithmDescription(String algorithmDescription) {
        this.algorithmDescription = algorithmDescription;
        return this;
    }
    public String getAlgorithmDescription() {
        return this.algorithmDescription;
    }

    public CreateAlgorithmRequest setAlgorithmName(String algorithmName) {
        this.algorithmName = algorithmName;
        return this;
    }
    public String getAlgorithmName() {
        return this.algorithmName;
    }

    public CreateAlgorithmRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public CreateAlgorithmRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
