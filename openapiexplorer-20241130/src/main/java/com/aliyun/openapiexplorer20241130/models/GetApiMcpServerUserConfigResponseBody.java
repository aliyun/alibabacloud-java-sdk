// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiMcpServerUserConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>162302724684579*</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enablePublicAccess")
    public Boolean enablePublicAccess;

    /**
     * <strong>example:</strong>
     * <p>2025-11-10T06:58:39Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <strong>example:</strong>
     * <p>2025-11-10T06:58:39Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>A707AFA8-1A4C-5B2A-A165-8436C1EA38DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("vpcWhitelists")
    public java.util.List<String> vpcWhitelists;

    public static GetApiMcpServerUserConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApiMcpServerUserConfigResponseBody self = new GetApiMcpServerUserConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApiMcpServerUserConfigResponseBody setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetApiMcpServerUserConfigResponseBody setEnablePublicAccess(Boolean enablePublicAccess) {
        this.enablePublicAccess = enablePublicAccess;
        return this;
    }
    public Boolean getEnablePublicAccess() {
        return this.enablePublicAccess;
    }

    public GetApiMcpServerUserConfigResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public GetApiMcpServerUserConfigResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetApiMcpServerUserConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApiMcpServerUserConfigResponseBody setVpcWhitelists(java.util.List<String> vpcWhitelists) {
        this.vpcWhitelists = vpcWhitelists;
        return this;
    }
    public java.util.List<String> getVpcWhitelists() {
        return this.vpcWhitelists;
    }

}
