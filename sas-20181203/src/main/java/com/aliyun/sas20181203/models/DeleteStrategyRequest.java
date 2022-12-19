// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteStrategyRequest extends TeaModel {
    // The ID of the baseline check policy that you want to delete.
    @NameInMap("Id")
    public String id;

    // The language of the content within the request and response. Default value: **zh**. Valid values:
    // 
    // *   **zh**: Chinese
    // *   **en**: English
    @NameInMap("Lang")
    public String lang;

    // The source IP address of the request.
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
