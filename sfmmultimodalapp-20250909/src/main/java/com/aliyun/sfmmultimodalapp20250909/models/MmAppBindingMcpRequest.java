// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class MmAppBindingMcpRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mm_a2eb4e04b48041108edb1f6de815</p>
     */
    @NameInMap("AppId")
    public String appId;

    @NameInMap("Mcps")
    public java.util.List<MmAppBindingMcpRequestMcps> mcps;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>llm-o8ixktz41iyd2b6p</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static MmAppBindingMcpRequest build(java.util.Map<String, ?> map) throws Exception {
        MmAppBindingMcpRequest self = new MmAppBindingMcpRequest();
        return TeaModel.build(map, self);
    }

    public MmAppBindingMcpRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public MmAppBindingMcpRequest setMcps(java.util.List<MmAppBindingMcpRequestMcps> mcps) {
        this.mcps = mcps;
        return this;
    }
    public java.util.List<MmAppBindingMcpRequestMcps> getMcps() {
        return this.mcps;
    }

    public MmAppBindingMcpRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static class MmAppBindingMcpRequestMcps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>mcp-ZDI1MDU2ZTExZGZh</p>
         */
        @NameInMap("Code")
        public String code;

        @NameInMap("ToolList")
        public java.util.List<String> toolList;

        /**
         * <strong>example:</strong>
         * <p>CUSTOM</p>
         */
        @NameInMap("Type")
        public String type;

        public static MmAppBindingMcpRequestMcps build(java.util.Map<String, ?> map) throws Exception {
            MmAppBindingMcpRequestMcps self = new MmAppBindingMcpRequestMcps();
            return TeaModel.build(map, self);
        }

        public MmAppBindingMcpRequestMcps setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public MmAppBindingMcpRequestMcps setToolList(java.util.List<String> toolList) {
            this.toolList = toolList;
            return this;
        }
        public java.util.List<String> getToolList() {
            return this.toolList;
        }

        public MmAppBindingMcpRequestMcps setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
