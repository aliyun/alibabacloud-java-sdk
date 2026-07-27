// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetLakebaseTenantTokenResponseBody extends TeaModel {
    /**
     * <p>The associated PolarDB instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-xxx</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CD35F3-F3-44CA-AFFF-BAF869******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status.</p>
     * 
     * <strong>example:</strong>
     * <p>ACTIVATION</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The mount subdirectory.</p>
     * 
     * <strong>example:</strong>
     * <p>/home/project</p>
     */
    @NameInMap("Subdir")
    public String subdir;

    /**
     * <p>The tenant identifier.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Tenant")
    public String tenant;

    /**
     * <p>The tenant token.</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Token")
    public String token;

    public static GetLakebaseTenantTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLakebaseTenantTokenResponseBody self = new GetLakebaseTenantTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLakebaseTenantTokenResponseBody setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public GetLakebaseTenantTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLakebaseTenantTokenResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public GetLakebaseTenantTokenResponseBody setSubdir(String subdir) {
        this.subdir = subdir;
        return this;
    }
    public String getSubdir() {
        return this.subdir;
    }

    public GetLakebaseTenantTokenResponseBody setTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }
    public String getTenant() {
        return this.tenant;
    }

    public GetLakebaseTenantTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
