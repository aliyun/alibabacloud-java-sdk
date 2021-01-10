// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutZappinfosecarchdomainRequest extends TeaModel {
    @NameInMap("KeyWord")
    public String keyWord;

    @NameInMap("MetaCenterArchDomainId")
    public String metaCenterArchDomainId;

    public static QueryLinkeBahamutZappinfosecarchdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutZappinfosecarchdomainRequest self = new QueryLinkeBahamutZappinfosecarchdomainRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutZappinfosecarchdomainRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

    public QueryLinkeBahamutZappinfosecarchdomainRequest setMetaCenterArchDomainId(String metaCenterArchDomainId) {
        this.metaCenterArchDomainId = metaCenterArchDomainId;
        return this;
    }
    public String getMetaCenterArchDomainId() {
        return this.metaCenterArchDomainId;
    }

}
