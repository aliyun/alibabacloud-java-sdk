// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourceRequest extends TeaModel {
    @NameInMap("action")
    public String action;

    @NameInMap("enterpriseId")
    public Long enterpriseId;

    @NameInMap("operatorId")
    public String operatorId;

    @NameInMap("operatorType")
    public String operatorType;

    @NameInMap("resourcePrefix")
    public String resourcePrefix;

    public static ListPermissionResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourceRequest self = new ListPermissionResourceRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourceRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListPermissionResourceRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

    public ListPermissionResourceRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListPermissionResourceRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ListPermissionResourceRequest setResourcePrefix(String resourcePrefix) {
        this.resourcePrefix = resourcePrefix;
        return this;
    }
    public String getResourcePrefix() {
        return this.resourcePrefix;
    }

}
