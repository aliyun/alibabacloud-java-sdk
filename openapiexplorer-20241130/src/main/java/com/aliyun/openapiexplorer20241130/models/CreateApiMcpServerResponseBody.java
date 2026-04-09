// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openapiexplorer20241130.models;

import com.aliyun.tea.*;

public class CreateApiMcpServerResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>v6ZZ7ftCzEILW***</p>
     */
    @NameInMap("id")
    public String id;

    /**
     * <strong>example:</strong>
     * <p>9BFC4AC1-6BE4-5405-BDEC-CA288D404812</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("urls")
    public CreateApiMcpServerResponseBodyUrls urls;

    public static CreateApiMcpServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateApiMcpServerResponseBody self = new CreateApiMcpServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateApiMcpServerResponseBody setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CreateApiMcpServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateApiMcpServerResponseBody setUrls(CreateApiMcpServerResponseBodyUrls urls) {
        this.urls = urls;
        return this;
    }
    public CreateApiMcpServerResponseBodyUrls getUrls() {
        return this.urls;
    }

    public static class CreateApiMcpServerResponseBodyUrls extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp">https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/mcp</a></p>
         */
        @NameInMap("mcp")
        public String mcp;

        /**
         * <strong>example:</strong>
         * <p><a href="https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse">https://mcpserverinner-pre.cn-zhangjiakou.aliyuncs.com/accounts/xxxx/custom/xxx/id/xxxx/sse</a></p>
         */
        @NameInMap("sse")
        public String sse;

        @NameInMap("vpcMcp")
        public String vpcMcp;

        @NameInMap("vpcSse")
        public String vpcSse;

        public static CreateApiMcpServerResponseBodyUrls build(java.util.Map<String, ?> map) throws Exception {
            CreateApiMcpServerResponseBodyUrls self = new CreateApiMcpServerResponseBodyUrls();
            return TeaModel.build(map, self);
        }

        public CreateApiMcpServerResponseBodyUrls setMcp(String mcp) {
            this.mcp = mcp;
            return this;
        }
        public String getMcp() {
            return this.mcp;
        }

        public CreateApiMcpServerResponseBodyUrls setSse(String sse) {
            this.sse = sse;
            return this;
        }
        public String getSse() {
            return this.sse;
        }

        public CreateApiMcpServerResponseBodyUrls setVpcMcp(String vpcMcp) {
            this.vpcMcp = vpcMcp;
            return this;
        }
        public String getVpcMcp() {
            return this.vpcMcp;
        }

        public CreateApiMcpServerResponseBodyUrls setVpcSse(String vpcSse) {
            this.vpcSse = vpcSse;
            return this;
        }
        public String getVpcSse() {
            return this.vpcSse;
        }

    }

}
