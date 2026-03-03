// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListPermissionResourceForFrontRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>VIEW</p>
     */
    @NameInMap("action")
    public String action;

    /**
     * <strong>example:</strong>
     * <p>41</p>
     */
    @NameInMap("enterpriseId")
    public String enterpriseId;

    /**
     * <strong>example:</strong>
     * <p>292758960042264423</p>
     */
    @NameInMap("operatorId")
    public String operatorId;

    /**
     * <strong>example:</strong>
     * <p>DEVELOPER</p>
     */
    @NameInMap("operatorType")
    public String operatorType;

    /**
     * <strong>example:</strong>
     * <p>CONTAIN_MATCH</p>
     */
    @NameInMap("queryType")
    public String queryType;

    /**
     * <strong>example:</strong>
     * <p>neuron:catalog:company/1</p>
     */
    @NameInMap("resourcePrefix")
    public String resourcePrefix;

    public static ListPermissionResourceForFrontRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionResourceForFrontRequest self = new ListPermissionResourceForFrontRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionResourceForFrontRequest setAction(String action) {
        this.action = action;
        return this;
    }
    public String getAction() {
        return this.action;
    }

    public ListPermissionResourceForFrontRequest setEnterpriseId(String enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public String getEnterpriseId() {
        return this.enterpriseId;
    }

    public ListPermissionResourceForFrontRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListPermissionResourceForFrontRequest setOperatorType(String operatorType) {
        this.operatorType = operatorType;
        return this;
    }
    public String getOperatorType() {
        return this.operatorType;
    }

    public ListPermissionResourceForFrontRequest setQueryType(String queryType) {
        this.queryType = queryType;
        return this;
    }
    public String getQueryType() {
        return this.queryType;
    }

    public ListPermissionResourceForFrontRequest setResourcePrefix(String resourcePrefix) {
        this.resourcePrefix = resourcePrefix;
        return this;
    }
    public String getResourcePrefix() {
        return this.resourcePrefix;
    }

}
