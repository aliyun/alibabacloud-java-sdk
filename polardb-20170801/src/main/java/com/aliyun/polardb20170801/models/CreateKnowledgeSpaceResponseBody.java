// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateKnowledgeSpaceResponseBody extends TeaModel {
    /**
     * <p>The ID of the PolarDB instance created by automatic creation.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The unique identifier of the knowledge space.</p>
     * 
     * <strong>example:</strong>
     * <p>pks-xxxxxx</p>
     */
    @NameInMap("KnowledgeSpaceId")
    public String knowledgeSpaceId;

    /**
     * <p>The order ID.</p>
     * 
     * <strong>example:</strong>
     * <p>20951253014****</p>
     */
    @NameInMap("OrderId")
    public String orderId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>2F029645-FED9-4FE8-A6D3-488954******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateKnowledgeSpaceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateKnowledgeSpaceResponseBody self = new CreateKnowledgeSpaceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateKnowledgeSpaceResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public CreateKnowledgeSpaceResponseBody setKnowledgeSpaceId(String knowledgeSpaceId) {
        this.knowledgeSpaceId = knowledgeSpaceId;
        return this;
    }
    public String getKnowledgeSpaceId() {
        return this.knowledgeSpaceId;
    }

    public CreateKnowledgeSpaceResponseBody setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public CreateKnowledgeSpaceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
