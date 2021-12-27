// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20191023.models;

import com.aliyun.tea.*;

public class QuerySafServiceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Ext")
    public java.util.Map<String, ?> ext;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Score")
    public String score;

    public static QuerySafServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QuerySafServiceResponseBody self = new QuerySafServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public QuerySafServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QuerySafServiceResponseBody setExt(java.util.Map<String, ?> ext) {
        this.ext = ext;
        return this;
    }
    public java.util.Map<String, ?> getExt() {
        return this.ext;
    }

    public QuerySafServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QuerySafServiceResponseBody setScore(String score) {
        this.score = score;
        return this;
    }
    public String getScore() {
        return this.score;
    }

}
