// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutZappinfoprimarchdomainRequest extends TeaModel {
    @NameInMap("KeyWord")
    public String keyWord;

    public static QueryLinkeBahamutZappinfoprimarchdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutZappinfoprimarchdomainRequest self = new QueryLinkeBahamutZappinfoprimarchdomainRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutZappinfoprimarchdomainRequest setKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }
    public String getKeyWord() {
        return this.keyWord;
    }

}
