// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sysom20231230.models;

import com.aliyun.tea.*;

public class InitialSysomRequest extends TeaModel {
    /**
     * <p>Specifies whether to only check if the service role exists</p>
     */
    @NameInMap("check_only")
    public Boolean checkOnly;

    /**
     * <p>Source, which is fixed as console.</p>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("source")
    public String source;

    public static InitialSysomRequest build(java.util.Map<String, ?> map) throws Exception {
        InitialSysomRequest self = new InitialSysomRequest();
        return TeaModel.build(map, self);
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

}
