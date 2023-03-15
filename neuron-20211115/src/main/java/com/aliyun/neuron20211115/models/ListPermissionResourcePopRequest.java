// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourcePopRequest extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("operatorType")
    public String operatorType;

    @NameInMap("resourcePrefix")
    public String resourcePrefix;

    public static ListPermissionResourcePopRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourcePopRequest self = new ListPermissionResourcePopRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourcePopRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListPermissionResourcePopRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListPermissionResourcePopRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ListPermissionResourcePopRequest setResourcePrefix(String resourcePrefix) {
        this.resourcePrefix = resourcePrefix;
        return this;
    }
    public String getResourcePrefix() {
        return this.resourcePrefix;
    }

}
