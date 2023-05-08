// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteStrategyRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Deletes a baseline check policy.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static DeleteStrategyRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteStrategyRequest self = new DeleteStrategyRequest();
        return TeaModel.build(map, self);
    }

    public DeleteStrategyRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public DeleteStrategyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DeleteStrategyRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
