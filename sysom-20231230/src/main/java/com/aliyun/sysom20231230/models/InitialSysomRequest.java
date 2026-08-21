// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InitialSysomRequest extends TeaModel {
    @NameInMap("X-Debug-Id")
    public String xDebugId;

    /**
     * <p>Specifies whether to only check if the service-linked role exists.</p>
     */
    @NameInMap("check_only")
    public Boolean checkOnly;

    /**
     * <p>The source. Set this parameter to console.</p>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("source")
    public String source;

    @NameInMap("x-sysom-invoke-source")
    public String xSysomInvokeSource;

    public static InitialSysomRequest build(java.util.Map<String, ?> map) throws Exception {
        InitialSysomRequest self = new InitialSysomRequest();
        return TeaModel.build(map, self);
    }

    public InitialSysomRequest setXDebugId(String xDebugId) {
        this.xDebugId = xDebugId;
        return this;
    }
    public String getXDebugId() {
        return this.xDebugId;
    }

    public InitialSysomRequest setCheckOnly(Boolean checkOnly) {
        this.checkOnly = checkOnly;
        return this;
    }
    public Boolean getCheckOnly() {
        return this.checkOnly;
    }

    public InitialSysomRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public InitialSysomRequest setXSysomInvokeSource(String xSysomInvokeSource) {
        this.xSysomInvokeSource = xSysomInvokeSource;
        return this;
    }
    public String getXSysomInvokeSource() {
        return this.xSysomInvokeSource;
    }

}
