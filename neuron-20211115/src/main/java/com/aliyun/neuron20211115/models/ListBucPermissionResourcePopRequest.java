// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListBucPermissionResourcePopRequest extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("operatorType")
    public String operatorType;

    @NameInMap("resourcePrefix")
    public String resourcePrefix;

    public static ListBucPermissionResourcePopRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBucPermissionResourcePopRequest self = new ListBucPermissionResourcePopRequest();
        return TeaModel.build(map, self);
    }

    public ListBucPermissionResourcePopRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListBucPermissionResourcePopRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListBucPermissionResourcePopRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ListBucPermissionResourcePopRequest setResourcePrefix(String resourcePrefix) {
        this.resourcePrefix = resourcePrefix;
        return this;
    }
    public String getResourcePrefix() {
        return this.resourcePrefix;
    }

}
