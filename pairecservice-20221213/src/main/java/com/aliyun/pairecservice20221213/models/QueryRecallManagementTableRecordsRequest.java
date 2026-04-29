// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class QueryRecallManagementTableRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pairec-cn-test123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>[&quot;1001&quot;,&quot;1002&quot;]</p>
     */
    @NameInMap("PrimaryKeys")
    public byte[] primaryKeys;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RecallManagementTableVersionId")
    public String recallManagementTableVersionId;

    public static QueryRecallManagementTableRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecallManagementTableRecordsRequest self = new QueryRecallManagementTableRecordsRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecallManagementTableRecordsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryRecallManagementTableRecordsRequest setPrimaryKeys(byte[] primaryKeys) {
        this.primaryKeys = primaryKeys;
        return this;
    }
    public byte[] getPrimaryKeys() {
        return this.primaryKeys;
    }

    public QueryRecallManagementTableRecordsRequest setRecallManagementTableVersionId(String recallManagementTableVersionId) {
        this.recallManagementTableVersionId = recallManagementTableVersionId;
        return this;
    }
    public String getRecallManagementTableVersionId() {
        return this.recallManagementTableVersionId;
    }

}
