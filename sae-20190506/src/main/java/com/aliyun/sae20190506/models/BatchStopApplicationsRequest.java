// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class BatchStopApplicationsRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ebf491f0-c1a5-45e2-b2c4-710dbe2a****</p>
     */
    @NameInMap("AppIds")
    public String appIds;

    /**
     * <p>ebf491f0-c1a5-45e2-b2c4-710dbe2a\<em>\</em>\<em>\</em>,ebf491f0-c1a5-45e2-b2c4-71025e2a\<em>\</em>\<em>\</em></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The application version.</p>
     * 
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("Version")
    public String version;

    public static BatchStopApplicationsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchStopApplicationsRequest self = new BatchStopApplicationsRequest();
        return TeaModel.build(map, self);
    }

    public BatchStopApplicationsRequest setAppIds(String appIds) {
        this.appIds = appIds;
        return this;
    }
    public String getAppIds() {
        return this.appIds;
    }

    public BatchStopApplicationsRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public BatchStopApplicationsRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
