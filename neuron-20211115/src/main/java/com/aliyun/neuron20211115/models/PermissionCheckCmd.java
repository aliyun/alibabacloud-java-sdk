// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class PermissionCheckCmd extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("operatorType")
    public String operatorType;

    @NameInMap("resource")
    public String resource;

    public static PermissionCheckCmd build(java.util.Map<String, ?> map) throws Exception {
        PermissionCheckCmd self = new PermissionCheckCmd();
        return TeaModel.build(map, self);
    }

    public PermissionCheckCmd setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public PermissionCheckCmd setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public PermissionCheckCmd setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public PermissionCheckCmd setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

}
