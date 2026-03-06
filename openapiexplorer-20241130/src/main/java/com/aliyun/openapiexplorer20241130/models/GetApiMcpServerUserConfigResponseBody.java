// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class GetApiMcpServerUserConfigResponseBody extends TeaModel {
    /**
     * <p>The ID of your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>162302724684579*</p>
     */
    @NameInMap("accountId")
    public String accountId;

    /**
     * <p>Specifies whether to enable public network access for all API MCP Servers, including system MCP Servers, under your account. By default, this feature is enabled. If you disable it, you can access the servers only through VPC domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enablePublicAccess")
    public Boolean enablePublicAccess;

    /**
     * <p>The time when the configuration was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-10T06:58:39Z</p>
     */
    @NameInMap("gmtCreate")
    public String gmtCreate;

    /**
     * <p>The time when the configuration was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-11-10T06:58:39Z</p>
     */
    @NameInMap("gmtModified")
    public String gmtModified;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A707AFA8-1A4C-5B2A-A165-8436C1EA38DB</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The whitelist of source VPCs that are allowed to send requests after public network access is disabled. If you do not set this parameter or leave it empty, requests from all sources are allowed.</p>
     */
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
