// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateDynamicDictRequest extends TeaModel {
    /**
     * <p>Specifies whether to overwrite existing data. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Override")
    public Boolean override;

    /**
     * <p>The source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>123.103.9.***</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static CreateDynamicDictRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicDictRequest self = new CreateDynamicDictRequest();
        return TeaModel.build(map, self);
    }

    public CreateDynamicDictRequest setOverride(Boolean override) {
        this.override = override;
        return this;
    }
    public Boolean getOverride() {
        return this.override;
    }

    public CreateDynamicDictRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
