// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerConfig extends TeaModel {
    // 配置项细节，json结构
    @NameInMap("Content")
    public String content;

    // 系统生成的debug config唯一ID
    @NameInMap("DebuggerConfigId")
    public String debuggerConfigId;

    // 配置项描述
    @NameInMap("Description")
    public String description;

    // 模板配置项名称
    @NameInMap("DisplayName")
    public String displayName;

    // 创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 修改时间（UTC）
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    public static DebuggerConfig build(java.util.Map<String, ?> map) throws Exception {
        DebuggerConfig self = new DebuggerConfig();
        return TeaModel.build(map, self);
    }

    public DebuggerConfig setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public DebuggerConfig setDebuggerConfigId(String debuggerConfigId) {
        this.debuggerConfigId = debuggerConfigId;
        return this;
    }
    public String getDebuggerConfigId() {
        return this.debuggerConfigId;
    }

    public DebuggerConfig setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public DebuggerConfig setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DebuggerConfig setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DebuggerConfig setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

}
