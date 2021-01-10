// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryRmsXflushDelegateRequest extends TeaModel {
    @NameInMap("EnvJsonStr")
    public String envJsonStr;

    @NameInMap("Meth")
    public String meth;

    @NameInMap("Query")
    public String query;

    @NameInMap("Url")
    public String url;

    public static QueryRmsXflushDelegateRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsXflushDelegateRequest self = new QueryRmsXflushDelegateRequest();
        return TeaModel.build(map, self);
    }

    public QueryRmsXflushDelegateRequest setEnvJsonStr(String envJsonStr) {
        this.envJsonStr = envJsonStr;
        return this;
    }
    public String getEnvJsonStr() {
        return this.envJsonStr;
    }

    public QueryRmsXflushDelegateRequest setMeth(String meth) {
        this.meth = meth;
        return this;
    }
    public String getMeth() {
        return this.meth;
    }

    public QueryRmsXflushDelegateRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public QueryRmsXflushDelegateRequest setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
