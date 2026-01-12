// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class ListProjectsByDependencyIdRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DependencyProjectId")
    public Long dependencyProjectId;

    @NameInMap("JwtToken")
    public String jwtToken;

    @NameInMap("MapUuid")
    public String mapUuid;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WithDataset")
    public Boolean withDataset;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WithSource")
    public Boolean withSource;

    public static ListProjectsByDependencyIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsByDependencyIdRequest self = new ListProjectsByDependencyIdRequest();
        return TeaModel.build(map, self);
    }

    public ListProjectsByDependencyIdRequest setDependencyProjectId(Long dependencyProjectId) {
        this.dependencyProjectId = dependencyProjectId;
        return this;
    }
    public Long getDependencyProjectId() {
        return this.dependencyProjectId;
    }

    public ListProjectsByDependencyIdRequest setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
        return this;
    }
    public String getJwtToken() {
        return this.jwtToken;
    }

    public ListProjectsByDependencyIdRequest setMapUuid(String mapUuid) {
        this.mapUuid = mapUuid;
        return this;
    }
    public String getMapUuid() {
        return this.mapUuid;
    }

    public ListProjectsByDependencyIdRequest setWithDataset(Boolean withDataset) {
        this.withDataset = withDataset;
        return this;
    }
    public Boolean getWithDataset() {
        return this.withDataset;
    }

    public ListProjectsByDependencyIdRequest setWithSource(Boolean withSource) {
        this.withSource = withSource;
        return this;
    }
    public Boolean getWithSource() {
        return this.withSource;
    }

}
