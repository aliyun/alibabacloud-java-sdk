// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class EtlMeta extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("enable")
    public Boolean enable;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("etlMetaKey")
    public String etlMetaKey;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("etlMetaName")
    public String etlMetaName;

    @NameInMap("etlMetaTag")
    public String etlMetaTag;

    @NameInMap("etlMetaValue")
    public String etlMetaValue;

    public static EtlMeta build(java.util.Map<String, ?> map) throws Exception {
        EtlMeta self = new EtlMeta();
        return TeaModel.build(map, self);
    }

    public EtlMeta setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public EtlMeta setEtlMetaKey(String etlMetaKey) {
        this.etlMetaKey = etlMetaKey;
        return this;
    }
    public String getEtlMetaKey() {
        return this.etlMetaKey;
    }

    public EtlMeta setEtlMetaName(String etlMetaName) {
        this.etlMetaName = etlMetaName;
        return this;
    }
    public String getEtlMetaName() {
        return this.etlMetaName;
    }

    public EtlMeta setEtlMetaTag(String etlMetaTag) {
        this.etlMetaTag = etlMetaTag;
        return this;
    }
    public String getEtlMetaTag() {
        return this.etlMetaTag;
    }

    public EtlMeta setEtlMetaValue(String etlMetaValue) {
        this.etlMetaValue = etlMetaValue;
        return this;
    }
    public String getEtlMetaValue() {
        return this.etlMetaValue;
    }

}
