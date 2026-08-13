// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class ListVisibleKnowledgeBasesRequest extends TeaModel {
    /**
     * <p>数字员工名称（运营对象 name）</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>string_value</p>
     */
    @NameInMap("operatingObjectName")
    public String operatingObjectName;

    /**
     * <p>租户ID，公共参数，缺省时使用调用方默认租户</p>
     * 
     * <strong>example:</strong>
     * <p>10000</p>
     */
    @NameInMap("tenantId")
    public String tenantId;

    public static ListVisibleKnowledgeBasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVisibleKnowledgeBasesRequest self = new ListVisibleKnowledgeBasesRequest();
        return TeaModel.build(map, self);
    }

    public ListVisibleKnowledgeBasesRequest setOperatingObjectName(String operatingObjectName) {
        this.operatingObjectName = operatingObjectName;
        return this;
    }
    public String getOperatingObjectName() {
        return this.operatingObjectName;
    }

    public ListVisibleKnowledgeBasesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
