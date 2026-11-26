// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListOperatingObjectFavoritesRequest extends TeaModel {
    /**
     * <p>The platform application token issued by the console. If specified, the operation is executed as the user identified by opsUserId or opsUserCode.</p>
     * 
     * <strong>example:</strong>
     * <p>wn_app_xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx</p>
     */
    @NameInMap("appToken")
    public String appToken;

    /**
     * <p>The name of the graph. You can call the listGraphs operation to obtain the graph name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>crm</p>
     */
    @NameInMap("graphName")
    public String graphName;

    /**
     * <p>The pagination cursor.</p>
     * 
     * <strong>example:</strong>
     * <p>eyJ2IjoxLCJpZCI6MTAwMX0.c2lnbmF0dXJlX2V4YW1wbGU</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The object type, such as customer. This parameter has a value when type is set to mention.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>contract</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The name of the digital worker, which is the name of the operating object. This parameter is optional.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customer_assistant</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>The proxy user code, which is unique within the tenant. This parameter is used only when the application credential is configured as source_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>alice</p>
     */
    @NameInMap("opsUserCode")
    public String opsUserCode;

    /**
     * <p>The proxy user ID, which is the WINNEXO platform user ID. This parameter is used only when the application credential is configured as winnexo_uid.</p>
     * 
     * <strong>example:</strong>
     * <p>10001</p>
     */
    @NameInMap("opsUserId")
    public String opsUserId;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The ID of the effective tenant.</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListOperatingObjectFavoritesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperatingObjectFavoritesRequest self = new ListOperatingObjectFavoritesRequest();
        return TeaModel.build(map, self);
    }

    public ListOperatingObjectFavoritesRequest setAppToken(String appToken) {
        this.appToken = appToken;
        return this;
    }
    public String getAppToken() {
        return this.appToken;
    }

    public ListOperatingObjectFavoritesRequest setGraphName(String graphName) {
        this.graphName = graphName;
        return this;
    }
    public String getGraphName() {
        return this.graphName;
    }

    public ListOperatingObjectFavoritesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListOperatingObjectFavoritesRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public ListOperatingObjectFavoritesRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListOperatingObjectFavoritesRequest setOpsUserCode(String opsUserCode) {
        this.opsUserCode = opsUserCode;
        return this;
    }
    public String getOpsUserCode() {
        return this.opsUserCode;
    }

    public ListOperatingObjectFavoritesRequest setOpsUserId(String opsUserId) {
        this.opsUserId = opsUserId;
        return this;
    }
    public String getOpsUserId() {
        return this.opsUserId;
    }

    public ListOperatingObjectFavoritesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListOperatingObjectFavoritesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
