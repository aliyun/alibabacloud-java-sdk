// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class GetLineageInfoParams extends TeaModel {
    @NameInMap("depth")
    public Long depth;

    @NameInMap("direction")
    public String direction;

    @NameInMap("id")
    public String id;

    @NameInMap("idType")
    public String idType;

    @NameInMap("isColumnLevel")
    public Boolean isColumnLevel;

    @NameInMap("isTemporary")
    public Boolean isTemporary;

    @NameInMap("namespace")
    public String namespace;

    @NameInMap("workspace")
    public String workspace;

    public static GetLineageInfoParams build(java.util.Map<String, ?> map) throws Exception {
        GetLineageInfoParams self = new GetLineageInfoParams();
        return TeaModel.build(map, self);
    }

    public GetLineageInfoParams setDepth(Long depth) {
        this.depth = depth;
        return this;
    }
    public Long getDepth() {
        return this.depth;
    }

    public GetLineageInfoParams setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public GetLineageInfoParams setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetLineageInfoParams setIdType(String idType) {
        this.idType = idType;
        return this;
    }
    public String getIdType() {
        return this.idType;
    }

    public GetLineageInfoParams setIsColumnLevel(Boolean isColumnLevel) {
        this.isColumnLevel = isColumnLevel;
        return this;
    }
    public Boolean getIsColumnLevel() {
        return this.isColumnLevel;
    }

    public GetLineageInfoParams setIsTemporary(Boolean isTemporary) {
        this.isTemporary = isTemporary;
        return this;
    }
    public Boolean getIsTemporary() {
        return this.isTemporary;
    }

    public GetLineageInfoParams setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetLineageInfoParams setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
